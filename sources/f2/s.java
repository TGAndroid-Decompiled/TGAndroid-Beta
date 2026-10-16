package f2;

import java.nio.ByteBuffer;
import v7.u6;
public final class s {
    public final boolean f8897a;
    public final boolean f8898b;
    public final boolean f8899c;
    public final boolean d;
    public final boolean e;
    public final int f8900f;
    public final int f8901g;
    public final boolean h;
    public final boolean f8902i;
    public final boolean f8903j;
    public final boolean f8904k;
    public final boolean f8905l;
    public final byte f8906m;
    public final byte f8907n;
    public final byte f8908o;

    public s(r rVar) {
        boolean z10;
        int i10 = rVar.f8895a;
        ByteBuffer byteBuffer = rVar.f8896b;
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
        this.f8901g = gVar.g(3);
        gVar.n();
        boolean f7 = gVar.f();
        this.f8897a = f7;
        if (f7) {
            gVar.g(5);
            this.f8898b = false;
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
                this.f8898b = f10;
                if (f10) {
                    gVar.o(47);
                }
            } else {
                this.f8898b = false;
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
                if (this.f8898b) {
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
        if (!this.f8897a) {
            this.f8899c = gVar.f();
        } else {
            this.f8899c = false;
        }
        if (this.f8899c) {
            gVar.o(4);
            gVar.o(3);
        }
        gVar.o(3);
        if (this.f8897a) {
            this.e = true;
            this.d = true;
            this.f8900f = 0;
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
                this.f8900f = gVar.g(3) + 1;
            } else {
                this.f8900f = 0;
            }
        }
        gVar.o(3);
        boolean f12 = gVar.f();
        if (this.f8901g == 2 && f12) {
            this.f8902i = gVar.f();
        } else {
            this.f8902i = false;
        }
        if (this.f8901g != 1) {
            this.f8903j = gVar.f();
        } else {
            this.f8903j = false;
        }
        if (gVar.f()) {
            this.f8906m = (byte) gVar.g(8);
            this.f8907n = (byte) gVar.g(8);
            this.f8908o = (byte) gVar.g(8);
        } else {
            this.f8906m = (byte) 0;
            this.f8907n = (byte) 0;
            this.f8908o = (byte) 0;
        }
        if (this.f8903j) {
            gVar.n();
            this.f8904k = false;
            this.f8905l = false;
        } else if (this.f8906m == 1 && this.f8907n == 13 && this.f8908o == 0) {
            this.f8904k = false;
            this.f8905l = false;
        } else {
            gVar.n();
            int i13 = this.f8901g;
            if (i13 == 0) {
                this.f8904k = true;
                this.f8905l = true;
            } else if (i13 == 1) {
                this.f8904k = false;
                this.f8905l = false;
            } else if (this.f8902i) {
                boolean f13 = gVar.f();
                this.f8904k = f13;
                if (f13) {
                    this.f8905l = gVar.f();
                } else {
                    this.f8905l = false;
                }
            } else {
                this.f8904k = true;
                this.f8905l = false;
            }
            if (this.f8904k && this.f8905l) {
                gVar.g(2);
            }
        }
        gVar.n();
    }
}
