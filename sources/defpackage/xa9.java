package defpackage;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public final class xa9 implements Iterable {
    public final b76 a;

    public xa9(wa9 wa9Var, Interpolator interpolator, long j) {
        this.a = new b76(new um4(this, wa9Var, false, (byte) 24), interpolator, j);
    }

    public final void h(Object obj, boolean z) {
        List list;
        if (obj != null) {
            list = Collections.singletonList(obj);
        } else {
            list = null;
        }
        this.a.m(list, z);
    }

    @Override
    public final Iterator iterator() {
        return this.a.b.iterator();
    }
}
