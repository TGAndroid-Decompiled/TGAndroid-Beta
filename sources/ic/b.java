package ic;

import java.util.ArrayList;
public final class b {
    public final dc.b f10552a;
    public final int f10554c;
    public final int d;
    public final int e;
    public final int f10555f;
    public final float f10556g;
    public final ArrayList f10553b = new ArrayList(5);
    public final int[] h = new int[3];

    public b(dc.b bVar, int i10, int i11, int i12, int i13, float f7) {
        this.f10552a = bVar;
        this.f10554c = i10;
        this.d = i11;
        this.e = i12;
        this.f10555f = i13;
        this.f10556g = f7;
    }

    public final boolean a(int[] iArr) {
        float f7 = this.f10556g;
        float f10 = f7 / 2.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f7 - iArr[i10]) >= f10) {
                return false;
            }
        }
        return true;
    }

    public final a b(int i10, int i11, int[] iArr) {
        int i12;
        int i13 = 0;
        int i14 = iArr[0];
        int i15 = iArr[1];
        int i16 = i14 + i15 + iArr[2];
        float f7 = (i11 - i12) - (i15 / 2.0f);
        int i17 = (int) f7;
        int i18 = i15 * 2;
        dc.b bVar = this.f10552a;
        int i19 = bVar.f6390b;
        int[] iArr2 = this.h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i20 = i10;
        while (i20 >= 0 && bVar.b(i17, i20)) {
            int i21 = iArr2[1];
            if (i21 > i18) {
                break;
            }
            iArr2[1] = i21 + 1;
            i20--;
        }
        float f10 = Float.NaN;
        if (i20 >= 0 && iArr2[1] <= i18) {
            while (i20 >= 0 && !bVar.b(i17, i20)) {
                int i22 = iArr2[0];
                if (i22 > i18) {
                    break;
                }
                iArr2[0] = i22 + 1;
                i20--;
            }
            if (iArr2[0] <= i18) {
                int i23 = i10 + 1;
                while (i23 < i19 && bVar.b(i17, i23)) {
                    int i24 = iArr2[1];
                    if (i24 > i18) {
                        break;
                    }
                    iArr2[1] = i24 + 1;
                    i23++;
                }
                if (i23 != i19 && iArr2[1] <= i18) {
                    while (i23 < i19 && !bVar.b(i17, i23)) {
                        int i25 = iArr2[2];
                        if (i25 > i18) {
                            break;
                        }
                        iArr2[2] = i25 + 1;
                        i23++;
                    }
                    int i26 = iArr2[2];
                    if (i26 <= i18 && Math.abs(((iArr2[0] + iArr2[1]) + i26) - i16) * 5 < i16 * 2 && a(iArr2)) {
                        f10 = (i23 - iArr2[2]) - (iArr2[1] / 2.0f);
                    }
                }
            }
        }
        if (!Float.isNaN(f10)) {
            float f11 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
            ArrayList arrayList = this.f10553b;
            int size = arrayList.size();
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                a aVar = (a) obj;
                float f12 = aVar.f10551c;
                float f13 = aVar.f4629a;
                float f14 = aVar.f4630b;
                if (Math.abs(f10 - f14) <= f11 && Math.abs(f7 - f13) <= f11) {
                    float abs = Math.abs(f11 - f12);
                    if (abs <= 1.0f || abs <= f12) {
                        return new a((f13 + f7) / 2.0f, (f14 + f10) / 2.0f, (aVar.f10551c + f11) / 2.0f);
                    }
                }
            }
            arrayList.add(new a(f7, f10, f11));
            return null;
        }
        return null;
    }
}
