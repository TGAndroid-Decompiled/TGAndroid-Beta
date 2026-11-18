package i2;

import a8.la;
import java.nio.ByteBuffer;
public final class r {
    public final boolean f15982a;
    public final boolean f15983b;
    public final boolean f15984c;
    public final boolean d;
    public final boolean f15985e;
    public final int f15986f;
    public final int f15987g;
    public final boolean h;
    public final boolean f15988i;
    public final boolean f15989j;
    public final boolean f15990k;
    public final boolean f15991l;
    public final byte f15992m;
    public final byte f15993n;
    public final byte f15994o;

    public r(q qVar) {
        boolean z10;
        int i7 = qVar.f15980a;
        ByteBuffer byteBuffer = qVar.f15981b;
        if (i7 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        d4.f fVar = new d4.f(bArr, remaining);
        this.f15987g = fVar.j(3);
        fVar.K();
        boolean i10 = fVar.i();
        this.f15982a = i10;
        if (i10) {
            fVar.j(5);
            this.f15983b = false;
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
                this.f15983b = i12;
                if (i12) {
                    fVar.L(47);
                }
            } else {
                this.f15983b = false;
            }
            this.h = fVar.i();
            int j3 = fVar.j(5);
            for (int i13 = 0; i13 <= j3; i13++) {
                fVar.L(12);
                if (i13 == 0) {
                    if (fVar.j(5) > 7) {
                        fVar.i();
                    }
                } else if (fVar.j(5) > 7) {
                    fVar.K();
                }
                if (this.f15983b) {
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
        int j10 = fVar.j(4);
        int j11 = fVar.j(4);
        fVar.L(j10 + 1);
        fVar.L(j11 + 1);
        if (!this.f15982a) {
            this.f15984c = fVar.i();
        } else {
            this.f15984c = false;
        }
        if (this.f15984c) {
            fVar.L(4);
            fVar.L(3);
        }
        fVar.L(3);
        if (this.f15982a) {
            this.f15985e = true;
            this.d = true;
            this.f15986f = 0;
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
                    this.f15985e = true;
                } else {
                    this.f15985e = fVar.i();
                }
            } else {
                this.f15985e = true;
            }
            if (i14) {
                this.f15986f = fVar.j(3) + 1;
            } else {
                this.f15986f = 0;
            }
        }
        fVar.L(3);
        boolean i15 = fVar.i();
        if (this.f15987g == 2 && i15) {
            this.f15988i = fVar.i();
        } else {
            this.f15988i = false;
        }
        if (this.f15987g != 1) {
            this.f15989j = fVar.i();
        } else {
            this.f15989j = false;
        }
        if (fVar.i()) {
            this.f15992m = (byte) fVar.j(8);
            this.f15993n = (byte) fVar.j(8);
            this.f15994o = (byte) fVar.j(8);
        } else {
            this.f15992m = (byte) 0;
            this.f15993n = (byte) 0;
            this.f15994o = (byte) 0;
        }
        if (this.f15989j) {
            fVar.K();
            this.f15990k = false;
            this.f15991l = false;
        } else if (this.f15992m == 1 && this.f15993n == 13 && this.f15994o == 0) {
            this.f15990k = false;
            this.f15991l = false;
        } else {
            fVar.K();
            int i16 = this.f15987g;
            if (i16 == 0) {
                this.f15990k = true;
                this.f15991l = true;
            } else if (i16 == 1) {
                this.f15990k = false;
                this.f15991l = false;
            } else if (this.f15988i) {
                boolean i17 = fVar.i();
                this.f15990k = i17;
                if (i17) {
                    this.f15991l = fVar.i();
                } else {
                    this.f15991l = false;
                }
            } else {
                this.f15990k = true;
                this.f15991l = false;
            }
            if (this.f15990k && this.f15991l) {
                fVar.j(2);
            }
        }
        fVar.K();
    }
}
