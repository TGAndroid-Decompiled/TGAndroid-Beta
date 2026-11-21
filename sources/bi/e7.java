package bi;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.o41;
public final class e7 implements di.m4, v10 {
    public final k8 f3593a;

    @Override
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        k8.c0(this.f3593a, tL_starGiftUnique, j3, z10);
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        k8.e0(this.f3593a, (o41) obj);
    }
}
