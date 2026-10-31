package o2;

import b2.x;
import e2.l0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import u2.d1;
import v7.c8;
import v7.t6;
public final class m implements d1 {
    public final int f14027a;
    public final q f14028b;
    public int f14029c = -1;

    public m(q qVar, int i10) {
        this.f14028b = qVar;
        this.f14027a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f14029c;
        q qVar = this.f14028b;
        if (i10 != -2) {
            if (i10 == -1) {
                qVar.C();
                return;
            } else if (i10 != -3) {
                qVar.C();
                qVar.L[i10].C();
                return;
            } else {
                return;
            }
        }
        qVar.e();
        throw new IOException(a1.g.n("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.Y.a(this.f14027a).d[0].f2423s, "."));
    }

    public final void b() {
        boolean z10;
        if (this.f14029c == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        q qVar = this.f14028b;
        qVar.e();
        qVar.f14039a0.getClass();
        int[] iArr = qVar.f14039a0;
        int i10 = this.f14027a;
        int i11 = iArr[i10];
        if (i11 == -1) {
            if (qVar.Z.contains(qVar.Y.a(i10))) {
                i11 = -3;
            }
            i11 = -2;
        } else {
            boolean[] zArr = qVar.f14044d0;
            if (!zArr[i11]) {
                zArr[i11] = true;
            }
            i11 = -2;
        }
        this.f14029c = i11;
    }

    public final boolean c() {
        int i10 = this.f14029c;
        if (i10 != -1 && i10 != -3 && i10 != -2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        if (this.f14029c != -3) {
            if (c()) {
                int i10 = this.f14029c;
                q qVar = this.f14028b;
                if (qVar.A() || !qVar.L[i10].A(qVar.f14051j0)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int i(long j10) {
        Object next;
        Object obj;
        if (c()) {
            int i10 = this.f14029c;
            q qVar = this.f14028b;
            if (!qVar.A()) {
                p pVar = qVar.L[i10];
                int x10 = pVar.x(j10, qVar.f14051j0);
                ArrayList arrayList = qVar.D;
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        obj = i0.a.g(1, arrayList);
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
                    x10 = Math.min(x10, jVar.f(i10) - pVar.v());
                }
                pVar.L(x10);
                return x10;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final int r(hf.b bVar, h2.h hVar, int i10) {
        x xVar;
        if (this.f14029c == -3) {
            hVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i11 = this.f14029c;
            q qVar = this.f14028b;
            ArrayList arrayList = qVar.D;
            if (!qVar.A()) {
                int i12 = 0;
                if (!arrayList.isEmpty()) {
                    int i13 = 0;
                    loop0: while (i13 < arrayList.size() - 1) {
                        int i14 = ((j) arrayList.get(i13)).f14003w;
                        int length = qVar.L.length;
                        for (int i15 = 0; i15 < length; i15++) {
                            if (qVar.f14044d0[i15] && qVar.L[i15].E() == i14) {
                                break loop0;
                            }
                        }
                        i13++;
                    }
                    l0.X(0, i13, arrayList);
                    j jVar = (j) arrayList.get(0);
                    x xVar2 = jVar.d;
                    if (!xVar2.equals(qVar.W)) {
                        qVar.f14059w.l(qVar.f14040b, xVar2, jVar.e, jVar.f50308f, jVar.h);
                    }
                    qVar.W = xVar2;
                }
                if (arrayList.isEmpty() || ((j) arrayList.get(0)).g()) {
                    int F = qVar.L[i11].F(bVar, hVar, i10, qVar.f14051j0);
                    if (F == -5) {
                        x xVar3 = (x) bVar.f7658c;
                        xVar3.getClass();
                        if (i11 == qVar.R) {
                            int b10 = c8.b(qVar.L[i11].E());
                            while (i12 < arrayList.size() && ((j) arrayList.get(i12)).f14003w != b10) {
                                i12++;
                            }
                            if (i12 < arrayList.size()) {
                                xVar = ((j) arrayList.get(i12)).d;
                            } else {
                                xVar = qVar.V;
                                xVar.getClass();
                            }
                            xVar3 = xVar3.d(xVar);
                        }
                        bVar.f7658c = xVar3;
                    }
                    return F;
                }
            }
        }
        return -3;
    }
}
