package org.scilab.forge.jlatexmath;

import java.io.InputStream;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.noties.jlatexmath.JLatexMathAndroid;

public class PredefinedTeXFormulaParser {
    public static final String RESOURCE_NAME = "PredefinedTeXFormulas.xml";
    private Element root;
    private String type;

    public PredefinedTeXFormulaParser(InputStream inputStream, String str) {
        try {
            this.type = str;
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setIgnoringElementContentWhitespace(true);
            documentBuilderFactoryNewInstance.setIgnoringComments(true);
            this.root = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(inputStream).getDocumentElement();
        } catch (Exception e) {
            throw new XMLResourceParseException("", e);
        }
    }

    private static String getAttrValueAndCheckIfNotNull(String str, Element element) {
        String attribute = element.getAttribute(str);
        if (attribute.equals("")) {
            throw new XMLResourceParseException("PredefinedTeXFormulas.xml", element.getTagName(), str, null);
        }
        return attribute;
    }

    public void parse(Map map) {
        if ("true".equals(getAttrValueAndCheckIfNotNull("enabled", this.root))) {
            NodeList elementsByTagName = this.root.getElementsByTagName(this.type);
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element = (Element) elementsByTagName.item(i);
                if ("true".equals(getAttrValueAndCheckIfNotNull("enabled", element))) {
                    String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("name", element);
                    if ("TeXFormula".equals(this.type)) {
                        map.put(attrValueAndCheckIfNotNull, (TeXFormula) new TeXFormulaParser(attrValueAndCheckIfNotNull, element, this.type).parse());
                    } else {
                        map.put(attrValueAndCheckIfNotNull, (MacroInfo) new TeXFormulaParser(attrValueAndCheckIfNotNull, element, this.type).parse());
                    }
                }
            }
        }
    }

    public PredefinedTeXFormulaParser(String str, String str2) {
        this(JLatexMathAndroid.getResourceAsStream(str), str2);
    }
}
