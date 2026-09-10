package org.scilab.forge.jlatexmath;

import a4.a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.telegram.ui.Cells.r6;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.awt.Font;
public class DefaultTeXFontParser {
    public static final String GEN_SET_EL = "GeneralSettings";
    public static final String MUFONTID_ATTR = "mufontid";
    public static final String RESOURCE_NAME = "DefaultTeXFont.xml";
    public static final String SPACEFONTID_ATTR = "spacefontid";
    public static final String STYLE_MAPPING_EL = "TextStyleMapping";
    public static final String SYMBOL_MAPPING_EL = "SymbolMapping";
    private static boolean registerFontExceptionDisplayed = false;
    private static boolean shouldRegisterFonts = true;
    private Object base;
    private Map<String, CharFont[]> parsedTextStyles;
    private Element root;
    private static DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    protected static ArrayList<String> Font_ID = new ArrayList<>();
    private static Map<String, Integer> rangeTypeMappings = new HashMap();
    private static Map<String, CharChildParser> charChildParsers = new HashMap();

    public interface CharChildParser {
        void parse(Element element, char c10, FontInfo fontInfo);
    }

    public static class ExtensionParser implements CharChildParser {
        @Override
        public void parse(Element element, char c10, FontInfo fontInfo) {
            fontInfo.setExtension(c10, new int[]{DefaultTeXFontParser.getOptionalInt("top", element, -1), DefaultTeXFontParser.getOptionalInt("mid", element, -1), DefaultTeXFontParser.getIntAndCheck("rep", element), DefaultTeXFontParser.getOptionalInt("bot", element, -1)});
        }
    }

    public static class KernParser implements CharChildParser {
        @Override
        public void parse(Element element, char c10, FontInfo fontInfo) {
            fontInfo.addKern(c10, (char) DefaultTeXFontParser.getIntAndCheck("code", element), DefaultTeXFontParser.getFloatAndCheck("val", element));
        }
    }

    public static class LigParser implements CharChildParser {
        @Override
        public void parse(Element element, char c10, FontInfo fontInfo) {
            fontInfo.addLigature(c10, (char) DefaultTeXFontParser.getIntAndCheck("code", element), (char) DefaultTeXFontParser.getIntAndCheck("ligCode", element));
        }
    }

    public static class NextLargerParser implements CharChildParser {
        @Override
        public void parse(Element element, char c10, FontInfo fontInfo) {
            fontInfo.setNextLarger(c10, (char) DefaultTeXFontParser.getIntAndCheck("code", element), DefaultTeXFontParser.Font_ID.indexOf(DefaultTeXFontParser.getAttrValueAndCheckIfNotNull("fontId", element)));
        }
    }

    static {
        setRangeTypeMappings();
        setCharChildParsers();
    }

    public DefaultTeXFontParser() {
        this(JLatexMathAndroid.getResourceAsStream("DefaultTeXFont.xml"), "DefaultTeXFont.xml");
    }

    public static Font createFont(String str) {
        return Font.createFont(JLatexMathAndroid.loadTypeface(str), TeXFormula.PIXELS_PER_POINT * TeXFormula.FONT_SCALE_FACTOR);
    }

    public static String getAttrValueAndCheckIfNotNull(String str, Element element) {
        String attribute = element.getAttribute(str);
        if (!attribute.equals("")) {
            return attribute;
        }
        throw new XMLResourceParseException("DefaultTeXFont.xml", element.getTagName(), str, null);
    }

    public static float getFloatAndCheck(String str, Element element) {
        try {
            return (float) Double.parseDouble(getAttrValueAndCheckIfNotNull(str, element));
        } catch (NumberFormatException unused) {
            throw new XMLResourceParseException("DefaultTeXFont.xml", element.getTagName(), str, "has an invalid real value!");
        }
    }

    public static int getIntAndCheck(String str, Element element) {
        try {
            return Integer.parseInt(getAttrValueAndCheckIfNotNull(str, element));
        } catch (NumberFormatException unused) {
            throw new XMLResourceParseException("DefaultTeXFont.xml", element.getTagName(), str, "has an invalid integer value!");
        }
    }

    public static float getOptionalFloat(String str, Element element, float f7) {
        String attribute = element.getAttribute(str);
        if (attribute.equals("")) {
            return f7;
        }
        try {
            return (float) Double.parseDouble(attribute);
        } catch (NumberFormatException unused) {
            throw new XMLResourceParseException("DefaultTeXFont.xml", element.getTagName(), str, "has an invalid float value!");
        }
    }

    public static int getOptionalInt(String str, Element element, int i10) {
        String attribute = element.getAttribute(str);
        if (attribute.equals("")) {
            return i10;
        }
        try {
            return Integer.parseInt(attribute);
        } catch (NumberFormatException unused) {
            throw new XMLResourceParseException("DefaultTeXFont.xml", element.getTagName(), str, "has an invalid integer value!");
        }
    }

    private Map<String, CharFont[]> parseStyleMappings() {
        String str;
        HashMap hashMap = new HashMap();
        Element element = (Element) this.root.getElementsByTagName("TextStyleMappings").item(0);
        if (element != null) {
            NodeList elementsByTagName = element.getElementsByTagName("TextStyleMapping");
            for (int i10 = 0; i10 < elementsByTagName.getLength(); i10++) {
                Element element2 = (Element) elementsByTagName.item(i10);
                String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("name", element2);
                try {
                    str = getAttrValueAndCheckIfNotNull("bold", element2);
                } catch (ResourceParseException unused) {
                    str = null;
                }
                NodeList elementsByTagName2 = element2.getElementsByTagName("MapRange");
                CharFont[] charFontArr = new CharFont[4];
                for (int i11 = 0; i11 < elementsByTagName2.getLength(); i11++) {
                    Element element3 = (Element) elementsByTagName2.item(i11);
                    String attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull("fontId", element3);
                    int intAndCheck = getIntAndCheck("start", element3);
                    String attrValueAndCheckIfNotNull3 = getAttrValueAndCheckIfNotNull("code", element3);
                    Integer num = rangeTypeMappings.get(attrValueAndCheckIfNotNull3);
                    if (num != null) {
                        if (str == null) {
                            charFontArr[num.intValue()] = new CharFont((char) intAndCheck, Font_ID.indexOf(attrValueAndCheckIfNotNull2));
                        } else {
                            charFontArr[num.intValue()] = new CharFont((char) intAndCheck, Font_ID.indexOf(attrValueAndCheckIfNotNull2), Font_ID.indexOf(str));
                        }
                    } else {
                        throw new XMLResourceParseException("DefaultTeXFont.xml", "MapRange", "code", a.p("contains an unknown \"range name\" '", attrValueAndCheckIfNotNull3, "'!"));
                    }
                }
                hashMap.put(attrValueAndCheckIfNotNull, charFontArr);
            }
        }
        return hashMap;
    }

    private static void processCharElement(Element element, FontInfo fontInfo) {
        char intAndCheck = (char) getIntAndCheck("code", element);
        fontInfo.setMetrics(intAndCheck, new float[]{getOptionalFloat("width", element, 0.0f), getOptionalFloat("height", element, 0.0f), getOptionalFloat("depth", element, 0.0f), getOptionalFloat("italic", element, 0.0f)});
        NodeList childNodes = element.getChildNodes();
        for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
            Node item = childNodes.item(i10);
            if (item.getNodeType() != 3) {
                Element element2 = (Element) item;
                CharChildParser charChildParser = charChildParsers.get(element2.getTagName());
                if (charChildParser != null) {
                    charChildParser.parse(element2, intAndCheck, fontInfo);
                } else {
                    throw new XMLResourceParseException("DefaultTeXFont.xml: a <Char>-element has an unknown child element '" + element2.getTagName() + "'!");
                }
            }
        }
    }

    public static void registerFonts(boolean z10) {
        shouldRegisterFonts = z10;
    }

    private static void setCharChildParsers() {
        charChildParsers.put("Kern", new KernParser());
        charChildParsers.put("Lig", new LigParser());
        charChildParsers.put("NextLarger", new NextLargerParser());
        charChildParsers.put("Extension", new ExtensionParser());
    }

    private static void setRangeTypeMappings() {
        rangeTypeMappings.put("numbers", 0);
        rangeTypeMappings.put("capitals", 1);
        rangeTypeMappings.put("small", 2);
        rangeTypeMappings.put("unicode", 3);
    }

    public String[] parseDefaultTextStyleMappings() {
        String[] strArr = new String[4];
        Element element = (Element) this.root.getElementsByTagName("DefaultTextStyleMapping").item(0);
        if (element != null) {
            NodeList elementsByTagName = element.getElementsByTagName("MapStyle");
            for (int i10 = 0; i10 < elementsByTagName.getLength(); i10++) {
                Element element2 = (Element) elementsByTagName.item(i10);
                String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("code", element2);
                Integer num = rangeTypeMappings.get(attrValueAndCheckIfNotNull);
                if (num != null) {
                    String attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull("textStyle", element2);
                    if (this.parsedTextStyles.get(attrValueAndCheckIfNotNull2) != null) {
                        int intValue = num.intValue();
                        if (this.parsedTextStyles.get(attrValueAndCheckIfNotNull2)[intValue] != null) {
                            strArr[intValue] = attrValueAndCheckIfNotNull2;
                        } else {
                            throw new XMLResourceParseException(r6.j("DefaultTeXFont.xml: the default text style mapping '", attrValueAndCheckIfNotNull2, "' for the range '", attrValueAndCheckIfNotNull, "' contains no mapping for that range!"));
                        }
                    } else {
                        throw new XMLResourceParseException("DefaultTeXFont.xml", "MapStyle", "textStyle", a.p("contains an unknown text style '", attrValueAndCheckIfNotNull2, "'!"));
                    }
                } else {
                    throw new XMLResourceParseException("DefaultTeXFont.xml", "MapStyle", "code", a.p("contains an unknown \"range name\" '", attrValueAndCheckIfNotNull, "'!"));
                }
            }
        }
        return strArr;
    }

    public void parseExtraPath() {
        Element element = (Element) this.root.getElementsByTagName("TeXSymbols").item(0);
        if (element != null) {
            String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("include", element);
            SymbolAtom.addSymbolAtom(JLatexMathAndroid.getResourceAsStream(attrValueAndCheckIfNotNull), attrValueAndCheckIfNotNull);
        }
        Element element2 = (Element) this.root.getElementsByTagName("FormulaSettings").item(0);
        if (element2 != null) {
            String attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull("include", element2);
            TeXFormula.addSymbolMappings(JLatexMathAndroid.getResourceAsStream(attrValueAndCheckIfNotNull2), attrValueAndCheckIfNotNull2);
        }
    }

    public FontInfo[] parseFontDescriptions(FontInfo[] fontInfoArr, InputStream inputStream, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        if (inputStream == null) {
            return fontInfoArr;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(fontInfoArr));
        try {
            Element documentElement = factory.newDocumentBuilder().parse(inputStream).getDocumentElement();
            String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("name", documentElement);
            String attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull("id", documentElement);
            if (Font_ID.indexOf(attrValueAndCheckIfNotNull2) < 0) {
                Font_ID.add(attrValueAndCheckIfNotNull2);
                float floatAndCheck = getFloatAndCheck("space", documentElement);
                float floatAndCheck2 = getFloatAndCheck("xHeight", documentElement);
                float floatAndCheck3 = getFloatAndCheck("quad", documentElement);
                int optionalInt = getOptionalInt("skewChar", documentElement, -1);
                int optionalInt2 = getOptionalInt("unicode", documentElement, 0);
                String str6 = null;
                try {
                    str2 = getAttrValueAndCheckIfNotNull("boldVersion", documentElement);
                } catch (ResourceParseException unused) {
                    str2 = null;
                }
                try {
                    str3 = getAttrValueAndCheckIfNotNull("romanVersion", documentElement);
                } catch (ResourceParseException unused2) {
                    str3 = null;
                }
                try {
                    str4 = getAttrValueAndCheckIfNotNull("ssVersion", documentElement);
                } catch (ResourceParseException unused3) {
                    str4 = null;
                }
                try {
                    str5 = getAttrValueAndCheckIfNotNull("ttVersion", documentElement);
                } catch (ResourceParseException unused4) {
                    str5 = null;
                }
                try {
                    str6 = getAttrValueAndCheckIfNotNull("itVersion", documentElement);
                } catch (ResourceParseException unused5) {
                }
                FontInfo fontInfo = new FontInfo(Font_ID.indexOf(attrValueAndCheckIfNotNull2), this.base, str.substring(0, str.lastIndexOf("/") + 1) + attrValueAndCheckIfNotNull, attrValueAndCheckIfNotNull, optionalInt2, floatAndCheck2, floatAndCheck, floatAndCheck3, str2, str3, str4, str5, str6);
                if (optionalInt != -1) {
                    fontInfo.setSkewChar((char) optionalInt);
                }
                NodeList elementsByTagName = documentElement.getElementsByTagName("Char");
                for (int i10 = 0; i10 < elementsByTagName.getLength(); i10++) {
                    processCharElement((Element) elementsByTagName.item(i10), fontInfo);
                }
                arrayList.add(fontInfo);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    FontInfo fontInfo2 = (FontInfo) arrayList.get(i11);
                    fontInfo2.setBoldId(Font_ID.indexOf(fontInfo2.boldVersion));
                    fontInfo2.setRomanId(Font_ID.indexOf(fontInfo2.romanVersion));
                    fontInfo2.setSsId(Font_ID.indexOf(fontInfo2.ssVersion));
                    fontInfo2.setTtId(Font_ID.indexOf(fontInfo2.ttVersion));
                    fontInfo2.setItId(Font_ID.indexOf(fontInfo2.itVersion));
                }
                this.parsedTextStyles = parseStyleMappings();
                return (FontInfo[]) arrayList.toArray(fontInfoArr);
            }
            throw new FontAlreadyLoadedException(a.p("Font ", attrValueAndCheckIfNotNull2, " is already loaded !"));
        } catch (Exception e) {
            StringBuilder v = a.v("Cannot find the file ", str, "!");
            v.append(e.toString());
            throw new XMLResourceParseException(v.toString());
        }
    }

    public Map<String, Number> parseGeneralSettings() {
        HashMap hashMap = new HashMap();
        Element element = (Element) this.root.getElementsByTagName("GeneralSettings").item(0);
        if (element != null) {
            hashMap.put("mufontid", Integer.valueOf(Font_ID.indexOf(getAttrValueAndCheckIfNotNull("mufontid", element))));
            hashMap.put("spacefontid", Integer.valueOf(Font_ID.indexOf(getAttrValueAndCheckIfNotNull("spacefontid", element))));
            hashMap.put("scriptfactor", Float.valueOf(getFloatAndCheck("scriptfactor", element)));
            hashMap.put("scriptscriptfactor", Float.valueOf(getFloatAndCheck("scriptscriptfactor", element)));
            return hashMap;
        }
        throw new XMLResourceParseException("DefaultTeXFont.xml", "GeneralSettings");
    }

    public Map<String, Float> parseParameters() {
        HashMap hashMap = new HashMap();
        Element element = (Element) this.root.getElementsByTagName("Parameters").item(0);
        if (element != null) {
            NamedNodeMap attributes = element.getAttributes();
            for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                String name = ((Attr) attributes.item(i10)).getName();
                hashMap.put(name, new Float(getFloatAndCheck(name, element)));
            }
            return hashMap;
        }
        throw new XMLResourceParseException("DefaultTeXFont.xml", "Parameters");
    }

    public Map<String, CharFont> parseSymbolMappings() {
        Element documentElement;
        String str;
        HashMap hashMap = new HashMap();
        Element element = (Element) this.root.getElementsByTagName("SymbolMappings").item(0);
        if (element != null) {
            NodeList elementsByTagName = element.getElementsByTagName("Mapping");
            for (int i10 = 0; i10 < elementsByTagName.getLength(); i10++) {
                String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("include", (Element) elementsByTagName.item(i10));
                try {
                    if (this.base == null) {
                        documentElement = factory.newDocumentBuilder().parse(JLatexMathAndroid.getResourceAsStream(attrValueAndCheckIfNotNull)).getDocumentElement();
                    } else {
                        documentElement = factory.newDocumentBuilder().parse(JLatexMathAndroid.getResourceAsStream(attrValueAndCheckIfNotNull)).getDocumentElement();
                    }
                    NodeList elementsByTagName2 = documentElement.getElementsByTagName("SymbolMapping");
                    for (int i11 = 0; i11 < elementsByTagName2.getLength(); i11++) {
                        Element element2 = (Element) elementsByTagName2.item(i11);
                        String attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull("name", element2);
                        int intAndCheck = getIntAndCheck("ch", element2);
                        String attrValueAndCheckIfNotNull3 = getAttrValueAndCheckIfNotNull("fontId", element2);
                        try {
                            str = getAttrValueAndCheckIfNotNull("boldId", element2);
                        } catch (ResourceParseException unused) {
                            str = null;
                        }
                        if (str == null) {
                            hashMap.put(attrValueAndCheckIfNotNull2, new CharFont((char) intAndCheck, Font_ID.indexOf(attrValueAndCheckIfNotNull3)));
                        } else {
                            hashMap.put(attrValueAndCheckIfNotNull2, new CharFont((char) intAndCheck, Font_ID.indexOf(attrValueAndCheckIfNotNull3), Font_ID.indexOf(str)));
                        }
                    }
                } catch (Exception unused2) {
                    throw new XMLResourceParseException(a.p("Cannot find the file ", attrValueAndCheckIfNotNull, "!"));
                }
            }
            return hashMap;
        }
        throw new XMLResourceParseException("DefaultTeXFont.xml", "SymbolMappings");
    }

    public Map<String, CharFont[]> parseTextStyleMappings() {
        return this.parsedTextStyles;
    }

    public DefaultTeXFontParser(InputStream inputStream, String str) {
        this.base = null;
        factory.setIgnoringElementContentWhitespace(true);
        factory.setIgnoringComments(true);
        try {
            this.root = factory.newDocumentBuilder().parse(inputStream).getDocumentElement();
        } catch (Exception e) {
            throw new XMLResourceParseException(str, e);
        }
    }

    public DefaultTeXFontParser(Object obj, InputStream inputStream, String str) {
        this.base = obj;
        factory.setIgnoringElementContentWhitespace(true);
        factory.setIgnoringComments(true);
        try {
            this.root = factory.newDocumentBuilder().parse(inputStream).getDocumentElement();
        } catch (Exception e) {
            throw new XMLResourceParseException(str, e);
        }
    }

    public FontInfo[] parseFontDescriptions(FontInfo[] fontInfoArr) {
        Element element = (Element) this.root.getElementsByTagName("FontDescriptions").item(0);
        if (element != null) {
            NodeList elementsByTagName = element.getElementsByTagName("Metrics");
            for (int i10 = 0; i10 < elementsByTagName.getLength(); i10++) {
                String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("include", (Element) elementsByTagName.item(i10));
                if (this.base == null) {
                    fontInfoArr = parseFontDescriptions(fontInfoArr, JLatexMathAndroid.getResourceAsStream(attrValueAndCheckIfNotNull), attrValueAndCheckIfNotNull);
                } else {
                    fontInfoArr = parseFontDescriptions(fontInfoArr, JLatexMathAndroid.getResourceAsStream(attrValueAndCheckIfNotNull), attrValueAndCheckIfNotNull);
                }
            }
        }
        return fontInfoArr;
    }
}
