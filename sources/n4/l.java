package n4;

import android.net.Uri;
import h3.t0;
import java.util.ArrayList;
import java.util.List;
import o8.z;
public final class l extends m {
    public final j f18428n;
    public final n2.p f18429r;

    public l(t0 t0Var, z zVar, r rVar, ArrayList arrayList, List list, List list2) {
        super(t0Var, zVar, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) zVar.get(0)).f18387a);
        long j10 = rVar.f18445e;
        if (j10 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, j10, null);
        }
        this.f18428n = jVar;
        this.f18429r = jVar == null ? new n2.p(new j(0L, -1L, null), 1) : null;
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final m4.h c() {
        return this.f18429r;
    }

    @Override
    public final j d() {
        return this.f18428n;
    }
}
