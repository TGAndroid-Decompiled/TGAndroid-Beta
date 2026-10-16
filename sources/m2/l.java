package m2;

import android.net.Uri;
import b2.x;
import e9.n0;
import java.util.ArrayList;
import java.util.List;
public final class l extends m {
    public final j f15091n;
    public final m.l f15092r;

    public l(x xVar, n0 n0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(xVar, n0Var, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) n0Var.get(0)).f15053a);
        long j10 = rVar.e;
        if (j10 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, j10, null);
        }
        this.f15091n = jVar;
        this.f15092r = jVar == null ? new m.l(new j(0L, -1L, null)) : null;
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final l2.h d() {
        return this.f15092r;
    }

    @Override
    public final j g() {
        return this.f15091n;
    }
}
