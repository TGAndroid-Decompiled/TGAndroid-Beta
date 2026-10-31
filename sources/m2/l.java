package m2;

import android.net.Uri;
import b2.x;
import e9.n0;
import java.util.ArrayList;
import java.util.List;
public final class l extends m {
    public final j f12665n;
    public final t f12666r;

    public l(x xVar, n0 n0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(xVar, n0Var, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) n0Var.get(0)).f12627a);
        long j10 = rVar.e;
        if (j10 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, null, j10);
        }
        this.f12665n = jVar;
        this.f12666r = jVar == null ? new t(new j(0L, null, -1L), 0) : null;
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final l2.i d() {
        return this.f12666r;
    }

    @Override
    public final j h() {
        return this.f12665n;
    }
}
