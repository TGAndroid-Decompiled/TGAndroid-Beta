package m2;

import android.net.Uri;
import b2.x;
import e9.n0;
import java.util.ArrayList;
import java.util.List;
import ji.w4;
public final class l extends m {
    public final j f15356n;
    public final w4 f15357r;

    public l(x xVar, n0 n0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(xVar, n0Var, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) n0Var.get(0)).f15318a);
        long j10 = rVar.e;
        if (j10 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, j10, null);
        }
        this.f15356n = jVar;
        this.f15357r = jVar == null ? new w4(new j(0L, -1L, null), 6) : null;
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final l2.i d() {
        return this.f15357r;
    }

    @Override
    public final j f() {
        return this.f15356n;
    }
}
