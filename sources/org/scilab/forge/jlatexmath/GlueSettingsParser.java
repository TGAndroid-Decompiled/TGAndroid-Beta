package org.scilab.forge.jlatexmath;

import a9.p;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.noties.jlatexmath.JLatexMathAndroid;

public class GlueSettingsParser {
    private static final String RESOURCE_NAME = "GlueSettings.xml";
    private Glue[] glueTypes;
    private Element root;
    private final Map<String, Integer> typeMappings = new HashMap();
    private final Map<String, Integer> glueTypeMappings = new HashMap();
    private final Map<String, Integer> styleMappings = new HashMap();

    public GlueSettingsParser() {
        try {
            setTypeMappings();
            setStyleMappings();
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setIgnoringElementContentWhitespace(true);
            documentBuilderFactoryNewInstance.setIgnoringComments(true);
            this.root = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(JLatexMathAndroid.getResourceAsStream("GlueSettings.xml")).getDocumentElement();
            parseGlueTypes();
        } catch (Exception e9) {
            throw new XMLResourceParseException("GlueSettings.xml", e9);
        }
    }

    private static void checkMapping(Object obj, String str, String str2, String str3) {
        if (obj == null) {
            throw new XMLResourceParseException("GlueSettings.xml", str, str2, p.m("has an unknown value '", str3, "'!"));
        }
    }

    private Glue createGlue(Element element, String str) {
        String[] strArr = {"space", "stretch", "shrink"};
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            try {
                String attribute = element.getAttribute(strArr[i10]);
                fArr[i10] = (float) (!attribute.equals("") ? Double.parseDouble(attribute) : 0.0d);
            } catch (NumberFormatException unused) {
                throw new XMLResourceParseException("GlueSettings.xml", "GlueType", strArr[i10], p.m("has an invalid real value '", null, "'!"));
            }
        }
        return new Glue(fArr[0], fArr[1], fArr[2], str);
    }

    private static String getAttrValueAndCheckIfNotNull(String str, Element element) {
        String attribute = element.getAttribute(str);
        if (attribute.equals("")) {
            throw new XMLResourceParseException("GlueSettings.xml", element.getTagName(), str, null);
        }
        return attribute;
    }

    private void parseGlueTypes() {
        int i10;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        Element element = (Element) this.root.getElementsByTagName("GlueTypes").item(0);
        int i12 = -1;
        if (element != null) {
            NodeList elementsByTagName = element.getElementsByTagName("GlueType");
            i10 = 0;
            for (int i13 = 0; i13 < elementsByTagName.getLength(); i13++) {
                Element element2 = (Element) elementsByTagName.item(i13);
                String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("name", element2);
                Glue glueCreateGlue = createGlue(element2, attrValueAndCheckIfNotNull);
                if (attrValueAndCheckIfNotNull.equalsIgnoreCase("default")) {
                    i12 = i10;
                }
                arrayList.add(glueCreateGlue);
                i10++;
            }
        } else {
            i10 = 0;
        }
        if (i12 < 0) {
            arrayList.add(new Glue(0.0f, 0.0f, 0.0f, "default"));
            i12 = i10;
        }
        Glue[] glueArr = (Glue[]) arrayList.toArray(new Glue[arrayList.size()]);
        this.glueTypes = glueArr;
        if (i12 > 0) {
            Glue glue = glueArr[i12];
            glueArr[i12] = glueArr[0];
            glueArr[0] = glue;
        }
        while (true) {
            Glue[] glueArr2 = this.glueTypes;
            if (i11 >= glueArr2.length) {
                return;
            }
            this.glueTypeMappings.put(glueArr2[i11].getName(), Integer.valueOf(i11));
            i11++;
        }
    }

    private void setStyleMappings() {
        this.styleMappings.put("display", 0);
        this.styleMappings.put("text", 1);
        this.styleMappings.put("script", 2);
        this.styleMappings.put("script_script", 3);
    }

    private void setTypeMappings() {
        this.typeMappings.put("ord", 0);
        this.typeMappings.put("op", 1);
        this.typeMappings.put("bin", 2);
        this.typeMappings.put("rel", 3);
        this.typeMappings.put("open", 4);
        this.typeMappings.put("close", 5);
        this.typeMappings.put("punct", 6);
        this.typeMappings.put("inner", 7);
    }

    public int[][][] createGlueTable() {
        int size = this.typeMappings.size();
        int[][][] iArr = (int[][][]) Array.newInstance((Class<?>) Integer.TYPE, size, size, this.styleMappings.size());
        Element element = (Element) this.root.getElementsByTagName("GlueTable").item(0);
        if (element != null) {
            NodeList elementsByTagName = element.getElementsByTagName("Glue");
            int i10 = 0;
            while (i10 < elementsByTagName.getLength()) {
                Element element2 = (Element) elementsByTagName.item(i10);
                String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("lefttype", element2);
                String attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull("righttype", element2);
                String attrValueAndCheckIfNotNull3 = getAttrValueAndCheckIfNotNull("gluetype", element2);
                NodeList elementsByTagName2 = element2.getElementsByTagName("Style");
                int i11 = 0;
                while (i11 < elementsByTagName2.getLength()) {
                    String attrValueAndCheckIfNotNull4 = getAttrValueAndCheckIfNotNull("name", (Element) elementsByTagName2.item(i11));
                    int[][][] iArr2 = iArr;
                    Integer num = this.typeMappings.get(attrValueAndCheckIfNotNull);
                    NodeList nodeList = elementsByTagName;
                    Integer num2 = this.typeMappings.get(attrValueAndCheckIfNotNull2);
                    int i12 = i10;
                    Integer num3 = this.styleMappings.get(attrValueAndCheckIfNotNull4);
                    NodeList nodeList2 = elementsByTagName2;
                    Integer num4 = this.glueTypeMappings.get(attrValueAndCheckIfNotNull3);
                    checkMapping(num, "Glue", "lefttype", attrValueAndCheckIfNotNull);
                    checkMapping(num2, "Glue", "righttype", attrValueAndCheckIfNotNull2);
                    checkMapping(num4, "Glue", "gluetype", attrValueAndCheckIfNotNull3);
                    checkMapping(num3, "Style", "name", attrValueAndCheckIfNotNull4);
                    iArr2[num.intValue()][num2.intValue()][num3.intValue()] = num4.intValue();
                    i11++;
                    iArr = iArr2;
                    elementsByTagName = nodeList;
                    i10 = i12;
                    elementsByTagName2 = nodeList2;
                }
                i10++;
            }
        }
        return iArr;
    }

    public Glue[] getGlueTypes() {
        return this.glueTypes;
    }
}
