package oe;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m4.w1;
public final class l implements Iterable {
    public final j f19350a;

    public l(k kVar, Interpolator interpolator, long j10) {
        this.f19350a = new j(new w1(this, kVar, false, 7), interpolator, j10);
    }

    public final void h(Object obj, boolean z10) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.f19350a.q(list, z10);
    }

    @Override
    public final Iterator iterator() {
        return this.f19350a.f19347b.iterator();
    }
}
