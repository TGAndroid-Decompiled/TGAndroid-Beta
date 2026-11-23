package i2;

import a8.ma;
import java.nio.ByteBuffer;
public final class r {
    public final boolean f16068a;
    public final boolean f16069b;
    public final boolean f16070c;
    public final boolean d;
    public final boolean f16071e;
    public final int f16072f;
    public final int f16073g;
    public final boolean h;
    public final boolean f16074i;
    public final boolean f16075j;
    public final boolean f16076k;
    public final boolean f16077l;
    public final byte f16078m;
    public final byte f16079n;
    public final byte f16080o;

    public r(q qVar) {
        boolean z10;
        int i7 = qVar.f16066a;
        ByteBuffer byteBuffer = qVar.f16067b;
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
        this.f16073g = fVar.j(3);
        fVar.K();
        boolean i10 = fVar.i();
        this.f16068a = i10;
        if (i10) {
            fVar.j(5);
            this.f16069b = false;
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
                this.f16069b = i12;
                if (i12) {
                    fVar.L(47);
                }
            } else {
                this.f16069b = false;
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
                if (this.f16069b) {
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
        if (!this.f16068a) {
            this.f16070c = fVar.i();
        } else {
            this.f16070c = false;
        }
        if (this.f16070c) {
            fVar.L(4);
            fVar.L(3);
        }
        fVar.L(3);
        if (this.f16068a) {
            this.f16071e = true;
            this.d = true;
            this.f16072f = 0;
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
                    this.f16071e = true;
                } else {
                    this.f16071e = fVar.i();
                }
            } else {
                this.f16071e = true;
            }
            if (i14) {
                this.f16072f = fVar.j(3) + 1;
            } else {
                this.f16072f = 0;
            }
        }
        fVar.L(3);
        boolean i15 = fVar.i();
        if (this.f16073g == 2 && i15) {
            this.f16074i = fVar.i();
        } else {
            this.f16074i = false;
        }
        if (this.f16073g != 1) {
            this.f16075j = fVar.i();
        } else {
            this.f16075j = false;
        }
        if (fVar.i()) {
            this.f16078m = (byte) fVar.j(8);
            this.f16079n = (byte) fVar.j(8);
            this.f16080o = (byte) fVar.j(8);
        } else {
            this.f16078m = (byte) 0;
            this.f16079n = (byte) 0;
            this.f16080o = (byte) 0;
        }
        if (this.f16075j) {
            fVar.K();
            this.f16076k = false;
            this.f16077l = false;
        } else if (this.f16078m == 1 && this.f16079n == 13 && this.f16080o == 0) {
            this.f16076k = false;
            this.f16077l = false;
        } else {
            fVar.K();
            int i16 = this.f16073g;
            if (i16 == 0) {
                this.f16076k = true;
                this.f16077l = true;
            } else if (i16 == 1) {
                this.f16076k = false;
                this.f16077l = false;
            } else if (this.f16074i) {
                boolean i17 = fVar.i();
                this.f16076k = i17;
                if (i17) {
                    this.f16077l = fVar.i();
                } else {
                    this.f16077l = false;
                }
            } else {
                this.f16076k = true;
                this.f16077l = false;
            }
            if (this.f16076k && this.f16077l) {
                fVar.j(2);
            }
        }
        fVar.K();
    }
}
