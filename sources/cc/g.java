package cc;
public class g {
    public static final byte[] d = new byte[0];
    public final bc.d f6061a;
    public byte[] f6062b = d;
    public final int[] f6063c = new int[32];

    public g(bc.d dVar) {
        this.f6061a = dVar;
    }

    public b a() {
        int[] iArr;
        bc.d dVar = this.f6061a;
        int i7 = dVar.f3165a;
        int i10 = dVar.f3166b;
        b bVar = new b(i7, i10);
        if (this.f6062b.length < i7) {
            this.f6062b = new byte[i7];
        }
        int i11 = 0;
        while (true) {
            iArr = this.f6063c;
            if (i11 >= 32) {
                break;
            }
            iArr[i11] = 0;
            i11++;
        }
        for (int i12 = 1; i12 < 5; i12++) {
            byte[] b10 = dVar.b((i10 * i12) / 5, this.f6062b);
            int i13 = (i7 * 4) / 5;
            for (int i14 = i7 / 5; i14 < i13; i14++) {
                int i15 = (b10[i14] & 255) >> 3;
                iArr[i15] = iArr[i15] + 1;
            }
        }
        int length = iArr.length;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < length; i19++) {
            int i20 = iArr[i19];
            if (i20 > i16) {
                i18 = i19;
                i16 = i20;
            }
            if (i20 > i17) {
                i17 = i20;
            }
        }
        int i21 = 0;
        int i22 = 0;
        for (int i23 = 0; i23 < length; i23++) {
            int i24 = i23 - i18;
            int i25 = iArr[i23] * i24 * i24;
            if (i25 > i22) {
                i21 = i23;
                i22 = i25;
            }
        }
        if (i18 <= i21) {
            int i26 = i18;
            i18 = i21;
            i21 = i26;
        }
        if (i18 - i21 > length / 16) {
            int i27 = i18 - 1;
            int i28 = -1;
            int i29 = i27;
            while (i27 > i21) {
                int i30 = i27 - i21;
                int i31 = (i17 - iArr[i27]) * (i18 - i27) * i30 * i30;
                if (i31 > i28) {
                    i29 = i27;
                    i28 = i31;
                }
                i27--;
            }
            int i32 = i29 << 3;
            byte[] a10 = dVar.a();
            for (int i33 = 0; i33 < i10; i33++) {
                int i34 = i33 * i7;
                for (int i35 = 0; i35 < i7; i35++) {
                    if ((a10[i34 + i35] & 255) < i32) {
                        bVar.c(i35, i33);
                    }
                }
            }
            return bVar;
        }
        throw bc.e.a();
    }
}
