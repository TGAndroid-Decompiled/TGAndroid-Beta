package org.telegram.messenger.utils;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.os.Bundle;
import androidx.core.math.MathUtils;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda5;

public abstract class FBool {
    public static final Theme$$ExternalSyntheticLambda5 RECT_COMPARATOR = new Theme$$ExternalSyntheticLambda5(21);
    public static RenderEffect saturationUpX3Effect;

    public static RenderEffect getSaturationX3RenderEffect() {
        if (saturationUpX3Effect == null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(3.0f);
            saturationUpX3Effect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
        }
        return saturationUpX3Effect;
    }

    public static Bundle m(long j, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(str, j);
        return bundle;
    }

    public static int mergeOverlapping(List list, List list2, int i) {
        boolean z;
        if (list == null || i <= 0) {
            return 0;
        }
        if (i > list.size()) {
            i = list.size();
        }
        for (int size = list2.size(); size < i; size++) {
            list2.add(new RectF());
        }
        for (int i2 = 0; i2 < i; i2++) {
            RectF rectF = (RectF) list.get(i2);
            RectF rectF2 = (RectF) list2.get(i2);
            if (rectF != null) {
                rectF2.set(rectF);
            } else {
                rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
        do {
            int i3 = 0;
            while (true) {
                if (i3 >= i) {
                    z = false;
                    break;
                }
                RectF rectF3 = (RectF) list2.get(i3);
                i3++;
                for (int i4 = i3; i4 < i; i4++) {
                    RectF rectF4 = (RectF) list2.get(i4);
                    float f = rectF3.left;
                    float f2 = rectF4.right;
                    if (f <= f2 + 1.0E-4f) {
                        float f3 = rectF3.right;
                        float f4 = rectF4.left;
                        if (f3 >= f4 - 1.0E-4f) {
                            float f5 = rectF3.top;
                            float f6 = rectF4.bottom;
                            if (f5 <= f6 + 1.0E-4f) {
                                float f7 = rectF3.bottom;
                                float f8 = rectF4.top;
                                if (f7 >= f8 - 1.0E-4f) {
                                    if (f4 < f) {
                                        rectF3.left = f4;
                                    }
                                    if (f8 < f5) {
                                        rectF3.top = f8;
                                    }
                                    if (f2 > f3) {
                                        rectF3.right = f2;
                                    }
                                    if (f6 > f7) {
                                        rectF3.bottom = f6;
                                    }
                                    int i5 = i - 1;
                                    if (i4 != i5) {
                                        ((RectF) list2.get(i4)).set((RectF) list2.get(i5));
                                    }
                                    i--;
                                    z = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        } while (z);
        for (int i6 = i; i6 < list2.size(); i6++) {
            RectF rectF5 = (RectF) list2.get(i6);
            rectF5.top = Float.MAX_VALUE;
            rectF5.left = Float.MAX_VALUE;
        }
        Collections.sort(list2, RECT_COMPARATOR);
        return i;
    }

    public static float not(float f) {
        return 1.0f - MathUtils.clamp(f, 0.0f, 1.0f);
    }

    public static boolean radiiAreSame(float[] fArr) {
        if (fArr != null && fArr.length == 8) {
            float f = fArr[0];
            if (f == fArr[1] && f == fArr[2] && f == fArr[3] && f == fArr[4] && f == fArr[5] && f == fArr[6] && f == fArr[7]) {
                return true;
            }
        }
        return false;
    }
}
