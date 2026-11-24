package defpackage;
public abstract class vsd {
    public static void a(long j, yw7 yw7Var, yzb[] yzbVarArr) {
        int i;
        int i2;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (yw7Var.a() > 1) {
                int i3 = 0;
                while (true) {
                    if (yw7Var.a() == 0) {
                        i = -1;
                        break;
                    }
                    int A = yw7Var.A();
                    i3 += A;
                    if (A != 255) {
                        i = i3;
                        break;
                    }
                }
                int i4 = 0;
                while (true) {
                    if (yw7Var.a() == 0) {
                        i4 = -1;
                        break;
                    }
                    int A2 = yw7Var.A();
                    i4 += A2;
                    if (A2 != 255) {
                        break;
                    }
                }
                int i5 = yw7Var.b + i4;
                if (i4 != -1 && i4 <= yw7Var.a()) {
                    if (i == 4 && i4 >= 8) {
                        int A3 = yw7Var.A();
                        int H = yw7Var.H();
                        if (H == 49) {
                            i2 = yw7Var.m();
                        } else {
                            i2 = 0;
                        }
                        int A4 = yw7Var.A();
                        if (H == 47) {
                            yw7Var.O(1);
                        }
                        if (A3 == 181 && ((H == 49 || H == 47) && A4 == 3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (H == 49) {
                            if (i2 != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            b(j, yw7Var, yzbVarArr);
                        }
                    }
                } else {
                    ncd.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i5 = yw7Var.c;
                }
                yw7Var.N(i5);
            } else {
                return;
            }
        }
    }

    public static void b(long j, yw7 yw7Var, yzb[] yzbVarArr) {
        boolean z;
        int A = yw7Var.A();
        if ((A & 64) != 0) {
            yw7Var.O(1);
            int i = (A & 31) * 3;
            int i2 = yw7Var.b;
            for (yzb yzbVar : yzbVarArr) {
                yw7Var.N(i2);
                yzbVar.e(i, yw7Var);
                if (j != -9223372036854775807L) {
                    z = true;
                } else {
                    z = false;
                }
                jte.p(z);
                yzbVar.a(j, 1, i, 0, null);
            }
        }
    }
}
