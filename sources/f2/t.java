package f2;

import a8.yb;
import java.nio.ByteBuffer;
public final class t {
    public final boolean f10115a;
    public final boolean f10116b;
    public final boolean f10117c;
    public final boolean d;
    public final boolean e;
    public final int f10118f;
    public final int f10119g;
    public final boolean h;
    public final boolean f10120i;
    public final boolean f10121j;
    public final boolean f10122k;
    public final boolean f10123l;
    public final byte f10124m;
    public final byte f10125n;
    public final byte f10126o;

    public t(s sVar) {
        boolean z10;
        int i10 = sVar.f10113a;
        ByteBuffer byteBuffer = sVar.f10114b;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        a4.g gVar = new a4.g(bArr, remaining);
        this.f10119g = gVar.g(3);
        gVar.n();
        boolean f7 = gVar.f();
        this.f10115a = f7;
        if (f7) {
            gVar.g(5);
            this.f10116b = false;
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
                this.f10116b = f10;
                if (f10) {
                    gVar.o(47);
                }
            } else {
                this.f10116b = false;
            }
            this.h = gVar.f();
            int g7 = gVar.g(5);
            for (int i12 = 0; i12 <= g7; i12++) {
                gVar.o(12);
                if (i12 == 0) {
                    if (gVar.g(5) > 7) {
                        gVar.f();
                    }
                } else if (gVar.g(5) > 7) {
                    gVar.n();
                }
                if (this.f10116b) {
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
        int g10 = gVar.g(4);
        int g11 = gVar.g(4);
        gVar.o(g10 + 1);
        gVar.o(g11 + 1);
        if (!this.f10115a) {
            this.f10117c = gVar.f();
        } else {
            this.f10117c = false;
        }
        if (this.f10117c) {
            gVar.o(4);
            gVar.o(3);
        }
        gVar.o(3);
        if (this.f10115a) {
            this.e = true;
            this.d = true;
            this.f10118f = 0;
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
                this.f10118f = gVar.g(3) + 1;
            } else {
                this.f10118f = 0;
            }
        }
        gVar.o(3);
        boolean f12 = gVar.f();
        if (this.f10119g == 2 && f12) {
            this.f10120i = gVar.f();
        } else {
            this.f10120i = false;
        }
        if (this.f10119g != 1) {
            this.f10121j = gVar.f();
        } else {
            this.f10121j = false;
        }
        if (gVar.f()) {
            this.f10124m = (byte) gVar.g(8);
            this.f10125n = (byte) gVar.g(8);
            this.f10126o = (byte) gVar.g(8);
        } else {
            this.f10124m = (byte) 0;
            this.f10125n = (byte) 0;
            this.f10126o = (byte) 0;
        }
        if (this.f10121j) {
            gVar.n();
            this.f10122k = false;
            this.f10123l = false;
        } else if (this.f10124m == 1 && this.f10125n == 13 && this.f10126o == 0) {
            this.f10122k = false;
            this.f10123l = false;
        } else {
            gVar.n();
            int i13 = this.f10119g;
            if (i13 == 0) {
                this.f10122k = true;
                this.f10123l = true;
            } else if (i13 == 1) {
                this.f10122k = false;
                this.f10123l = false;
            } else if (this.f10120i) {
                boolean f13 = gVar.f();
                this.f10122k = f13;
                if (f13) {
                    this.f10123l = gVar.f();
                } else {
                    this.f10123l = false;
                }
            } else {
                this.f10122k = true;
                this.f10123l = false;
            }
            if (this.f10122k && this.f10123l) {
                gVar.g(2);
            }
        }
        gVar.n();
    }
}
