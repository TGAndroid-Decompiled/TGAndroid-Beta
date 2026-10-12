package f2;

import java.nio.ByteBuffer;
import v7.u6;
public final class s {
    public final boolean f8894a;
    public final boolean f8895b;
    public final boolean f8896c;
    public final boolean d;
    public final boolean e;
    public final int f8897f;
    public final int f8898g;
    public final boolean h;
    public final boolean f8899i;
    public final boolean f8900j;
    public final boolean f8901k;
    public final boolean f8902l;
    public final byte f8903m;
    public final byte f8904n;
    public final byte f8905o;

    public s(r rVar) {
        boolean z10;
        int i10 = rVar.f8892a;
        ByteBuffer byteBuffer = rVar.f8893b;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        a4.g gVar = new a4.g(bArr, remaining);
        this.f8898g = gVar.g(3);
        gVar.n();
        boolean f7 = gVar.f();
        this.f8894a = f7;
        if (f7) {
            gVar.g(5);
            this.f8895b = false;
            this.h = false;
        } else {
            if (gVar.f()) {
                gVar.o(64);
                if (gVar.f()) {
                    int i11 = 0;
                    while (!gVar.f()) {
                        i11++;
                    }
                    if (i11 < 32) {
                        gVar.o(i11);
                    }
                }
                boolean f10 = gVar.f();
                this.f8895b = f10;
                if (f10) {
                    gVar.o(47);
                }
            } else {
                this.f8895b = false;
            }
            this.h = gVar.f();
            int g10 = gVar.g(5);
            for (int i12 = 0; i12 <= g10; i12++) {
                gVar.o(12);
                if (i12 == 0) {
                    if (gVar.g(5) > 7) {
                        gVar.f();
                    }
                } else if (gVar.g(5) > 7) {
                    gVar.n();
                }
                if (this.f8895b) {
                    gVar.n();
                }
                if (this.h && gVar.f()) {
                    if (i12 == 0) {
                        gVar.g(4);
                    } else {
                        gVar.o(4);
                    }
                }
            }
        }
        int g11 = gVar.g(4);
        int g12 = gVar.g(4);
        gVar.o(g11 + 1);
        gVar.o(g12 + 1);
        if (!this.f8894a) {
            this.f8896c = gVar.f();
        } else {
            this.f8896c = false;
        }
        if (this.f8896c) {
            gVar.o(4);
            gVar.o(3);
        }
        gVar.o(3);
        if (this.f8894a) {
            this.e = true;
            this.d = true;
            this.f8897f = 0;
        } else {
            gVar.o(4);
            boolean f11 = gVar.f();
            if (f11) {
                gVar.o(2);
            }
            if (gVar.f()) {
                this.d = true;
            } else {
                this.d = gVar.f();
            }
            if (this.d) {
                if (gVar.f()) {
                    this.e = true;
                } else {
                    this.e = gVar.f();
                }
            } else {
                this.e = true;
            }
            if (f11) {
                this.f8897f = gVar.g(3) + 1;
            } else {
                this.f8897f = 0;
            }
        }
        gVar.o(3);
        boolean f12 = gVar.f();
        if (this.f8898g == 2 && f12) {
            this.f8899i = gVar.f();
        } else {
            this.f8899i = false;
        }
        if (this.f8898g != 1) {
            this.f8900j = gVar.f();
        } else {
            this.f8900j = false;
        }
        if (gVar.f()) {
            this.f8903m = (byte) gVar.g(8);
            this.f8904n = (byte) gVar.g(8);
            this.f8905o = (byte) gVar.g(8);
        } else {
            this.f8903m = (byte) 0;
            this.f8904n = (byte) 0;
            this.f8905o = (byte) 0;
        }
        if (this.f8900j) {
            gVar.n();
            this.f8901k = false;
            this.f8902l = false;
        } else if (this.f8903m == 1 && this.f8904n == 13 && this.f8905o == 0) {
            this.f8901k = false;
            this.f8902l = false;
        } else {
            gVar.n();
            int i13 = this.f8898g;
            if (i13 == 0) {
                this.f8901k = true;
                this.f8902l = true;
            } else if (i13 == 1) {
                this.f8901k = false;
                this.f8902l = false;
            } else if (this.f8899i) {
                boolean f13 = gVar.f();
                this.f8901k = f13;
                if (f13) {
                    this.f8902l = gVar.f();
                } else {
                    this.f8902l = false;
                }
            } else {
                this.f8901k = true;
                this.f8902l = false;
            }
            if (this.f8901k && this.f8902l) {
                gVar.g(2);
            }
        }
        gVar.n();
    }
}
