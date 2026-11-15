package i2;

import a8.ja;
import java.nio.ByteBuffer;
public final class r {
    public final boolean f15664a;
    public final boolean f15665b;
    public final boolean f15666c;
    public final boolean d;
    public final boolean f15667e;
    public final int f15668f;
    public final int f15669g;
    public final boolean h;
    public final boolean f15670i;
    public final boolean f15671j;
    public final boolean f15672k;
    public final boolean f15673l;
    public final byte f15674m;
    public final byte f15675n;
    public final byte f15676o;

    public r(q qVar) {
        boolean z10;
        int i7 = qVar.f15662a;
        ByteBuffer byteBuffer = qVar.f15663b;
        if (i7 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        d4.f fVar = new d4.f(bArr, remaining);
        this.f15669g = fVar.j(3);
        fVar.K();
        boolean i10 = fVar.i();
        this.f15664a = i10;
        if (i10) {
            fVar.j(5);
            this.f15665b = false;
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
                this.f15665b = i12;
                if (i12) {
                    fVar.L(47);
                }
            } else {
                this.f15665b = false;
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
                if (this.f15665b) {
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
        if (!this.f15664a) {
            this.f15666c = fVar.i();
        } else {
            this.f15666c = false;
        }
        if (this.f15666c) {
            fVar.L(4);
            fVar.L(3);
        }
        fVar.L(3);
        if (this.f15664a) {
            this.f15667e = true;
            this.d = true;
            this.f15668f = 0;
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
                    this.f15667e = true;
                } else {
                    this.f15667e = fVar.i();
                }
            } else {
                this.f15667e = true;
            }
            if (i14) {
                this.f15668f = fVar.j(3) + 1;
            } else {
                this.f15668f = 0;
            }
        }
        fVar.L(3);
        boolean i15 = fVar.i();
        if (this.f15669g == 2 && i15) {
            this.f15670i = fVar.i();
        } else {
            this.f15670i = false;
        }
        if (this.f15669g != 1) {
            this.f15671j = fVar.i();
        } else {
            this.f15671j = false;
        }
        if (fVar.i()) {
            this.f15674m = (byte) fVar.j(8);
            this.f15675n = (byte) fVar.j(8);
            this.f15676o = (byte) fVar.j(8);
        } else {
            this.f15674m = (byte) 0;
            this.f15675n = (byte) 0;
            this.f15676o = (byte) 0;
        }
        if (this.f15671j) {
            fVar.K();
            this.f15672k = false;
            this.f15673l = false;
        } else if (this.f15674m == 1 && this.f15675n == 13 && this.f15676o == 0) {
            this.f15672k = false;
            this.f15673l = false;
        } else {
            fVar.K();
            int i16 = this.f15669g;
            if (i16 == 0) {
                this.f15672k = true;
                this.f15673l = true;
            } else if (i16 == 1) {
                this.f15672k = false;
                this.f15673l = false;
            } else if (this.f15670i) {
                boolean i17 = fVar.i();
                this.f15672k = i17;
                if (i17) {
                    this.f15673l = fVar.i();
                } else {
                    this.f15673l = false;
                }
            } else {
                this.f15672k = true;
                this.f15673l = false;
            }
            if (this.f15672k && this.f15673l) {
                fVar.j(2);
            }
        }
        fVar.K();
    }
}
