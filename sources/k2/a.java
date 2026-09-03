package k2;

import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.InflateException;
import j7.z7;
public abstract class a {
    public static final int[] f9610a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    public static final int[] f9611b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    public static final int[] f9612c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] d = {16842755, 16843781, 16844062};
    public static final int[] e = {16843161};
    public static final int[] f9613f = {16842755, 16843213};
    public static final int[] f9614g = {16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};
    public static final int[] h = {16843490};
    public static final int[] f9615i = {16843486, 16843487, 16843488, 16843489};
    public static final int[] f9616j = {16842788, 16843073, 16843488, 16843992};
    public static final int[] f9617k = {16843489, 16843781, 16843892, 16843893};

    public static android.animation.Animator a(android.content.Context r26, android.content.res.Resources r27, android.content.res.Resources.Theme r28, org.xmlpull.v1.XmlPullParser r29, android.util.AttributeSet r30, android.animation.AnimatorSet r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: k2.a.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i10, int i11, int i12, String str) {
        boolean z4;
        int i13;
        boolean z10;
        int i14;
        boolean z11;
        f fVar;
        int i15;
        int i16;
        int i17;
        float f10;
        PropertyValuesHolder ofFloat;
        float f11;
        float f12;
        TypedValue peekValue = typedArray.peekValue(i11);
        if (peekValue != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i13 = peekValue.type;
        } else {
            i13 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i12);
        if (peekValue2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i14 = peekValue2.type;
        } else {
            i14 = 0;
        }
        if (i10 == 4) {
            if ((z4 && c(i13)) || (z10 && c(i14))) {
                i10 = 3;
            } else {
                i10 = 0;
            }
        }
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            i0.d[] c3 = z7.c(string);
            i0.d[] c10 = z7.c(string2);
            if (c3 != null || c10 != null) {
                if (c3 != null) {
                    ?? obj = new Object();
                    if (c10 != null) {
                        if (z7.a(c3, c10)) {
                            return PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, c3, c10);
                        }
                        throw new InflateException(e2.c.k(" Can't morph from ", string, " to ", string2));
                    }
                    return PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, c3);
                } else if (c10 != null) {
                    return PropertyValuesHolder.ofObject(str, (TypeEvaluator) new Object(), c10);
                }
            }
            return null;
        }
        if (i10 == 3) {
            fVar = f.f9625a;
        } else {
            fVar = null;
        }
        if (z11) {
            if (z4) {
                if (i13 == 5) {
                    f11 = typedArray.getDimension(i11, 0.0f);
                } else {
                    f11 = typedArray.getFloat(i11, 0.0f);
                }
                if (z10) {
                    if (i14 == 5) {
                        f12 = typedArray.getDimension(i12, 0.0f);
                    } else {
                        f12 = typedArray.getFloat(i12, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f11, f12);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f11);
                }
            } else {
                if (i14 == 5) {
                    f10 = typedArray.getDimension(i12, 0.0f);
                } else {
                    f10 = typedArray.getFloat(i12, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f10);
            }
            propertyValuesHolder = ofFloat;
        } else if (z4) {
            if (i13 == 5) {
                i16 = (int) typedArray.getDimension(i11, 0.0f);
            } else if (c(i13)) {
                i16 = typedArray.getColor(i11, 0);
            } else {
                i16 = typedArray.getInt(i11, 0);
            }
            if (z10) {
                if (i14 == 5) {
                    i17 = (int) typedArray.getDimension(i12, 0.0f);
                } else if (c(i14)) {
                    i17 = typedArray.getColor(i12, 0);
                } else {
                    i17 = typedArray.getInt(i12, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i16, i17);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i16);
            }
        } else if (z10) {
            if (i14 == 5) {
                i15 = (int) typedArray.getDimension(i12, 0.0f);
            } else if (c(i14)) {
                i15 = typedArray.getColor(i12, 0);
            } else {
                i15 = typedArray.getInt(i12, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i15);
        }
        if (propertyValuesHolder != null && fVar != null) {
            propertyValuesHolder.setEvaluator(fVar);
        }
        return propertyValuesHolder;
    }

    public static boolean c(int i10) {
        if (i10 >= 28 && i10 <= 31) {
            return true;
        }
        return false;
    }

    public static android.animation.ValueAnimator d(android.content.Context r20, android.content.res.Resources r21, android.content.res.Resources.Theme r22, android.util.AttributeSet r23, android.animation.ObjectAnimator r24, org.xmlpull.v1.XmlPullParser r25) {
        throw new UnsupportedOperationException("Method not decompiled: k2.a.d(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, android.animation.ObjectAnimator, org.xmlpull.v1.XmlPullParser):android.animation.ValueAnimator");
    }
}
