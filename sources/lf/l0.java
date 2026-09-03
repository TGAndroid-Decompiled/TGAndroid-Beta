package lf;

import android.graphics.RectF;
import java.util.Collections;
import java.util.List;
public abstract class l0 {
    public static final e5.f f12489a = new e5.f(16);

    public static int a(int i10, List list, List list2) {
        boolean z4;
        if (list == null || i10 <= 0) {
            return 0;
        }
        if (i10 > list.size()) {
            i10 = list.size();
        }
        for (int size = list2.size(); size < i10; size++) {
            list2.add(new RectF());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            RectF rectF = (RectF) list.get(i11);
            RectF rectF2 = (RectF) list2.get(i11);
            if (rectF != null) {
                rectF2.set(rectF);
            } else {
                rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
        do {
            int i12 = 0;
            while (true) {
                if (i12 < i10) {
                    RectF rectF3 = (RectF) list2.get(i12);
                    i12++;
                    for (int i13 = i12; i13 < i10; i13++) {
                        RectF rectF4 = (RectF) list2.get(i13);
                        float f10 = rectF3.left;
                        float f11 = rectF4.right;
                        if (f10 <= f11 + 1.0E-4f) {
                            float f12 = rectF3.right;
                            float f13 = rectF4.left;
                            if (f12 >= f13 - 1.0E-4f) {
                                float f14 = rectF3.top;
                                float f15 = rectF4.bottom;
                                if (f14 <= f15 + 1.0E-4f) {
                                    float f16 = rectF3.bottom;
                                    float f17 = rectF4.top;
                                    if (f16 >= f17 - 1.0E-4f) {
                                        if (f13 < f10) {
                                            rectF3.left = f13;
                                        }
                                        if (f17 < f14) {
                                            rectF3.top = f17;
                                        }
                                        if (f11 > f12) {
                                            rectF3.right = f11;
                                        }
                                        if (f15 > f16) {
                                            rectF3.bottom = f15;
                                        }
                                        int i14 = i10 - 1;
                                        if (i13 != i14) {
                                            ((RectF) list2.get(i13)).set((RectF) list2.get(i14));
                                        }
                                        i10--;
                                        z4 = true;
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    z4 = false;
                    continue;
                    break;
                }
            }
        } while (z4);
        for (int i15 = i10; i15 < list2.size(); i15++) {
            RectF rectF5 = (RectF) list2.get(i15);
            rectF5.top = Float.MAX_VALUE;
            rectF5.left = Float.MAX_VALUE;
        }
        Collections.sort(list2, f12489a);
        return i10;
    }

    public static float b(float f10) {
        return 1.0f - k7.o.a(f10, 0.0f, 1.0f);
    }

    public static boolean c(float[] fArr) {
        if (fArr != null && fArr.length == 8) {
            float f10 = fArr[0];
            if (f10 == fArr[1] && f10 == fArr[2] && f10 == fArr[3] && f10 == fArr[4] && f10 == fArr[5] && f10 == fArr[6] && f10 == fArr[7]) {
                return true;
            }
        }
        return false;
    }
}
