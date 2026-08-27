package k2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import g7.w7;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public abstract class a {

    public static final int[] f14337a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};

    public static final int[] f14338b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};

    public static final int[] f14339c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] d = {16842755, 16843781, 16844062};

    public static final int[] f14340e = {16843161};

    public static final int[] f14341f = {16842755, 16843213};

    public static final int[] f14342g = {16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};
    public static final int[] h = {16843490};

    public static final int[] f14343i = {16843486, 16843487, 16843488, 16843489};

    public static final int[] f14344j = {16842788, 16843073, 16843488, 16843992};

    public static final int[] f14345k = {16843489, 16843781, 16843892, 16843893};

    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i10) throws XmlPullParserException, IOException {
        int i11;
        PropertyValuesHolder[] propertyValuesHolderArr;
        int i12;
        String str;
        PropertyValuesHolder propertyValuesHolderB;
        int size;
        int i13;
        Keyframe keyframeOfFloat;
        Animator animator;
        Animator animatorD;
        int depth = xmlPullParser.getDepth();
        Animator animator2 = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            int i14 = 3;
            boolean z10 = false;
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                break;
            }
            int i15 = 1;
            if (next == 1) {
                break;
            }
            int i16 = 2;
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    d(context, resources, theme, attributeSet, objectAnimator, xmlPullParser);
                    animatorD = objectAnimator;
                } else {
                    if (name.equals("animator")) {
                        animatorD = d(context, resources, theme, attributeSet, null, xmlPullParser);
                    } else {
                        Resources resources2 = resources;
                        Resources.Theme theme2 = theme;
                        XmlPullParser xmlPullParser2 = xmlPullParser;
                        if (name.equals("set")) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            TypedArray typedArrayF = h0.b.f(resources2, theme2, attributeSet, h);
                            a(context, resources2, theme2, xmlPullParser2, attributeSet, animatorSet2, xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "ordering") != null ? typedArrayF.getInt(0, 0) : 0);
                            animator = animatorSet2;
                            typedArrayF.recycle();
                            i11 = depth;
                            animator2 = animator;
                        } else {
                            String str2 = "propertyValuesHolder";
                            if (!name.equals("propertyValuesHolder")) {
                                throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                            }
                            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser2);
                            ArrayList arrayList2 = null;
                            while (true) {
                                int eventType = xmlPullParser2.getEventType();
                                if (eventType == i14 || eventType == i15) {
                                    break;
                                }
                                if (eventType != i16) {
                                    xmlPullParser2.next();
                                } else {
                                    if (xmlPullParser2.getName().equals(str2)) {
                                        TypedArray typedArrayF2 = h0.b.f(resources2, theme2, attributeSetAsAttributeSet, f14343i);
                                        String strB = h0.b.b(typedArrayF2, xmlPullParser2, "propertyName", i14);
                                        int i17 = xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? typedArrayF2.getInt(i16, 4) : 4;
                                        int i18 = i17;
                                        ArrayList arrayList3 = null;
                                        while (true) {
                                            int next2 = xmlPullParser2.next();
                                            i12 = depth;
                                            if (next2 == 3 || next2 == 1) {
                                                break;
                                            }
                                            if (xmlPullParser2.getName().equals("keyframe")) {
                                                int[] iArr = f14344j;
                                                if (i18 == 4) {
                                                    TypedArray typedArrayF3 = h0.b.f(resources2, theme2, Xml.asAttributeSet(xmlPullParser2), iArr);
                                                    TypedValue typedValuePeekValue = !h0.b.c(xmlPullParser2, "value") ? null : typedArrayF3.peekValue(0);
                                                    int i19 = (typedValuePeekValue == null || !c(typedValuePeekValue.type)) ? 0 : 3;
                                                    typedArrayF3.recycle();
                                                    i18 = i19;
                                                }
                                                TypedArray typedArrayF4 = h0.b.f(resources2, theme2, Xml.asAttributeSet(xmlPullParser2), iArr);
                                                float f10 = h0.b.c(xmlPullParser2, "fraction") ? typedArrayF4.getFloat(3, -1.0f) : -1.0f;
                                                TypedValue typedValuePeekValue2 = !h0.b.c(xmlPullParser2, "value") ? null : typedArrayF4.peekValue(0);
                                                boolean z11 = typedValuePeekValue2 != null;
                                                int i20 = i18 == 4 ? (z11 && c(typedValuePeekValue2.type)) ? 3 : 0 : i18;
                                                if (!z11) {
                                                    keyframeOfFloat = i20 == 0 ? Keyframe.ofFloat(f10) : Keyframe.ofInt(f10);
                                                } else if (i20 == 0) {
                                                    keyframeOfFloat = Keyframe.ofFloat(f10, xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? typedArrayF4.getFloat(0, 0.0f) : 0.0f);
                                                } else if (i20 == 1 || i20 == 3) {
                                                    keyframeOfFloat = Keyframe.ofInt(f10, xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? typedArrayF4.getInt(0, 0) : 0);
                                                } else {
                                                    keyframeOfFloat = null;
                                                }
                                                int resourceId = xmlPullParser2.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayF4.getResourceId(1, 0) : 0;
                                                if (resourceId > 0) {
                                                    keyframeOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                                }
                                                typedArrayF4.recycle();
                                                if (keyframeOfFloat != null) {
                                                    if (arrayList3 == null) {
                                                        arrayList3 = new ArrayList();
                                                    }
                                                    arrayList3.add(keyframeOfFloat);
                                                }
                                                xmlPullParser2.next();
                                            }
                                            resources2 = resources;
                                            theme2 = theme;
                                            depth = i12;
                                            str2 = str2;
                                        }
                                        str = str2;
                                        if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                            propertyValuesHolderB = null;
                                        } else {
                                            Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                            Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                            float fraction = keyframe2.getFraction();
                                            int i21 = size;
                                            Class cls = Integer.TYPE;
                                            Class cls2 = Float.TYPE;
                                            if (fraction < 1.0f) {
                                                if (fraction < 0.0f) {
                                                    keyframe2.setFraction(1.0f);
                                                } else {
                                                    arrayList3.add(arrayList3.size(), keyframe2.getType() == cls2 ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == cls ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                                    i21++;
                                                }
                                            }
                                            float fraction2 = keyframe.getFraction();
                                            if (fraction2 != 0.0f) {
                                                if (fraction2 < 0.0f) {
                                                    keyframe.setFraction(0.0f);
                                                } else {
                                                    arrayList3.add(0, keyframe.getType() == cls2 ? Keyframe.ofFloat(0.0f) : keyframe.getType() == cls ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                                    i21++;
                                                }
                                            }
                                            int i22 = i21;
                                            Keyframe[] keyframeArr = new Keyframe[i22];
                                            arrayList3.toArray(keyframeArr);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                Keyframe keyframe3 = keyframeArr[i23];
                                                if (keyframe3.getFraction() >= 0.0f) {
                                                    i13 = i22;
                                                } else {
                                                    if (i23 == 0) {
                                                        keyframe3.setFraction(0.0f);
                                                    } else {
                                                        int i24 = i22 - 1;
                                                        if (i23 == i24) {
                                                            keyframe3.setFraction(1.0f);
                                                        } else {
                                                            int i25 = i23;
                                                            for (int i26 = i23 + 1; i26 < i24 && keyframeArr[i26].getFraction() < 0.0f; i26++) {
                                                                i25 = i26;
                                                            }
                                                            float fraction3 = (keyframeArr[i25 + 1].getFraction() - keyframeArr[i23 - 1].getFraction()) / ((i25 - i23) + 2);
                                                            int i27 = i23;
                                                            while (i27 <= i25) {
                                                                keyframeArr[i27].setFraction(keyframeArr[i27 - 1].getFraction() + fraction3);
                                                                i27++;
                                                                i22 = i22;
                                                            }
                                                            i13 = i22;
                                                        }
                                                    }
                                                    i13 = i22;
                                                }
                                                i23++;
                                                i22 = i13;
                                            }
                                            propertyValuesHolderB = PropertyValuesHolder.ofKeyframe(strB, keyframeArr);
                                            if (i18 == 3) {
                                                propertyValuesHolderB.setEvaluator(f.f14353a);
                                            }
                                        }
                                        if (propertyValuesHolderB == null) {
                                            propertyValuesHolderB = b(typedArrayF2, i17, 0, 1, strB);
                                        }
                                        if (propertyValuesHolderB != null) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(propertyValuesHolderB);
                                        }
                                        typedArrayF2.recycle();
                                    } else {
                                        i12 = depth;
                                        str = str2;
                                    }
                                    xmlPullParser.next();
                                    resources2 = resources;
                                    theme2 = theme;
                                    xmlPullParser2 = xmlPullParser;
                                    attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                    depth = i12;
                                    str2 = str;
                                    i14 = 3;
                                    i15 = 1;
                                    i16 = 2;
                                }
                            }
                            i11 = depth;
                            if (arrayList2 != null) {
                                int size2 = arrayList2.size();
                                propertyValuesHolderArr = new PropertyValuesHolder[size2];
                                for (int i28 = 0; i28 < size2; i28++) {
                                    propertyValuesHolderArr[i28] = (PropertyValuesHolder) arrayList2.get(i28);
                                }
                            } else {
                                propertyValuesHolderArr = null;
                            }
                            if (propertyValuesHolderArr != null && (animator2 instanceof ValueAnimator)) {
                                ((ValueAnimator) animator2).setValues(propertyValuesHolderArr);
                            }
                            z10 = true;
                            animator2 = animator2;
                        }
                    }
                    if (animatorSet != null && !z10) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(animator2);
                    }
                    depth = i11;
                }
                animator = animatorD;
                i11 = depth;
                animator2 = animator;
                if (animatorSet != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(animator2);
                }
                depth = i11;
            }
        }
        int i29 = 0;
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            int size3 = arrayList.size();
            int i30 = 0;
            while (i29 < size3) {
                Object obj = arrayList.get(i29);
                i29++;
                animatorArr[i30] = (Animator) obj;
                i30++;
            }
            if (i10 == 0) {
                animatorSet.playTogether(animatorArr);
                return animator2;
            }
            animatorSet.playSequentially(animatorArr);
        }
        return animator2;
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i10, int i11, int i12, String str) {
        int color;
        int color2;
        int color3;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        TypedValue typedValuePeekValue = typedArray.peekValue(i11);
        boolean z10 = typedValuePeekValue != null;
        int i13 = z10 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i12);
        boolean z11 = typedValuePeekValue2 != null;
        int i14 = z11 ? typedValuePeekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z10 && c(i13)) || (z11 && c(i14))) ? 3 : 0;
        }
        boolean z12 = i10 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            i0.e[] eVarArrC = w7.c(string);
            i0.e[] eVarArrC2 = w7.c(string2);
            if (eVarArrC != null || eVarArrC2 != null) {
                if (eVarArrC != null) {
                    e eVar = new e();
                    if (eVarArrC2 == null) {
                        return PropertyValuesHolder.ofObject(str, eVar, eVarArrC);
                    }
                    if (w7.a(eVarArrC, eVarArrC2)) {
                        return PropertyValuesHolder.ofObject(str, eVar, eVarArrC, eVarArrC2);
                    }
                    throw new InflateException(i0.a.n(" Can't morph from ", string, " to ", string2));
                }
                if (eVarArrC2 != null) {
                    return PropertyValuesHolder.ofObject(str, new e(), eVarArrC2);
                }
            }
            return null;
        }
        f fVar = i10 == 3 ? f.f14353a : null;
        if (z12) {
            if (z10) {
                float dimension = i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                if (z11) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z10) {
            if (i13 == 5) {
                color2 = (int) typedArray.getDimension(i11, 0.0f);
            } else {
                color2 = c(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
            }
            if (z11) {
                if (i14 == 5) {
                    color3 = (int) typedArray.getDimension(i12, 0.0f);
                } else {
                    color3 = c(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (z11) {
            if (i14 == 5) {
                color = (int) typedArray.getDimension(i12, 0.0f);
            } else {
                color = c(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt != null && fVar != null) {
            propertyValuesHolderOfInt.setEvaluator(fVar);
        }
        return propertyValuesHolderOfInt;
    }

    public static boolean c(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator;
        int i10;
        int resourceId;
        ValueAnimator valueAnimator2;
        TypedArray typedArrayF = h0.b.f(resources, theme, attributeSet, f14342g);
        TypedArray typedArrayF2 = h0.b.f(resources, theme, attributeSet, f14345k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j10 = h0.b.c(xmlPullParser, "duration") ? typedArrayF.getInt(1, 300) : 300;
        boolean z10 = false;
        long j11 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null ? typedArrayF.getInt(2, 0) : 0;
        int i11 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? typedArrayF.getInt(7, 4) : 4;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i11 == 4) {
                TypedValue typedValuePeekValue = typedArrayF.peekValue(5);
                boolean z11 = typedValuePeekValue != null;
                int i12 = z11 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayF.peekValue(6);
                boolean z12 = typedValuePeekValue2 != null;
                i11 = ((z11 && c(i12)) || (z12 && c(z12 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderB = b(typedArrayF, i11, 5, 6, "");
            if (propertyValuesHolderB != null) {
                valueAnimator3.setValues(propertyValuesHolderB);
            }
        }
        valueAnimator3.setDuration(j10);
        valueAnimator3.setStartDelay(j11);
        valueAnimator3.setRepeatCount(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? typedArrayF.getInt(3, 0) : 0);
        valueAnimator3.setRepeatMode(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? typedArrayF.getInt(4, 1) : 1);
        if (typedArrayF2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strB = h0.b.b(typedArrayF2, xmlPullParser, "pathData", 1);
            if (strB != null) {
                String strB2 = h0.b.b(typedArrayF2, xmlPullParser, "propertyXName", 2);
                String strB3 = h0.b.b(typedArrayF2, xmlPullParser, "propertyYName", 3);
                if (i11 != 2) {
                }
                if (strB2 == null && strB3 == null) {
                    throw new InflateException(typedArrayF2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathD = w7.d(strB);
                PathMeasure pathMeasure = new PathMeasure(pathD, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                while (true) {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                    z10 = false;
                }
                PathMeasure pathMeasure2 = new PathMeasure(pathD, z10);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f10 = length / (iMin - 1);
                valueAnimator = valueAnimator3;
                float f11 = 0.0f;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i13 >= iMin) {
                        break;
                    }
                    int i15 = iMin;
                    pathMeasure2.getPosTan(f11 - ((Float) arrayList.get(i14)).floatValue(), fArr3, null);
                    fArr[i13] = fArr3[0];
                    fArr2[i13] = fArr3[1];
                    int i16 = i14 + 1;
                    f11 += f10;
                    if (i16 < arrayList.size() && f11 > ((Float) arrayList.get(i16)).floatValue()) {
                        pathMeasure2.nextContour();
                        i14 = i16;
                    }
                    i13++;
                    iMin = i15;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strB2 != null ? PropertyValuesHolder.ofFloat(strB2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strB3 != null ? PropertyValuesHolder.ofFloat(strB3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else if (propertyValuesHolderOfFloat2 == null) {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat);
                } else {
                    objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                }
            } else {
                valueAnimator = valueAnimator3;
                i10 = 0;
                objectAnimator2.setPropertyName(h0.b.b(typedArrayF2, xmlPullParser, "propertyName", 0));
            }
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
                resourceId = typedArrayF.getResourceId(i10, i10);
            } else {
                resourceId = 0;
            }
            if (resourceId > 0) {
                valueAnimator2 = valueAnimator;
                valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
            } else {
                valueAnimator2 = valueAnimator;
            }
            typedArrayF.recycle();
            if (typedArrayF2 != null) {
                typedArrayF2.recycle();
            }
            return valueAnimator2;
        }
        valueAnimator = valueAnimator3;
        i10 = 0;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
            resourceId = typedArrayF.getResourceId(i10, i10);
        } else {
            resourceId = 0;
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArrayF.recycle();
        if (typedArrayF2 != null) {
            typedArrayF2.recycle();
        }
        return valueAnimator2;
    }
}
