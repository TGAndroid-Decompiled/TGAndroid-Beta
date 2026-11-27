package defpackage;

import java.io.EOFException;
public final class kr7 {
    public short a;
    public long b;
    public short c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final ey7 g = new ey7(255);

    public final boolean a(cb3 cb3Var, boolean z) {
        boolean z2;
        boolean z3;
        this.a = (short) 0;
        this.b = 0L;
        this.c = (short) 0;
        this.d = 0;
        this.e = 0;
        ey7 ey7Var = this.g;
        ey7Var.K(27);
        try {
            z2 = cb3Var.d(ey7Var.a, 0, 27, z);
        } catch (EOFException e) {
            if (z) {
                z2 = false;
            } else {
                throw e;
            }
        }
        if (z2 && ey7Var.C() == 1332176723) {
            if (ey7Var.A() != 0) {
                if (!z) {
                    throw hy7.d("unsupported bit stream revision");
                }
            } else {
                this.a = ey7Var.A();
                this.b = ey7Var.p();
                ey7Var.r();
                ey7Var.r();
                ey7Var.r();
                ?? A = ey7Var.A();
                this.c = A;
                this.d = A + 27;
                ey7Var.K(A);
                try {
                    z3 = cb3Var.d(ey7Var.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (z) {
                        z3 = false;
                    } else {
                        throw e2;
                    }
                }
                if (z3) {
                    for (int i = 0; i < this.c; i++) {
                        int A2 = ey7Var.A();
                        this.f[i] = A2;
                        this.e += A2;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(defpackage.cb3 r9, long r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr7.b(cb3, long):boolean");
    }
}
