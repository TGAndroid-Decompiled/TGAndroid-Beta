package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
public abstract class nqd {
    public static android.animation.Animator a(android.content.Context r28, android.content.res.Resources r29, android.content.res.Resources.Theme r30, android.content.res.XmlResourceParser r31, android.util.AttributeSet r32, android.animation.AnimatorSet r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqd.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i, int i2, int i3, String str) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        js jsVar;
        int i6;
        int i7;
        int i8;
        float f;
        PropertyValuesHolder ofFloat;
        float f2;
        float f3;
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i4 = peekValue.type;
        } else {
            i4 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i3);
        if (peekValue2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i5 = peekValue2.type;
        } else {
            i5 = 0;
        }
        if (i == 4) {
            if ((z && c(i4)) || (z2 && c(i5))) {
                i = 3;
            } else {
                i = 0;
            }
        }
        if (i == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            q18[] c = hve.c(string);
            q18[] c2 = hve.c(string2);
            if (c == null) {
                if (c2 == null) {
                    return null;
                }
                return PropertyValuesHolder.ofObject(str, (TypeEvaluator) new Object(), c2);
            }
            ?? obj = new Object();
            if (c2 != null) {
                if (hve.a(c, c2)) {
                    return PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, c, c2);
                }
                throw new InflateException(qd4.q(" Can't morph from ", string, " to ", string2));
            }
            return PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, c);
        }
        if (i == 3) {
            jsVar = js.a;
        } else {
            jsVar = null;
        }
        if (z3) {
            if (z) {
                if (i4 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (z2) {
                    if (i5 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f2, f3);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f2);
                }
            } else {
                if (i5 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f);
            }
            propertyValuesHolder = ofFloat;
        } else if (z) {
            if (i4 == 5) {
                i7 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (c(i4)) {
                i7 = typedArray.getColor(i2, 0);
            } else {
                i7 = typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i5 == 5) {
                    i8 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (c(i5)) {
                    i8 = typedArray.getColor(i3, 0);
                } else {
                    i8 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i7, i8);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i7);
            }
        } else if (z2) {
            if (i5 == 5) {
                i6 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (c(i5)) {
                i6 = typedArray.getColor(i3, 0);
            } else {
                i6 = typedArray.getInt(i3, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i6);
        }
        if (propertyValuesHolder != null && jsVar != null) {
            propertyValuesHolder.setEvaluator(jsVar);
        }
        return propertyValuesHolder;
    }

    public static boolean c(int i) {
        if (i >= 28 && i <= 31) {
            return true;
        }
        return false;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        int i;
        int i2;
        int i3;
        int i4;
        ValueAnimator valueAnimator2;
        int i5;
        int i6;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z;
        int i7;
        boolean z2;
        int i8;
        TypedArray d = m1f.d(resources, theme, attributeSet, rd0.h);
        TypedArray d2 = m1f.d(resources, theme, attributeSet, rd0.l);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        int i9 = 300;
        if (m1f.c(xmlResourceParser, "duration")) {
            i9 = d.getInt(1, 300);
        }
        long j = i9;
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null) {
            i = d.getInt(2, 0);
        } else {
            i = 0;
        }
        long j2 = i;
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null) {
            i2 = d.getInt(7, 4);
        } else {
            i2 = 4;
        }
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i2 == 4) {
                TypedValue peekValue = d.peekValue(5);
                if (peekValue != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i7 = peekValue.type;
                } else {
                    i7 = 0;
                }
                TypedValue peekValue2 = d.peekValue(6);
                if (peekValue2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i8 = peekValue2.type;
                } else {
                    i8 = 0;
                }
                if ((z && c(i7)) || (z2 && c(i8))) {
                    i2 = 3;
                } else {
                    i2 = 0;
                }
            }
            PropertyValuesHolder b = b(d, i2, 5, 6, "");
            if (b != null) {
                valueAnimator.setValues(b);
            }
        }
        valueAnimator.setDuration(j);
        valueAnimator.setStartDelay(j2);
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null) {
            i3 = d.getInt(3, 0);
        } else {
            i3 = 0;
        }
        valueAnimator.setRepeatCount(i3);
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null) {
            i4 = d.getInt(4, 1);
        } else {
            i4 = 1;
        }
        valueAnimator.setRepeatMode(i4);
        if (d2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String b2 = m1f.b(d2, xmlResourceParser, "pathData", 1);
            if (b2 != null) {
                String b3 = m1f.b(d2, xmlResourceParser, "propertyXName", 2);
                String b4 = m1f.b(d2, xmlResourceParser, "propertyYName", 3);
                if (b3 == null && b4 == null) {
                    throw new InflateException(d2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path d3 = hve.d(b2);
                PathMeasure pathMeasure = new PathMeasure(d3, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f = 0.0f;
                do {
                    f += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(d3, false);
                int min = Math.min(100, ((int) (f / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f2 = f / (min - 1);
                int i10 = 0;
                valueAnimator2 = valueAnimator;
                float f3 = 0.0f;
                int i11 = 0;
                while (true) {
                    propertyValuesHolder = null;
                    if (i10 >= min) {
                        break;
                    }
                    int i12 = min;
                    pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i11)).floatValue(), fArr3, null);
                    fArr[i10] = fArr3[0];
                    fArr2[i10] = fArr3[1];
                    int i13 = i11 + 1;
                    f3 += f2;
                    if (i13 < arrayList.size() && f3 > ((Float) arrayList.get(i13)).floatValue()) {
                        pathMeasure2.nextContour();
                        i11 = i13;
                    }
                    i10++;
                    min = i12;
                }
                if (b3 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(b3, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (b4 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(b4, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    objectAnimator2.setValues(propertyValuesHolder);
                } else if (propertyValuesHolder == null) {
                    objectAnimator2.setValues(propertyValuesHolder2);
                } else {
                    objectAnimator2.setValues(propertyValuesHolder2, propertyValuesHolder);
                }
                i5 = 0;
            } else {
                valueAnimator2 = valueAnimator;
                i5 = 0;
                objectAnimator2.setPropertyName(m1f.b(d2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
            i5 = 0;
        }
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
            i6 = d.getResourceId(i5, i5);
        } else {
            i6 = i5;
        }
        if (i6 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i6));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        d.recycle();
        if (d2 != null) {
            d2.recycle();
        }
        return valueAnimator3;
    }
}
