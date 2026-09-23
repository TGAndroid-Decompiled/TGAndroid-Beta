package m2;

import android.net.Uri;
import e9.i0;
import java.util.ArrayList;
import java.util.List;
import k2.u;
public final class l extends m {
    public final j f14416n;
    public final u f14417r;

    public l(b2.s sVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(sVar, i0Var, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) i0Var.get(0)).f14378a);
        long j3 = rVar.e;
        if (j3 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, j3, null);
        }
        this.f14416n = jVar;
        this.f14417r = jVar == null ? new u(new j(0L, -1L, null), 5) : null;
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final l2.h d() {
        return this.f14417r;
    }

    @Override
    public final j e() {
        return this.f14416n;
    }
}
