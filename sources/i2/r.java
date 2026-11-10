package i2;

import a8.ia;
import java.nio.ByteBuffer;
public final class r {
    public final boolean f15212a;
    public final boolean f15213b;
    public final boolean f15214c;
    public final boolean d;
    public final boolean f15215e;
    public final int f15216f;
    public final int f15217g;
    public final boolean h;
    public final boolean f15218i;
    public final boolean f15219j;
    public final boolean f15220k;
    public final boolean f15221l;
    public final byte f15222m;
    public final byte f15223n;
    public final byte f15224o;

    public r(q qVar) {
        boolean z9;
        int i7 = qVar.f15210a;
        ByteBuffer byteBuffer = qVar.f15211b;
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
        this.f15217g = fVar.j(3);
        fVar.K();
        boolean i10 = fVar.i();
        this.f15212a = i10;
        if (i10) {
            fVar.j(5);
            this.f15213b = false;
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
                this.f15213b = i12;
                if (i12) {
                    fVar.L(47);
                }
            } else {
                this.f15213b = false;
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
                if (this.f15213b) {
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
        if (!this.f15212a) {
            this.f15214c = fVar.i();
        } else {
            this.f15214c = false;
        }
        if (this.f15214c) {
            fVar.L(4);
            fVar.L(3);
        }
        fVar.L(3);
        if (this.f15212a) {
            this.f15215e = true;
            this.d = true;
            this.f15216f = 0;
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
                    this.f15215e = true;
                } else {
                    this.f15215e = fVar.i();
                }
            } else {
                this.f15215e = true;
            }
            if (i14) {
                this.f15216f = fVar.j(3) + 1;
            } else {
                this.f15216f = 0;
            }
        }
        fVar.L(3);
        boolean i15 = fVar.i();
        if (this.f15217g == 2 && i15) {
            this.f15218i = fVar.i();
        } else {
            this.f15218i = false;
        }
        if (this.f15217g != 1) {
            this.f15219j = fVar.i();
        } else {
            this.f15219j = false;
        }
        if (fVar.i()) {
            this.f15222m = (byte) fVar.j(8);
            this.f15223n = (byte) fVar.j(8);
            this.f15224o = (byte) fVar.j(8);
        } else {
            this.f15222m = (byte) 0;
            this.f15223n = (byte) 0;
            this.f15224o = (byte) 0;
        }
        if (this.f15219j) {
            fVar.K();
            this.f15220k = false;
            this.f15221l = false;
        } else if (this.f15222m == 1 && this.f15223n == 13 && this.f15224o == 0) {
            this.f15220k = false;
            this.f15221l = false;
        } else {
            fVar.K();
            int i16 = this.f15217g;
            if (i16 == 0) {
                this.f15220k = true;
                this.f15221l = true;
            } else if (i16 == 1) {
                this.f15220k = false;
                this.f15221l = false;
            } else if (this.f15218i) {
                boolean i17 = fVar.i();
                this.f15220k = i17;
                if (i17) {
                    this.f15221l = fVar.i();
                } else {
                    this.f15221l = false;
                }
            } else {
                this.f15220k = true;
                this.f15221l = false;
            }
            if (this.f15220k && this.f15221l) {
                fVar.j(2);
            }
        }
        fVar.K();
    }
}
