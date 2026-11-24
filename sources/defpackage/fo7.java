package defpackage;

import java.nio.ByteBuffer;
public final class fo7 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final boolean h;

    public fo7(eo7 eo7Var) {
        boolean z;
        boolean z2;
        boolean e;
        boolean z3;
        boolean z4;
        byte b;
        byte b2;
        byte b3;
        byte b4 = eo7Var.a;
        ByteBuffer byteBuffer = eo7Var.b;
        boolean z5 = true;
        if (b4 == 1) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        qd1 qd1Var = new qd1(remaining, bArr);
        this.g = qd1Var.f(3);
        qd1Var.m();
        boolean e2 = qd1Var.e();
        this.a = e2;
        if (e2) {
            qd1Var.f(5);
            this.b = false;
            this.h = false;
        } else {
            if (qd1Var.e()) {
                qd1Var.n(64);
                if (qd1Var.e()) {
                    int i = 0;
                    while (!qd1Var.e()) {
                        i++;
                    }
                    if (i < 32) {
                        qd1Var.n(i);
                    }
                }
                boolean e3 = qd1Var.e();
                this.b = e3;
                if (e3) {
                    qd1Var.n(47);
                }
            } else {
                this.b = false;
            }
            this.h = qd1Var.e();
            int f = qd1Var.f(5);
            for (int i2 = 0; i2 <= f; i2++) {
                qd1Var.n(12);
                if (i2 == 0) {
                    if (qd1Var.f(5) > 7) {
                        qd1Var.e();
                    }
                } else if (qd1Var.f(5) > 7) {
                    qd1Var.m();
                }
                if (this.b) {
                    qd1Var.m();
                }
                if (this.h && qd1Var.e()) {
                    if (i2 == 0) {
                        qd1Var.f(4);
                    } else {
                        qd1Var.n(4);
                    }
                }
            }
        }
        int f2 = qd1Var.f(4);
        int f3 = qd1Var.f(4);
        qd1Var.n(f2 + 1);
        qd1Var.n(f3 + 1);
        if (!this.a) {
            z2 = qd1Var.e();
            this.c = z2;
        } else {
            this.c = false;
            z2 = false;
        }
        if (z2) {
            qd1Var.n(4);
            qd1Var.n(3);
        }
        qd1Var.n(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            qd1Var.n(4);
            boolean e4 = qd1Var.e();
            if (e4) {
                qd1Var.n(2);
            }
            if (qd1Var.e()) {
                this.d = true;
                e = true;
            } else {
                e = qd1Var.e();
                this.d = e;
            }
            if (e) {
                if (qd1Var.e()) {
                    this.e = true;
                } else {
                    this.e = qd1Var.e();
                }
            } else {
                this.e = true;
            }
            if (e4) {
                this.f = qd1Var.f(3) + 1;
            } else {
                this.f = 0;
            }
        }
        qd1Var.n(3);
        boolean e5 = qd1Var.e();
        if (this.g == 2 && e5) {
            z3 = qd1Var.e();
        } else {
            z3 = false;
        }
        if (this.g != 1) {
            z4 = qd1Var.e();
        } else {
            z4 = false;
        }
        if (qd1Var.e()) {
            b2 = (byte) qd1Var.f(8);
            b3 = (byte) qd1Var.f(8);
            b = (byte) qd1Var.f(8);
        } else {
            b = 0;
            b2 = 0;
            b3 = 0;
        }
        if (z4) {
            qd1Var.m();
        } else if (b2 != 1 || b3 != 13 || b != 0) {
            qd1Var.m();
            int i3 = this.g;
            if (i3 == 0) {
                r1 = true;
            } else if (i3 == 1) {
                z5 = false;
            } else if (z3) {
                boolean e6 = qd1Var.e();
                z5 = e6 ? qd1Var.e() : false;
                r1 = e6;
            } else {
                z5 = false;
                r1 = true;
            }
            if (r1 && z5) {
                qd1Var.f(2);
            }
        }
        qd1Var.m();
    }
}
