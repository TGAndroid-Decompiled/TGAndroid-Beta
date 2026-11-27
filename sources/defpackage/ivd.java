package defpackage;
public abstract class ivd {
    public static void a(long j, ey7 ey7Var, x1c[] x1cVarArr) {
        int i;
        int i2;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (ey7Var.a() > 1) {
                int i3 = 0;
                while (true) {
                    if (ey7Var.a() == 0) {
                        i = -1;
                        break;
                    }
                    int A = ey7Var.A();
                    i3 += A;
                    if (A != 255) {
                        i = i3;
                        break;
                    }
                }
                int i4 = 0;
                while (true) {
                    if (ey7Var.a() == 0) {
                        i4 = -1;
                        break;
                    }
                    int A2 = ey7Var.A();
                    i4 += A2;
                    if (A2 != 255) {
                        break;
                    }
                }
                int i5 = ey7Var.b + i4;
                if (i4 != -1 && i4 <= ey7Var.a()) {
                    if (i == 4 && i4 >= 8) {
                        int A3 = ey7Var.A();
                        int H = ey7Var.H();
                        if (H == 49) {
                            i2 = ey7Var.m();
                        } else {
                            i2 = 0;
                        }
                        int A4 = ey7Var.A();
                        if (H == 47) {
                            ey7Var.O(1);
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
                            b(j, ey7Var, x1cVarArr);
                        }
                    }
                } else {
                    efd.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i5 = ey7Var.c;
                }
                ey7Var.N(i5);
            } else {
                return;
            }
        }
    }

    public static void b(long j, ey7 ey7Var, x1c[] x1cVarArr) {
        boolean z;
        int A = ey7Var.A();
        if ((A & 64) != 0) {
            ey7Var.O(1);
            int i = (A & 31) * 3;
            int i2 = ey7Var.b;
            for (x1c x1cVar : x1cVarArr) {
                ey7Var.N(i2);
                x1cVar.e(i, ey7Var);
                if (j != -9223372036854775807L) {
                    z = true;
                } else {
                    z = false;
                }
                yve.p(z);
                x1cVar.a(j, 1, i, 0, null);
            }
        }
    }
}
