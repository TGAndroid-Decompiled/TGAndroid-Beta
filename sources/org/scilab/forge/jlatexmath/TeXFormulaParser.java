package org.scilab.forge.jlatexmath;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
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

    private interface ActionParser {
        void parse(Element element);
    }

    private interface ArgumentValueParser {
        Object parseValue(String str, String str2);
    }

    private class MethodInvocationParser implements ActionParser {
        MethodInvocationParser() {
        }

        @Override
        public void parse(Element element) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            String attrValueAndCheckIfNotNull = TeXFormulaParser.getAttrValueAndCheckIfNotNull("name", element);
            String attrValueAndCheckIfNotNull2 = TeXFormulaParser.getAttrValueAndCheckIfNotNull("formula", element);
            Object obj = TeXFormulaParser.this.tempFormulas.get(attrValueAndCheckIfNotNull2);
            if (obj == null) {
                throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Argument", "formula", "has an unknown temporary TeXFormula name as value : '" + attrValueAndCheckIfNotNull2 + "'!");
            }
            NodeList elementsByTagName = element.getElementsByTagName("Argument");
            try {
                TeXFormula.class.getMethod(attrValueAndCheckIfNotNull, TeXFormulaParser.getArgumentClasses(elementsByTagName)).invoke((TeXFormula) obj, TeXFormulaParser.this.getArgumentValues(elementsByTagName));
            } catch (Exception e) {
                throw new XMLResourceParseException("Error invoking the method '" + attrValueAndCheckIfNotNull + "' on the temporary TeXFormula '" + attrValueAndCheckIfNotNull2 + "' while constructing the predefined TeXFormula '" + TeXFormulaParser.this.formulaName + "'!\n" + e.toString());
            }
        }
    }

    private class CreateTeXFormulaParser implements ActionParser {
        CreateTeXFormulaParser() {
        }

        @Override
        public void parse(Element element) {
            String attrValueAndCheckIfNotNull = TeXFormulaParser.getAttrValueAndCheckIfNotNull("name", element);
            NodeList elementsByTagName = element.getElementsByTagName("Argument");
            try {
                TeXFormulaParser.this.tempFormulas.put(attrValueAndCheckIfNotNull, (TeXFormula) TeXFormula.class.getConstructor(TeXFormulaParser.getArgumentClasses(elementsByTagName)).newInstance(TeXFormulaParser.this.getArgumentValues(elementsByTagName)));
            } catch (Exception e) {
                throw new XMLResourceParseException("Error creating the temporary TeXFormula '" + attrValueAndCheckIfNotNull + "' while constructing the predefined TeXFormula '" + TeXFormulaParser.this.formulaName + "'!\n" + e.toString());
            }
        }
    }

    private class CreateCommandParser implements ActionParser {
        CreateCommandParser() {
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
                throw new XMLResourceParseException("Error creating the temporary command '" + attrValueAndCheckIfNotNull + "' while constructing the predefined command '" + TeXFormulaParser.this.formulaName + "'!\n" + str);
            } catch (Exception e) {
                throw new XMLResourceParseException("Error creating the temporary command '" + attrValueAndCheckIfNotNull + "' while constructing the predefined command '" + TeXFormulaParser.this.formulaName + "'!\n" + e.toString());
            }
        }
    }

    private class FloatValueParser implements ArgumentValueParser {
        FloatValueParser() {
        }

        @Override
        public Object parseValue(String str, String str2) {
            TeXFormulaParser.checkNullValue(str, str2);
            try {
                return new Float(Float.parseFloat(str));
            } catch (NumberFormatException e) {
                throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Argument", "value", "has an invalid '" + str2 + "'-value : '" + str + "'!", e);
            }
        }
    }

    private class CharValueParser implements ArgumentValueParser {
        CharValueParser() {
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

    private class BooleanValueParser implements ArgumentValueParser {
        BooleanValueParser() {
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
            throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Argument", "value", "has an invalid '" + str2 + "'-value : '" + str + "'!");
        }
    }

    private class IntValueParser implements ArgumentValueParser {
        IntValueParser() {
        }

        @Override
        public Object parseValue(String str, String str2) {
            TeXFormulaParser.checkNullValue(str, str2);
            try {
                return new Float(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Argument", "value", "has an invalid '" + str2 + "'-value : '" + str + "'!", e);
            }
        }
    }

    private class ReturnParser implements ActionParser {
        ReturnParser() {
        }

        @Override
        public void parse(Element element) {
            String attrValueAndCheckIfNotNull = TeXFormulaParser.getAttrValueAndCheckIfNotNull("name", element);
            Object obj = (TeXFormulaParser.this.type == 0 ? TeXFormulaParser.this.tempCommands : TeXFormulaParser.this.tempFormulas).get(attrValueAndCheckIfNotNull);
            if (obj != null) {
                TeXFormulaParser.this.result = obj;
                return;
            }
            throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Return", "name", "contains an unknown temporary TeXFormula variable name '" + attrValueAndCheckIfNotNull + "' for the predefined TeXFormula '" + TeXFormulaParser.this.formulaName + "'!");
        }
    }

    private class StringValueParser implements ArgumentValueParser {
        @Override
        public Object parseValue(String str, String str2) {
            return str;
        }

        StringValueParser() {
        }
    }

    private class TeXFormulaValueParser implements ArgumentValueParser {
        TeXFormulaValueParser() {
        }

        @Override
        public Object parseValue(String str, String str2) {
            if (str == null) {
                return null;
            }
            Object obj = TeXFormulaParser.this.tempFormulas.get(str);
            if (obj == null) {
                throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Argument", "value", "has an unknown temporary TeXFormula name as value : '" + str + "'!");
            }
            return (TeXFormula) obj;
        }
    }

    private class TeXConstantsValueParser implements ArgumentValueParser {
        TeXConstantsValueParser() {
        }

        @Override
        public Object parseValue(String str, String str2) {
            TeXFormulaParser.checkNullValue(str, str2);
            try {
                return Integer.valueOf(TeXConstants.class.getDeclaredField(str).getInt(null));
            } catch (Exception e) {
                throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Argument", "value", "has an unknown constant name as value : '" + str + "'!", e);
            }
        }
    }

    private class ColorConstantValueParser implements ArgumentValueParser {
        ColorConstantValueParser() {
        }

        @Override
        public Object parseValue(String str, String str2) {
            TeXFormulaParser.checkNullValue(str, str2);
            try {
                return Color.class.getDeclaredField(str).get(null);
            } catch (Exception e) {
                throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Argument", "value", "has an unknown color constant name as value : '" + str + "'!", e);
            }
        }
    }

    static {
        HashMap map = new HashMap();
        classMappings = map;
        Class<?> cls = Integer.TYPE;
        map.put("TeXConstants", cls);
        classMappings.put("TeXFormula", TeXFormula.class);
        classMappings.put("String", String.class);
        classMappings.put("float", Float.TYPE);
        classMappings.put("int", cls);
        classMappings.put("boolean", Boolean.TYPE);
        classMappings.put("char", Character.TYPE);
        classMappings.put("ColorConstant", Color.class);
    }

    public TeXFormulaParser(String str, Element element, String str2) {
        HashMap map = new HashMap();
        this.argValueParsers = map;
        HashMap map2 = new HashMap();
        this.actionParsers = map2;
        this.tempFormulas = new HashMap();
        this.tempCommands = new HashMap();
        this.result = new Object();
        this.formulaName = str;
        this.formula = element;
        this.type = !"Command".equals(str2) ? 1 : 0;
        if ("Command".equals(str2)) {
            map2.put("CreateCommand", new CreateCommandParser());
        } else {
            map2.put("CreateTeXFormula", new CreateTeXFormulaParser());
        }
        map2.put("MethodInvocation", new MethodInvocationParser());
        map2.put("Return", new ReturnParser());
        map.put("TeXConstants", new TeXConstantsValueParser());
        map.put("TeXFormula", new TeXFormulaValueParser());
        map.put("String", new StringValueParser());
        map.put("float", new FloatValueParser());
        map.put("int", new IntValueParser());
        map.put("boolean", new BooleanValueParser());
        map.put("char", new CharValueParser());
        map.put("ColorConstant", new ColorConstantValueParser());
    }

    public Object parse() {
        NodeList childNodes = this.formula.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() != 3) {
                Element element = (Element) nodeItem;
                ActionParser actionParser = this.actionParsers.get(element.getTagName());
                if (actionParser != null) {
                    actionParser.parse(element);
                }
            }
        }
        return this.result;
    }

    public Object[] getArgumentValues(NodeList nodeList) {
        Object[] objArr = new Object[nodeList.getLength()];
        int i = 0;
        for (int i2 = 0; i2 < nodeList.getLength(); i2++) {
            Element element = (Element) nodeList.item(i2);
            String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("type", element);
            objArr[i] = this.argValueParsers.get(attrValueAndCheckIfNotNull).parseValue(element.getAttribute("value"), attrValueAndCheckIfNotNull);
            i++;
        }
        return objArr;
    }

    public static Class<?>[] getArgumentClasses(NodeList nodeList) {
        Class<?>[] clsArr = new Class[nodeList.getLength()];
        int i = 0;
        for (int i2 = 0; i2 < nodeList.getLength(); i2++) {
            Class<?> cls = classMappings.get(getAttrValueAndCheckIfNotNull("type", (Element) nodeList.item(i2)));
            if (cls == null) {
                throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Argument", "type", "has an invalid class name value!");
            }
            clsArr[i] = cls;
            i++;
        }
        return clsArr;
    }

    public static void checkNullValue(String str, String str2) {
        if (str.equals("")) {
            throw new XMLResourceParseException("PredefinedTeXFormulas.xml", "Argument", "value", "is required for an argument of type '" + str2 + "'!");
        }
    }

    public static String getAttrValueAndCheckIfNotNull(String str, Element element) {
        String attribute = element.getAttribute(str);
        if (attribute.equals("")) {
            throw new XMLResourceParseException("PredefinedTeXFormulas.xml", element.getTagName(), str, null);
        }
        return attribute;
    }
}
