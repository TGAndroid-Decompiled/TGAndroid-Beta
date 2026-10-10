package m2;

import android.net.Uri;
import e9.i0;
import java.util.ArrayList;
import java.util.List;
public final class l extends m {
    public final j f15954n;
    public final t f15955r;

    public l(b2.s sVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(sVar, i0Var, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) i0Var.get(0)).f15912a);
        long j3 = rVar.f15971e;
        if (j3 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, j3, null);
        }
        this.f15954n = jVar;
        this.f15955r = jVar == null ? new t(new j(0L, -1L, null), 0) : null;
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final l2.i c() {
        return this.f15955r;
    }

    @Override
    public final j e() {
        return this.f15954n;
    }
}
