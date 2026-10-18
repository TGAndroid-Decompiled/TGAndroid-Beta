package f2;

import java.nio.ByteBuffer;
import v7.u6;
public final class t {
    public final boolean f10343a;
    public final boolean f10344b;
    public final boolean f10345c;
    public final boolean d;
    public final boolean e;
    public final int f10346f;
    public final int f10347g;
    public final boolean h;
    public final boolean f10348i;
    public final boolean f10349j;
    public final boolean f10350k;
    public final boolean f10351l;
    public final byte f10352m;
    public final byte f10353n;
    public final byte f10354o;

    public t(s sVar) {
        boolean z10;
        int i10 = sVar.f10341a;
        ByteBuffer byteBuffer = sVar.f10342b;
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
        this.f10347g = gVar.g(3);
        gVar.n();
        boolean f7 = gVar.f();
        this.f10343a = f7;
        if (f7) {
            gVar.g(5);
            this.f10344b = false;
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
                this.f10344b = f10;
                if (f10) {
                    gVar.o(47);
                }
            } else {
                this.f10344b = false;
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
                if (this.f10344b) {
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
        if (!this.f10343a) {
            this.f10345c = gVar.f();
        } else {
            this.f10345c = false;
        }
        if (this.f10345c) {
            gVar.o(4);
            gVar.o(3);
        }
        gVar.o(3);
        if (this.f10343a) {
            this.e = true;
            this.d = true;
            this.f10346f = 0;
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
                this.f10346f = gVar.g(3) + 1;
            } else {
                this.f10346f = 0;
            }
        }
        gVar.o(3);
        boolean f12 = gVar.f();
        if (this.f10347g == 2 && f12) {
            this.f10348i = gVar.f();
        } else {
            this.f10348i = false;
        }
        if (this.f10347g != 1) {
            this.f10349j = gVar.f();
        } else {
            this.f10349j = false;
        }
        if (gVar.f()) {
            this.f10352m = (byte) gVar.g(8);
            this.f10353n = (byte) gVar.g(8);
            this.f10354o = (byte) gVar.g(8);
        } else {
            this.f10352m = (byte) 0;
            this.f10353n = (byte) 0;
            this.f10354o = (byte) 0;
        }
        if (this.f10349j) {
            gVar.n();
            this.f10350k = false;
            this.f10351l = false;
        } else if (this.f10352m == 1 && this.f10353n == 13 && this.f10354o == 0) {
            this.f10350k = false;
            this.f10351l = false;
        } else {
            gVar.n();
            int i13 = this.f10347g;
            if (i13 == 0) {
                this.f10350k = true;
                this.f10351l = true;
            } else if (i13 == 1) {
                this.f10350k = false;
                this.f10351l = false;
            } else if (this.f10348i) {
                boolean f13 = gVar.f();
                this.f10350k = f13;
                if (f13) {
                    this.f10351l = gVar.f();
                } else {
                    this.f10351l = false;
                }
            } else {
                this.f10350k = true;
                this.f10351l = false;
            }
            if (this.f10350k && this.f10351l) {
                gVar.g(2);
            }
        }
        gVar.n();
    }
}
