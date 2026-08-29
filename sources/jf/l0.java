package jf;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
public abstract class l0 {
    public static final c5.e f11653a = new c5.e(16);

    public static int a(ArrayList arrayList, int i10, ArrayList arrayList2) {
        boolean z10;
        if (arrayList == null || i10 <= 0) {
            return 0;
        }
        if (i10 > arrayList.size()) {
            i10 = arrayList.size();
        }
        for (int size = arrayList2.size(); size < i10; size++) {
            arrayList2.add(new RectF());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            RectF rectF = (RectF) arrayList.get(i11);
            RectF rectF2 = (RectF) arrayList2.get(i11);
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
                    RectF rectF3 = (RectF) arrayList2.get(i12);
                    i12++;
                    for (int i13 = i12; i13 < i10; i13++) {
                        RectF rectF4 = (RectF) arrayList2.get(i13);
                        float f9 = rectF3.left;
                        float f10 = rectF4.right;
                        if (f9 <= f10 + 1.0E-4f) {
                            float f11 = rectF3.right;
                            float f12 = rectF4.left;
                            if (f11 >= f12 - 1.0E-4f) {
                                float f13 = rectF3.top;
                                float f14 = rectF4.bottom;
                                if (f13 <= f14 + 1.0E-4f) {
                                    float f15 = rectF3.bottom;
                                    float f16 = rectF4.top;
                                    if (f15 >= f16 - 1.0E-4f) {
                                        if (f12 < f9) {
                                            rectF3.left = f12;
                                        }
                                        if (f16 < f13) {
                                            rectF3.top = f16;
                                        }
                                        if (f10 > f11) {
                                            rectF3.right = f10;
                                        }
                                        if (f14 > f15) {
                                            rectF3.bottom = f14;
                                        }
                                        int i14 = i10 - 1;
                                        if (i13 != i14) {
                                            ((RectF) arrayList2.get(i13)).set((RectF) arrayList2.get(i14));
                                        }
                                        i10--;
                                        z10 = true;
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    z10 = false;
                    continue;
                    break;
                }
            }
        } while (z10);
        for (int i15 = i10; i15 < arrayList2.size(); i15++) {
            RectF rectF5 = (RectF) arrayList2.get(i15);
            rectF5.top = Float.MAX_VALUE;
            rectF5.left = Float.MAX_VALUE;
        }
        Collections.sort(arrayList2, f11653a);
        return i10;
    }

    public static float b(float f9) {
        return 1.0f - i7.w.a(f9, 0.0f, 1.0f);
    }

    public static boolean c(float[] fArr) {
        if (fArr != null && fArr.length == 8) {
            float f9 = fArr[0];
            if (f9 == fArr[1] && f9 == fArr[2] && f9 == fArr[3] && f9 == fArr[4] && f9 == fArr[5] && f9 == fArr[6] && f9 == fArr[7]) {
                return true;
            }
        }
        return false;
    }
}
