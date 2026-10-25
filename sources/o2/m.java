package o2;

import a8.ed;
import a8.yb;
import b2.x;
import e2.n0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import u2.d1;
public final class m implements d1 {
    public final int f19037a;
    public final q f19038b;
    public int f19039c = -1;

    public m(q qVar, int i10) {
        this.f19038b = qVar;
        this.f19037a = i10;
    }

    public final void a() {
        boolean z10;
        if (this.f19039c == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        q qVar = this.f19038b;
        qVar.e();
        qVar.f19049a0.getClass();
        int[] iArr = qVar.f19049a0;
        int i10 = this.f19037a;
        int i11 = iArr[i10];
        if (i11 == -1) {
            if (qVar.Z.contains(qVar.Y.a(i10))) {
                i11 = -3;
            }
            i11 = -2;
        } else {
            boolean[] zArr = qVar.f19054d0;
            if (!zArr[i11]) {
                zArr[i11] = true;
            }
            i11 = -2;
        }
        this.f19039c = i11;
    }

    public final boolean b() {
        int i10 = this.f19039c;
        if (i10 != -1 && i10 != -3 && i10 != -2) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        int i10 = this.f19039c;
        q qVar = this.f19038b;
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
        throw new IOException(a1.g.p("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.Y.a(this.f19037a).d[0].f3586s, "."));
    }

    @Override
    public final boolean e() {
        if (this.f19039c != -3) {
            if (b()) {
                int i10 = this.f19039c;
                q qVar = this.f19038b;
                if (qVar.y() || !qVar.L[i10].A(qVar.f19061j0)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int f(n4.s sVar, h2.h hVar, int i10) {
        x xVar;
        if (this.f19039c == -3) {
            hVar.addFlag(4);
            return -4;
        }
        if (b()) {
            int i11 = this.f19039c;
            q qVar = this.f19038b;
            ArrayList arrayList = qVar.f19071y;
            if (!qVar.y()) {
                int i12 = 0;
                if (!arrayList.isEmpty()) {
                    int i13 = 0;
                    loop0: while (i13 < arrayList.size() - 1) {
                        int i14 = ((j) arrayList.get(i13)).v;
                        int length = qVar.L.length;
                        for (int i15 = 0; i15 < length; i15++) {
                            if (qVar.f19054d0[i15] && qVar.L[i15].E() == i14) {
                                break loop0;
                            }
                        }
                        i13++;
                    }
                    n0.X(0, i13, arrayList);
                    j jVar = (j) arrayList.get(0);
                    x xVar2 = jVar.d;
                    if (!xVar2.equals(qVar.W)) {
                        qVar.v.l(qVar.f19050b, xVar2, jVar.e, jVar.f50006f, jVar.h);
                    }
                    qVar.W = xVar2;
                }
                if (arrayList.isEmpty() || ((j) arrayList.get(0)).g()) {
                    int F = qVar.L[i11].F(sVar, hVar, i10, qVar.f19061j0);
                    if (F == -5) {
                        x xVar3 = (x) sVar.f18697c;
                        xVar3.getClass();
                        if (i11 == qVar.R) {
                            int b10 = ed.b(qVar.L[i11].E());
                            while (i12 < arrayList.size() && ((j) arrayList.get(i12)).v != b10) {
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
                        sVar.f18697c = xVar3;
                    }
                    return F;
                }
            }
        }
        return -3;
    }

    @Override
    public final int j(long j10) {
        Object next;
        Object obj;
        if (b()) {
            int i10 = this.f19039c;
            q qVar = this.f19038b;
            if (!qVar.y()) {
                p pVar = qVar.L[i10];
                int x9 = pVar.x(j10, qVar.f19061j0);
                ArrayList arrayList = qVar.f19071y;
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        obj = ic.a.g(1, arrayList);
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
                    x9 = Math.min(x9, jVar.f(i10) - pVar.v());
                }
                pVar.L(x9);
                return x9;
            }
            return 0;
        }
        return 0;
    }
}
