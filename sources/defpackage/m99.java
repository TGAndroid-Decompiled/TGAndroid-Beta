package defpackage;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public final class m99 implements Iterable {
    public final x66 a;

    public m99(l99 l99Var, Interpolator interpolator, long j) {
        this.a = new x66(new wm4(this, l99Var, false, (byte) 23), interpolator, j);
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
