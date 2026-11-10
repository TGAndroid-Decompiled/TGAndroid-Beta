package hc;

import java.util.ArrayList;
public final class e {
    public static final d f14465e = new Object();
    public final cc.b f14466a;
    public boolean f14468c;
    public final ArrayList f14467b = new ArrayList();
    public final int[] d = new int[5];

    public e(cc.b bVar) {
        this.f14466a = bVar;
    }

    public static float a(int[] iArr, int i7) {
        return ((i7 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean b(int[] iArr) {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i7 < 5) {
                int i11 = iArr[i7];
                if (i11 == 0) {
                    break;
                }
                i10 += i11;
                i7++;
            } else if (i10 >= 7) {
                float f10 = i10 / 7.0f;
                float f11 = f10 / 2.0f;
                if (Math.abs(f10 - iArr[0]) >= f11 || Math.abs(f10 - iArr[1]) >= f11 || Math.abs((f10 * 3.0f) - iArr[2]) >= 3.0f * f11 || Math.abs(f10 - iArr[3]) >= f11 || Math.abs(f10 - iArr[4]) >= f11) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static double e(c cVar, c cVar2) {
        double d = cVar.f3180a - cVar2.f3180a;
        double d2 = cVar.f3181b - cVar2.f3181b;
        return (d2 * d2) + (d * d);
    }

    public final boolean c(int r20, int r21, int[] r22) {
        throw new UnsupportedOperationException("Method not decompiled: hc.e.c(int, int, int[]):boolean");
    }

    public final boolean d() {
        ArrayList arrayList = this.f14467b;
        int size = arrayList.size();
        int size2 = arrayList.size();
        float f10 = 0.0f;
        int i7 = 0;
        int i10 = 0;
        float f11 = 0.0f;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            c cVar = (c) obj;
            if (cVar.d >= 2) {
                i7++;
                f11 += cVar.f14464c;
            }
        }
        if (i7 >= 3) {
            float f12 = f11 / size;
            int size3 = arrayList.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj2 = arrayList.get(i11);
                i11++;
                f10 += Math.abs(((c) obj2).f14464c - f12);
            }
            if (f10 <= f11 * 0.05f) {
                return true;
            }
        }
        return false;
    }
}
