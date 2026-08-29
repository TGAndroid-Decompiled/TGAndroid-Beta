package ih;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.w41;
public final class e4 implements jh.s3, Utilities.Callback5, Utilities.Callback5Return {
    public final r5 f9124a;

    @Override
    public void d(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        r5.U(this.f9124a, tL_starGiftUnique, j10, z10);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        w41 w41Var = (w41) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f9124a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        r5.Y(this.f9124a, (w41) obj);
    }
}
