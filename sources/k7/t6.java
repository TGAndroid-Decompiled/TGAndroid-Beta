package k7;
public abstract class t6 {
    public static void a(long j10, h5.w wVar, r3.v[] vVarArr) {
        int i10;
        int i11;
        boolean z4;
        while (true) {
            boolean z10 = true;
            if (wVar.a() > 1) {
                int i12 = 0;
                while (true) {
                    if (wVar.a() == 0) {
                        i10 = -1;
                        break;
                    }
                    int u10 = wVar.u();
                    i12 += u10;
                    if (u10 != 255) {
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
                    int u11 = wVar.u();
                    i13 += u11;
                    if (u11 != 255) {
                        break;
                    }
                }
                int i14 = wVar.f6988b + i13;
                if (i13 != -1 && i13 <= wVar.a()) {
                    if (i10 == 4 && i13 >= 8) {
                        int u12 = wVar.u();
                        int z11 = wVar.z();
                        if (z11 == 49) {
                            i11 = wVar.g();
                        } else {
                            i11 = 0;
                        }
                        int u13 = wVar.u();
                        if (z11 == 47) {
                            wVar.G(1);
                        }
                        if (u12 == 181 && ((z11 == 49 || z11 == 47) && u13 == 3)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z11 == 49) {
                            if (i11 != 1195456820) {
                                z10 = false;
                            }
                            z4 &= z10;
                        }
                        if (z4) {
                            b(j10, wVar, vVarArr);
                        }
                    }
                } else {
                    h5.a.K("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i14 = wVar.f6989c;
                }
                wVar.F(i14);
            } else {
                return;
            }
        }
    }

    public static void b(long j10, h5.w wVar, r3.v[] vVarArr) {
        long j11;
        int u10 = wVar.u();
        if ((u10 & 64) != 0) {
            wVar.G(1);
            int i10 = (u10 & 31) * 3;
            int i11 = wVar.f6988b;
            int length = vVarArr.length;
            int i12 = 0;
            while (i12 < length) {
                r3.v vVar = vVarArr[i12];
                wVar.F(i11);
                vVar.d(i10, wVar);
                if (j10 != -9223372036854775807L) {
                    j11 = j10;
                    vVar.c(j11, 1, i10, 0, null);
                } else {
                    j11 = j10;
                }
                i12++;
                j10 = j11;
            }
        }
    }
}
