package org.scilab.forge.jlatexmath;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.noties.jlatexmath.JLatexMathAndroid;
public class TeXSymbolParser {
    public static final String DELIMITER_ATTR = "del";
    public static final String RESOURCE_NAME = "TeXSymbols.xml";
    public static final String TYPE_ATTR = "type";
    private static Map<String, Integer> typeMappings = new HashMap();
    private Element root;

    public TeXSymbolParser(InputStream inputStream, String str) {
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setIgnoringElementContentWhitespace(true);
            newInstance.setIgnoringComments(true);
            this.root = newInstance.newDocumentBuilder().parse(inputStream).getDocumentElement();
            setTypeMappings();
        } catch (Exception e) {
            throw new XMLResourceParseException(str, e);
        }
    }

    private static String getAttrValueAndCheckIfNotNull(String str, Element element) {
        String attribute = element.getAttribute(str);
        if (!attribute.equals("")) {
            return attribute;
        }
        k93.g("TeXSymbols.xml", element.getTagName(), str, null);
        return null;
    }

    private void setTypeMappings() {
        typeMappings.put("ord", 0);
        typeMappings.put("op", 1);
        typeMappings.put("bin", 2);
        typeMappings.put("rel", 3);
        typeMappings.put("open", 4);
        typeMappings.put("close", 5);
        typeMappings.put("punct", 6);
        typeMappings.put("acc", 10);
    }

    public Map<String, SymbolAtom> readSymbols() {
        boolean z;
        HashMap hashMap = new HashMap();
        NodeList elementsByTagName = this.root.getElementsByTagName("Symbol");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Element element = (Element) elementsByTagName.item(i);
            String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("name", element);
            String attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull("type", element);
            String attribute = element.getAttribute("del");
            if (attribute != null && attribute.equals("true")) {
                z = true;
            } else {
                z = false;
            }
            Integer num = typeMappings.get(attrValueAndCheckIfNotNull2);
            if (num != null) {
                hashMap.put(attrValueAndCheckIfNotNull, new SymbolAtom(attrValueAndCheckIfNotNull, num.intValue(), z));
            } else {
                k93.g("TeXSymbols.xml", "Symbol", "type", tb4.y("has an unknown value '", attrValueAndCheckIfNotNull2, "'!"));
                return null;
            }
        }
        return hashMap;
    }

    public TeXSymbolParser() {
        this(JLatexMathAndroid.getResourceAsStream("TeXSymbols.xml"), "TeXSymbols.xml");
    }
}
