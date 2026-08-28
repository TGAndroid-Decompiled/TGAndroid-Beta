package org.scilab.forge.jlatexmath;

import aa.d;
import j3.r0;
import java.util.HashMap;
import java.util.Map;
import org.telegram.ui.Cells.j2;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ru.noties.jlatexmath.awt.Color;
public class TeXFormulaParser {
    private static final String ARG_OBJ_ATTR = "formula";
    private static final String ARG_VAL_ATTR = "value";
    private static final int COMMAND = 0;
    private static final String RETURN_EL = "Return";
    private static final int TEXFORMULA = 1;
    private static Map<String, Class<?>> classMappings;
    private final Map<String, ActionParser> actionParsers;
    private final Map<String, ArgumentValueParser> argValueParsers;
    private final Element formula;
    private final String formulaName;
    private Object result;
    private final Map<String, MacroInfo> tempCommands;
    private final Map<String, TeXFormula> tempFormulas;
    private int type;

    public interface ActionParser {
        void parse(Element element);
    }

    public interface ArgumentValueParser {
        Object parseValue(String str, String str2);
    }

    public class BooleanValueParser implements ArgumentValueParser {
        public BooleanValueParser() {
        }

        @Override
        public Object parseValue(String str, String str2) {
            TeXFormulaParser.checkNullValue(str, str2);
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Argument", "value", j2.h("has an invalid '", str2, "'-value : '", str, "'!"));
        }
    }

    public class CharValueParser implements ArgumentValueParser {
        public CharValueParser() {
        }

        @Override
        public Object parseValue(String str, String str2) {
            TeXFormulaParser.checkNullValue(str, str2);
            if (str.length() == 1) {
                return new Character(str.charAt(0));
            }
            throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Argument", "value", "must have a value that consists of exactly 1 character!");
        }
    }

    public class ColorConstantValueParser implements ArgumentValueParser {
        public ColorConstantValueParser() {
        }

        @Override
        public Object parseValue(String str, String str2) {
            TeXFormulaParser.checkNullValue(str, str2);
            try {
                return Color.class.getDeclaredField(str).get(null);
            } catch (Exception e10) {
                throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Argument", "value", d.o("has an unknown color constant name as value : '", str, "'!"), e10);
            }
        }
    }

    public class CreateCommandParser implements ActionParser {
        public CreateCommandParser() {
        }

        @Override
        public void parse(Element element) {
            String attrValueAndCheckIfNotNull = TeXFormulaParser.getAttrValueAndCheckIfNotNull("name", element);
            NodeList elementsByTagName = element.getElementsByTagName("Argument");
            Class[] argumentClasses = TeXFormulaParser.getArgumentClasses(elementsByTagName);
            Object[] argumentValues = TeXFormulaParser.this.getArgumentValues(elementsByTagName);
            try {
                TeXFormulaParser.this.tempCommands.put(attrValueAndCheckIfNotNull, (MacroInfo) MacroInfo.class.getConstructor(argumentClasses).newInstance(argumentValues));
            } catch (IllegalArgumentException unused) {
                String str = "IllegalArgumentException:\nClassLoader to load this class (TeXFormulaParser): " + getClass().getClassLoader() + "\n";
                for (Class cls : argumentClasses) {
                    str = str + "Created class: " + cls + " loaded with the ClassLoader: " + cls.getClassLoader() + "\n";
                }
                for (Object obj : argumentValues) {
                    str = str + "Created object: " + obj + "\n";
                }
                StringBuilder t10 = d.t("Error creating the temporary command '", attrValueAndCheckIfNotNull, "' while constructing the predefined command '");
                t10.append(TeXFormulaParser.this.formulaName);
                t10.append("'!\n");
                t10.append(str);
                throw new XMLResourceParseException(t10.toString());
            } catch (Exception e10) {
                StringBuilder t11 = d.t("Error creating the temporary command '", attrValueAndCheckIfNotNull, "' while constructing the predefined command '");
                t11.append(TeXFormulaParser.this.formulaName);
                t11.append("'!\n");
                t11.append(e10.toString());
                throw new XMLResourceParseException(t11.toString());
            }
        }
    }

    public class CreateTeXFormulaParser implements ActionParser {
        public CreateTeXFormulaParser() {
        }

        @Override
        public void parse(Element element) {
            String attrValueAndCheckIfNotNull = TeXFormulaParser.getAttrValueAndCheckIfNotNull("name", element);
            NodeList elementsByTagName = element.getElementsByTagName("Argument");
            Class[] argumentClasses = TeXFormulaParser.getArgumentClasses(elementsByTagName);
            Object[] argumentValues = TeXFormulaParser.this.getArgumentValues(elementsByTagName);
            try {
                TeXFormulaParser.this.tempFormulas.put(attrValueAndCheckIfNotNull, (TeXFormula) TeXFormula.class.getConstructor(argumentClasses).newInstance(argumentValues));
            } catch (Exception e10) {
                StringBuilder t10 = d.t("Error creating the temporary TeXFormula '", attrValueAndCheckIfNotNull, "' while constructing the predefined TeXFormula '");
                t10.append(TeXFormulaParser.this.formulaName);
                t10.append("'!\n");
                t10.append(e10.toString());
                throw new XMLResourceParseException(t10.toString());
            }
        }
    }

    public class FloatValueParser implements ArgumentValueParser {
        public FloatValueParser() {
        }

        @Override
        public Object parseValue(String str, String str2) {
            TeXFormulaParser.checkNullValue(str, str2);
            try {
                return new Float(Float.parseFloat(str));
            } catch (NumberFormatException e10) {
                throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Argument", "value", j2.h("has an invalid '", str2, "'-value : '", str, "'!"), e10);
            }
        }
    }

    public class IntValueParser implements ArgumentValueParser {
        public IntValueParser() {
        }

        @Override
        public Object parseValue(String str, String str2) {
            TeXFormulaParser.checkNullValue(str, str2);
            try {
                return new Float(Integer.parseInt(str));
            } catch (NumberFormatException e10) {
                throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Argument", "value", j2.h("has an invalid '", str2, "'-value : '", str, "'!"), e10);
            }
        }
    }

    public class MethodInvocationParser implements ActionParser {
        public MethodInvocationParser() {
        }

        @Override
        public void parse(Element element) {
            String attrValueAndCheckIfNotNull = TeXFormulaParser.getAttrValueAndCheckIfNotNull("name", element);
            String attrValueAndCheckIfNotNull2 = TeXFormulaParser.getAttrValueAndCheckIfNotNull("formula", element);
            Object obj = TeXFormulaParser.this.tempFormulas.get(attrValueAndCheckIfNotNull2);
            if (obj != null) {
                NodeList elementsByTagName = element.getElementsByTagName("Argument");
                Class[] argumentClasses = TeXFormulaParser.getArgumentClasses(elementsByTagName);
                try {
                    TeXFormula.class.getMethod(attrValueAndCheckIfNotNull, argumentClasses).invoke((TeXFormula) obj, TeXFormulaParser.this.getArgumentValues(elementsByTagName));
                    return;
                } catch (Exception e10) {
                    StringBuilder q10 = r0.q("Error invoking the method '", attrValueAndCheckIfNotNull, "' on the temporary TeXFormula '", attrValueAndCheckIfNotNull2, "' while constructing the predefined TeXFormula '");
                    q10.append(TeXFormulaParser.this.formulaName);
                    q10.append("'!\n");
                    q10.append(e10.toString());
                    throw new XMLResourceParseException(q10.toString());
                }
            }
            throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Argument", "formula", d.o("has an unknown temporary TeXFormula name as value : '", attrValueAndCheckIfNotNull2, "'!"));
        }
    }

    public class ReturnParser implements ActionParser {
        public ReturnParser() {
        }

        @Override
        public void parse(Element element) {
            String attrValueAndCheckIfNotNull = TeXFormulaParser.getAttrValueAndCheckIfNotNull("name", element);
            Object obj = (TeXFormulaParser.this.type == 0 ? TeXFormulaParser.this.tempCommands : TeXFormulaParser.this.tempFormulas).get(attrValueAndCheckIfNotNull);
            if (obj != null) {
                TeXFormulaParser.this.result = obj;
                return;
            }
            StringBuilder t10 = d.t("contains an unknown temporary TeXFormula variable name '", attrValueAndCheckIfNotNull, "' for the predefined TeXFormula '");
            t10.append(TeXFormulaParser.this.formulaName);
            t10.append("'!");
            throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Return", "name", t10.toString());
        }
    }

    public class TeXConstantsValueParser implements ArgumentValueParser {
        public TeXConstantsValueParser() {
        }

        @Override
        public Object parseValue(String str, String str2) {
            TeXFormulaParser.checkNullValue(str, str2);
            try {
                return Integer.valueOf(TeXConstants.class.getDeclaredField(str).getInt(null));
            } catch (Exception e10) {
                throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Argument", "value", d.o("has an unknown constant name as value : '", str, "'!"), e10);
            }
        }
    }

    public class TeXFormulaValueParser implements ArgumentValueParser {
        public TeXFormulaValueParser() {
        }

        @Override
        public Object parseValue(String str, String str2) {
            if (str == null) {
                return null;
            }
            Object obj = TeXFormulaParser.this.tempFormulas.get(str);
            if (obj != null) {
                return (TeXFormula) obj;
            }
            throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Argument", "value", d.o("has an unknown temporary TeXFormula name as value : '", str, "'!"));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        classMappings = hashMap;
        Class<?> cls = Integer.TYPE;
        hashMap.put("TeXConstants", cls);
        classMappings.put("TeXFormula", TeXFormula.class);
        classMappings.put("String", String.class);
        classMappings.put("float", Float.TYPE);
        classMappings.put("int", cls);
        classMappings.put("boolean", Boolean.TYPE);
        classMappings.put("char", Character.TYPE);
        classMappings.put("ColorConstant", Color.class);
    }

    public TeXFormulaParser(String str, Element element, String str2) {
        HashMap hashMap = new HashMap();
        this.argValueParsers = hashMap;
        HashMap hashMap2 = new HashMap();
        this.actionParsers = hashMap2;
        this.tempFormulas = new HashMap();
        this.tempCommands = new HashMap();
        this.result = new Object();
        this.formulaName = str;
        this.formula = element;
        this.type = !"Command".equals(str2) ? 1 : 0;
        if ("Command".equals(str2)) {
            hashMap2.put("CreateCommand", new CreateCommandParser());
        } else {
            hashMap2.put("CreateTeXFormula", new CreateTeXFormulaParser());
        }
        hashMap2.put("MethodInvocation", new MethodInvocationParser());
        hashMap2.put("Return", new ReturnParser());
        hashMap.put("TeXConstants", new TeXConstantsValueParser());
        hashMap.put("TeXFormula", new TeXFormulaValueParser());
        hashMap.put("String", new StringValueParser());
        hashMap.put("float", new FloatValueParser());
        hashMap.put("int", new IntValueParser());
        hashMap.put("boolean", new BooleanValueParser());
        hashMap.put("char", new CharValueParser());
        hashMap.put("ColorConstant", new ColorConstantValueParser());
    }

    public static void checkNullValue(String str, String str2) {
        if (!str.equals("")) {
            return;
        }
        throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Argument", "value", d.o("is required for an argument of type '", str2, "'!"));
    }

    public static Class<?>[] getArgumentClasses(NodeList nodeList) {
        Class<?>[] clsArr = new Class[nodeList.getLength()];
        int i9 = 0;
        for (int i10 = 0; i10 < nodeList.getLength(); i10++) {
            Class<?> cls = classMappings.get(getAttrValueAndCheckIfNotNull("type", (Element) nodeList.item(i10)));
            if (cls != null) {
                clsArr[i9] = cls;
                i9++;
            } else {
                throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Argument", "type", "has an invalid class name value!");
            }
        }
        return clsArr;
    }

    public Object[] getArgumentValues(NodeList nodeList) {
        Object[] objArr = new Object[nodeList.getLength()];
        int i9 = 0;
        for (int i10 = 0; i10 < nodeList.getLength(); i10++) {
            Element element = (Element) nodeList.item(i10);
            String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("type", element);
            objArr[i9] = this.argValueParsers.get(attrValueAndCheckIfNotNull).parseValue(element.getAttribute("value"), attrValueAndCheckIfNotNull);
            i9++;
        }
        return objArr;
    }

    public static String getAttrValueAndCheckIfNotNull(String str, Element element) {
        String attribute = element.getAttribute(str);
        if (!attribute.equals("")) {
            return attribute;
        }
        throw new XMLResourceParseException("PredefinedTeXFormulas.xml", element.getTagName(), str, null);
    }

    public Object parse() {
        NodeList childNodes = this.formula.getChildNodes();
        for (int i9 = 0; i9 < childNodes.getLength(); i9++) {
            Node item = childNodes.item(i9);
            if (item.getNodeType() != 3) {
                Element element = (Element) item;
                ActionParser actionParser = this.actionParsers.get(element.getTagName());
                if (actionParser != null) {
                    actionParser.parse(element);
                }
            }
        }
        return this.result;
    }

    public class StringValueParser implements ArgumentValueParser {
        public StringValueParser() {
        }

        @Override
        public Object parseValue(String str, String str2) {
            return str;
        }
    }
}
