package i5;

import j3.r1;
import java.util.Collections;
import java.util.List;
public final class f {
    public final List f7255a;
    public final int f7256b;
    public final int f7257c;
    public final int d;
    public final int e;
    public final float f7258f;
    public final String f7259g;

    public f(List list, int i10, int i11, int i12, int i13, float f10, String str) {
        this.f7255a = list;
        this.f7256b = i10;
        this.f7257c = i11;
        this.d = i12;
        this.e = i13;
        this.f7258f = f10;
        this.f7259g = str;
    }

    public static f a(h5.w wVar) {
        List singletonList;
        int i10;
        try {
            wVar.G(21);
            int u10 = wVar.u() & 3;
            int u11 = wVar.u();
            int i11 = wVar.f6988b;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < u11; i14++) {
                wVar.G(1);
                int z4 = wVar.z();
                for (int i15 = 0; i15 < z4; i15++) {
                    int z10 = wVar.z();
                    i13 += z10 + 4;
                    wVar.G(z10);
                }
            }
            wVar.F(i11);
            byte[] bArr = new byte[i13];
            String str = null;
            int i16 = 0;
            int i17 = 0;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            float f10 = 1.0f;
            while (i16 < u11) {
                int u12 = wVar.u() & 63;
                int z11 = wVar.z();
                int i21 = 0;
                while (i21 < z11) {
                    int z12 = wVar.z();
                    int i22 = u10;
                    System.arraycopy(h5.a.d, i12, bArr, i17, 4);
                    int i23 = i17 + 4;
                    System.arraycopy(wVar.f6987a, wVar.f6988b, bArr, i23, z12);
                    if (u12 == 33 && i21 == 0) {
                        h5.p B = h5.a.B(i23, i23 + z12, bArr);
                        i18 = B.f6961j;
                        i19 = B.f6962k;
                        i20 = B.f6963l;
                        float f11 = B.f6960i;
                        i10 = u11;
                        str = h5.a.d(B.f6955a, B.f6957c, B.d, B.f6958f, B.f6956b, B.e);
                        f10 = f11;
                    } else {
                        i10 = u11;
                    }
                    i17 = i23 + z12;
                    wVar.G(z12);
                    i21++;
                    u10 = i22;
                    u11 = i10;
                    i12 = 0;
                }
                i16++;
                i12 = 0;
            }
            int i24 = u10;
            if (i13 == 0) {
                singletonList = Collections.EMPTY_LIST;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new f(singletonList, i24 + 1, i18, i19, i20, f10, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw r1.a("Error parsing HEVC config", e);
        }
    }
}
