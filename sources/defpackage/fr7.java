package defpackage;

import java.nio.ByteBuffer;
public final class fr7 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final boolean h;

    public fr7(er7 er7Var) {
        boolean z;
        boolean z2;
        boolean e;
        boolean z3;
        boolean z4;
        byte b;
        byte b2;
        byte b3;
        byte b4 = er7Var.a;
        ByteBuffer byteBuffer = er7Var.b;
        boolean z5 = true;
        if (b4 == 1) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        zd1 zd1Var = new zd1(remaining, bArr);
        this.g = zd1Var.f(3);
        zd1Var.m();
        boolean e2 = zd1Var.e();
        this.a = e2;
        if (e2) {
            zd1Var.f(5);
            this.b = false;
            this.h = false;
        } else {
            if (zd1Var.e()) {
                zd1Var.n(64);
                if (zd1Var.e()) {
                    int i = 0;
                    while (!zd1Var.e()) {
                        i++;
                    }
                    if (i < 32) {
                        zd1Var.n(i);
                    }
                }
                boolean e3 = zd1Var.e();
                this.b = e3;
                if (e3) {
                    zd1Var.n(47);
                }
            } else {
                this.b = false;
            }
            this.h = zd1Var.e();
            int f = zd1Var.f(5);
            for (int i2 = 0; i2 <= f; i2++) {
                zd1Var.n(12);
                if (i2 == 0) {
                    if (zd1Var.f(5) > 7) {
                        zd1Var.e();
                    }
                } else if (zd1Var.f(5) > 7) {
                    zd1Var.m();
                }
                if (this.b) {
                    zd1Var.m();
                }
                if (this.h && zd1Var.e()) {
                    if (i2 == 0) {
                        zd1Var.f(4);
                    } else {
                        zd1Var.n(4);
                    }
                }
            }
        }
        int f2 = zd1Var.f(4);
        int f3 = zd1Var.f(4);
        zd1Var.n(f2 + 1);
        zd1Var.n(f3 + 1);
        if (!this.a) {
            z2 = zd1Var.e();
            this.c = z2;
        } else {
            this.c = false;
            z2 = false;
        }
        if (z2) {
            zd1Var.n(4);
            zd1Var.n(3);
        }
        zd1Var.n(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            zd1Var.n(4);
            boolean e4 = zd1Var.e();
            if (e4) {
                zd1Var.n(2);
            }
            if (zd1Var.e()) {
                this.d = true;
                e = true;
            } else {
                e = zd1Var.e();
                this.d = e;
            }
            if (e) {
                if (zd1Var.e()) {
                    this.e = true;
                } else {
                    this.e = zd1Var.e();
                }
            } else {
                this.e = true;
            }
            if (e4) {
                this.f = zd1Var.f(3) + 1;
            } else {
                this.f = 0;
            }
        }
        zd1Var.n(3);
        boolean e5 = zd1Var.e();
        if (this.g == 2 && e5) {
            z3 = zd1Var.e();
        } else {
            z3 = false;
        }
        if (this.g != 1) {
            z4 = zd1Var.e();
        } else {
            z4 = false;
        }
        if (zd1Var.e()) {
            b2 = (byte) zd1Var.f(8);
            b3 = (byte) zd1Var.f(8);
            b = (byte) zd1Var.f(8);
        } else {
            b = 0;
            b2 = 0;
            b3 = 0;
        }
        if (z4) {
            zd1Var.m();
        } else if (b2 != 1 || b3 != 13 || b != 0) {
            zd1Var.m();
            int i3 = this.g;
            if (i3 == 0) {
                r1 = true;
            } else if (i3 == 1) {
                z5 = false;
            } else if (z3) {
                boolean e6 = zd1Var.e();
                z5 = e6 ? zd1Var.e() : false;
                r1 = e6;
            } else {
                z5 = false;
                r1 = true;
            }
            if (r1 && z5) {
                zd1Var.f(2);
            }
        }
        zd1Var.m();
    }
}
