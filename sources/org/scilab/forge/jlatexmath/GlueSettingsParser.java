package org.scilab.forge.jlatexmath;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.noties.jlatexmath.JLatexMathAndroid;

public class GlueSettingsParser {
    private Glue[] glueTypes;
    private Element root;
    private final Map typeMappings = new HashMap();
    private final Map glueTypeMappings = new HashMap();
    private final Map styleMappings = new HashMap();

    public GlueSettingsParser() {
        try {
            setTypeMappings();
            setStyleMappings();
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setIgnoringElementContentWhitespace(true);
            documentBuilderFactoryNewInstance.setIgnoringComments(true);
            this.root = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(JLatexMathAndroid.getResourceAsStream("GlueSettings.xml")).getDocumentElement();
            parseGlueTypes();
        } catch (Exception e) {
            throw new XMLResourceParseException("GlueSettings.xml", e);
        }
    }

    private void setStyleMappings() {
        this.styleMappings.put("display", 0);
        this.styleMappings.put("text", 1);
        this.styleMappings.put("script", 2);
        this.styleMappings.put("script_script", 3);
    }

    private void parseGlueTypes() {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        Element element = (Element) this.root.getElementsByTagName("GlueTypes").item(0);
        int i3 = -1;
        if (element != null) {
            NodeList elementsByTagName = element.getElementsByTagName("GlueType");
            i = 0;
            for (int i4 = 0; i4 < elementsByTagName.getLength(); i4++) {
                Element element2 = (Element) elementsByTagName.item(i4);
                String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("name", element2);
                Glue glueCreateGlue = createGlue(element2, attrValueAndCheckIfNotNull);
                if (attrValueAndCheckIfNotNull.equalsIgnoreCase("default")) {
                    i3 = i;
                }
                arrayList.add(glueCreateGlue);
                i++;
            }
        } else {
            i = 0;
        }
        if (i3 < 0) {
            arrayList.add(new Glue(0.0f, 0.0f, 0.0f, "default"));
            i3 = i;
        }
        Glue[] glueArr = (Glue[]) arrayList.toArray(new Glue[arrayList.size()]);
        this.glueTypes = glueArr;
        if (i3 > 0) {
            Glue glue = glueArr[i3];
            glueArr[i3] = glueArr[0];
            glueArr[0] = glue;
        }
        while (true) {
            Glue[] glueArr2 = this.glueTypes;
            if (i2 >= glueArr2.length) {
                return;
            }
            this.glueTypeMappings.put(glueArr2[i2].getName(), Integer.valueOf(i2));
            i2++;
        }
    }

    private Glue createGlue(Element element, String str) {
        String[] strArr = {"space", "stretch", "shrink"};
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            String attribute = null;
            try {
                attribute = element.getAttribute(strArr[i]);
                fArr[i] = (float) (!attribute.equals("") ? Double.parseDouble(attribute) : 0.0d);
            } catch (NumberFormatException unused) {
                throw new XMLResourceParseException("GlueSettings.xml", "GlueType", strArr[i], "has an invalid real value '" + attribute + "'!");
            }
        }
        return new Glue(fArr[0], fArr[1], fArr[2], str);
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

    public Glue[] getGlueTypes() {
        return this.glueTypes;
    }

    public int[][][] createGlueTable() {
        int size = this.typeMappings.size();
        int[][][] iArr = (int[][][]) Array.newInstance((Class<?>) Integer.TYPE, size, size, this.styleMappings.size());
        Element element = (Element) this.root.getElementsByTagName("GlueTable").item(0);
        if (element != null) {
            NodeList elementsByTagName = element.getElementsByTagName("Glue");
            int i = 0;
            while (i < elementsByTagName.getLength()) {
                Element element2 = (Element) elementsByTagName.item(i);
                String attrValueAndCheckIfNotNull = getAttrValueAndCheckIfNotNull("lefttype", element2);
                String attrValueAndCheckIfNotNull2 = getAttrValueAndCheckIfNotNull("righttype", element2);
                String attrValueAndCheckIfNotNull3 = getAttrValueAndCheckIfNotNull("gluetype", element2);
                NodeList elementsByTagName2 = element2.getElementsByTagName("Style");
                int i2 = 0;
                while (i2 < elementsByTagName2.getLength()) {
                    String attrValueAndCheckIfNotNull4 = getAttrValueAndCheckIfNotNull("name", (Element) elementsByTagName2.item(i2));
                    NodeList nodeList = elementsByTagName;
                    Object obj = this.typeMappings.get(attrValueAndCheckIfNotNull);
                    NodeList nodeList2 = elementsByTagName2;
                    Object obj2 = this.typeMappings.get(attrValueAndCheckIfNotNull2);
                    int i3 = i;
                    Object obj3 = this.styleMappings.get(attrValueAndCheckIfNotNull4);
                    int i4 = i2;
                    Object obj4 = this.glueTypeMappings.get(attrValueAndCheckIfNotNull3);
                    checkMapping(obj, "Glue", "lefttype", attrValueAndCheckIfNotNull);
                    checkMapping(obj2, "Glue", "righttype", attrValueAndCheckIfNotNull2);
                    checkMapping(obj4, "Glue", "gluetype", attrValueAndCheckIfNotNull3);
                    checkMapping(obj3, "Style", "name", attrValueAndCheckIfNotNull4);
                    iArr[((Integer) obj).intValue()][((Integer) obj2).intValue()][((Integer) obj3).intValue()] = ((Integer) obj4).intValue();
                    i2 = i4 + 1;
                    elementsByTagName = nodeList;
                    elementsByTagName2 = nodeList2;
                    i = i3;
                }
                i++;
            }
        }
        return iArr;
    }

    private static void checkMapping(Object obj, String str, String str2, String str3) {
        if (obj != null) {
            return;
        }
        throw new XMLResourceParseException("GlueSettings.xml", str, str2, "has an unknown value '" + str3 + "'!");
    }

    private static String getAttrValueAndCheckIfNotNull(String str, Element element) {
        String attribute = element.getAttribute(str);
        if (attribute.equals("")) {
            throw new XMLResourceParseException("GlueSettings.xml", element.getTagName(), str, null);
        }
        return attribute;
    }
}
