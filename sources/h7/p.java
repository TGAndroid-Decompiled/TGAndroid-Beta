package h7;

public abstract class p {
    public static void a(long j10, d5.z zVar, m3.w[] wVarArr) {
        int i10;
        int iR;
        while (true) {
            if (zVar.a() <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (zVar.a() == 0) {
                    i10 = -1;
                    break;
                }
                int iR2 = zVar.r();
                i11 += iR2;
                if (iR2 != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            do {
                if (zVar.a() == 0) {
                    i12 = -1;
                    break;
                } else {
                    iR = zVar.r();
                    i12 += iR;
                }
            } while (iR == 255);
            int i13 = zVar.f4859b + i12;
            if (i12 == -1 || i12 > zVar.a()) {
                d5.a.K("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i13 = zVar.f4860c;
            } else if (i10 == 4 && i12 >= 8) {
                int iR3 = zVar.r();
                int iW = zVar.w();
                int iE = iW == 49 ? zVar.e() : 0;
                int iR4 = zVar.r();
                if (iW == 47) {
                    zVar.D(1);
                }
                boolean z10 = iR3 == 181 && (iW == 49 || iW == 47) && iR4 == 3;
                if (iW == 49) {
                    z10 &= iE == 1195456820;
                }
                if (z10) {
                    b(j10, zVar, wVarArr);
                }
            }
            zVar.C(i13);
        }
    }

    public static void b(long j10, d5.z zVar, m3.w[] wVarArr) {
        long j11;
        int iR = zVar.r();
        if ((iR & 64) != 0) {
            zVar.D(1);
            int i10 = (iR & 31) * 3;
            int i11 = zVar.f4859b;
            int length = wVarArr.length;
            int i12 = 0;
            while (i12 < length) {
                m3.w wVar = wVarArr[i12];
                zVar.C(i11);
                wVar.a(i10, zVar);
                if (j10 != -9223372036854775807L) {
                    j11 = j10;
                    wVar.e(j11, 1, i10, 0, null);
                } else {
                    j11 = j10;
                }
                i12++;
                j10 = j11;
            }
        }
    }
}
