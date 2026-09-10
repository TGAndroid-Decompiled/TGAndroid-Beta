package le;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public final class l implements Iterable {
    public final j f12892a;

    public l(k kVar, Interpolator interpolator, long j3) {
        this.f12892a = new j(new of.b(22, this, kVar), interpolator, j3);
    }

    public final void i(Object obj, boolean z10) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.f12892a.r(list, z10);
    }

    @Override
    public final Iterator iterator() {
        return this.f12892a.f12889b.iterator();
    }
}
