package ai;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.s10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.r31;
public final class b5 implements ci.s4, s10 {
    public final i6 f528a;

    @Override
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        i6.Z(this.f528a, tL_starGiftUnique, j10, z10);
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        i6.d0(this.f528a, (r31) obj);
    }
}
