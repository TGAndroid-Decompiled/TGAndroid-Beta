package defpackage;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.tl.TL_stars;
public final class lc9 implements ita, ncc {
    public final nd9 a;

    public lc9(nd9 nd9Var) {
        this.a = nd9Var;
    }

    @Override
    public final void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, boolean z) {
        this.a.j0(tL_starGiftUnique, j, z);
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.l0((b8c) obj);
    }
}
