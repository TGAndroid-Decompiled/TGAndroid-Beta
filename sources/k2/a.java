package k2;

import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.InflateException;
import f7.i8;
import j3.r0;
public abstract class a {
    public static final int[] f14516a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    public static final int[] f14517b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    public static final int[] f14518c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] d = {16842755, 16843781, 16844062};
    public static final int[] f14519e = {16843161};
    public static final int[] f14520f = {16842755, 16843213};
    public static final int[] f14521g = {16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};
    public static final int[] h = {16843490};
    public static final int[] f14522i = {16843486, 16843487, 16843488, 16843489};
    public static final int[] f14523j = {16842788, 16843073, 16843488, 16843992};
    public static final int[] f14524k = {16843489, 16843781, 16843892, 16843893};

    public static android.animation.Animator a(android.content.Context r26, android.content.res.Resources r27, android.content.res.Resources.Theme r28, org.xmlpull.v1.XmlPullParser r29, android.util.AttributeSet r30, android.animation.AnimatorSet r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: k2.a.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i9, int i10, int i11, String str) {
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        f fVar;
        int i14;
        int i15;
        int i16;
        float f10;
        PropertyValuesHolder ofFloat;
        float f11;
        float f12;
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i12 = peekValue.type;
        } else {
            i12 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i11);
        if (peekValue2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i13 = peekValue2.type;
        } else {
            i13 = 0;
        }
        if (i9 == 4) {
            if ((z10 && c(i12)) || (z11 && c(i13))) {
                i9 = 3;
            } else {
                i9 = 0;
            }
        }
        if (i9 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i9 == 2) {
            String string = typedArray.getString(i10);
            String string2 = typedArray.getString(i11);
            i0.d[] c10 = i8.c(string);
            i0.d[] c11 = i8.c(string2);
            if (c10 != null || c11 != null) {
                if (c10 != null) {
                    ?? obj = new Object();
                    if (c11 != null) {
                        if (i8.a(c10, c11)) {
                            return PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, c10, c11);
                        }
                        throw new InflateException(r0.o(" Can't morph from ", string, " to ", string2));
                    }
                    return PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, c10);
                } else if (c11 != null) {
                    return PropertyValuesHolder.ofObject(str, (TypeEvaluator) new Object(), c11);
                }
            }
            return null;
        }
        if (i9 == 3) {
            fVar = f.f14532a;
        } else {
            fVar = null;
        }
        if (z12) {
            if (z10) {
                if (i12 == 5) {
                    f11 = typedArray.getDimension(i10, 0.0f);
                } else {
                    f11 = typedArray.getFloat(i10, 0.0f);
                }
                if (z11) {
                    if (i13 == 5) {
                        f12 = typedArray.getDimension(i11, 0.0f);
                    } else {
                        f12 = typedArray.getFloat(i11, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f11, f12);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f11);
                }
            } else {
                if (i13 == 5) {
                    f10 = typedArray.getDimension(i11, 0.0f);
                } else {
                    f10 = typedArray.getFloat(i11, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f10);
            }
            propertyValuesHolder = ofFloat;
        } else if (z10) {
            if (i12 == 5) {
                i15 = (int) typedArray.getDimension(i10, 0.0f);
            } else if (c(i12)) {
                i15 = typedArray.getColor(i10, 0);
            } else {
                i15 = typedArray.getInt(i10, 0);
            }
            if (z11) {
                if (i13 == 5) {
                    i16 = (int) typedArray.getDimension(i11, 0.0f);
                } else if (c(i13)) {
                    i16 = typedArray.getColor(i11, 0);
                } else {
                    i16 = typedArray.getInt(i11, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i15, i16);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i15);
            }
        } else if (z11) {
            if (i13 == 5) {
                i14 = (int) typedArray.getDimension(i11, 0.0f);
            } else if (c(i13)) {
                i14 = typedArray.getColor(i11, 0);
            } else {
                i14 = typedArray.getInt(i11, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i14);
        }
        if (propertyValuesHolder != null && fVar != null) {
            propertyValuesHolder.setEvaluator(fVar);
        }
        return propertyValuesHolder;
    }

    public static boolean c(int i9) {
        if (i9 >= 28 && i9 <= 31) {
            return true;
        }
        return false;
    }

    public static android.animation.ValueAnimator d(android.content.Context r20, android.content.res.Resources r21, android.content.res.Resources.Theme r22, android.util.AttributeSet r23, android.animation.ObjectAnimator r24, org.xmlpull.v1.XmlPullParser r25) {
        throw new UnsupportedOperationException("Method not decompiled: k2.a.d(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, android.animation.ObjectAnimator, org.xmlpull.v1.XmlPullParser):android.animation.ValueAnimator");
    }
}
