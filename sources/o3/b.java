package o3;

import d5.g0;
import d5.q;
import d5.z;
import h3.s0;
import h3.t0;
import h3.t1;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.o;
import m3.w;
import p8.x;

public final class b implements k {

    public int f19160c;

    public c f19161e;
    public long h;

    public e f19164i;

    public int f19168m;

    public boolean f19169n;

    public final z f19158a = new z(12);

    public final b8.b f19159b = new b8.b();
    public m d = new w9.d(14);

    public e[] f19163g = new e[0];

    public long f19166k = -1;

    public long f19167l = -1;

    public int f19165j = -1;

    public long f19162f = -9223372036854775807L;

    @Override
    public final int b(l lVar, n nVar) throws t1, EOFException, InterruptedIOException {
        boolean z10;
        e eVar;
        e eVar2;
        long j10 = this.h;
        if (j10 != -1) {
            long j11 = ((m3.h) lVar).d;
            if (j10 < j11 || j10 > 262144 + j11) {
                nVar.f17620a = j10;
                z10 = true;
            } else {
                ((m3.h) lVar).t((int) (j10 - j11));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.h = -1L;
        if (z10) {
            return 1;
        }
        int i10 = this.f19160c;
        e eVar3 = null;
        b8.b bVar = this.f19159b;
        z zVar = this.f19158a;
        switch (i10) {
            case 0:
                if (!f(lVar)) {
                    throw t1.a("AVI Header List not found", null);
                }
                ((m3.h) lVar).t(12);
                this.f19160c = 1;
                return 0;
            case 1:
                ((m3.h) lVar).d(zVar.f4858a, 0, 12, false);
                zVar.C(0);
                bVar.getClass();
                bVar.f2041a = zVar.g();
                bVar.f2042b = zVar.g();
                bVar.f2043c = 0;
                if (bVar.f2041a != 1414744396) {
                    throw t1.a("LIST expected, found: " + bVar.f2041a, null);
                }
                int iG = zVar.g();
                bVar.f2043c = iG;
                if (iG == 1819436136) {
                    this.f19165j = bVar.f2042b;
                    this.f19160c = 2;
                    return 0;
                }
                throw t1.a("hdrl expected, found: " + bVar.f2043c, null);
            case 2:
                int i11 = this.f19165j - 4;
                z zVar2 = new z(i11);
                ((m3.h) lVar).d(zVar2.f4858a, 0, i11, false);
                f fVarB = f.b(1819436136, zVar2);
                int i12 = fVarB.f19188b;
                if (i12 != 1819436136) {
                    throw t1.a("Unexpected header list type " + i12, null);
                }
                c cVar = (c) fVarB.a(c.class);
                if (cVar == null) {
                    throw t1.a("AviHeader not found", null);
                }
                this.f19161e = cVar;
                this.f19162f = ((long) cVar.f19172c) * ((long) cVar.f19170a);
                ArrayList arrayList = new ArrayList();
                x xVarListIterator = fVarB.f19187a.listIterator(0);
                int i13 = 0;
                while (xVarListIterator.hasNext()) {
                    a aVar = (a) xVarListIterator.next();
                    if (aVar.getType() == 1819440243) {
                        f fVar = (f) aVar;
                        int i14 = i13 + 1;
                        d dVar = (d) fVar.a(d.class);
                        g gVar = (g) fVar.a(g.class);
                        if (dVar == null) {
                            d5.a.K("AviExtractor", "Missing Stream Header");
                        } else if (gVar == null) {
                            d5.a.K("AviExtractor", "Missing Stream Format");
                        } else {
                            long jO = g0.O(dVar.d, ((long) dVar.f19174b) * 1000000, dVar.f19175c);
                            t0 t0Var = gVar.f19189a;
                            s0 s0VarA = t0Var.a();
                            s0VarA.f8123a = Integer.toString(i13);
                            int i15 = dVar.f19176e;
                            if (i15 != 0) {
                                s0VarA.f8136p = i15;
                            }
                            h hVar = (h) fVar.a(h.class);
                            if (hVar != null) {
                                s0VarA.f8124b = hVar.f19190a;
                            }
                            int iG2 = q.g(t0Var.B);
                            if (iG2 == 1 || iG2 == 2) {
                                w wVarC = this.d.C(i13, iG2);
                                wVarC.c(new t0(s0VarA));
                                eVar = new e(i13, iG2, jO, dVar.d, wVarC);
                                this.f19162f = jO;
                            }
                            if (eVar != null) {
                                arrayList.add(eVar);
                            }
                            i13 = i14;
                        }
                        eVar = null;
                        if (eVar != null) {
                            arrayList.add(eVar);
                        }
                        i13 = i14;
                    }
                }
                this.f19163g = (e[]) arrayList.toArray(new e[0]);
                this.d.A();
                this.f19160c = 3;
                return 0;
            case 3:
                long j12 = this.f19166k;
                if (j12 != -1 && ((m3.h) lVar).d != j12) {
                    this.h = j12;
                    return 0;
                }
                ((m3.h) lVar).g(zVar.f4858a, 0, 12, false);
                m3.h hVar2 = (m3.h) lVar;
                hVar2.f17614f = 0;
                zVar.C(0);
                bVar.getClass();
                bVar.f2041a = zVar.g();
                bVar.f2042b = zVar.g();
                bVar.f2043c = 0;
                int iG3 = zVar.g();
                int i16 = bVar.f2041a;
                if (i16 == 1179011410) {
                    hVar2.t(12);
                    return 0;
                }
                if (i16 != 1414744396 || iG3 != 1769369453) {
                    this.h = hVar2.d + ((long) bVar.f2042b) + 8;
                    return 0;
                }
                long j13 = hVar2.d;
                this.f19166k = j13;
                this.f19167l = j13 + ((long) bVar.f2042b) + 8;
                if (!this.f19169n) {
                    c cVar2 = this.f19161e;
                    cVar2.getClass();
                    if ((cVar2.f19171b & 16) == 16) {
                        this.f19160c = 4;
                        this.h = this.f19167l;
                        return 0;
                    }
                    this.d.n(new o(this.f19162f));
                    this.f19169n = true;
                }
                this.h = hVar2.d + 12;
                this.f19160c = 6;
                return 0;
            case 4:
                ((m3.h) lVar).d(zVar.f4858a, 0, 8, false);
                zVar.C(0);
                int iG4 = zVar.g();
                int iG5 = zVar.g();
                if (iG4 != 829973609) {
                    this.h = ((m3.h) lVar).d + ((long) iG5);
                    return 0;
                }
                this.f19160c = 5;
                this.f19168m = iG5;
                return 0;
            case 5:
                z zVar3 = new z(this.f19168m);
                ((m3.h) lVar).d(zVar3.f4858a, 0, this.f19168m, false);
                long j14 = 0;
                if (zVar3.a() >= 16) {
                    int i17 = zVar3.f4859b;
                    zVar3.D(8);
                    long jG = zVar3.g();
                    long j15 = this.f19166k;
                    j14 = jG <= j15 ? j15 + 8 : 0L;
                    zVar3.C(i17);
                }
                while (zVar3.a() >= 16) {
                    int iG6 = zVar3.g();
                    int iG7 = zVar3.g();
                    long jG2 = ((long) zVar3.g()) + j14;
                    zVar3.g();
                    e[] eVarArr = this.f19163g;
                    int length = eVarArr.length;
                    int i18 = 0;
                    while (true) {
                        if (i18 < length) {
                            eVar2 = eVarArr[i18];
                            if (eVar2.f19178b != iG6 && eVar2.f19179c != iG6) {
                                i18++;
                            }
                        } else {
                            eVar2 = null;
                        }
                    }
                    if (eVar2 != null) {
                        if ((iG7 & 16) == 16) {
                            if (eVar2.f19184j == eVar2.f19186l.length) {
                                long[] jArr = eVar2.f19185k;
                                eVar2.f19185k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = eVar2.f19186l;
                                eVar2.f19186l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = eVar2.f19185k;
                            int i19 = eVar2.f19184j;
                            jArr2[i19] = jG2;
                            eVar2.f19186l[i19] = eVar2.f19183i;
                            eVar2.f19184j = i19 + 1;
                        }
                        eVar2.f19183i++;
                    }
                }
                for (e eVar4 : this.f19163g) {
                    eVar4.f19185k = Arrays.copyOf(eVar4.f19185k, eVar4.f19184j);
                    eVar4.f19186l = Arrays.copyOf(eVar4.f19186l, eVar4.f19184j);
                }
                this.f19169n = true;
                this.d.n(new o(this, this.f19162f, 2));
                this.f19160c = 6;
                this.h = this.f19166k;
                return 0;
            case 6:
                if (((m3.h) lVar).d >= this.f19167l) {
                    return -1;
                }
                e eVar5 = this.f19164i;
                if (eVar5 != null) {
                    int i20 = eVar5.f19182g;
                    int iB = i20 - eVar5.f19177a.b(lVar, i20, false);
                    eVar5.f19182g = iB;
                    boolean z11 = iB == 0;
                    if (z11) {
                        if (eVar5.f19181f > 0) {
                            w wVar = eVar5.f19177a;
                            int i21 = eVar5.h;
                            wVar.e((eVar5.d * ((long) i21)) / ((long) eVar5.f19180e), Arrays.binarySearch(eVar5.f19186l, i21) >= 0 ? 1 : 0, eVar5.f19181f, 0, null);
                        }
                        eVar5.h++;
                    }
                    if (z11) {
                        this.f19164i = null;
                    }
                    return 0;
                }
                m3.h hVar3 = (m3.h) lVar;
                if ((hVar3.d & 1) == 1) {
                    hVar3.t(1);
                }
                hVar3.g(zVar.f4858a, 0, 12, false);
                zVar.C(0);
                int iG8 = zVar.g();
                if (iG8 == 1414744396) {
                    zVar.C(8);
                    hVar3.t(zVar.g() == 1769369453 ? 12 : 8);
                    hVar3.f17614f = 0;
                    return 0;
                }
                int iG9 = zVar.g();
                if (iG8 == 1263424842) {
                    this.h = hVar3.d + ((long) iG9) + 8;
                    return 0;
                }
                hVar3.t(8);
                hVar3.f17614f = 0;
                for (e eVar6 : this.f19163g) {
                    if (eVar6.f19178b == iG8 || eVar6.f19179c == iG8) {
                        eVar3 = eVar6;
                        if (eVar3 == null) {
                            this.h = hVar3.d + ((long) iG9);
                            return 0;
                        }
                        eVar3.f19181f = iG9;
                        eVar3.f19182g = iG9;
                        this.f19164i = eVar3;
                        return 0;
                    }
                }
                if (eVar3 == null) {
                    this.h = hVar3.d + ((long) iG9);
                    return 0;
                }
                eVar3.f19181f = iG9;
                eVar3.f19182g = iG9;
                this.f19164i = eVar3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override
    public final void c(m mVar) {
        this.f19160c = 0;
        this.d = mVar;
        this.h = -1L;
    }

    @Override
    public final boolean f(l lVar) {
        z zVar = this.f19158a;
        lVar.b(0, 12, zVar.f4858a);
        zVar.C(0);
        if (zVar.g() == 1179011410) {
            zVar.D(4);
            if (zVar.g() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void g(long j10, long j11) {
        this.h = -1L;
        this.f19164i = null;
        for (e eVar : this.f19163g) {
            if (eVar.f19184j == 0) {
                eVar.h = 0;
            } else {
                eVar.h = eVar.f19186l[g0.e(eVar.f19185k, j10, true)];
            }
        }
        if (j10 != 0) {
            this.f19160c = 6;
        } else if (this.f19163g.length == 0) {
            this.f19160c = 0;
        } else {
            this.f19160c = 3;
        }
    }

    @Override
    public final void release() {
    }
}
