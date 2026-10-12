package ne;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public final class l implements Iterable {
    public final j f16315a;

    public l(k kVar, Interpolator interpolator, long j10) {
        this.f16315a = new j(new m4.c(this, kVar, false, 7), interpolator, j10);
    }

    public final void h(Object obj, boolean z10) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.f16315a.q(list, z10);
    }

    @Override
    public final Iterator iterator() {
        return this.f16315a.f16312b.iterator();
    }
}
