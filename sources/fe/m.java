package fe;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public final class m implements Iterable {
    public final k f7047a;

    public m(l lVar, Interpolator interpolator, long j10) {
        this.f7047a = new k(new hf.b(this, lVar, false, 18), interpolator, j10);
    }

    @Override
    public final Iterator iterator() {
        return this.f7047a.f7044b.iterator();
    }

    public final void l(Object obj, boolean z10) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.f7047a.q(list, z10);
    }
}
