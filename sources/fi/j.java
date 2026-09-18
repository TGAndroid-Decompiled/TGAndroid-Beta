package fi;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.x51;
import r0.m1;
public final class j implements Utilities.Callback5, Utilities.Callback5Return, r0.n, MessagesStorage.BooleanCallback {
    public final p f9117a;

    public j(p pVar) {
        this.f9117a = pVar;
    }

    @Override
    public m1 Q0(View view, m1 m1Var) {
        i0.b f7 = m1Var.f42109a.f(519);
        this.f9117a.d.setPadding(0, f7.f10592b, 0, f7.d);
        return m1.f42108b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(p.U(this.f9117a, (x51) obj, (View) obj2));
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        p.V(this.f9117a, (x51) obj);
    }

    @Override
    public void run(boolean z10) {
        p pVar = this.f9117a;
        pVar.finishFragment();
        pVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-pVar.f9152b), null, pVar.H, Boolean.valueOf(z10));
    }
}
