package m2;

import android.net.Uri;
import b2.x;
import f9.i0;
import java.util.ArrayList;
import java.util.List;
import jg.s0;
public final class l extends m {
    public final j f17970n;
    public final s0 f17971r;

    public l(x xVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(xVar, i0Var, rVar, arrayList, list, list2);
        j jVar;
        Uri.parse(((b) i0Var.get(0)).f17932a);
        long j10 = rVar.e;
        if (j10 <= 0) {
            jVar = null;
        } else {
            jVar = new j(rVar.d, j10, null);
        }
        this.f17970n = jVar;
        this.f17971r = jVar == null ? new s0(new j(0L, -1L, null), 9) : null;
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final l2.h c() {
        return this.f17971r;
    }

    @Override
    public final j d() {
        return this.f17970n;
    }
}
