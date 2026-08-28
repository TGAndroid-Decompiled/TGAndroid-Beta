package org.scilab.forge.jlatexmath;

import aa.d;
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
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setIgnoringElementContentWhitespace(true);
            newInstance.setIgnoringComments(true);
            this.root = newInstance.newDocumentBuilder().parse(JLatexMathAndroid.getResourceAsStream("GlueSettings.xml")).getDocumentElement();
            parseGlueTypes();
        } catch (Exception e10) {
            throw new XMLResourceParseException("GlueSettings.xml", e10);
        }
    }

    private static void checkMapping(Object obj, String str, String str2, String str3) {
        if (obj != null) {
            return;
        }
        throw new XMLResourceParseException("GlueSettings.xml", str, str2, d.o("has an unknown value '", str3, "'!"));
    }

    private Glue createGlue(Element element, String str) {
        double d;
        String[] strArr = {"space", "stretch", "shrink"};
        float[] fArr = new float[3];
        for (int i9 = 0; i9 < 3; i9++) {
            String str2 = null;
            try {
                str2 = element.getAttribute(strArr[i9]);
                if (!str2.equals("")) {
                    d = Double.parseDouble(str2);
                } else {
                    d = 0.0d;
                }
                fArr[i9] = (float) d;
            } catch (NumberFormatException unused) {
                throw new XMLResourceParseException("GlueSettings.xml", "GlueType", strArr[i9], d.o("has an invalid real value '", str2, "'!"));
            }
        }
        return new Glue(fArr[0], fArr[1], fArr[2], str);
    }

    private static String getAttrValueAndCheckIfNotNull(String str, Element element) {
        String attribute = element.getAttribute(str);
        if (!attribute.equals("")) {
            return attribute;
        }
        throw new XMLResourceParseException("GlueSettings.xml", element.getTagName(), str, null);
    }

    private void parseGlueTypes() {
        int i9;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        Element element = (Element) this.root.getElementsByTagName("GlueTypes").item(0);
        int i11 = -1;
        if (element != null) {
            NodeList elementsByTagName = element.getElementsByTagName("GlueType");
            i9 = 0;
            for (int i12 = 0; i12 < elementsByTagName.getLength(); i12++) {
                Element element2 = (Element) elementsByTagName.item(i12);
                String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("name", element2);
                Glue createGlue = createGlue(element2, attrValueAndCheckIfNotNull);
                if (attrValueAndCheckIfNotNull.equalsIgnoreCase("default")) {
                    i11 = i9;
                }
                arrayList.add(createGlue);
                i9++;
            }
        } else {
            i9 = 0;
        }
        if (i11 < 0) {
            arrayList.add(new Glue(0.0f, 0.0f, 0.0f, "default"));
            i11 = i9;
        }
        Glue[] glueArr = (Glue[]) arrayList.toArray(new Glue[arrayList.size()]);
        this.glueTypes = glueArr;
        if (i11 > 0) {
            Glue glue = glueArr[i11];
            glueArr[i11] = glueArr[0];
            glueArr[0] = glue;
        }
        while (true) {
            Glue[] glueArr2 = this.glueTypes;
            if (i10 < glueArr2.length) {
                this.glueTypeMappings.put(glueArr2[i10].getName(), Integer.valueOf(i10));
                i10++;
            } else {
                return;
            }
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
        int[][][] iArr = (int[][][]) Array.newInstance(Integer.TYPE, size, size, this.styleMappings.size());
        Element element = (Element) this.root.getElementsByTagName("GlueTable").item(0);
        if (element != null) {
            NodeList elementsByTagName = element.getElementsByTagName("Glue");
            int i9 = 0;
            while (i9 < elementsByTagName.getLength()) {
                Element element2 = (Element) elementsByTagName.item(i9);
                String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("lefttype", element2);
                String attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull("righttype", element2);
                String attrValueAndCheckIfNotNull3 = getAttrValueAndCheckIfNotNull("gluetype", element2);
                NodeList elementsByTagName2 = element2.getElementsByTagName("Style");
                int i10 = 0;
                while (i10 < elementsByTagName2.getLength()) {
                    String attrValueAndCheckIfNotNull4 = getAttrValueAndCheckIfNotNull("name", (Element) elementsByTagName2.item(i10));
                    int[][][] iArr2 = iArr;
                    Integer num = this.typeMappings.get(attrValueAndCheckIfNotNull);
                    NodeList nodeList = elementsByTagName;
                    Integer num2 = this.typeMappings.get(attrValueAndCheckIfNotNull2);
                    int i11 = i9;
                    Integer num3 = this.styleMappings.get(attrValueAndCheckIfNotNull4);
                    NodeList nodeList2 = elementsByTagName2;
                    Integer num4 = this.glueTypeMappings.get(attrValueAndCheckIfNotNull3);
                    checkMapping(num, "Glue", "lefttype", attrValueAndCheckIfNotNull);
                    checkMapping(num2, "Glue", "righttype", attrValueAndCheckIfNotNull2);
                    checkMapping(num4, "Glue", "gluetype", attrValueAndCheckIfNotNull3);
                    checkMapping(num3, "Style", "name", attrValueAndCheckIfNotNull4);
                    iArr2[num.intValue()][num2.intValue()][num3.intValue()] = num4.intValue();
                    i10++;
                    iArr = iArr2;
                    elementsByTagName = nodeList;
                    i9 = i11;
                    elementsByTagName2 = nodeList2;
                }
                i9++;
            }
        }
        return iArr;
    }

    public Glue[] getGlueTypes() {
        return this.glueTypes;
    }
}
