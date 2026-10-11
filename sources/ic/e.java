package ic;

import java.util.ArrayList;
public final class e {
    public static final d f12100e = new Object();
    public final dc.b f12101a;
    public boolean f12103c;
    public final ArrayList f12102b = new ArrayList();
    public final int[] d = new int[5];

    public e(dc.b bVar) {
        this.f12101a = bVar;
    }

    public static float a(int i10, int[] iArr) {
        return ((i10 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean b(int[] iArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 < 5) {
                int i12 = iArr[i10];
                if (i12 == 0) {
                    break;
                }
                i11 += i12;
                i10++;
            } else if (i11 >= 7) {
                float f7 = i11 / 7.0f;
                float f10 = f7 / 2.0f;
                if (Math.abs(f7 - iArr[0]) >= f10 || Math.abs(f7 - iArr[1]) >= f10 || Math.abs((f7 * 3.0f) - iArr[2]) >= 3.0f * f10 || Math.abs(f7 - iArr[3]) >= f10 || Math.abs(f7 - iArr[4]) >= f10) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static double e(c cVar, c cVar2) {
        double d = cVar.f4603a - cVar2.f4603a;
        double d10 = cVar.f4604b - cVar2.f4604b;
        return (d10 * d10) + (d * d);
    }

    public final boolean c(int r20, int r21, int[] r22) {
        throw new UnsupportedOperationException("Method not decompiled: ic.e.c(int, int, int[]):boolean");
    }

    public final boolean d() {
        ArrayList arrayList = this.f12102b;
        int size = arrayList.size();
        int size2 = arrayList.size();
        float f7 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        float f10 = 0.0f;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            c cVar = (c) obj;
            if (cVar.d >= 2) {
                i10++;
                f10 += cVar.f12099c;
            }
        }
        if (i10 >= 3) {
            float f11 = f10 / size;
            int size3 = arrayList.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj2 = arrayList.get(i12);
                i12++;
                f7 += Math.abs(((c) obj2).f12099c - f11);
            }
            if (f7 <= f10 * 0.05f) {
                return true;
            }
        }
        return false;
    }
}
