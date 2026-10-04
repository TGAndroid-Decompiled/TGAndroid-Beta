package fi;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g61;
import r0.l1;
public final class j implements Utilities.Callback5, Utilities.Callback5Return, r0.n, MessagesStorage.BooleanCallback {
    public final p f9907a;

    public j(p pVar) {
        this.f9907a = pVar;
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        i0.b f7 = l1Var.f45617a.f(519);
        this.f9907a.d.setPadding(0, f7.f11527b, 0, f7.d);
        return l1.f45616b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(p.S(this.f9907a, (g61) obj, (View) obj2));
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        p.T(this.f9907a, (g61) obj);
    }

    @Override
    public void run(boolean z10) {
        p pVar = this.f9907a;
        pVar.finishFragment();
        pVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-pVar.f9947b), null, pVar.H, Boolean.valueOf(z10));
    }
}
