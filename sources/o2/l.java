package o2;

import android.net.Uri;
import d2.v;
import g9.i0;
import gi.w5;
import java.util.ArrayList;
import java.util.List;
public final class l extends m {
    public final j f20551n;
    public final w5 f20552r;

    public l(v vVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(vVar, i0Var, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) i0Var.get(0)).f20509a);
        long j10 = rVar.f20568e;
        if (j10 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, null, j10);
        }
        this.f20551n = jVar;
        this.f20552r = jVar == null ? new w5(new j(0L, null, -1L), 19) : null;
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final n2.i c() {
        return this.f20552r;
    }

    @Override
    public final j d() {
        return this.f20551n;
    }
}
