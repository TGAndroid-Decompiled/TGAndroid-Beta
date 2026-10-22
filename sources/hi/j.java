package hi;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h61;
import r0.k1;
public final class j implements Utilities.Callback5, Utilities.Callback5Return, r0.n, MessagesStorage.BooleanCallback {
    public final o f12161a;

    public j(o oVar) {
        this.f12161a = oVar;
    }

    @Override
    public k1 B0(View view, k1 k1Var) {
        i0.b f7 = k1Var.f44838a.f(519);
        this.f12161a.d.setPadding(0, f7.f12284b, 0, f7.d);
        return k1.f44837b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(o.U(this.f12161a, (h61) obj, (View) obj2));
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        o.V(this.f12161a, (h61) obj);
    }

    @Override
    public void run(boolean z10) {
        o oVar = this.f12161a;
        oVar.finishFragment();
        oVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-oVar.f12192b), null, oVar.H, Boolean.valueOf(z10));
    }
}
