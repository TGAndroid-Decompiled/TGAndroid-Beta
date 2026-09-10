package m2;

import android.net.Uri;
import e9.i0;
import java.util.ArrayList;
import java.util.List;
public final class l extends m {
    public final j f13266n;
    public final a4.m f13267r;

    public l(b2.s sVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(sVar, i0Var, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) i0Var.get(0)).f13228a);
        long j3 = rVar.e;
        if (j3 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, j3, null);
        }
        this.f13266n = jVar;
        this.f13267r = jVar == null ? new a4.m(new j(0L, -1L, null), 28) : null;
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final l2.j d() {
        return this.f13267r;
    }

    @Override
    public final j e() {
        return this.f13266n;
    }
}
