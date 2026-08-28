package o4;

import d5.f0;
import h3.t0;
import h3.u0;
import j3.r0;
import j4.b1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
public final class n implements b1 {
    public final int f18902a;
    public final r f18903b;
    public int f18904c = -1;

    public n(r rVar, int i9) {
        this.f18903b = rVar;
        this.f18902a = i9;
    }

    @Override
    public final void a() {
        int i9 = this.f18904c;
        r rVar = this.f18903b;
        if (i9 != -2) {
            if (i9 == -1) {
                rVar.D();
                return;
            } else if (i9 != -3) {
                rVar.D();
                rVar.H[i9].w();
                return;
            } else {
                return;
            }
        }
        rVar.f();
        throw new IOException(aa.d.o("Unable to bind a sample queue to TrackGroup with mime type ", rVar.U.a(this.f18902a).d[0].B, "."));
    }

    public final void b() {
        boolean z10;
        if (this.f18904c == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        r rVar = this.f18903b;
        rVar.f();
        rVar.W.getClass();
        int[] iArr = rVar.W;
        int i9 = this.f18902a;
        int i10 = iArr[i9];
        if (i10 == -1) {
            if (rVar.V.contains(rVar.U.a(i9))) {
                i10 = -3;
            }
            i10 = -2;
        } else {
            boolean[] zArr = rVar.Z;
            if (!zArr[i10]) {
                zArr[i10] = true;
            }
            i10 = -2;
        }
        this.f18904c = i10;
    }

    public final boolean c() {
        int i9 = this.f18904c;
        if (i9 != -1 && i9 != -3 && i9 != -2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        if (this.f18904c != -3) {
            if (c()) {
                int i9 = this.f18904c;
                r rVar = this.f18903b;
                if (rVar.A() || !rVar.H[i9].u(rVar.f18924f0)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int j(long j10) {
        Object next;
        Object obj;
        if (c()) {
            int i9 = this.f18904c;
            r rVar = this.f18903b;
            if (!rVar.A()) {
                q qVar = rVar.H[i9];
                int s10 = qVar.s(j10, rVar.f18924f0);
                ArrayList arrayList = rVar.f18934y;
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        obj = r0.j(1, arrayList);
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
                k kVar = (k) obj;
                if (kVar != null && !kVar.W) {
                    s10 = Math.min(s10, kVar.f(i9) - qVar.q());
                }
                qVar.E(s10);
                return s10;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final int l(u0 u0Var, k3.i iVar, int i9) {
        t0 t0Var;
        if (this.f18904c == -3) {
            iVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i10 = this.f18904c;
            r rVar = this.f18903b;
            ArrayList arrayList = rVar.f18934y;
            if (!rVar.A()) {
                int i11 = 0;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    loop0: while (i12 < arrayList.size() - 1) {
                        int i13 = ((k) arrayList.get(i12)).v;
                        int length = rVar.H.length;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (rVar.Z[i14] && rVar.H[i14].y() == i13) {
                                break loop0;
                            }
                        }
                        i12++;
                    }
                    f0.N(0, i12, arrayList);
                    k kVar = (k) arrayList.get(0);
                    t0 t0Var2 = kVar.d;
                    if (!t0Var2.equals(rVar.S)) {
                        rVar.v.b(rVar.f18916b, t0Var2, kVar.f16663e, kVar.f16664f, kVar.h);
                    }
                    rVar.S = t0Var2;
                }
                if (arrayList.isEmpty() || ((k) arrayList.get(0)).W) {
                    int z10 = rVar.H[i10].z(u0Var, iVar, i9, rVar.f18924f0);
                    if (z10 == -5) {
                        t0 t0Var3 = u0Var.f9778b;
                        t0Var3.getClass();
                        if (i10 == rVar.N) {
                            int y10 = rVar.H[i10].y();
                            while (i11 < arrayList.size() && ((k) arrayList.get(i11)).v != y10) {
                                i11++;
                            }
                            if (i11 < arrayList.size()) {
                                t0Var = ((k) arrayList.get(i11)).d;
                            } else {
                                t0Var = rVar.R;
                                t0Var.getClass();
                            }
                            t0Var3 = t0Var3.c(t0Var);
                        }
                        u0Var.f9778b = t0Var3;
                    }
                    return z10;
                }
            }
        }
        return -3;
    }
}
