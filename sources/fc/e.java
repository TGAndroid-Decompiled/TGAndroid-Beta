package fc;
public class e {
    public static final byte[] d = new byte[0];
    public final ec.d f10414a;
    public byte[] f10415b = d;
    public final int[] f10416c = new int[32];

    public e(ec.d dVar) {
        this.f10414a = dVar;
    }

    public b a() {
        int[] iArr;
        ec.d dVar = this.f10414a;
        int i10 = dVar.f9880a;
        int i11 = dVar.f9881b;
        b bVar = new b(i10, i11);
        if (this.f10415b.length < i10) {
            this.f10415b = new byte[i10];
        }
        int i12 = 0;
        while (true) {
            iArr = this.f10416c;
            if (i12 >= 32) {
                break;
            }
            iArr[i12] = 0;
            i12++;
        }
        for (int i13 = 1; i13 < 5; i13++) {
            byte[] b10 = dVar.b((i11 * i13) / 5, this.f10415b);
            int i14 = (i10 * 4) / 5;
            for (int i15 = i10 / 5; i15 < i14; i15++) {
                int i16 = (b10[i15] & 255) >> 3;
                iArr[i16] = iArr[i16] + 1;
            }
        }
        int length = iArr.length;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < length; i20++) {
            int i21 = iArr[i20];
            if (i21 > i17) {
                i19 = i20;
                i17 = i21;
            }
            if (i21 > i18) {
                i18 = i21;
            }
        }
        int i22 = 0;
        int i23 = 0;
        for (int i24 = 0; i24 < length; i24++) {
            int i25 = i24 - i19;
            int i26 = iArr[i24] * i25 * i25;
            if (i26 > i23) {
                i22 = i24;
                i23 = i26;
            }
        }
        if (i19 <= i22) {
            int i27 = i19;
            i19 = i22;
            i22 = i27;
        }
        if (i19 - i22 > length / 16) {
            int i28 = i19 - 1;
            int i29 = -1;
            int i30 = i28;
            while (i28 > i22) {
                int i31 = i28 - i22;
                int i32 = (i18 - iArr[i28]) * (i19 - i28) * i31 * i31;
                if (i32 > i29) {
                    i30 = i28;
                    i29 = i32;
                }
                i28--;
            }
            int i33 = i30 << 3;
            byte[] a2 = dVar.a();
            for (int i34 = 0; i34 < i11; i34++) {
                int i35 = i34 * i10;
                for (int i36 = 0; i36 < i10; i36++) {
                    if ((a2[i35 + i36] & 255) < i33) {
                        bVar.c(i36, i34);
                    }
                }
            }
            return bVar;
        }
        throw ec.e.a();
    }
}
