package defpackage;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public final class k79 implements Iterable {
    public final x46 a;

    public k79(j79 j79Var, Interpolator interpolator, long j) {
        this.a = new x46(new wk4(this, j79Var, false, (byte) 23), interpolator, j);
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
