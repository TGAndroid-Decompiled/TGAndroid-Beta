package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
public abstract class tme {
    public static bo4 a(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        boolean z;
        int i2;
        int i3;
        un4 un4Var;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                xmlResourceParser.require(2, null, "font-family");
                if (xmlResourceParser.getName().equals("font-family")) {
                    TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), t19.b);
                    String string = obtainAttributes.getString(0);
                    String string2 = obtainAttributes.getString(5);
                    String string3 = obtainAttributes.getString(6);
                    String string4 = obtainAttributes.getString(2);
                    int resourceId = obtainAttributes.getResourceId(1, 0);
                    int integer = obtainAttributes.getInteger(3, 1);
                    int integer2 = obtainAttributes.getInteger(4, 500);
                    String string5 = obtainAttributes.getString(7);
                    obtainAttributes.recycle();
                    if (string != null && string2 != null && string3 != null) {
                        while (xmlResourceParser.next() != 3) {
                            c(xmlResourceParser);
                        }
                        List b = b(resources, resourceId);
                        if (string4 != null) {
                            un4Var = new un4(string, string2, string4, b);
                        } else {
                            un4Var = null;
                        }
                        return new eo4(new un4(string, string2, string3, b), un4Var, integer, integer2, string5);
                    }
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != 3) {
                        if (xmlResourceParser.getEventType() == 2) {
                            if (xmlResourceParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), t19.c);
                                int i4 = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i4 = 1;
                                }
                                int i5 = obtainAttributes2.getInt(i4, 400);
                                if (obtainAttributes2.hasValue(6)) {
                                    i = 6;
                                } else {
                                    i = 2;
                                }
                                if (1 == obtainAttributes2.getInt(i, 0)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                int i6 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i6 = 3;
                                }
                                if (obtainAttributes2.hasValue(7)) {
                                    i2 = 7;
                                } else {
                                    i2 = 4;
                                }
                                String string6 = obtainAttributes2.getString(i2);
                                int i7 = obtainAttributes2.getInt(i6, 0);
                                if (obtainAttributes2.hasValue(5)) {
                                    i3 = 5;
                                } else {
                                    i3 = 0;
                                }
                                int resourceId2 = obtainAttributes2.getResourceId(i3, 0);
                                String string7 = obtainAttributes2.getString(i3);
                                obtainAttributes2.recycle();
                                while (xmlResourceParser.next() != 3) {
                                    c(xmlResourceParser);
                                }
                                arrayList.add(new do4(string7, i5, z, string6, i7, resourceId2));
                            } else {
                                c(xmlResourceParser);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return new co4((do4[]) arrayList.toArray(new do4[0]));
                }
                c(xmlResourceParser);
                return null;
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    public static List b(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(XmlResourceParser xmlResourceParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlResourceParser.next();
            if (next != 2) {
                if (next == 3) {
                    i--;
                }
            } else {
                i++;
            }
        }
    }
}
