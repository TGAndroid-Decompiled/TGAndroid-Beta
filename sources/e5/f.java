package e5;

import h3.t1;
import java.util.Collections;
import java.util.List;
public final class f {
    public final List f4888a;
    public final int f4889b;
    public final float f4890c;
    public final String d;

    public f(List list, int i9, float f10, String str) {
        this.f4888a = list;
        this.f4889b = i9;
        this.f4890c = f10;
        this.d = str;
    }

    public static f a(d5.y yVar) {
        List singletonList;
        int i9;
        try {
            yVar.D(21);
            int r10 = yVar.r() & 3;
            int r11 = yVar.r();
            int i10 = yVar.f4411b;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < r11; i13++) {
                yVar.D(1);
                int w8 = yVar.w();
                for (int i14 = 0; i14 < w8; i14++) {
                    int w10 = yVar.w();
                    i12 += w10 + 4;
                    yVar.D(w10);
                }
            }
            yVar.C(i10);
            byte[] bArr = new byte[i12];
            float f10 = 1.0f;
            String str = null;
            int i15 = 0;
            int i16 = 0;
            while (i15 < r11) {
                int r12 = yVar.r() & 63;
                int w11 = yVar.w();
                int i17 = 0;
                while (i17 < w11) {
                    int w12 = yVar.w();
                    System.arraycopy(d5.a.d, i11, bArr, i16, 4);
                    int i18 = i16 + 4;
                    System.arraycopy(yVar.f4410a, yVar.f4411b, bArr, i18, w12);
                    if (r12 == 33 && i17 == 0) {
                        d5.r B = d5.a.B(i18, i18 + w12, bArr);
                        float f11 = B.f4385g;
                        int i19 = B.f4380a;
                        boolean z10 = B.f4381b;
                        i9 = r10;
                        str = d5.a.d(i19, B.f4382c, B.d, B.f4384f, z10, B.f4383e);
                        f10 = f11;
                    } else {
                        i9 = r10;
                    }
                    i16 = i18 + w12;
                    yVar.D(w12);
                    i17++;
                    r10 = i9;
                    i11 = 0;
                }
                i15++;
                i11 = 0;
            }
            int i20 = r10;
            if (i12 == 0) {
                singletonList = Collections.EMPTY_LIST;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new f(singletonList, i20 + 1, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw t1.a("Error parsing HEVC config", e10);
        }
    }
}
