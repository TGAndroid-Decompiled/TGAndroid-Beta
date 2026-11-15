package m4;

import com.google.android.gms.internal.vision.e2;
import h2.k0;
public final class w implements g0 {
    public final i f20433a;
    public final d4.f f20434b = new d4.f(new byte[10], 10);
    public int f20435c = 0;
    public int d;
    public k0 f20436e;
    public boolean f20437f;
    public boolean f20438g;
    public boolean h;
    public int f20439i;
    public int f20440j;
    public boolean f20441k;
    public long f20442l;

    public w(i iVar) {
        this.f20433a = iVar;
    }

    @Override
    public final void a(int i7, h2.x xVar) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        this.f20436e.getClass();
        int i13 = i7 & 1;
        int i14 = -1;
        int i15 = 2;
        i iVar = this.f20433a;
        if (i13 != 0) {
            int i16 = this.f20435c;
            if (i16 != 0 && i16 != 1) {
                if (i16 != 2) {
                    if (i16 == 3) {
                        if (this.f20440j != -1) {
                            h2.a.l("PesReader", "Unexpected start indicator: expected " + this.f20440j + " more bytes");
                        }
                        if (xVar.f13523c == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        iVar.e(z10);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    h2.a.l("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f20435c = 1;
            this.d = 0;
        }
        int i17 = i7;
        while (xVar.a() > 0) {
            int i18 = this.f20435c;
            if (i18 != 0) {
                d4.f fVar = this.f20434b;
                if (i18 != 1) {
                    if (i18 != i15) {
                        if (i18 == 3) {
                            int a10 = xVar.a();
                            int i19 = this.f20440j;
                            if (i19 == i14) {
                                i12 = 0;
                            } else {
                                i12 = a10 - i19;
                            }
                            if (i12 > 0) {
                                a10 -= i12;
                                xVar.M(xVar.f13522b + a10);
                            }
                            iVar.c(xVar);
                            int i20 = this.f20440j;
                            if (i20 != i14) {
                                int i21 = i20 - a10;
                                this.f20440j = i21;
                                if (i21 == 0) {
                                    iVar.e(false);
                                    this.f20435c = 1;
                                    this.d = 0;
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (c(xVar, (byte[]) fVar.f7550b, Math.min(10, this.f20439i)) && c(xVar, null, this.f20439i)) {
                            fVar.J(0);
                            this.f20442l = -9223372036854775807L;
                            if (this.f20437f) {
                                fVar.L(4);
                                fVar.L(1);
                                long j3 = fVar.j(15) << 15;
                                fVar.L(1);
                                long j10 = j3 | (fVar.j(3) << 30) | fVar.j(15);
                                fVar.L(1);
                                if (!this.h && this.f20438g) {
                                    fVar.L(4);
                                    fVar.L(1);
                                    fVar.L(1);
                                    fVar.L(1);
                                    this.f20436e.b((fVar.j(3) << 30) | (fVar.j(15) << 15) | fVar.j(15));
                                    this.h = true;
                                }
                                this.f20442l = this.f20436e.b(j10);
                            }
                            if (this.f20441k) {
                                i11 = 4;
                            } else {
                                i11 = 0;
                            }
                            i17 |= i11;
                            iVar.f(i17, this.f20442l);
                            this.f20435c = 3;
                            this.d = 0;
                        }
                    }
                } else if (c(xVar, (byte[]) fVar.f7550b, 9)) {
                    if (e()) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    this.f20435c = i10;
                    this.d = 0;
                }
            } else {
                xVar.O(xVar.a());
            }
            i14 = -1;
            i15 = 2;
        }
    }

    @Override
    public final void b(k0 k0Var, f3.q qVar, f0 f0Var) {
        this.f20436e = k0Var;
        this.f20433a.g(qVar, f0Var);
    }

    public final boolean c(h2.x xVar, byte[] bArr, int i7) {
        int min = Math.min(xVar.a(), i7 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            xVar.O(min);
        } else {
            xVar.k(this.d, min, bArr);
        }
        int i10 = this.d + min;
        this.d = i10;
        if (i10 == i7) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f20435c = 0;
        this.d = 0;
        this.h = false;
        this.f20433a.d();
    }

    public final boolean e() {
        d4.f fVar = this.f20434b;
        fVar.J(0);
        int j3 = fVar.j(24);
        if (j3 != 1) {
            e2.o(j3, "Unexpected start code prefix: ", "PesReader");
            this.f20440j = -1;
            return false;
        }
        fVar.L(8);
        int j10 = fVar.j(16);
        fVar.L(5);
        this.f20441k = fVar.i();
        fVar.L(2);
        this.f20437f = fVar.i();
        this.f20438g = fVar.i();
        fVar.L(6);
        int j11 = fVar.j(8);
        this.f20439i = j11;
        if (j10 == 0) {
            this.f20440j = -1;
        } else {
            int i7 = (j10 - 3) - j11;
            this.f20440j = i7;
            if (i7 < 0) {
                h2.a.l("PesReader", "Found negative packet payload size: " + this.f20440j);
                this.f20440j = -1;
            }
        }
        return true;
    }
}
