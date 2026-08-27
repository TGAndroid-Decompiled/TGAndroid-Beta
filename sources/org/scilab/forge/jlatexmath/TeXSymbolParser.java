package org.scilab.forge.jlatexmath;

import a9.p;
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

    public TeXSymbolParser() {
        this(JLatexMathAndroid.getResourceAsStream("TeXSymbols.xml"), "TeXSymbols.xml");
    }

    private static String getAttrValueAndCheckIfNotNull(String str, Element element) {
        String attribute = element.getAttribute(str);
        if (attribute.equals("")) {
            throw new XMLResourceParseException("TeXSymbols.xml", element.getTagName(), str, null);
        }
        return attribute;
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
        HashMap map = new HashMap();
        NodeList elementsByTagName = this.root.getElementsByTagName("Symbol");
        for (int i10 = 0; i10 < elementsByTagName.getLength(); i10++) {
            Element element = (Element) elementsByTagName.item(i10);
            String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("name", element);
            String attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull("type", element);
            String attribute = element.getAttribute("del");
            boolean z10 = attribute != null && attribute.equals("true");
            Integer num = typeMappings.get(attrValueAndCheckIfNotNull2);
            if (num == null) {
                throw new XMLResourceParseException("TeXSymbols.xml", "Symbol", "type", p.m("has an unknown value '", attrValueAndCheckIfNotNull2, "'!"));
            }
            map.put(attrValueAndCheckIfNotNull, new SymbolAtom(attrValueAndCheckIfNotNull, num.intValue(), z10));
        }
        return map;
    }

    public TeXSymbolParser(InputStream inputStream, String str) {
        try {
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setIgnoringElementContentWhitespace(true);
            documentBuilderFactoryNewInstance.setIgnoringComments(true);
            this.root = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(inputStream).getDocumentElement();
            setTypeMappings();
        } catch (Exception e9) {
            throw new XMLResourceParseException(str, e9);
        }
    }
}
