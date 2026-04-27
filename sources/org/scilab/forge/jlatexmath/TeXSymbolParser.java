package org.scilab.forge.jlatexmath;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.noties.jlatexmath.JLatexMathAndroid;

public class TeXSymbolParser {
    private static Map typeMappings = new HashMap();
    private Element root;

    public TeXSymbolParser() {
        this(JLatexMathAndroid.getResourceAsStream("TeXSymbols.xml"), "TeXSymbols.xml");
    }

    public TeXSymbolParser(InputStream inputStream, String str) {
        try {
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setIgnoringElementContentWhitespace(true);
            documentBuilderFactoryNewInstance.setIgnoringComments(true);
            this.root = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(inputStream).getDocumentElement();
            setTypeMappings();
        } catch (Exception e) {
            throw new XMLResourceParseException(str, e);
        }
    }

    public Map readSymbols() {
        HashMap map = new HashMap();
        NodeList elementsByTagName = this.root.getElementsByTagName("Symbol");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Element element = (Element) elementsByTagName.item(i);
            String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("name", element);
            String attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull("type", element);
            String attribute = element.getAttribute("del");
            boolean z = attribute != null && attribute.equals("true");
            Object obj = typeMappings.get(attrValueAndCheckIfNotNull2);
            if (obj == null) {
                throw new XMLResourceParseException("TeXSymbols.xml", "Symbol", "type", "has an unknown value '" + attrValueAndCheckIfNotNull2 + "'!");
            }
            map.put(attrValueAndCheckIfNotNull, new SymbolAtom(attrValueAndCheckIfNotNull, ((Integer) obj).intValue(), z));
        }
        return map;
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

    private static String getAttrValueAndCheckIfNotNull(String str, Element element) {
        String attribute = element.getAttribute(str);
        if (attribute.equals("")) {
            throw new XMLResourceParseException("TeXSymbols.xml", element.getTagName(), str, null);
        }
        return attribute;
    }
}
