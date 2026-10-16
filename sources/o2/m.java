package o2;

import b2.x;
import e2.m0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import u2.d1;
import v7.b8;
import v7.u6;
public final class m implements d1 {
    public final int f16229a;
    public final q f16230b;
    public int f16231c = -1;

    public m(q qVar, int i10) {
        this.f16230b = qVar;
        this.f16229a = i10;
    }

    public final void a() {
        boolean z10;
        if (this.f16231c == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        q qVar = this.f16230b;
        qVar.e();
        qVar.f16241a0.getClass();
        int[] iArr = qVar.f16241a0;
        int i10 = this.f16229a;
        int i11 = iArr[i10];
        if (i11 == -1) {
            if (qVar.Z.contains(qVar.Y.a(i10))) {
                i11 = -3;
            }
            i11 = -2;
        } else {
            boolean[] zArr = qVar.f16246d0;
            if (!zArr[i11]) {
                zArr[i11] = true;
            }
            i11 = -2;
        }
        this.f16231c = i11;
    }

    @Override
    public final void b() {
        int i10 = this.f16231c;
        q qVar = this.f16230b;
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
        throw new IOException(a1.g.p("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.Y.a(this.f16229a).d[0].f2523s, "."));
    }

    public final boolean c() {
        int i10 = this.f16231c;
        if (i10 != -1 && i10 != -3 && i10 != -2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        if (this.f16231c != -3) {
            if (c()) {
                int i10 = this.f16231c;
                q qVar = this.f16230b;
                if (qVar.z() || !qVar.L[i10].A(qVar.f16253j0)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        x xVar;
        if (this.f16231c == -3) {
            hVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i11 = this.f16231c;
            q qVar = this.f16230b;
            ArrayList arrayList = qVar.f16263y;
            if (!qVar.z()) {
                int i12 = 0;
                if (!arrayList.isEmpty()) {
                    int i13 = 0;
                    loop0: while (i13 < arrayList.size() - 1) {
                        int i14 = ((j) arrayList.get(i13)).v;
                        int length = qVar.L.length;
                        for (int i15 = 0; i15 < length; i15++) {
                            if (qVar.f16246d0[i15] && qVar.L[i15].E() == i14) {
                                break loop0;
                            }
                        }
                        i13++;
                    }
                    m0.X(0, i13, arrayList);
                    j jVar = (j) arrayList.get(0);
                    x xVar2 = jVar.d;
                    if (!xVar2.equals(qVar.W)) {
                        qVar.v.m(qVar.f16242b, xVar2, jVar.e, jVar.f46501f, jVar.h);
                    }
                    qVar.W = xVar2;
                }
                if (arrayList.isEmpty() || ((j) arrayList.get(0)).g()) {
                    int F = qVar.L[i11].F(bVar, hVar, i10, qVar.f16253j0);
                    if (F == -5) {
                        x xVar3 = (x) bVar.f43098c;
                        xVar3.getClass();
                        if (i11 == qVar.R) {
                            int b10 = b8.b(qVar.L[i11].E());
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
                        bVar.f43098c = xVar3;
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
        if (c()) {
            int i10 = this.f16231c;
            q qVar = this.f16230b;
            if (!qVar.z()) {
                p pVar = qVar.L[i10];
                int x10 = pVar.x(j10, qVar.f16253j0);
                ArrayList arrayList = qVar.f16263y;
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        obj = i2.d.h(1, arrayList);
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
}
