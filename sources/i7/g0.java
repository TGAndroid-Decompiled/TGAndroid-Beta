package i7;
public abstract class g0 {
    public static void a(long j10, f5.w wVar, o3.w[] wVarArr) {
        int i10;
        int i11;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (wVar.a() > 1) {
                int i12 = 0;
                while (true) {
                    if (wVar.a() == 0) {
                        i10 = -1;
                        break;
                    }
                    int r6 = wVar.r();
                    i12 += r6;
                    if (r6 != 255) {
                        i10 = i12;
                        break;
                    }
                }
                int i13 = 0;
                while (true) {
                    if (wVar.a() == 0) {
                        i13 = -1;
                        break;
                    }
                    int r9 = wVar.r();
                    i13 += r9;
                    if (r9 != 255) {
                        break;
                    }
                }
                int i14 = wVar.f6641b + i13;
                if (i13 != -1 && i13 <= wVar.a()) {
                    if (i10 == 4 && i13 >= 8) {
                        int r10 = wVar.r();
                        int w10 = wVar.w();
                        if (w10 == 49) {
                            i11 = wVar.e();
                        } else {
                            i11 = 0;
                        }
                        int r11 = wVar.r();
                        if (w10 == 47) {
                            wVar.D(1);
                        }
                        if (r10 == 181 && ((w10 == 49 || w10 == 47) && r11 == 3)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (w10 == 49) {
                            if (i11 != 1195456820) {
                                z11 = false;
                            }
                            z10 &= z11;
                        }
                        if (z10) {
                            b(j10, wVar, wVarArr);
                        }
                    }
                } else {
                    f5.a.K("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i14 = wVar.f6642c;
                }
                wVar.C(i14);
            } else {
                return;
            }
        }
    }

    public static void b(long j10, f5.w wVar, o3.w[] wVarArr) {
        long j11;
        int r6 = wVar.r();
        if ((r6 & 64) != 0) {
            wVar.D(1);
            int i10 = (r6 & 31) * 3;
            int i11 = wVar.f6641b;
            int length = wVarArr.length;
            int i12 = 0;
            while (i12 < length) {
                o3.w wVar2 = wVarArr[i12];
                wVar.C(i11);
                wVar2.e(i10, wVar);
                if (j10 != -9223372036854775807L) {
                    j11 = j10;
                    wVar2.c(j11, 1, i10, 0, null);
                } else {
                    j11 = j10;
                }
                i12++;
                j10 = j11;
            }
        }
    }
}
