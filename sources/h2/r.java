package h2;

import b8.zb;
import java.nio.ByteBuffer;
public final class r {
    public final boolean f14163a;
    public final boolean f14164b;
    public final boolean f14165c;
    public final boolean d;
    public final boolean f14166e;
    public final int f14167f;
    public final int f14168g;
    public final boolean h;
    public final boolean f14169i;
    public final boolean f14170j;
    public final boolean f14171k;
    public final boolean f14172l;
    public final byte f14173m;
    public final byte f14174n;
    public final byte f14175o;

    public r(q qVar) {
        boolean z10;
        int i3 = qVar.f14161a;
        ByteBuffer byteBuffer = qVar.f14162b;
        if (i3 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        c4.f fVar = new c4.f(bArr, remaining);
        this.f14168g = fVar.j(3);
        fVar.K();
        boolean i10 = fVar.i();
        this.f14163a = i10;
        if (i10) {
            fVar.j(5);
            this.f14164b = false;
            this.h = false;
        } else {
            if (fVar.i()) {
                fVar.L(64);
                if (fVar.i()) {
                    int i11 = 0;
                    while (!fVar.i()) {
                        i11++;
                    }
                    if (i11 < 32) {
                        fVar.L(i11);
                    }
                }
                boolean i12 = fVar.i();
                this.f14164b = i12;
                if (i12) {
                    fVar.L(47);
                }
            } else {
                this.f14164b = false;
            }
            this.h = fVar.i();
            int j10 = fVar.j(5);
            for (int i13 = 0; i13 <= j10; i13++) {
                fVar.L(12);
                if (i13 == 0) {
                    if (fVar.j(5) > 7) {
                        fVar.i();
                    }
                } else if (fVar.j(5) > 7) {
                    fVar.K();
                }
                if (this.f14164b) {
                    fVar.K();
                }
                if (this.h && fVar.i()) {
                    if (i13 == 0) {
                        fVar.j(4);
                    } else {
                        fVar.L(4);
                    }
                }
            }
        }
        int j11 = fVar.j(4);
        int j12 = fVar.j(4);
        fVar.L(j11 + 1);
        fVar.L(j12 + 1);
        if (!this.f14163a) {
            this.f14165c = fVar.i();
        } else {
            this.f14165c = false;
        }
        if (this.f14165c) {
            fVar.L(4);
            fVar.L(3);
        }
        fVar.L(3);
        if (this.f14163a) {
            this.f14166e = true;
            this.d = true;
            this.f14167f = 0;
        } else {
            fVar.L(4);
            boolean i14 = fVar.i();
            if (i14) {
                fVar.L(2);
            }
            if (fVar.i()) {
                this.d = true;
            } else {
                this.d = fVar.i();
            }
            if (this.d) {
                if (fVar.i()) {
                    this.f14166e = true;
                } else {
                    this.f14166e = fVar.i();
                }
            } else {
                this.f14166e = true;
            }
            if (i14) {
                this.f14167f = fVar.j(3) + 1;
            } else {
                this.f14167f = 0;
            }
        }
        fVar.L(3);
        boolean i15 = fVar.i();
        if (this.f14168g == 2 && i15) {
            this.f14169i = fVar.i();
        } else {
            this.f14169i = false;
        }
        if (this.f14168g != 1) {
            this.f14170j = fVar.i();
        } else {
            this.f14170j = false;
        }
        if (fVar.i()) {
            this.f14173m = (byte) fVar.j(8);
            this.f14174n = (byte) fVar.j(8);
            this.f14175o = (byte) fVar.j(8);
        } else {
            this.f14173m = (byte) 0;
            this.f14174n = (byte) 0;
            this.f14175o = (byte) 0;
        }
        if (this.f14170j) {
            fVar.K();
            this.f14171k = false;
            this.f14172l = false;
        } else if (this.f14173m == 1 && this.f14174n == 13 && this.f14175o == 0) {
            this.f14171k = false;
            this.f14172l = false;
        } else {
            fVar.K();
            int i16 = this.f14168g;
            if (i16 == 0) {
                this.f14171k = true;
                this.f14172l = true;
            } else if (i16 == 1) {
                this.f14171k = false;
                this.f14172l = false;
            } else if (this.f14169i) {
                boolean i17 = fVar.i();
                this.f14171k = i17;
                if (i17) {
                    this.f14172l = fVar.i();
                } else {
                    this.f14172l = false;
                }
            } else {
                this.f14171k = true;
                this.f14172l = false;
            }
            if (this.f14171k && this.f14172l) {
                fVar.j(2);
            }
        }
        fVar.K();
    }
}
