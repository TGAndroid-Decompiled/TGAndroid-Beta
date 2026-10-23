package m2;

import android.net.Uri;
import b2.w;
import e9.n0;
import java.util.ArrayList;
import java.util.List;
public final class l extends m {
    public final j f16513n;
    public final l2.f f16514r;

    public l(w wVar, n0 n0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(wVar, n0Var, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) n0Var.get(0)).f16475a);
        long j10 = rVar.e;
        if (j10 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, j10, null);
        }
        this.f16513n = jVar;
        this.f16514r = jVar == null ? new l2.f(new j(0L, -1L, null), 2) : null;
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final l2.i d() {
        return this.f16514r;
    }

    @Override
    public final j h() {
        return this.f16513n;
    }
}
