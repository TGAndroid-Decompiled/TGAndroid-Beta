package defpackage;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.tl.TL_stars;
public final class bb9 implements ira, oac {
    public final zb9 a;

    @Override
    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, boolean z) {
        this.a.f0(tL_starGiftUnique, j, z);
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.g0((c6c) obj);
    }
}
