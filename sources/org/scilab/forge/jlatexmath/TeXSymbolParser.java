package org.scilab.forge.jlatexmath;

import android.support.v4.media.a;
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
        if (!attribute.equals("")) {
            return attribute;
        }
        throw new XMLResourceParseException("TeXSymbols.xml", element.getTagName(), str, null);
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
        boolean z4;
        HashMap hashMap = new HashMap();
        NodeList elementsByTagName = this.root.getElementsByTagName("Symbol");
        for (int i10 = 0; i10 < elementsByTagName.getLength(); i10++) {
            Element element = (Element) elementsByTagName.item(i10);
            String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("name", element);
            String attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull("type", element);
            String attribute = element.getAttribute("del");
            if (attribute != null && attribute.equals("true")) {
                z4 = true;
            } else {
                z4 = false;
            }
            Integer num = typeMappings.get(attrValueAndCheckIfNotNull2);
            if (num != null) {
                hashMap.put(attrValueAndCheckIfNotNull, new SymbolAtom(attrValueAndCheckIfNotNull, num.intValue(), z4));
            } else {
                throw new XMLResourceParseException("TeXSymbols.xml", "Symbol", "type", a.o("has an unknown value '", attrValueAndCheckIfNotNull2, "'!"));
            }
        }
        return hashMap;
    }

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
}
