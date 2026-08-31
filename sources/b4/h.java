package b4;

import j3.m0;
import j3.n0;
import java.util.Collections;
import java.util.List;
public final class h implements i {
    public final int f1505a;
    public boolean f1506b;
    public long f1507c;
    public int d;
    public int f1508e;
    public final Object f1509f;
    public Object f1510g;

    public h(List list) {
        this.f1505a = 0;
        this.f1509f = list;
        this.f1510g = new r3.v[list.size()];
        this.f1507c = -9223372036854775807L;
    }

    @Override
    public final void a(h5.w wVar) {
        r3.v[] vVarArr;
        boolean z4;
        boolean z10;
        switch (this.f1505a) {
            case 0:
                if (this.f1506b) {
                    if (this.d == 2) {
                        if (wVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (wVar.u() != 32) {
                                this.f1506b = false;
                            }
                            this.d--;
                            z10 = this.f1506b;
                        }
                        if (!z10) {
                            return;
                        }
                    }
                    if (this.d == 1) {
                        if (wVar.a() == 0) {
                            z4 = false;
                        } else {
                            if (wVar.u() != 0) {
                                this.f1506b = false;
                            }
                            this.d--;
                            z4 = this.f1506b;
                        }
                        if (!z4) {
                            return;
                        }
                    }
                    int i10 = wVar.f7309b;
                    int a2 = wVar.a();
                    for (r3.v vVar : (r3.v[]) this.f1510g) {
                        wVar.F(i10);
                        vVar.d(a2, wVar);
                    }
                    this.f1508e += a2;
                    return;
                }
                return;
            default:
                h5.w wVar2 = (h5.w) this.f1509f;
                h5.a.j((r3.v) this.f1510g);
                if (this.f1506b) {
                    int a10 = wVar.a();
                    int i11 = this.f1508e;
                    if (i11 < 10) {
                        int min = Math.min(a10, 10 - i11);
                        System.arraycopy(wVar.f7308a, wVar.f7309b, wVar2.f7308a, this.f1508e, min);
                        if (this.f1508e + min == 10) {
                            wVar2.F(0);
                            if (73 == wVar2.u() && 68 == wVar2.u() && 51 == wVar2.u()) {
                                wVar2.G(3);
                                this.d = wVar2.t() + 10;
                            } else {
                                h5.a.K("Id3Reader", "Discarding invalid ID3 tag");
                                this.f1506b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a10, this.d - this.f1508e);
                    ((r3.v) this.f1510g).d(min2, wVar);
                    this.f1508e += min2;
                    return;
                }
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f1505a) {
            case 0:
                this.f1506b = false;
                this.f1507c = -9223372036854775807L;
                return;
            default:
                this.f1506b = false;
                this.f1507c = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void c(r3.m mVar, h0 h0Var) {
        switch (this.f1505a) {
            case 0:
                r3.v[] vVarArr = (r3.v[]) this.f1510g;
                for (int i10 = 0; i10 < vVarArr.length; i10++) {
                    g0 g0Var = (g0) ((List) this.f1509f).get(i10);
                    h0Var.a();
                    h0Var.b();
                    r3.v i22 = mVar.i2(h0Var.d, 3);
                    m0 m0Var = new m0();
                    h0Var.b();
                    m0Var.f9253a = h0Var.f1514e;
                    m0Var.f9265o = "application/dvbsubs";
                    m0Var.f9267q = Collections.singletonList(g0Var.f1504b);
                    m0Var.f9255c = g0Var.f1503a;
                    i22.b(new n0(m0Var));
                    vVarArr[i10] = i22;
                }
                return;
            default:
                h0Var.a();
                h0Var.b();
                r3.v i23 = mVar.i2(h0Var.d, 5);
                this.f1510g = i23;
                m0 m0Var2 = new m0();
                h0Var.b();
                m0Var2.f9253a = h0Var.f1514e;
                m0Var2.f9265o = "application/id3";
                i23.b(new n0(m0Var2));
                return;
        }
    }

    @Override
    public final void d() {
        int i10;
        switch (this.f1505a) {
            case 0:
                if (this.f1506b) {
                    if (this.f1507c != -9223372036854775807L) {
                        for (r3.v vVar : (r3.v[]) this.f1510g) {
                            vVar.c(this.f1507c, 1, this.f1508e, 0, null);
                        }
                    }
                    this.f1506b = false;
                    return;
                }
                return;
            default:
                h5.a.j((r3.v) this.f1510g);
                if (this.f1506b && (i10 = this.d) != 0 && this.f1508e == i10) {
                    long j10 = this.f1507c;
                    if (j10 != -9223372036854775807L) {
                        ((r3.v) this.f1510g).c(j10, 1, i10, 0, null);
                    }
                    this.f1506b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void e(int i10, long j10) {
        switch (this.f1505a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f1506b = true;
                    if (j10 != -9223372036854775807L) {
                        this.f1507c = j10;
                    }
                    this.f1508e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i10 & 4) != 0) {
                    this.f1506b = true;
                    if (j10 != -9223372036854775807L) {
                        this.f1507c = j10;
                    }
                    this.d = 0;
                    this.f1508e = 0;
                    return;
                }
                return;
        }
    }

    public h() {
        this.f1505a = 1;
        this.f1509f = new h5.w(10);
        this.f1507c = -9223372036854775807L;
    }
}
