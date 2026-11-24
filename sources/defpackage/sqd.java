package defpackage;
public abstract class sqd {
    public static void a(long j, xu7 xu7Var, wxb[] wxbVarArr) {
        int i;
        int i2;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (xu7Var.a() > 1) {
                int i3 = 0;
                while (true) {
                    if (xu7Var.a() == 0) {
                        i = -1;
                        break;
                    }
                    int A = xu7Var.A();
                    i3 += A;
                    if (A != 255) {
                        i = i3;
                        break;
                    }
                }
                int i4 = 0;
                while (true) {
                    if (xu7Var.a() == 0) {
                        i4 = -1;
                        break;
                    }
                    int A2 = xu7Var.A();
                    i4 += A2;
                    if (A2 != 255) {
                        break;
                    }
                }
                int i5 = xu7Var.b + i4;
                if (i4 != -1 && i4 <= xu7Var.a()) {
                    if (i == 4 && i4 >= 8) {
                        int A3 = xu7Var.A();
                        int H = xu7Var.H();
                        if (H == 49) {
                            i2 = xu7Var.m();
                        } else {
                            i2 = 0;
                        }
                        int A4 = xu7Var.A();
                        if (H == 47) {
                            xu7Var.O(1);
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
                            b(j, xu7Var, wxbVarArr);
                        }
                    }
                } else {
                    lad.f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i5 = xu7Var.c;
                }
                xu7Var.N(i5);
            } else {
                return;
            }
        }
    }

    public static void b(long j, xu7 xu7Var, wxb[] wxbVarArr) {
        boolean z;
        int A = xu7Var.A();
        if ((A & 64) != 0) {
            xu7Var.O(1);
            int i = (A & 31) * 3;
            int i2 = xu7Var.b;
            for (wxb wxbVar : wxbVarArr) {
                xu7Var.N(i2);
                wxbVar.e(i, xu7Var);
                if (j != -9223372036854775807L) {
                    z = true;
                } else {
                    z = false;
                }
                gre.p(z);
                wxbVar.a(j, 1, i, 0, null);
            }
        }
    }
}
