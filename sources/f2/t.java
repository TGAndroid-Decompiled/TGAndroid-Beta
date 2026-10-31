package f2;

import java.nio.ByteBuffer;
import v7.t6;
public final class t {
    public final boolean f6788a;
    public final boolean f6789b;
    public final boolean f6790c;
    public final boolean d;
    public final boolean e;
    public final int f6791f;
    public final int f6792g;
    public final boolean h;
    public final boolean f6793i;
    public final boolean f6794j;
    public final boolean f6795k;
    public final boolean f6796l;
    public final byte f6797m;
    public final byte f6798n;
    public final byte f6799o;

    public t(s sVar) {
        boolean z10;
        int i10 = sVar.f6786a;
        ByteBuffer byteBuffer = sVar.f6787b;
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
        this.f6792g = gVar.i(3);
        gVar.e0();
        boolean h = gVar.h();
        this.f6788a = h;
        if (h) {
            gVar.i(5);
            this.f6789b = false;
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
                this.f6789b = h10;
                if (h10) {
                    gVar.f0(47);
                }
            } else {
                this.f6789b = false;
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
                if (this.f6789b) {
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
        if (!this.f6788a) {
            this.f6790c = gVar.h();
        } else {
            this.f6790c = false;
        }
        if (this.f6790c) {
            gVar.f0(4);
            gVar.f0(3);
        }
        gVar.f0(3);
        if (this.f6788a) {
            this.e = true;
            this.d = true;
            this.f6791f = 0;
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
                this.f6791f = gVar.i(3) + 1;
            } else {
                this.f6791f = 0;
            }
        }
        gVar.f0(3);
        boolean h12 = gVar.h();
        if (this.f6792g == 2 && h12) {
            this.f6793i = gVar.h();
        } else {
            this.f6793i = false;
        }
        if (this.f6792g != 1) {
            this.f6794j = gVar.h();
        } else {
            this.f6794j = false;
        }
        if (gVar.h()) {
            this.f6797m = (byte) gVar.i(8);
            this.f6798n = (byte) gVar.i(8);
            this.f6799o = (byte) gVar.i(8);
        } else {
            this.f6797m = (byte) 0;
            this.f6798n = (byte) 0;
            this.f6799o = (byte) 0;
        }
        if (this.f6794j) {
            gVar.e0();
            this.f6795k = false;
            this.f6796l = false;
        } else if (this.f6797m == 1 && this.f6798n == 13 && this.f6799o == 0) {
            this.f6795k = false;
            this.f6796l = false;
        } else {
            gVar.e0();
            int i16 = this.f6792g;
            if (i16 == 0) {
                this.f6795k = true;
                this.f6796l = true;
            } else if (i16 == 1) {
                this.f6795k = false;
                this.f6796l = false;
            } else if (this.f6793i) {
                boolean h13 = gVar.h();
                this.f6795k = h13;
                if (h13) {
                    this.f6796l = gVar.h();
                } else {
                    this.f6796l = false;
                }
            } else {
                this.f6795k = true;
                this.f6796l = false;
            }
            if (this.f6795k && this.f6796l) {
                gVar.i(2);
            }
        }
        gVar.e0();
    }
}
