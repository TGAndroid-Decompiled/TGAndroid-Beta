package f2;

import a8.yb;
import java.nio.ByteBuffer;
public final class t {
    public final boolean f10116a;
    public final boolean f10117b;
    public final boolean f10118c;
    public final boolean d;
    public final boolean e;
    public final int f10119f;
    public final int f10120g;
    public final boolean h;
    public final boolean f10121i;
    public final boolean f10122j;
    public final boolean f10123k;
    public final boolean f10124l;
    public final byte f10125m;
    public final byte f10126n;
    public final byte f10127o;

    public t(s sVar) {
        boolean z10;
        int i10 = sVar.f10114a;
        ByteBuffer byteBuffer = sVar.f10115b;
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
        this.f10120g = gVar.g(3);
        gVar.n();
        boolean f7 = gVar.f();
        this.f10116a = f7;
        if (f7) {
            gVar.g(5);
            this.f10117b = false;
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
                this.f10117b = f10;
                if (f10) {
                    gVar.o(47);
                }
            } else {
                this.f10117b = false;
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
                if (this.f10117b) {
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
        if (!this.f10116a) {
            this.f10118c = gVar.f();
        } else {
            this.f10118c = false;
        }
        if (this.f10118c) {
            gVar.o(4);
            gVar.o(3);
        }
        gVar.o(3);
        if (this.f10116a) {
            this.e = true;
            this.d = true;
            this.f10119f = 0;
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
                this.f10119f = gVar.g(3) + 1;
            } else {
                this.f10119f = 0;
            }
        }
        gVar.o(3);
        boolean f12 = gVar.f();
        if (this.f10120g == 2 && f12) {
            this.f10121i = gVar.f();
        } else {
            this.f10121i = false;
        }
        if (this.f10120g != 1) {
            this.f10122j = gVar.f();
        } else {
            this.f10122j = false;
        }
        if (gVar.f()) {
            this.f10125m = (byte) gVar.g(8);
            this.f10126n = (byte) gVar.g(8);
            this.f10127o = (byte) gVar.g(8);
        } else {
            this.f10125m = (byte) 0;
            this.f10126n = (byte) 0;
            this.f10127o = (byte) 0;
        }
        if (this.f10122j) {
            gVar.n();
            this.f10123k = false;
            this.f10124l = false;
        } else if (this.f10125m == 1 && this.f10126n == 13 && this.f10127o == 0) {
            this.f10123k = false;
            this.f10124l = false;
        } else {
            gVar.n();
            int i13 = this.f10120g;
            if (i13 == 0) {
                this.f10123k = true;
                this.f10124l = true;
            } else if (i13 == 1) {
                this.f10123k = false;
                this.f10124l = false;
            } else if (this.f10121i) {
                boolean f13 = gVar.f();
                this.f10123k = f13;
                if (f13) {
                    this.f10124l = gVar.f();
                } else {
                    this.f10124l = false;
                }
            } else {
                this.f10123k = true;
                this.f10124l = false;
            }
            if (this.f10123k && this.f10124l) {
                gVar.g(2);
            }
        }
        gVar.n();
    }
}
