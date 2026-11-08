package i2;

import a8.ia;
import java.nio.ByteBuffer;
public final class r {
    public final boolean f15210a;
    public final boolean f15211b;
    public final boolean f15212c;
    public final boolean d;
    public final boolean f15213e;
    public final int f15214f;
    public final int f15215g;
    public final boolean h;
    public final boolean f15216i;
    public final boolean f15217j;
    public final boolean f15218k;
    public final boolean f15219l;
    public final byte f15220m;
    public final byte f15221n;
    public final byte f15222o;

    public r(q qVar) {
        boolean z9;
        int i7 = qVar.f15208a;
        ByteBuffer byteBuffer = qVar.f15209b;
        if (i7 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        d4.f fVar = new d4.f(bArr, remaining);
        this.f15215g = fVar.j(3);
        fVar.K();
        boolean i10 = fVar.i();
        this.f15210a = i10;
        if (i10) {
            fVar.j(5);
            this.f15211b = false;
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
                this.f15211b = i12;
                if (i12) {
                    fVar.L(47);
                }
            } else {
                this.f15211b = false;
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
                if (this.f15211b) {
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
        if (!this.f15210a) {
            this.f15212c = fVar.i();
        } else {
            this.f15212c = false;
        }
        if (this.f15212c) {
            fVar.L(4);
            fVar.L(3);
        }
        fVar.L(3);
        if (this.f15210a) {
            this.f15213e = true;
            this.d = true;
            this.f15214f = 0;
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
                    this.f15213e = true;
                } else {
                    this.f15213e = fVar.i();
                }
            } else {
                this.f15213e = true;
            }
            if (i14) {
                this.f15214f = fVar.j(3) + 1;
            } else {
                this.f15214f = 0;
            }
        }
        fVar.L(3);
        boolean i15 = fVar.i();
        if (this.f15215g == 2 && i15) {
            this.f15216i = fVar.i();
        } else {
            this.f15216i = false;
        }
        if (this.f15215g != 1) {
            this.f15217j = fVar.i();
        } else {
            this.f15217j = false;
        }
        if (fVar.i()) {
            this.f15220m = (byte) fVar.j(8);
            this.f15221n = (byte) fVar.j(8);
            this.f15222o = (byte) fVar.j(8);
        } else {
            this.f15220m = (byte) 0;
            this.f15221n = (byte) 0;
            this.f15222o = (byte) 0;
        }
        if (this.f15217j) {
            fVar.K();
            this.f15218k = false;
            this.f15219l = false;
        } else if (this.f15220m == 1 && this.f15221n == 13 && this.f15222o == 0) {
            this.f15218k = false;
            this.f15219l = false;
        } else {
            fVar.K();
            int i16 = this.f15215g;
            if (i16 == 0) {
                this.f15218k = true;
                this.f15219l = true;
            } else if (i16 == 1) {
                this.f15218k = false;
                this.f15219l = false;
            } else if (this.f15216i) {
                boolean i17 = fVar.i();
                this.f15218k = i17;
                if (i17) {
                    this.f15219l = fVar.i();
                } else {
                    this.f15219l = false;
                }
            } else {
                this.f15218k = true;
                this.f15219l = false;
            }
            if (this.f15218k && this.f15219l) {
                fVar.j(2);
            }
        }
        fVar.K();
    }
}
