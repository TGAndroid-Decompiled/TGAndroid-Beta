package i2;

import a8.ia;
import java.nio.ByteBuffer;
public final class r {
    public final boolean f15207a;
    public final boolean f15208b;
    public final boolean f15209c;
    public final boolean d;
    public final boolean f15210e;
    public final int f15211f;
    public final int f15212g;
    public final boolean h;
    public final boolean f15213i;
    public final boolean f15214j;
    public final boolean f15215k;
    public final boolean f15216l;
    public final byte f15217m;
    public final byte f15218n;
    public final byte f15219o;

    public r(q qVar) {
        boolean z9;
        int i7 = qVar.f15205a;
        ByteBuffer byteBuffer = qVar.f15206b;
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
        this.f15212g = fVar.j(3);
        fVar.K();
        boolean i10 = fVar.i();
        this.f15207a = i10;
        if (i10) {
            fVar.j(5);
            this.f15208b = false;
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
                this.f15208b = i12;
                if (i12) {
                    fVar.L(47);
                }
            } else {
                this.f15208b = false;
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
                if (this.f15208b) {
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
        if (!this.f15207a) {
            this.f15209c = fVar.i();
        } else {
            this.f15209c = false;
        }
        if (this.f15209c) {
            fVar.L(4);
            fVar.L(3);
        }
        fVar.L(3);
        if (this.f15207a) {
            this.f15210e = true;
            this.d = true;
            this.f15211f = 0;
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
                    this.f15210e = true;
                } else {
                    this.f15210e = fVar.i();
                }
            } else {
                this.f15210e = true;
            }
            if (i14) {
                this.f15211f = fVar.j(3) + 1;
            } else {
                this.f15211f = 0;
            }
        }
        fVar.L(3);
        boolean i15 = fVar.i();
        if (this.f15212g == 2 && i15) {
            this.f15213i = fVar.i();
        } else {
            this.f15213i = false;
        }
        if (this.f15212g != 1) {
            this.f15214j = fVar.i();
        } else {
            this.f15214j = false;
        }
        if (fVar.i()) {
            this.f15217m = (byte) fVar.j(8);
            this.f15218n = (byte) fVar.j(8);
            this.f15219o = (byte) fVar.j(8);
        } else {
            this.f15217m = (byte) 0;
            this.f15218n = (byte) 0;
            this.f15219o = (byte) 0;
        }
        if (this.f15214j) {
            fVar.K();
            this.f15215k = false;
            this.f15216l = false;
        } else if (this.f15217m == 1 && this.f15218n == 13 && this.f15219o == 0) {
            this.f15215k = false;
            this.f15216l = false;
        } else {
            fVar.K();
            int i16 = this.f15212g;
            if (i16 == 0) {
                this.f15215k = true;
                this.f15216l = true;
            } else if (i16 == 1) {
                this.f15215k = false;
                this.f15216l = false;
            } else if (this.f15213i) {
                boolean i17 = fVar.i();
                this.f15215k = i17;
                if (i17) {
                    this.f15216l = fVar.i();
                } else {
                    this.f15216l = false;
                }
            } else {
                this.f15215k = true;
                this.f15216l = false;
            }
            if (this.f15215k && this.f15216l) {
                fVar.j(2);
            }
        }
        fVar.K();
    }
}
