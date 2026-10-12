package fi;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.u61;
import r0.k1;
public final class j implements Utilities.Callback5, Utilities.Callback5Return, r0.n, MessagesStorage.BooleanCallback {
    public final p f9980a;

    public j(p pVar) {
        this.f9980a = pVar;
    }

    @Override
    public k1 M0(View view, k1 k1Var) {
        i0.b f7 = k1Var.f47000a.f(519);
        this.f9980a.d.setPadding(0, f7.f11575b, 0, f7.d);
        return k1.f46999b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(p.U(this.f9980a, (u61) obj, (View) obj2));
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        p.V(this.f9980a, (u61) obj);
    }

    @Override
    public void run(boolean z10) {
        p pVar = this.f9980a;
        pVar.finishFragment();
        pVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-pVar.f10020b), null, pVar.H, Boolean.valueOf(z10));
    }
}
