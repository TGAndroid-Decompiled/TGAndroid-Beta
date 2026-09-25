package le;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n4.y;
public final class m implements Iterable {
    public final k f14223a;

    public m(l lVar, Interpolator interpolator, long j3) {
        this.f14223a = new k(new y(this, lVar, false, 23), interpolator, j3);
    }

    public final void i(Object obj, boolean z10) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.f14223a.r(list, z10);
    }

    @Override
    public final Iterator iterator() {
        return this.f14223a.f14220b.iterator();
    }
}
