package b4;

import j3.m0;
import j3.n0;
import java.util.Collections;
import java.util.List;
public final class h implements i {
    public final int f1407a;
    public boolean f1408b;
    public long f1409c;
    public int d;
    public int e;
    public final Object f1410f;
    public Object f1411g;

    public h(List list) {
        this.f1407a = 0;
        this.f1410f = list;
        this.f1411g = new r3.v[list.size()];
        this.f1409c = -9223372036854775807L;
    }

    @Override
    public final void a(h5.w wVar) {
        r3.v[] vVarArr;
        boolean z4;
        boolean z10;
        switch (this.f1407a) {
            case 0:
                if (this.f1408b) {
                    if (this.d == 2) {
                        if (wVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (wVar.u() != 32) {
                                this.f1408b = false;
                            }
                            this.d--;
                            z10 = this.f1408b;
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
                                this.f1408b = false;
                            }
                            this.d--;
                            z4 = this.f1408b;
                        }
                        if (!z4) {
                            return;
                        }
                    }
                    int i10 = wVar.f6988b;
                    int a2 = wVar.a();
                    for (r3.v vVar : (r3.v[]) this.f1411g) {
                        wVar.F(i10);
                        vVar.d(a2, wVar);
                    }
                    this.e += a2;
                    return;
                }
                return;
            default:
                h5.w wVar2 = (h5.w) this.f1410f;
                h5.a.j((r3.v) this.f1411g);
                if (this.f1408b) {
                    int a10 = wVar.a();
                    int i11 = this.e;
                    if (i11 < 10) {
                        int min = Math.min(a10, 10 - i11);
                        System.arraycopy(wVar.f6987a, wVar.f6988b, wVar2.f6987a, this.e, min);
                        if (this.e + min == 10) {
                            wVar2.F(0);
                            if (73 == wVar2.u() && 68 == wVar2.u() && 51 == wVar2.u()) {
                                wVar2.G(3);
                                this.d = wVar2.t() + 10;
                            } else {
                                h5.a.K("Id3Reader", "Discarding invalid ID3 tag");
                                this.f1408b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a10, this.d - this.e);
                    ((r3.v) this.f1411g).d(min2, wVar);
                    this.e += min2;
                    return;
                }
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f1407a) {
            case 0:
                this.f1408b = false;
                this.f1409c = -9223372036854775807L;
                return;
            default:
                this.f1408b = false;
                this.f1409c = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void c(r3.m mVar, h0 h0Var) {
        switch (this.f1407a) {
            case 0:
                r3.v[] vVarArr = (r3.v[]) this.f1411g;
                for (int i10 = 0; i10 < vVarArr.length; i10++) {
                    g0 g0Var = (g0) ((List) this.f1410f).get(i10);
                    h0Var.a();
                    h0Var.b();
                    r3.v d22 = mVar.d2(h0Var.d, 3);
                    m0 m0Var = new m0();
                    h0Var.b();
                    m0Var.f8655a = h0Var.e;
                    m0Var.f8666o = "application/dvbsubs";
                    m0Var.f8668q = Collections.singletonList(g0Var.f1406b);
                    m0Var.f8657c = g0Var.f1405a;
                    d22.b(new n0(m0Var));
                    vVarArr[i10] = d22;
                }
                return;
            default:
                h0Var.a();
                h0Var.b();
                r3.v d23 = mVar.d2(h0Var.d, 5);
                this.f1411g = d23;
                m0 m0Var2 = new m0();
                h0Var.b();
                m0Var2.f8655a = h0Var.e;
                m0Var2.f8666o = "application/id3";
                d23.b(new n0(m0Var2));
                return;
        }
    }

    @Override
    public final void d() {
        int i10;
        switch (this.f1407a) {
            case 0:
                if (this.f1408b) {
                    if (this.f1409c != -9223372036854775807L) {
                        for (r3.v vVar : (r3.v[]) this.f1411g) {
                            vVar.c(this.f1409c, 1, this.e, 0, null);
                        }
                    }
                    this.f1408b = false;
                    return;
                }
                return;
            default:
                h5.a.j((r3.v) this.f1411g);
                if (this.f1408b && (i10 = this.d) != 0 && this.e == i10) {
                    long j10 = this.f1409c;
                    if (j10 != -9223372036854775807L) {
                        ((r3.v) this.f1411g).c(j10, 1, i10, 0, null);
                    }
                    this.f1408b = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void e(int i10, long j10) {
        switch (this.f1407a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f1408b = true;
                    if (j10 != -9223372036854775807L) {
                        this.f1409c = j10;
                    }
                    this.e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i10 & 4) != 0) {
                    this.f1408b = true;
                    if (j10 != -9223372036854775807L) {
                        this.f1409c = j10;
                    }
                    this.d = 0;
                    this.e = 0;
                    return;
                }
                return;
        }
    }

    public h() {
        this.f1407a = 1;
        this.f1410f = new h5.w(10);
        this.f1409c = -9223372036854775807L;
    }
}
