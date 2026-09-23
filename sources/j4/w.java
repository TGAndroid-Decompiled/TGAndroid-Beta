package j4;

import com.google.android.gms.internal.vision.e2;
public final class w implements g0 {
    public final i f12838a;
    public final a4.h f12839b = new a4.h(new byte[10], 10);
    public int f12840c = 0;
    public int d;
    public e2.b0 e;
    public boolean f12841f;
    public boolean f12842g;
    public boolean h;
    public int f12843i;
    public int f12844j;
    public boolean f12845k;
    public long f12846l;

    public w(i iVar) {
        this.f12838a = iVar;
    }

    @Override
    public final void a(int i10, e2.v vVar) {
        int i11;
        int i12;
        int i13;
        boolean z10;
        e2.d.h(this.e);
        int i14 = i10 & 1;
        int i15 = -1;
        int i16 = 2;
        i iVar = this.f12838a;
        if (i14 != 0) {
            int i17 = this.f12840c;
            if (i17 != 0 && i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 3) {
                        if (this.f12844j != -1) {
                            e2.a.n("PesReader", "Unexpected start indicator: expected " + this.f12844j + " more bytes");
                        }
                        if (vVar.f7919c == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        iVar.e(z10);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    e2.a.n("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f12840c = 1;
            this.d = 0;
        }
        int i18 = i10;
        while (vVar.a() > 0) {
            int i19 = this.f12840c;
            if (i19 != 0) {
                a4.h hVar = this.f12839b;
                if (i19 != 1) {
                    if (i19 != i16) {
                        if (i19 == 3) {
                            int a2 = vVar.a();
                            int i20 = this.f12844j;
                            if (i20 == i15) {
                                i13 = 0;
                            } else {
                                i13 = a2 - i20;
                            }
                            if (i13 > 0) {
                                a2 -= i13;
                                vVar.I(vVar.f7918b + a2);
                            }
                            iVar.a(vVar);
                            int i21 = this.f12844j;
                            if (i21 != i15) {
                                int i22 = i21 - a2;
                                this.f12844j = i22;
                                if (i22 == 0) {
                                    iVar.e(false);
                                    this.f12840c = 1;
                                    this.d = 0;
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (d(vVar, hVar.f256b, Math.min(10, this.f12843i)) && d(vVar, null, this.f12843i)) {
                            hVar.q(0);
                            this.f12846l = -9223372036854775807L;
                            if (this.f12841f) {
                                hVar.t(4);
                                hVar.t(1);
                                long i23 = hVar.i(15) << 15;
                                hVar.t(1);
                                long i24 = i23 | (hVar.i(3) << 30) | hVar.i(15);
                                hVar.t(1);
                                if (!this.h && this.f12842g) {
                                    hVar.t(4);
                                    hVar.t(1);
                                    hVar.t(1);
                                    hVar.t(1);
                                    this.e.b((hVar.i(3) << 30) | (hVar.i(15) << 15) | hVar.i(15));
                                    this.h = true;
                                }
                                this.f12846l = this.e.b(i24);
                            }
                            if (this.f12845k) {
                                i12 = 4;
                            } else {
                                i12 = 0;
                            }
                            i18 |= i12;
                            iVar.f(i18, this.f12846l);
                            this.f12840c = 3;
                            this.d = 0;
                        }
                    }
                } else if (d(vVar, hVar.f256b, 9)) {
                    if (e()) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    this.f12840c = i11;
                    this.d = 0;
                }
            } else {
                vVar.K(vVar.a());
            }
            i15 = -1;
            i16 = 2;
        }
    }

    @Override
    public final void b(e2.b0 b0Var, c3.q qVar, f0 f0Var) {
        this.e = b0Var;
        this.f12838a.d(qVar, f0Var);
    }

    @Override
    public final void c() {
        this.f12840c = 0;
        this.d = 0;
        this.h = false;
        this.f12838a.c();
    }

    public final boolean d(e2.v vVar, byte[] bArr, int i10) {
        int min = Math.min(vVar.a(), i10 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            vVar.K(min);
        } else {
            vVar.h(this.d, min, bArr);
        }
        int i11 = this.d + min;
        this.d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        a4.h hVar = this.f12839b;
        hVar.q(0);
        int i10 = hVar.i(24);
        if (i10 != 1) {
            e2.m(i10, "Unexpected start code prefix: ", "PesReader");
            this.f12844j = -1;
            return false;
        }
        hVar.t(8);
        int i11 = hVar.i(16);
        hVar.t(5);
        this.f12845k = hVar.h();
        hVar.t(2);
        this.f12841f = hVar.h();
        this.f12842g = hVar.h();
        hVar.t(6);
        int i12 = hVar.i(8);
        this.f12843i = i12;
        if (i11 == 0) {
            this.f12844j = -1;
        } else {
            int i13 = (i11 - 3) - i12;
            this.f12844j = i13;
            if (i13 < 0) {
                e2.a.n("PesReader", "Found negative packet payload size: " + this.f12844j);
                this.f12844j = -1;
            }
        }
        return true;
    }
}
