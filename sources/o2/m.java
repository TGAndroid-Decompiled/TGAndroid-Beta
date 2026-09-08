package o2;

import e2.d0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import n4.y;
import u2.b1;
import v7.x7;
public final class m implements b1 {
    public final int f16924a;
    public final q f16925b;
    public int f16926c = -1;

    public m(q qVar, int i10) {
        this.f16925b = qVar;
        this.f16924a = i10;
    }

    public final void a() {
        boolean z10;
        if (this.f16926c == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        q qVar = this.f16925b;
        qVar.e();
        qVar.f16937a0.getClass();
        int[] iArr = qVar.f16937a0;
        int i10 = this.f16924a;
        int i11 = iArr[i10];
        if (i11 == -1) {
            if (qVar.Z.contains(qVar.Y.a(i10))) {
                i11 = -3;
            }
            i11 = -2;
        } else {
            boolean[] zArr = qVar.f16942d0;
            if (!zArr[i11]) {
                zArr[i11] = true;
            }
            i11 = -2;
        }
        this.f16926c = i11;
    }

    @Override
    public final void b() {
        int i10 = this.f16926c;
        q qVar = this.f16925b;
        if (i10 != -2) {
            if (i10 == -1) {
                qVar.D();
                return;
            } else if (i10 != -3) {
                qVar.D();
                qVar.L[i10].z();
                return;
            } else {
                return;
            }
        }
        qVar.e();
        throw new IOException(a4.a.p("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.Y.a(this.f16924a).d[0].f2397r, "."));
    }

    public final boolean c() {
        int i10 = this.f16926c;
        if (i10 != -1 && i10 != -3 && i10 != -2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        if (this.f16926c != -3) {
            if (c()) {
                int i10 = this.f16926c;
                q qVar = this.f16925b;
                if (qVar.B() || !qVar.L[i10].x(qVar.f16950j0)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int f(y yVar, h2.h hVar, int i10) {
        b2.s sVar;
        if (this.f16926c == -3) {
            hVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i11 = this.f16926c;
            q qVar = this.f16925b;
            ArrayList arrayList = qVar.f16959y;
            if (!qVar.B()) {
                int i12 = 0;
                if (!arrayList.isEmpty()) {
                    int i13 = 0;
                    loop0: while (i13 < arrayList.size() - 1) {
                        int i14 = ((j) arrayList.get(i13)).v;
                        int length = qVar.L.length;
                        for (int i15 = 0; i15 < length; i15++) {
                            if (qVar.f16942d0[i15] && qVar.L[i15].B() == i14) {
                                break loop0;
                            }
                        }
                        i13++;
                    }
                    d0.V(0, i13, arrayList);
                    j jVar = (j) arrayList.get(0);
                    b2.s sVar2 = jVar.d;
                    if (!sVar2.equals(qVar.W)) {
                        qVar.v.j(qVar.f16938b, sVar2, jVar.f47329e, jVar.f47330f, jVar.h);
                    }
                    qVar.W = sVar2;
                }
                if (arrayList.isEmpty() || ((j) arrayList.get(0)).g()) {
                    int C = qVar.L[i11].C(yVar, hVar, i10, qVar.f16950j0);
                    if (C == -5) {
                        b2.s sVar3 = (b2.s) yVar.f16524c;
                        sVar3.getClass();
                        if (i11 == qVar.R) {
                            int b10 = x7.b(qVar.L[i11].B());
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
                        yVar.f16524c = sVar3;
                    }
                    return C;
                }
            }
        }
        return -3;
    }

    @Override
    public final int m(long j3) {
        Object next;
        Object obj;
        if (c()) {
            int i10 = this.f16926c;
            q qVar = this.f16925b;
            if (!qVar.B()) {
                p pVar = qVar.L[i10];
                int v = pVar.v(j3, qVar.f16950j0);
                ArrayList arrayList = qVar.f16959y;
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        obj = i2.g.h(1, arrayList);
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
}
