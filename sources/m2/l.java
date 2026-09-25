package m2;

import android.net.Uri;
import e9.i0;
import java.util.ArrayList;
import java.util.List;
public final class l extends m {
    public final j f14669n;
    public final l.d f14670r;

    public l(b2.s sVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(sVar, i0Var, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) i0Var.get(0)).f14631a);
        long j3 = rVar.e;
        if (j3 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, j3, null);
        }
        this.f14669n = jVar;
        this.f14670r = jVar == null ? new l.d(new j(0L, -1L, null)) : null;
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final l2.h d() {
        return this.f14670r;
    }

    @Override
    public final j e() {
        return this.f14669n;
    }
}
