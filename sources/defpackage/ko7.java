package defpackage;

import java.io.EOFException;
public final class ko7 {
    public short a;
    public long b;
    public short c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final xu7 g = new xu7(255);

    public final boolean a(ja3 ja3Var, boolean z) {
        boolean z2;
        boolean z3;
        this.a = (short) 0;
        this.b = 0L;
        this.c = (short) 0;
        this.d = 0;
        this.e = 0;
        xu7 xu7Var = this.g;
        xu7Var.K(27);
        try {
            z2 = ja3Var.d(xu7Var.a, 0, 27, z);
        } catch (EOFException e) {
            if (z) {
                z2 = false;
            } else {
                throw e;
            }
        }
        if (z2 && xu7Var.C() == 1332176723) {
            if (xu7Var.A() != 0) {
                if (!z) {
                    throw av7.d("unsupported bit stream revision");
                }
            } else {
                this.a = xu7Var.A();
                this.b = xu7Var.p();
                xu7Var.r();
                xu7Var.r();
                xu7Var.r();
                ?? A = xu7Var.A();
                this.c = A;
                this.d = A + 27;
                xu7Var.K(A);
                try {
                    z3 = ja3Var.d(xu7Var.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (z) {
                        z3 = false;
                    } else {
                        throw e2;
                    }
                }
                if (z3) {
                    for (int i = 0; i < this.c; i++) {
                        int A2 = xu7Var.A();
                        this.f[i] = A2;
                        this.e += A2;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(defpackage.ja3 r9, long r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ko7.b(ja3, long):boolean");
    }
}
