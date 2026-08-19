package org.telegram.messenger.utils;

import android.graphics.RectF;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class RectFMergeBounding {
    private static final Comparator RECT_COMPARATOR = new Comparator() {
        @Override
        public final int compare(Object obj, Object obj2) {
            return RectFMergeBounding.m1135$r8$lambda$3FEaNDNxTEmLiir9NQLN9ndvqw((RectF) obj, (RectF) obj2);
        }
    };

    public static int mergeOverlapping(List list, int i, List list2) {
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
                    if (intersectsOrTouches(rectF3, rectF4)) {
                        float f = rectF4.left;
                        if (f < rectF3.left) {
                            rectF3.left = f;
                        }
                        float f2 = rectF4.top;
                        if (f2 < rectF3.top) {
                            rectF3.top = f2;
                        }
                        float f3 = rectF4.right;
                        if (f3 > rectF3.right) {
                            rectF3.right = f3;
                        }
                        float f4 = rectF4.bottom;
                        if (f4 > rectF3.bottom) {
                            rectF3.bottom = f4;
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
        } while (z);
        for (int i6 = i; i6 < list2.size(); i6++) {
            RectF rectF5 = (RectF) list2.get(i6);
            rectF5.top = Float.MAX_VALUE;
            rectF5.left = Float.MAX_VALUE;
        }
        Collections.sort(list2, RECT_COMPARATOR);
        return i;
    }

    private static boolean intersectsOrTouches(RectF rectF, RectF rectF2) {
        return rectF.left <= rectF2.right + 1.0E-4f && rectF.right >= rectF2.left - 1.0E-4f && rectF.top <= rectF2.bottom + 1.0E-4f && rectF.bottom >= rectF2.top - 1.0E-4f;
    }

    public static int m1135$r8$lambda$3FEaNDNxTEmLiir9NQLN9ndvqw(RectF rectF, RectF rectF2) {
        if (Math.abs(rectF.top - rectF2.top) > 1.0E-4f) {
            return rectF.top < rectF2.top ? -1 : 1;
        }
        if (Math.abs(rectF.left - rectF2.left) > 1.0E-4f) {
            return rectF.left < rectF2.left ? -1 : 1;
        }
        return 0;
    }
}
