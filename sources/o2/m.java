package o2;

import b2.w;
import e2.m0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import u2.d1;
import v7.b8;
import v7.u6;
public final class m implements d1 {
    public final int f17623a;
    public final q f17624b;
    public int f17625c = -1;

    public m(q qVar, int i10) {
        this.f17624b = qVar;
        this.f17623a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f17625c;
        q qVar = this.f17624b;
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
        throw new IOException(a1.g.p("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.Y.a(this.f17623a).d[0].f4131s, "."));
    }

    public final void b() {
        boolean z10;
        if (this.f17625c == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        q qVar = this.f17624b;
        qVar.e();
        qVar.f17635a0.getClass();
        int[] iArr = qVar.f17635a0;
        int i10 = this.f17623a;
        int i11 = iArr[i10];
        if (i11 == -1) {
            if (qVar.Z.contains(qVar.Y.a(i10))) {
                i11 = -3;
            }
            i11 = -2;
        } else {
            boolean[] zArr = qVar.f17640d0;
            if (!zArr[i11]) {
                zArr[i11] = true;
            }
            i11 = -2;
        }
        this.f17625c = i11;
    }

    public final boolean c() {
        int i10 = this.f17625c;
        if (i10 != -1 && i10 != -3 && i10 != -2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        if (this.f17625c != -3) {
            if (c()) {
                int i10 = this.f17625c;
                q qVar = this.f17624b;
                if (qVar.A() || !qVar.L[i10].A(qVar.f17647j0)) {
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
        w wVar;
        if (this.f17625c == -3) {
            hVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i11 = this.f17625c;
            q qVar = this.f17624b;
            ArrayList arrayList = qVar.f17657y;
            if (!qVar.A()) {
                int i12 = 0;
                if (!arrayList.isEmpty()) {
                    int i13 = 0;
                    loop0: while (i13 < arrayList.size() - 1) {
                        int i14 = ((j) arrayList.get(i13)).v;
                        int length = qVar.L.length;
                        for (int i15 = 0; i15 < length; i15++) {
                            if (qVar.f17640d0[i15] && qVar.L[i15].E() == i14) {
                                break loop0;
                            }
                        }
                        i13++;
                    }
                    m0.X(0, i13, arrayList);
                    j jVar = (j) arrayList.get(0);
                    w wVar2 = jVar.d;
                    if (!wVar2.equals(qVar.W)) {
                        qVar.v.m(qVar.f17636b, wVar2, jVar.e, jVar.f47909f, jVar.h);
                    }
                    qVar.W = wVar2;
                }
                if (arrayList.isEmpty() || ((j) arrayList.get(0)).g()) {
                    int F = qVar.L[i11].F(bVar, hVar, i10, qVar.f17647j0);
                    if (F == -5) {
                        w wVar3 = (w) bVar.f44466c;
                        wVar3.getClass();
                        if (i11 == qVar.R) {
                            int b10 = b8.b(qVar.L[i11].E());
                            while (i12 < arrayList.size() && ((j) arrayList.get(i12)).v != b10) {
                                i12++;
                            }
                            if (i12 < arrayList.size()) {
                                wVar = ((j) arrayList.get(i12)).d;
                            } else {
                                wVar = qVar.V;
                                wVar.getClass();
                            }
                            wVar3 = wVar3.d(wVar);
                        }
                        bVar.f44466c = wVar3;
                    }
                    return F;
                }
            }
        }
        return -3;
    }

    @Override
    public final int h(long j10) {
        Object next;
        Object obj;
        if (c()) {
            int i10 = this.f17625c;
            q qVar = this.f17624b;
            if (!qVar.A()) {
                p pVar = qVar.L[i10];
                int x10 = pVar.x(j10, qVar.f17647j0);
                ArrayList arrayList = qVar.f17657y;
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        obj = i0.a.h(1, arrayList);
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
