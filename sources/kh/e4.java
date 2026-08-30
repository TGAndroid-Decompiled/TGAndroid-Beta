package kh;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i51;
public final class e4 implements lh.r3, Utilities.Callback5, Utilities.Callback5Return {
    public final r5 f10562a;

    @Override
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z4) {
        r5.U(this.f10562a, tL_starGiftUnique, j10, z4);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f10562a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        r5.Y(this.f10562a, (i51) obj);
    }
}
