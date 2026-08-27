package e5;

import d5.z;
import h3.t1;
import java.util.Collections;
import java.util.List;

public final class e {

    public final List f5245a;

    public final int f5246b;

    public final float f5247c;
    public final String d;

    public e(List list, int i10, float f10, String str) {
        this.f5245a = list;
        this.f5246b = i10;
        this.f5247c = f10;
        this.d = str;
    }

    public static e a(z zVar) throws t1 {
        try {
            zVar.D(21);
            int iR = zVar.r() & 3;
            int iR2 = zVar.r();
            int i10 = zVar.f4859b;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < iR2; i13++) {
                zVar.D(1);
                int iW = zVar.w();
                for (int i14 = 0; i14 < iW; i14++) {
                    int iW2 = zVar.w();
                    i12 += iW2 + 4;
                    zVar.D(iW2);
                }
            }
            zVar.C(i10);
            byte[] bArr = new byte[i12];
            float f10 = 1.0f;
            String strD = null;
            int i15 = 0;
            int i16 = 0;
            while (i15 < iR2) {
                int iR3 = zVar.r() & 63;
                int iW3 = zVar.w();
                int i17 = 0;
                while (i17 < iW3) {
                    int iW4 = zVar.w();
                    System.arraycopy(d5.a.d, i11, bArr, i16, 4);
                    int i18 = i16 + 4;
                    System.arraycopy(zVar.f4858a, zVar.f4859b, bArr, i18, iW4);
                    if (iR3 == 33 && i17 == 0) {
                        d5.r rVarB = d5.a.B(i18, i18 + iW4, bArr);
                        float f11 = rVarB.f4830g;
                        strD = d5.a.d(rVarB.f4825a, rVarB.f4827c, rVarB.d, rVarB.f4829f, rVarB.f4826b, rVarB.f4828e);
                        f10 = f11;
                    }
                    i16 = i18 + iW4;
                    zVar.D(iW4);
                    i17++;
                    iR = iR;
                    i11 = 0;
                }
                i15++;
                i11 = 0;
            }
            return new e(i12 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iR + 1, f10, strD);
        } catch (ArrayIndexOutOfBoundsException e9) {
            throw t1.a("Error parsing HEVC config", e9);
        }
    }
}
