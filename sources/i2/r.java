package i2;

import a8.la;
import java.nio.ByteBuffer;
public final class r {
    public final boolean f15979a;
    public final boolean f15980b;
    public final boolean f15981c;
    public final boolean d;
    public final boolean f15982e;
    public final int f15983f;
    public final int f15984g;
    public final boolean h;
    public final boolean f15985i;
    public final boolean f15986j;
    public final boolean f15987k;
    public final boolean f15988l;
    public final byte f15989m;
    public final byte f15990n;
    public final byte f15991o;

    public r(q qVar) {
        boolean z10;
        int i7 = qVar.f15977a;
        ByteBuffer byteBuffer = qVar.f15978b;
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
        this.f15984g = fVar.j(3);
        fVar.K();
        boolean i10 = fVar.i();
        this.f15979a = i10;
        if (i10) {
            fVar.j(5);
            this.f15980b = false;
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
                this.f15980b = i12;
                if (i12) {
                    fVar.L(47);
                }
            } else {
                this.f15980b = false;
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
                if (this.f15980b) {
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
        if (!this.f15979a) {
            this.f15981c = fVar.i();
        } else {
            this.f15981c = false;
        }
        if (this.f15981c) {
            fVar.L(4);
            fVar.L(3);
        }
        fVar.L(3);
        if (this.f15979a) {
            this.f15982e = true;
            this.d = true;
            this.f15983f = 0;
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
                    this.f15982e = true;
                } else {
                    this.f15982e = fVar.i();
                }
            } else {
                this.f15982e = true;
            }
            if (i14) {
                this.f15983f = fVar.j(3) + 1;
            } else {
                this.f15983f = 0;
            }
        }
        fVar.L(3);
        boolean i15 = fVar.i();
        if (this.f15984g == 2 && i15) {
            this.f15985i = fVar.i();
        } else {
            this.f15985i = false;
        }
        if (this.f15984g != 1) {
            this.f15986j = fVar.i();
        } else {
            this.f15986j = false;
        }
        if (fVar.i()) {
            this.f15989m = (byte) fVar.j(8);
            this.f15990n = (byte) fVar.j(8);
            this.f15991o = (byte) fVar.j(8);
        } else {
            this.f15989m = (byte) 0;
            this.f15990n = (byte) 0;
            this.f15991o = (byte) 0;
        }
        if (this.f15986j) {
            fVar.K();
            this.f15987k = false;
            this.f15988l = false;
        } else if (this.f15989m == 1 && this.f15990n == 13 && this.f15991o == 0) {
            this.f15987k = false;
            this.f15988l = false;
        } else {
            fVar.K();
            int i16 = this.f15984g;
            if (i16 == 0) {
                this.f15987k = true;
                this.f15988l = true;
            } else if (i16 == 1) {
                this.f15987k = false;
                this.f15988l = false;
            } else if (this.f15985i) {
                boolean i17 = fVar.i();
                this.f15987k = i17;
                if (i17) {
                    this.f15988l = fVar.i();
                } else {
                    this.f15988l = false;
                }
            } else {
                this.f15987k = true;
                this.f15988l = false;
            }
            if (this.f15987k && this.f15988l) {
                fVar.j(2);
            }
        }
        fVar.K();
    }
}
