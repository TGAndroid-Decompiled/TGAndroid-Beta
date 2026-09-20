package le;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public final class l implements Iterable {
    public final j f14192a;

    public l(k kVar, Interpolator interpolator, long j3) {
        this.f14192a = new j(new of.b(27, this, kVar), interpolator, j3);
    }

    public final void i(Object obj, boolean z10) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.f14192a.r(list, z10);
    }

    @Override
    public final Iterator iterator() {
        return this.f14192a.f14189b.iterator();
    }
}
