package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
public abstract class b {
    public static final float[][] f9164a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] f9165b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] f9166c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static a5.a a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        a5.a aVar;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return new a5.a((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                aVar = a5.a.e(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                aVar = null;
            }
            if (aVar != null) {
                return aVar;
            }
        }
        return new a5.a((Shader) null, (ColorStateList) null, 0);
    }

    public static String b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10) {
        if (!c(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i10);
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static int d(float f7) {
        float f10;
        boolean z10;
        float f11;
        if (f7 < 1.0f) {
            return -16777216;
        }
        if (f7 > 99.0f) {
            return -1;
        }
        float f12 = (f7 + 16.0f) / 116.0f;
        if (f7 > 8.0f) {
            f10 = f12 * f12 * f12;
        } else {
            f10 = f7 / 903.2963f;
        }
        float f13 = f12 * f12 * f12;
        if (f13 > 0.008856452f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f11 = f13;
        } else {
            f11 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z10) {
            f13 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f9166c;
        return i0.a.c(f11 * fArr[0], f10 * fArr[1], f13 * fArr[2]);
    }

    public static float e(int i10) {
        float pow;
        float f7 = i10 / 255.0f;
        if (f7 <= 0.04045f) {
            pow = f7 / 12.92f;
        } else {
            pow = (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static TypedArray f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static d g(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i10;
        boolean z10;
        int i11;
        int i12;
        o0.e eVar;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), d0.a.f6170b);
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
                        i(xmlResourceParser);
                    }
                    List h = h(resources, resourceId);
                    if (string4 != null) {
                        eVar = new o0.e(string, string2, string4, h);
                    } else {
                        eVar = null;
                    }
                    return new g(new o0.e(string, string2, string3, h), eVar, integer, integer2, string5);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), d0.a.f6171c);
                            int i13 = 8;
                            if (!obtainAttributes2.hasValue(8)) {
                                i13 = 1;
                            }
                            int i14 = obtainAttributes2.getInt(i13, 400);
                            if (obtainAttributes2.hasValue(6)) {
                                i10 = 6;
                            } else {
                                i10 = 2;
                            }
                            if (1 == obtainAttributes2.getInt(i10, 0)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int i15 = 9;
                            if (!obtainAttributes2.hasValue(9)) {
                                i15 = 3;
                            }
                            if (obtainAttributes2.hasValue(7)) {
                                i11 = 7;
                            } else {
                                i11 = 4;
                            }
                            String string6 = obtainAttributes2.getString(i11);
                            int i16 = obtainAttributes2.getInt(i15, 0);
                            if (obtainAttributes2.hasValue(5)) {
                                i12 = 5;
                            } else {
                                i12 = 0;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i12, 0);
                            String string7 = obtainAttributes2.getString(i12);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != 3) {
                                i(xmlResourceParser);
                            }
                            arrayList.add(new f(string7, i14, z10, string6, i16, resourceId2));
                        } else {
                            i(xmlResourceParser);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new e((f[]) arrayList.toArray(new f[0]));
            }
            i(xmlResourceParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List h(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
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
                String[] stringArray2 = resources.getStringArray(i10);
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

    public static void i(XmlPullParser xmlPullParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i10--;
                }
            } else {
                i10++;
            }
        }
    }

    public static float j() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
