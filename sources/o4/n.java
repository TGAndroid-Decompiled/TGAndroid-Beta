package o4;

import com.google.android.gms.internal.cast.x4;
import d5.g0;
import h3.t0;
import h3.u0;
import j4.b1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public final class n implements b1 {

    public final int f19249a;

    public final r f19250b;

    public int f19251c = -1;

    public n(r rVar, int i10) {
        this.f19250b = rVar;
        this.f19249a = i10;
    }

    @Override
    public final void a() throws IOException {
        int i10 = this.f19251c;
        r rVar = this.f19250b;
        if (i10 == -2) {
            rVar.e();
            throw new x4(a9.p.m("Unable to bind a sample queue to TrackGroup with mime type ", rVar.U.a(this.f19249a).d[0].B, "."));
        }
        if (i10 == -1) {
            rVar.v();
        } else if (i10 != -3) {
            rVar.v();
            rVar.H[i10].w();
        }
    }

    public final void b() {
        d5.a.f(this.f19251c == -1);
        r rVar = this.f19250b;
        rVar.e();
        rVar.W.getClass();
        int[] iArr = rVar.W;
        int i10 = this.f19249a;
        int i11 = iArr[i10];
        if (i11 != -1) {
            boolean[] zArr = rVar.Z;
            if (zArr[i11]) {
                i11 = -2;
            } else {
                zArr[i11] = true;
            }
        } else if (rVar.V.contains(rVar.U.a(i10))) {
            i11 = -3;
        } else {
            i11 = -2;
        }
        this.f19251c = i11;
    }

    public final boolean c() {
        int i10 = this.f19251c;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    @Override
    public final boolean e() {
        if (this.f19251c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i10 = this.f19251c;
        r rVar = this.f19250b;
        return !rVar.t() && rVar.H[i10].u(rVar.f19271f0);
    }

    @Override
    public final int f(long j10) throws Throwable {
        Object next;
        Object objI;
        if (!c()) {
            return 0;
        }
        int i10 = this.f19251c;
        r rVar = this.f19250b;
        if (rVar.t()) {
            return 0;
        }
        q qVar = rVar.H[i10];
        int iS = qVar.s(j10, rVar.f19271f0);
        ArrayList arrayList = rVar.f19281y;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                objI = next;
            } else {
                objI = null;
            }
        } else if (arrayList.isEmpty()) {
            objI = null;
        } else {
            objI = i0.a.i(1, arrayList);
        }
        k kVar = (k) objI;
        if (kVar != null && !kVar.W) {
            iS = Math.min(iS, kVar.f(i10) - qVar.q());
        }
        qVar.E(iS);
        return iS;
    }

    @Override
    public final int i(u0 u0Var, k3.i iVar, int i10) {
        t0 t0Var;
        if (this.f19251c == -3) {
            iVar.addFlag(4);
            return -4;
        }
        if (c()) {
            int i11 = this.f19251c;
            r rVar = this.f19250b;
            ArrayList arrayList = rVar.f19281y;
            if (!rVar.t()) {
                int i12 = 0;
                if (!arrayList.isEmpty()) {
                    int i13 = 0;
                    loop0: while (i13 < arrayList.size() - 1) {
                        int i14 = ((k) arrayList.get(i13)).v;
                        int length = rVar.H.length;
                        for (int i15 = 0; i15 < length; i15++) {
                            if (rVar.Z[i15] && rVar.H[i15].y() == i14) {
                                break loop0;
                            }
                        }
                        i13++;
                    }
                    g0.N(0, i13, arrayList);
                    k kVar = (k) arrayList.get(0);
                    t0 t0Var2 = kVar.d;
                    if (!t0Var2.equals(rVar.S)) {
                        rVar.v.b(rVar.f19263b, t0Var2, kVar.f15420e, kVar.f15421f, kVar.h);
                    }
                    rVar.S = t0Var2;
                }
                if (arrayList.isEmpty() || ((k) arrayList.get(0)).W) {
                    int iZ = rVar.H[i11].z(u0Var, iVar, i10, rVar.f19271f0);
                    if (iZ == -5) {
                        t0 t0VarC = u0Var.f8207b;
                        t0VarC.getClass();
                        if (i11 == rVar.N) {
                            int iY = rVar.H[i11].y();
                            while (i12 < arrayList.size() && ((k) arrayList.get(i12)).v != iY) {
                                i12++;
                            }
                            if (i12 < arrayList.size()) {
                                t0Var = ((k) arrayList.get(i12)).d;
                            } else {
                                t0Var = rVar.R;
                                t0Var.getClass();
                            }
                            t0VarC = t0VarC.c(t0Var);
                        }
                        u0Var.f8207b = t0VarC;
                    }
                    return iZ;
                }
            }
        }
        return -3;
    }
}
