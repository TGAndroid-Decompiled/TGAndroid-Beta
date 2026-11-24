package defpackage;

import java.io.EOFException;
public final class nq7 {
    public short a;
    public long b;
    public short c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final yw7 g = new yw7(255);

    public final boolean a(vb3 vb3Var, boolean z) {
        boolean z2;
        boolean z3;
        this.a = (short) 0;
        this.b = 0L;
        this.c = (short) 0;
        this.d = 0;
        this.e = 0;
        yw7 yw7Var = this.g;
        yw7Var.K(27);
        try {
            z2 = vb3Var.d(yw7Var.a, 0, 27, z);
        } catch (EOFException e) {
            if (z) {
                z2 = false;
            } else {
                throw e;
            }
        }
        if (z2 && yw7Var.C() == 1332176723) {
            if (yw7Var.A() != 0) {
                if (!z) {
                    throw bx7.d("unsupported bit stream revision");
                }
            } else {
                this.a = yw7Var.A();
                this.b = yw7Var.p();
                yw7Var.r();
                yw7Var.r();
                yw7Var.r();
                ?? A = yw7Var.A();
                this.c = A;
                this.d = A + 27;
                yw7Var.K(A);
                try {
                    z3 = vb3Var.d(yw7Var.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (z) {
                        z3 = false;
                    } else {
                        throw e2;
                    }
                }
                if (z3) {
                    for (int i = 0; i < this.c; i++) {
                        int A2 = yw7Var.A();
                        this.f[i] = A2;
                        this.e += A2;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(defpackage.vb3 r9, long r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq7.b(vb3, long):boolean");
    }
}
