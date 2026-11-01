package f2;

import java.nio.ByteBuffer;
import v7.t6;
public final class t {
    public final boolean f6789a;
    public final boolean f6790b;
    public final boolean f6791c;
    public final boolean d;
    public final boolean e;
    public final int f6792f;
    public final int f6793g;
    public final boolean h;
    public final boolean f6794i;
    public final boolean f6795j;
    public final boolean f6796k;
    public final boolean f6797l;
    public final byte f6798m;
    public final byte f6799n;
    public final byte f6800o;

    public t(s sVar) {
        boolean z10;
        int i10 = sVar.f6787a;
        ByteBuffer byteBuffer = sVar.f6788b;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        a4.g gVar = new a4.g(bArr, remaining);
        this.f6793g = gVar.i(3);
        gVar.e0();
        boolean h = gVar.h();
        this.f6789a = h;
        if (h) {
            gVar.i(5);
            this.f6790b = false;
            this.h = false;
        } else {
            if (gVar.h()) {
                gVar.f0(64);
                if (gVar.h()) {
                    int i11 = 0;
                    while (!gVar.h()) {
                        i11++;
                    }
                    if (i11 < 32) {
                        gVar.f0(i11);
                    }
                }
                boolean h10 = gVar.h();
                this.f6790b = h10;
                if (h10) {
                    gVar.f0(47);
                }
            } else {
                this.f6790b = false;
            }
            this.h = gVar.h();
            int i12 = gVar.i(5);
            for (int i13 = 0; i13 <= i12; i13++) {
                gVar.f0(12);
                if (i13 == 0) {
                    if (gVar.i(5) > 7) {
                        gVar.h();
                    }
                } else if (gVar.i(5) > 7) {
                    gVar.e0();
                }
                if (this.f6790b) {
                    gVar.e0();
                }
                if (this.h && gVar.h()) {
                    if (i13 == 0) {
                        gVar.i(4);
                    } else {
                        gVar.f0(4);
                    }
                }
            }
        }
        int i14 = gVar.i(4);
        int i15 = gVar.i(4);
        gVar.f0(i14 + 1);
        gVar.f0(i15 + 1);
        if (!this.f6789a) {
            this.f6791c = gVar.h();
        } else {
            this.f6791c = false;
        }
        if (this.f6791c) {
            gVar.f0(4);
            gVar.f0(3);
        }
        gVar.f0(3);
        if (this.f6789a) {
            this.e = true;
            this.d = true;
            this.f6792f = 0;
        } else {
            gVar.f0(4);
            boolean h11 = gVar.h();
            if (h11) {
                gVar.f0(2);
            }
            if (gVar.h()) {
                this.d = true;
            } else {
                this.d = gVar.h();
            }
            if (this.d) {
                if (gVar.h()) {
                    this.e = true;
                } else {
                    this.e = gVar.h();
                }
            } else {
                this.e = true;
            }
            if (h11) {
                this.f6792f = gVar.i(3) + 1;
            } else {
                this.f6792f = 0;
            }
        }
        gVar.f0(3);
        boolean h12 = gVar.h();
        if (this.f6793g == 2 && h12) {
            this.f6794i = gVar.h();
        } else {
            this.f6794i = false;
        }
        if (this.f6793g != 1) {
            this.f6795j = gVar.h();
        } else {
            this.f6795j = false;
        }
        if (gVar.h()) {
            this.f6798m = (byte) gVar.i(8);
            this.f6799n = (byte) gVar.i(8);
            this.f6800o = (byte) gVar.i(8);
        } else {
            this.f6798m = (byte) 0;
            this.f6799n = (byte) 0;
            this.f6800o = (byte) 0;
        }
        if (this.f6795j) {
            gVar.e0();
            this.f6796k = false;
            this.f6797l = false;
        } else if (this.f6798m == 1 && this.f6799n == 13 && this.f6800o == 0) {
            this.f6796k = false;
            this.f6797l = false;
        } else {
            gVar.e0();
            int i16 = this.f6793g;
            if (i16 == 0) {
                this.f6796k = true;
                this.f6797l = true;
            } else if (i16 == 1) {
                this.f6796k = false;
                this.f6797l = false;
            } else if (this.f6794i) {
                boolean h13 = gVar.h();
                this.f6796k = h13;
                if (h13) {
                    this.f6797l = gVar.h();
                } else {
                    this.f6797l = false;
                }
            } else {
                this.f6796k = true;
                this.f6797l = false;
            }
            if (this.f6796k && this.f6797l) {
                gVar.i(2);
            }
        }
        gVar.e0();
    }
}
