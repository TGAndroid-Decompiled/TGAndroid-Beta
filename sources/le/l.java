package le;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n4.y;
public final class l implements Iterable {
    public final j f15422a;

    public l(k kVar, Interpolator interpolator, long j3) {
        this.f15422a = new j(new y(this, kVar, false, 23), interpolator, j3);
    }

    public final void i(Object obj, boolean z10) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.f15422a.r(list, z10);
    }

    @Override
    public final Iterator iterator() {
        return this.f15422a.f15418b.iterator();
    }
}
