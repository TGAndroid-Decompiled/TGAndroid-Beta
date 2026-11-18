package bi;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l41;
public final class b7 implements di.m4, v10 {
    public final h8 f3469a;

    @Override
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        h8.c0(this.f3469a, tL_starGiftUnique, j3, z10);
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        h8.e0(this.f3469a, (l41) obj);
    }
}
