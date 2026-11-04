package ec;

import java.util.ArrayList;
public final class e {
    public static final d f9939e = new Object();
    public final zb.b f9940a;
    public boolean f9942c;
    public final ArrayList f9941b = new ArrayList();
    public final int[] d = new int[5];

    public e(zb.b bVar) {
        this.f9940a = bVar;
    }

    public static float a(int[] iArr, int i3) {
        return ((i3 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean b(int[] iArr) {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            if (i3 < 5) {
                int i11 = iArr[i3];
                if (i11 == 0) {
                    break;
                }
                i10 += i11;
                i3++;
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
        double d = cVar.f59372a - cVar2.f59372a;
        double d10 = cVar.f59373b - cVar2.f59373b;
        return (d10 * d10) + (d * d);
    }

    public final boolean c(int r20, int r21, int[] r22) {
        throw new UnsupportedOperationException("Method not decompiled: ec.e.c(int, int, int[]):boolean");
    }

    public final boolean d() {
        ArrayList arrayList = this.f9941b;
        int size = arrayList.size();
        int size2 = arrayList.size();
        float f10 = 0.0f;
        int i3 = 0;
        int i10 = 0;
        float f11 = 0.0f;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            c cVar = (c) obj;
            if (cVar.d >= 2) {
                i3++;
                f11 += cVar.f9938c;
            }
        }
        if (i3 >= 3) {
            float f12 = f11 / size;
            int size3 = arrayList.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj2 = arrayList.get(i11);
                i11++;
                f10 += Math.abs(((c) obj2).f9938c - f12);
            }
            if (f10 <= f11 * 0.05f) {
                return true;
            }
        }
        return false;
    }
}
