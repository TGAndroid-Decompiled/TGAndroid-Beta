package ne;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import mi.q;
public final class l implements Iterable {
    public final j f17409a;

    public l(k kVar, Interpolator interpolator, long j10) {
        this.f17409a = new j(new q(this, kVar, false, 5), interpolator, j10);
    }

    public final void h(Object obj, boolean z10) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.f17409a.q(list, z10);
    }

    @Override
    public final Iterator iterator() {
        return this.f17409a.f17406b.iterator();
    }
}
