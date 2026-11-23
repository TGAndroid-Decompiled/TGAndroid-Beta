package bi;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.n41;
public final class g7 implements di.m4, u10 {
    public final m8 f3620a;

    @Override
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        m8.c0(this.f3620a, tL_starGiftUnique, j3, z10);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        m8.e0(this.f3620a, (n41) obj);
    }
}
