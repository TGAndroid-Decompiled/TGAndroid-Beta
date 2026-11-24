package org.scilab.forge.jlatexmath;

import java.io.InputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.noties.jlatexmath.JLatexMathAndroid;
public class TeXFormulaSettingsParser {
    public static final String CHARTODEL_MAPPING_EL = "Map";
    public static final String RESOURCE_NAME = "TeXFormulaSettings.xml";
    private Element root;

    public TeXFormulaSettingsParser(InputStream inputStream, String str) {
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setIgnoringElementContentWhitespace(true);
            newInstance.setIgnoringComments(true);
            this.root = newInstance.newDocumentBuilder().parse(inputStream).getDocumentElement();
        } catch (Exception e) {
            throw new XMLResourceParseException(str, e);
        }
    }

    private static void addFormulaToMap(NodeList nodeList, String[] strArr, String[] strArr2) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            String attribute = element.getAttribute("char");
            String attribute2 = element.getAttribute("formula");
            String attribute3 = element.getAttribute("text");
            if (!attribute.equals("")) {
                if (!attribute2.equals("")) {
                    if (attribute.length() == 1) {
                        strArr[attribute.charAt(0)] = attribute2;
                        if (strArr2 != null && !attribute3.equals("")) {
                            strArr2[attribute.charAt(0)] = attribute3;
                        }
                    } else {
                        k93.g("TeXFormulaSettings.xml", element.getTagName(), "char", "must have a value that contains exactly 1 character!");
                        return;
                    }
                } else {
                    k93.g("TeXFormulaSettings.xml", element.getTagName(), "formula", null);
                    return;
                }
            } else {
                k93.g("TeXFormulaSettings.xml", element.getTagName(), "char", null);
                return;
            }
        }
    }

    private static void addToMap(NodeList nodeList, String[] strArr, String[] strArr2) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            String attribute = element.getAttribute("char");
            String attribute2 = element.getAttribute("symbol");
            String attribute3 = element.getAttribute("text");
            if (!attribute.equals("")) {
                if (!attribute2.equals("")) {
                    if (attribute.length() == 1) {
                        strArr[attribute.charAt(0)] = attribute2;
                        if (strArr2 != null && !attribute3.equals("")) {
                            strArr2[attribute.charAt(0)] = attribute3;
                        }
                    } else {
                        k93.g("TeXFormulaSettings.xml", element.getTagName(), "char", "must have a value that contains exactly 1 character!");
                        return;
                    }
                } else {
                    k93.g("TeXFormulaSettings.xml", element.getTagName(), "symbol", null);
                    return;
                }
            } else {
                k93.g("TeXFormulaSettings.xml", element.getTagName(), "char", null);
                return;
            }
        }
    }

    public void parseSymbolMappings(String[] strArr, String[] strArr2) {
        Element element = (Element) this.root.getElementsByTagName("CharacterToSymbolMappings").item(0);
        if (element != null) {
            addToMap(element.getElementsByTagName("Map"), strArr, strArr2);
        }
    }

    public void parseSymbolToFormulaMappings(String[] strArr, String[] strArr2) {
        Element element = (Element) this.root.getElementsByTagName("CharacterToFormulaMappings").item(0);
        if (element != null) {
            addFormulaToMap(element.getElementsByTagName("Map"), strArr, strArr2);
        }
    }

    public TeXFormulaSettingsParser() {
        this(JLatexMathAndroid.getResourceAsStream("TeXFormulaSettings.xml"), "TeXFormulaSettings.xml");
    }
}
