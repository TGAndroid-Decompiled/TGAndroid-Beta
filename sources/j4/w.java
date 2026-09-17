package j4;

import com.google.android.gms.internal.vision.e2;
public final class w implements g0 {
    public final i f13501a;
    public final a4.h f13502b = new a4.h(new byte[10], 10);
    public int f13503c = 0;
    public int d;
    public e2.b0 f13504e;
    public boolean f13505f;
    public boolean f13506g;
    public boolean h;
    public int f13507i;
    public int f13508j;
    public boolean f13509k;
    public long f13510l;

    public w(i iVar) {
        this.f13501a = iVar;
    }

    @Override
    public final void a(int i10, e2.v vVar) {
        int i11;
        int i12;
        int i13;
        boolean z10;
        e2.d.h(this.f13504e);
        int i14 = i10 & 1;
        int i15 = -1;
        int i16 = 2;
        i iVar = this.f13501a;
        if (i14 != 0) {
            int i17 = this.f13503c;
            if (i17 != 0 && i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 3) {
                        if (this.f13508j != -1) {
                            e2.a.n("PesReader", "Unexpected start indicator: expected " + this.f13508j + " more bytes");
                        }
                        if (vVar.f8819c == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        iVar.f(z10);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    e2.a.n("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f13503c = 1;
            this.d = 0;
        }
        int i18 = i10;
        while (vVar.a() > 0) {
            int i19 = this.f13503c;
            if (i19 != 0) {
                a4.h hVar = this.f13502b;
                if (i19 != 1) {
                    if (i19 != i16) {
                        if (i19 == 3) {
                            int a2 = vVar.a();
                            int i20 = this.f13508j;
                            if (i20 == i15) {
                                i13 = 0;
                            } else {
                                i13 = a2 - i20;
                            }
                            if (i13 > 0) {
                                a2 -= i13;
                                vVar.I(vVar.f8818b + a2);
                            }
                            iVar.b(vVar);
                            int i21 = this.f13508j;
                            if (i21 != i15) {
                                int i22 = i21 - a2;
                                this.f13508j = i22;
                                if (i22 == 0) {
                                    iVar.f(false);
                                    this.f13503c = 1;
                                    this.d = 0;
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (b(vVar, hVar.f274b, Math.min(10, this.f13507i)) && b(vVar, null, this.f13507i)) {
                            hVar.q(0);
                            this.f13510l = -9223372036854775807L;
                            if (this.f13505f) {
                                hVar.t(4);
                                hVar.t(1);
                                long i23 = hVar.i(15) << 15;
                                hVar.t(1);
                                long i24 = i23 | (hVar.i(3) << 30) | hVar.i(15);
                                hVar.t(1);
                                if (!this.h && this.f13506g) {
                                    hVar.t(4);
                                    hVar.t(1);
                                    hVar.t(1);
                                    hVar.t(1);
                                    this.f13504e.b((hVar.i(3) << 30) | (hVar.i(15) << 15) | hVar.i(15));
                                    this.h = true;
                                }
                                this.f13510l = this.f13504e.b(i24);
                            }
                            if (this.f13509k) {
                                i12 = 4;
                            } else {
                                i12 = 0;
                            }
                            i18 |= i12;
                            iVar.g(i18, this.f13510l);
                            this.f13503c = 3;
                            this.d = 0;
                        }
                    }
                } else if (b(vVar, hVar.f274b, 9)) {
                    if (e()) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    this.f13503c = i11;
                    this.d = 0;
                }
            } else {
                vVar.K(vVar.a());
            }
            i15 = -1;
            i16 = 2;
        }
    }

    public final boolean b(e2.v vVar, byte[] bArr, int i10) {
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

    @Override
    public final void c(e2.b0 b0Var, c3.q qVar, f0 f0Var) {
        this.f13504e = b0Var;
        this.f13501a.e(qVar, f0Var);
    }

    @Override
    public final void d() {
        this.f13503c = 0;
        this.d = 0;
        this.h = false;
        this.f13501a.d();
    }

    public final boolean e() {
        a4.h hVar = this.f13502b;
        hVar.q(0);
        int i10 = hVar.i(24);
        if (i10 != 1) {
            e2.n(i10, "Unexpected start code prefix: ", "PesReader");
            this.f13508j = -1;
            return false;
        }
        hVar.t(8);
        int i11 = hVar.i(16);
        hVar.t(5);
        this.f13509k = hVar.h();
        hVar.t(2);
        this.f13505f = hVar.h();
        this.f13506g = hVar.h();
        hVar.t(6);
        int i12 = hVar.i(8);
        this.f13507i = i12;
        if (i11 == 0) {
            this.f13508j = -1;
        } else {
            int i13 = (i11 - 3) - i12;
            this.f13508j = i13;
            if (i13 < 0) {
                e2.a.n("PesReader", "Found negative packet payload size: " + this.f13508j);
                this.f13508j = -1;
            }
        }
        return true;
    }
}
