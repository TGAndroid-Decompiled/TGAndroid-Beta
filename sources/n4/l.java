package n4;

import android.net.Uri;
import h3.t0;
import java.util.ArrayList;
import java.util.List;
import p8.z;

public final class l extends m {

    public final j f18255n;

    public final n1.d f18256r;

    public l(t0 t0Var, z zVar, r rVar, ArrayList arrayList, List list, List list2) {
        super(t0Var, zVar, rVar, arrayList, list, list2);
        Uri.parse(((b) zVar.get(0)).f18214a);
        long j10 = rVar.f18272e;
        j jVar = j10 <= 0 ? null : new j(rVar.d, j10, null);
        this.f18255n = jVar;
        this.f18256r = jVar == null ? new n1.d(new j(0L, -1L, null), 2) : null;
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final m4.h c() {
        return this.f18256r;
    }

    @Override
    public final j d() {
        return this.f18255n;
    }
}
