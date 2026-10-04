package m2;

import android.net.Uri;
import e9.i0;
import java.util.ArrayList;
import java.util.List;
public final class l extends m {
    public final j f16011n;
    public final a4.m f16012r;

    public l(b2.s sVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(sVar, i0Var, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) i0Var.get(0)).f15969a);
        long j3 = rVar.f16028e;
        if (j3 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, j3, null);
        }
        this.f16011n = jVar;
        this.f16012r = jVar == null ? new a4.m(new j(0L, -1L, null), 29) : null;
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final l2.i c() {
        return this.f16012r;
    }

    @Override
    public final j d() {
        return this.f16011n;
    }
}
