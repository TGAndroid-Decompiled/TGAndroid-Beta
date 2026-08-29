package g5;

import j3.t1;
import java.util.Collections;
import java.util.List;
public final class f {
    public final List f7043a;
    public final int f7044b;
    public final float f7045c;
    public final String d;

    public f(List list, int i10, float f9, String str) {
        this.f7043a = list;
        this.f7044b = i10;
        this.f7045c = f9;
        this.d = str;
    }

    public static f a(f5.w wVar) {
        List singletonList;
        int i10;
        try {
            wVar.D(21);
            int r6 = wVar.r() & 3;
            int r9 = wVar.r();
            int i11 = wVar.f6641b;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < r9; i14++) {
                wVar.D(1);
                int w10 = wVar.w();
                for (int i15 = 0; i15 < w10; i15++) {
                    int w11 = wVar.w();
                    i13 += w11 + 4;
                    wVar.D(w11);
                }
            }
            wVar.C(i11);
            byte[] bArr = new byte[i13];
            float f9 = 1.0f;
            String str = null;
            int i16 = 0;
            int i17 = 0;
            while (i16 < r9) {
                int r10 = wVar.r() & 63;
                int w12 = wVar.w();
                int i18 = 0;
                while (i18 < w12) {
                    int w13 = wVar.w();
                    System.arraycopy(f5.a.d, i12, bArr, i17, 4);
                    int i19 = i17 + 4;
                    System.arraycopy(wVar.f6640a, wVar.f6641b, bArr, i19, w13);
                    if (r10 == 33 && i18 == 0) {
                        f5.p B = f5.a.B(i19, i19 + w13, bArr);
                        float f10 = B.f6615g;
                        int i20 = B.f6610a;
                        boolean z10 = B.f6611b;
                        i10 = r6;
                        str = f5.a.d(i20, B.f6612c, B.d, B.f6614f, z10, B.f6613e);
                        f9 = f10;
                    } else {
                        i10 = r6;
                    }
                    i17 = i19 + w13;
                    wVar.D(w13);
                    i18++;
                    r6 = i10;
                    i12 = 0;
                }
                i16++;
                i12 = 0;
            }
            int i21 = r6;
            if (i13 == 0) {
                singletonList = Collections.EMPTY_LIST;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new f(singletonList, i21 + 1, f9, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw t1.a("Error parsing HEVC config", e10);
        }
    }
}
