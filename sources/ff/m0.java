package ff;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
public abstract class m0 {
    public static final a5.e f6239a = new a5.e(15);

    public static int a(ArrayList arrayList, int i9, ArrayList arrayList2) {
        boolean z10;
        if (arrayList == null || i9 <= 0) {
            return 0;
        }
        if (i9 > arrayList.size()) {
            i9 = arrayList.size();
        }
        for (int size = arrayList2.size(); size < i9; size++) {
            arrayList2.add(new RectF());
        }
        for (int i10 = 0; i10 < i9; i10++) {
            RectF rectF = (RectF) arrayList.get(i10);
            RectF rectF2 = (RectF) arrayList2.get(i10);
            if (rectF != null) {
                rectF2.set(rectF);
            } else {
                rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
        do {
            int i11 = 0;
            while (true) {
                if (i11 < i9) {
                    RectF rectF3 = (RectF) arrayList2.get(i11);
                    i11++;
                    for (int i12 = i11; i12 < i9; i12++) {
                        RectF rectF4 = (RectF) arrayList2.get(i12);
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
                                        int i13 = i9 - 1;
                                        if (i12 != i13) {
                                            ((RectF) arrayList2.get(i12)).set((RectF) arrayList2.get(i13));
                                        }
                                        i9--;
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
        for (int i14 = i9; i14 < arrayList2.size(); i14++) {
            RectF rectF5 = (RectF) arrayList2.get(i14);
            rectF5.top = Float.MAX_VALUE;
            rectF5.left = Float.MAX_VALUE;
        }
        Collections.sort(arrayList2, f6239a);
        return i9;
    }

    public static float b(float f10) {
        return 1.0f - g7.n.a(f10, 0.0f, 1.0f);
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
