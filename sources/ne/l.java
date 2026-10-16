package ne;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m2.t;
public final class l implements Iterable {
    public final j f16026a;

    public l(k kVar, Interpolator interpolator, long j10) {
        this.f16026a = new j(new t(this, kVar, false, 7), interpolator, j10);
    }

    public final void h(Object obj, boolean z10) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.f16026a.q(list, z10);
    }

    @Override
    public final Iterator iterator() {
        return this.f16026a.f16023b.iterator();
    }
}
