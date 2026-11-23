package i2;

import a8.la;
import java.nio.ByteBuffer;
public final class r {
    public final boolean f16007a;
    public final boolean f16008b;
    public final boolean f16009c;
    public final boolean d;
    public final boolean f16010e;
    public final int f16011f;
    public final int f16012g;
    public final boolean h;
    public final boolean f16013i;
    public final boolean f16014j;
    public final boolean f16015k;
    public final boolean f16016l;
    public final byte f16017m;
    public final byte f16018n;
    public final byte f16019o;

    public r(q qVar) {
        boolean z10;
        int i7 = qVar.f16005a;
        ByteBuffer byteBuffer = qVar.f16006b;
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
        this.f16012g = fVar.j(3);
        fVar.K();
        boolean i10 = fVar.i();
        this.f16007a = i10;
        if (i10) {
            fVar.j(5);
            this.f16008b = false;
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
                this.f16008b = i12;
                if (i12) {
                    fVar.L(47);
                }
            } else {
                this.f16008b = false;
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
                if (this.f16008b) {
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
        if (!this.f16007a) {
            this.f16009c = fVar.i();
        } else {
            this.f16009c = false;
        }
        if (this.f16009c) {
            fVar.L(4);
            fVar.L(3);
        }
        fVar.L(3);
        if (this.f16007a) {
            this.f16010e = true;
            this.d = true;
            this.f16011f = 0;
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
                    this.f16010e = true;
                } else {
                    this.f16010e = fVar.i();
                }
            } else {
                this.f16010e = true;
            }
            if (i14) {
                this.f16011f = fVar.j(3) + 1;
            } else {
                this.f16011f = 0;
            }
        }
        fVar.L(3);
        boolean i15 = fVar.i();
        if (this.f16012g == 2 && i15) {
            this.f16013i = fVar.i();
        } else {
            this.f16013i = false;
        }
        if (this.f16012g != 1) {
            this.f16014j = fVar.i();
        } else {
            this.f16014j = false;
        }
        if (fVar.i()) {
            this.f16017m = (byte) fVar.j(8);
            this.f16018n = (byte) fVar.j(8);
            this.f16019o = (byte) fVar.j(8);
        } else {
            this.f16017m = (byte) 0;
            this.f16018n = (byte) 0;
            this.f16019o = (byte) 0;
        }
        if (this.f16014j) {
            fVar.K();
            this.f16015k = false;
            this.f16016l = false;
        } else if (this.f16017m == 1 && this.f16018n == 13 && this.f16019o == 0) {
            this.f16015k = false;
            this.f16016l = false;
        } else {
            fVar.K();
            int i16 = this.f16012g;
            if (i16 == 0) {
                this.f16015k = true;
                this.f16016l = true;
            } else if (i16 == 1) {
                this.f16015k = false;
                this.f16016l = false;
            } else if (this.f16013i) {
                boolean i17 = fVar.i();
                this.f16015k = i17;
                if (i17) {
                    this.f16016l = fVar.i();
                } else {
                    this.f16016l = false;
                }
            } else {
                this.f16015k = true;
                this.f16016l = false;
            }
            if (this.f16015k && this.f16016l) {
                fVar.j(2);
            }
        }
        fVar.K();
    }
}
