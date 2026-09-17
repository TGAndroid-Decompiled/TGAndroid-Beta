package m2;

import android.net.Uri;
import e9.i0;
import java.util.ArrayList;
import java.util.List;
import k2.g0;
public final class l extends m {
    public final j f15822n;
    public final g0 f15823r;

    public l(b2.s sVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(sVar, i0Var, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) i0Var.get(0)).f15780a);
        long j3 = rVar.f15839e;
        if (j3 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, j3, null);
        }
        this.f15822n = jVar;
        this.f15823r = jVar == null ? new g0(new j(0L, -1L, null), 2) : null;
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final l2.h d() {
        return this.f15823r;
    }

    @Override
    public final j h() {
        return this.f15822n;
    }
}
