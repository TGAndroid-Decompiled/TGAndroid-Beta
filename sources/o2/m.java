package o2;

import e2.d0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import u2.d1;
import v7.y7;
public final class m implements d1 {
    public final int f14201a;
    public final q f14202b;
    public int f14203c = -1;

    public m(q qVar, int i10) {
        this.f14202b = qVar;
        this.f14201a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f14203c;
        q qVar = this.f14202b;
        if (i10 != -2) {
            if (i10 == -1) {
                qVar.E();
                return;
            } else if (i10 != -3) {
                qVar.E();
                qVar.L[i10].z();
                return;
            } else {
                return;
            }
        }
        qVar.e();
        throw new IOException(a4.a.p("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.Y.a(this.f14201a).d[0].f2002r, "."));
    }

    public final void b() {
        boolean z10;
        if (this.f14203c == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        q qVar = this.f14202b;
        qVar.e();
        qVar.f14213a0.getClass();
        int[] iArr = qVar.f14213a0;
        int i10 = this.f14201a;
        int i11 = iArr[i10];
        if (i11 == -1) {
            if (qVar.Z.contains(qVar.Y.a(i10))) {
                i11 = -3;
            }
            i11 = -2;
        } else {
            boolean[] zArr = qVar.f14218d0;
            if (!zArr[i11]) {
                zArr[i11] = true;
            }
            i11 = -2;
        }
        this.f14203c = i11;
    }

    public final boolean c() {
        int i10 = this.f14203c;
        if (i10 != -1 && i10 != -3 && i10 != -2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        if (this.f14203c != -3) {
            if (c()) {
                int i10 = this.f14203c;
                q qVar = this.f14202b;
                if (qVar.A() || !qVar.L[i10].x(qVar.f14225j0)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int g(long j3) {
        Object next;
        Object obj;
        if (c()) {
            int i10 = this.f14203c;
            q qVar = this.f14202b;
            if (!qVar.A()) {
                p pVar = qVar.L[i10];
                int v = pVar.v(j3, qVar.f14225j0);
                ArrayList arrayList = qVar.f14234y;
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        obj = hc.b.i(1, arrayList);
                    }
                    obj = null;
                } else {
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        do {
                            next = it.next();
                        } while (it.hasNext());
                        obj = next;
                    }
                    obj = null;
                }
                j jVar = (j) obj;
                if (jVar != null && !jVar.g()) {
                    v = Math.min(v, jVar.f(i10) - pVar.t());
                }
                pVar.H(v);
                return v;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final int t(of.b bVar, h2.h hVar, int i10) {
        b2.s sVar;
        if (this.f14203c == -3) {
            hVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i11 = this.f14203c;
            q qVar = this.f14202b;
            ArrayList arrayList = qVar.f14234y;
            if (!qVar.A()) {
                int i12 = 0;
                if (!arrayList.isEmpty()) {
                    int i13 = 0;
                    loop0: while (i13 < arrayList.size() - 1) {
                        int i14 = ((j) arrayList.get(i13)).v;
                        int length = qVar.L.length;
                        for (int i15 = 0; i15 < length; i15++) {
                            if (qVar.f14218d0[i15] && qVar.L[i15].B() == i14) {
                                break loop0;
                            }
                        }
                        i13++;
                    }
                    d0.V(0, i13, arrayList);
                    j jVar = (j) arrayList.get(0);
                    b2.s sVar2 = jVar.d;
                    if (!sVar2.equals(qVar.W)) {
                        qVar.v.i(qVar.f14214b, sVar2, jVar.e, jVar.f42865f, jVar.h);
                    }
                    qVar.W = sVar2;
                }
                if (arrayList.isEmpty() || ((j) arrayList.get(0)).g()) {
                    int C = qVar.L[i11].C(bVar, hVar, i10, qVar.f14225j0);
                    if (C == -5) {
                        b2.s sVar3 = (b2.s) bVar.f14295c;
                        sVar3.getClass();
                        if (i11 == qVar.R) {
                            int b10 = y7.b(qVar.L[i11].B());
                            while (i12 < arrayList.size() && ((j) arrayList.get(i12)).v != b10) {
                                i12++;
                            }
                            if (i12 < arrayList.size()) {
                                sVar = ((j) arrayList.get(i12)).d;
                            } else {
                                sVar = qVar.V;
                                sVar.getClass();
                            }
                            sVar3 = sVar3.d(sVar);
                        }
                        bVar.f14295c = sVar3;
                    }
                    return C;
                }
            }
        }
        return -3;
    }
}
