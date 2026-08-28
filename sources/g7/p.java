package g7;
public abstract class p {
    public static void a(long j10, d5.y yVar, m3.w[] wVarArr) {
        int i9;
        int i10;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (yVar.a() > 1) {
                int i11 = 0;
                while (true) {
                    if (yVar.a() == 0) {
                        i9 = -1;
                        break;
                    }
                    int r10 = yVar.r();
                    i11 += r10;
                    if (r10 != 255) {
                        i9 = i11;
                        break;
                    }
                }
                int i12 = 0;
                while (true) {
                    if (yVar.a() == 0) {
                        i12 = -1;
                        break;
                    }
                    int r11 = yVar.r();
                    i12 += r11;
                    if (r11 != 255) {
                        break;
                    }
                }
                int i13 = yVar.f4411b + i12;
                if (i12 != -1 && i12 <= yVar.a()) {
                    if (i9 == 4 && i12 >= 8) {
                        int r12 = yVar.r();
                        int w8 = yVar.w();
                        if (w8 == 49) {
                            i10 = yVar.e();
                        } else {
                            i10 = 0;
                        }
                        int r13 = yVar.r();
                        if (w8 == 47) {
                            yVar.D(1);
                        }
                        if (r12 == 181 && ((w8 == 49 || w8 == 47) && r13 == 3)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (w8 == 49) {
                            if (i10 != 1195456820) {
                                z11 = false;
                            }
                            z10 &= z11;
                        }
                        if (z10) {
                            b(j10, yVar, wVarArr);
                        }
                    }
                } else {
                    d5.a.K("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i13 = yVar.f4412c;
                }
                yVar.C(i13);
            } else {
                return;
            }
        }
    }

    public static void b(long j10, d5.y yVar, m3.w[] wVarArr) {
        long j11;
        int r10 = yVar.r();
        if ((r10 & 64) != 0) {
            yVar.D(1);
            int i9 = (r10 & 31) * 3;
            int i10 = yVar.f4411b;
            int length = wVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                m3.w wVar = wVarArr[i11];
                yVar.C(i10);
                wVar.a(i9, yVar);
                if (j10 != -9223372036854775807L) {
                    j11 = j10;
                    wVar.e(j11, 1, i9, 0, null);
                } else {
                    j11 = j10;
                }
                i11++;
                j10 = j11;
            }
        }
    }
}
