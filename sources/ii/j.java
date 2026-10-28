package ii;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.u61;
import r0.k1;
public final class j implements Utilities.Callback5, Utilities.Callback5Return, r0.n, MessagesStorage.BooleanCallback {
    public final o f14356a;

    public j(o oVar) {
        this.f14356a = oVar;
    }

    @Override
    public k1 P0(View view, k1 k1Var) {
        i0.b f7 = k1Var.f47153a.f(519);
        this.f14356a.e.setPadding(0, f7.f13450b, 0, f7.d);
        return k1.f47152b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(o.V(this.f14356a, (u61) obj, (View) obj2));
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        o.W(this.f14356a, (u61) obj);
    }

    @Override
    public void run(boolean z10) {
        o oVar = this.f14356a;
        oVar.finishFragment();
        oVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-oVar.f14391c), null, oVar.I, Boolean.valueOf(z10));
    }
}
