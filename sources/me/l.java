package me;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public final class l implements Iterable {
    public final j f16392a;

    public l(k kVar, Interpolator interpolator, long j3) {
        this.f16392a = new j(new pf.b(27, this, kVar), interpolator, j3);
    }

    public final void i(Object obj, boolean z10) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.f16392a.r(list, z10);
    }

    @Override
    public final Iterator iterator() {
        return this.f16392a.f16388b.iterator();
    }
}
