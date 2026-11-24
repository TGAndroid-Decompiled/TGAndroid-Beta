package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
public final class cc3 implements lh5 {
    public final fc3 a;

    public cc3(fc3 fc3Var) {
        this.a = fc3Var;
    }

    @Override
    public final void a() {
        this.a.e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, de deVar, boolean z) {
        boolean z2;
        boolean f;
        fc3 fc3Var = this.a;
        HashMap hashMap = fc3Var.d;
        if (fc3Var.J == null) {
            rg5 rg5Var = fc3Var.y;
            if (rg5Var != null && rg5Var.k) {
                z2 = true;
            } else {
                z2 = false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ec3 ec3Var = (ec3) hashMap.get(uri);
            ec3Var.getClass();
            nh5 nh5Var = ec3Var.a;
            int size = nh5Var.b.size();
            v7c n = yo5.q(nh5Var.b.values()).n();
            int i = 0;
            while (n.hasNext()) {
                if (fc3Var.e(elapsedRealtime, (Uri) n.next())) {
                    i++;
                }
            }
            int size2 = fc3Var.E.size();
            ko5 listIterator = fc3Var.E.listIterator(0);
            int i2 = 0;
            while (listIterator.hasNext()) {
                nh5 nh5Var2 = (nh5) listIterator.next();
                if (z2) {
                    f = fc3Var.e(elapsedRealtime, nh5Var2.b());
                } else {
                    f = fc3Var.f(nh5Var2, elapsedRealtime);
                }
                if (f) {
                    i2++;
                }
            }
            ba6 ba6Var = new ba6(z2, size, i, size2, i2);
            fc3Var.c.getClass();
            ca6 u3 = k4f.u3(ba6Var, deVar);
            if (u3 != null) {
                long j = u3.b;
                if (z2 && u3.a == 1) {
                    rg5 rg5Var2 = fc3Var.y;
                    rg5Var2.getClass();
                    return rg5Var2.a(j);
                }
                ec3 ec3Var2 = (ec3) hashMap.get(uri);
                if (ec3Var2 != null) {
                    return ec3Var2.a(j, uri, null);
                }
            }
        }
        return false;
    }
}
