package me;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n4.x;
public final class l implements Iterable {
    public final j f16368a;

    public l(k kVar, Interpolator interpolator, long j3) {
        this.f16368a = new j(new x(this, kVar, false, 26), interpolator, j3);
    }

    public final void i(Object obj, boolean z10) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.f16368a.r(list, z10);
    }

    @Override
    public final Iterator iterator() {
        return this.f16368a.f16364b.iterator();
    }
}
