package i2;

import a8.ma;
import java.nio.ByteBuffer;
public final class r {
    public final boolean f15973a;
    public final boolean f15974b;
    public final boolean f15975c;
    public final boolean d;
    public final boolean f15976e;
    public final int f15977f;
    public final int f15978g;
    public final boolean h;
    public final boolean f15979i;
    public final boolean f15980j;
    public final boolean f15981k;
    public final boolean f15982l;
    public final byte f15983m;
    public final byte f15984n;
    public final byte f15985o;

    public r(q qVar) {
        boolean z10;
        int i7 = qVar.f15971a;
        ByteBuffer byteBuffer = qVar.f15972b;
        if (i7 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        d4.f fVar = new d4.f(bArr, remaining);
        this.f15978g = fVar.j(3);
        fVar.K();
        boolean i10 = fVar.i();
        this.f15973a = i10;
        if (i10) {
            fVar.j(5);
            this.f15974b = false;
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
                this.f15974b = i12;
                if (i12) {
                    fVar.L(47);
                }
            } else {
                this.f15974b = false;
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
                if (this.f15974b) {
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
        if (!this.f15973a) {
            this.f15975c = fVar.i();
        } else {
            this.f15975c = false;
        }
        if (this.f15975c) {
            fVar.L(4);
            fVar.L(3);
        }
        fVar.L(3);
        if (this.f15973a) {
            this.f15976e = true;
            this.d = true;
            this.f15977f = 0;
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
                    this.f15976e = true;
                } else {
                    this.f15976e = fVar.i();
                }
            } else {
                this.f15976e = true;
            }
            if (i14) {
                this.f15977f = fVar.j(3) + 1;
            } else {
                this.f15977f = 0;
            }
        }
        fVar.L(3);
        boolean i15 = fVar.i();
        if (this.f15978g == 2 && i15) {
            this.f15979i = fVar.i();
        } else {
            this.f15979i = false;
        }
        if (this.f15978g != 1) {
            this.f15980j = fVar.i();
        } else {
            this.f15980j = false;
        }
        if (fVar.i()) {
            this.f15983m = (byte) fVar.j(8);
            this.f15984n = (byte) fVar.j(8);
            this.f15985o = (byte) fVar.j(8);
        } else {
            this.f15983m = (byte) 0;
            this.f15984n = (byte) 0;
            this.f15985o = (byte) 0;
        }
        if (this.f15980j) {
            fVar.K();
            this.f15981k = false;
            this.f15982l = false;
        } else if (this.f15983m == 1 && this.f15984n == 13 && this.f15985o == 0) {
            this.f15981k = false;
            this.f15982l = false;
        } else {
            fVar.K();
            int i16 = this.f15978g;
            if (i16 == 0) {
                this.f15981k = true;
                this.f15982l = true;
            } else if (i16 == 1) {
                this.f15981k = false;
                this.f15982l = false;
            } else if (this.f15979i) {
                boolean i17 = fVar.i();
                this.f15981k = i17;
                if (i17) {
                    this.f15982l = fVar.i();
                } else {
                    this.f15982l = false;
                }
            } else {
                this.f15981k = true;
                this.f15982l = false;
            }
            if (this.f15981k && this.f15982l) {
                fVar.j(2);
            }
        }
        fVar.K();
    }
}
