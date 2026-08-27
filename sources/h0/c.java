package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import h7.n;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public abstract class c {

    public static final ThreadLocal f7712a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        int iD;
        float f10;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r10 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r10 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr2 = d0.a.f4676a;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i10, i10);
                int resourceId = typedArrayObtainAttributes.getResourceId(i10, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f7712a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, (boolean) r10);
                    int i12 = typedValue.type;
                    if (i12 < 28 || i12 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = typedArrayObtainAttributes.getColor(i10, -65281);
                        }
                    } else {
                        color = typedArrayObtainAttributes.getColor(i10, -65281);
                    }
                } else {
                    color = typedArrayObtainAttributes.getColor(i10, -65281);
                }
                float f11 = typedArrayObtainAttributes.hasValue(r10) ? typedArrayObtainAttributes.getFloat(r10, 1.0f) : typedArrayObtainAttributes.hasValue(3) ? typedArrayObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                float f12 = (Build.VERSION.SDK_INT < 31 || !typedArrayObtainAttributes.hasValue(2)) ? typedArrayObtainAttributes.getFloat(4, -1.0f) : typedArrayObtainAttributes.getFloat(2, -1.0f);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i13 = 0;
                for (int i14 = 0; i14 < attributeCount; i14++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i14);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != 2130968618 && attributeNameResource != 2130968825) {
                        int i15 = i13 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i14, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i13] = attributeNameResource;
                        i13 = i15;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i13);
                float f13 = 0.0f;
                boolean z10 = f12 >= 0.0f && f12 <= 100.0f;
                if (f11 != 1.0f || z10) {
                    int iB = n.b((int) ((Color.alpha(color) * f11) + 0.5f), 0, 255);
                    if (z10) {
                        a aVarA = a.a(color);
                        float f14 = aVarA.f7704a;
                        float f15 = aVarA.f7705b;
                        l lVar = l.f7731k;
                        if (f15 >= 1.0d && Math.round(f12) > 0.0d && Math.round(f12) < 100.0d) {
                            float fMin = f14 < 0.0f ? 0.0f : Math.min(360.0f, f14);
                            float fA = f15;
                            a aVar = null;
                            boolean z11 = true;
                            while (true) {
                                if (Math.abs(f13 - f15) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                    if (aVar != null) {
                                        iD = aVar.c(lVar);
                                        break;
                                    }
                                    iD = b.d(f12);
                                    break;
                                }
                                float f16 = 1000.0f;
                                iArrTrimStateSet = iArrTrimStateSet;
                                float f17 = 100.0f;
                                float f18 = 0.0f;
                                float f19 = 1000.0f;
                                a aVar2 = null;
                                while (true) {
                                    if (Math.abs(f18 - f17) <= 0.01f) {
                                        depth2 = depth2;
                                        break;
                                    }
                                    float fA2 = com.google.android.recaptcha.internal.a.A(f17, f18, 2.0f, f18);
                                    float f20 = f17;
                                    int iC = a.b(fA2, fA, fMin).c(l.f7731k);
                                    float fE = b.e(Color.red(iC));
                                    float fE2 = b.e(Color.green(iC));
                                    float fE3 = b.e(Color.blue(iC));
                                    float[] fArr = b.d[1];
                                    float f21 = (fE2 * fArr[1]) + (fE * fArr[0]);
                                    float f22 = fArr[2];
                                    depth2 = depth2;
                                    float fY = com.google.android.recaptcha.internal.a.y(fE3, f22, f21, 100.0f);
                                    float fCbrt = fY <= 0.008856452f ? fY * 903.2963f : (((float) Math.cbrt(fY)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f12 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        a aVarA2 = a.a(iC);
                                        f10 = fCbrt;
                                        a aVarB = a.b(aVarA2.f7706c, aVarA2.f7705b, fMin);
                                        float f23 = aVarA2.d - aVarB.d;
                                        float f24 = aVarA2.f7707e - aVarB.f7707e;
                                        float f25 = aVarA2.f7708f - aVarB.f7708f;
                                        float fPow = (float) (Math.pow(Math.sqrt((f25 * f25) + (f24 * f24) + (f23 * f23)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f19 = fPow;
                                            f16 = fAbs;
                                            aVar2 = aVarA2;
                                        }
                                    } else {
                                        f10 = fCbrt;
                                    }
                                    if (f16 == 0.0f && f19 == 0.0f) {
                                        break;
                                    }
                                    if (f10 < f12) {
                                        f17 = f20;
                                        f18 = fA2;
                                    } else {
                                        f17 = fA2;
                                    }
                                    depth2 = depth2;
                                }
                                a aVar3 = aVar2;
                                if (!z11) {
                                    if (aVar3 == null) {
                                        f15 = fA;
                                    } else {
                                        aVar = aVar3;
                                        f13 = fA;
                                    }
                                    fA = com.google.android.recaptcha.internal.a.A(f15, f13, 2.0f, f13);
                                } else {
                                    if (aVar3 != null) {
                                        iD = aVar3.c(lVar);
                                        break;
                                    }
                                    fA = com.google.android.recaptcha.internal.a.A(f15, f13, 2.0f, f13);
                                    z11 = false;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            depth2 = depth2;
                            iD = b.d(f12);
                        }
                        color = iD;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (iB << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                }
                int i16 = i11 + 1;
                if (i16 > iArr.length) {
                    int[] iArr4 = new int[i11 <= 4 ? 8 : i11 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i11);
                    iArr = iArr4;
                }
                iArr[i11] = color;
                if (i16 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i11 > 4 ? i11 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i11);
                    objArr = objArr2;
                }
                objArr[i11] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i11 = i16;
                depth2 = depth2;
                r10 = 1;
                i10 = 0;
            } else {
                depth2 = depth2;
                r10 = 1;
                i10 = 0;
            }
        }
        int[] iArr5 = new int[i11];
        int[][] iArr6 = new int[i11][];
        System.arraycopy(iArr, 0, iArr5, 0, i11);
        System.arraycopy(objArr, 0, iArr6, 0, i11);
        return new ColorStateList(iArr6, iArr5);
    }
}
