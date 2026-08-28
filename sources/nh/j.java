package nh;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l41;
import r0.m1;
public final class j implements Utilities.Callback5, Utilities.Callback5Return, r0.o, MessagesStorage.BooleanCallback {
    public final o f18648a;

    public j(o oVar) {
        this.f18648a = oVar;
    }

    @Override
    public m1 L0(View view, m1 m1Var) {
        i0.b f10 = m1Var.f46929a.f(519);
        this.f18648a.d.setPadding(0, f10.f10849b, 0, f10.d);
        return m1.f46928b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(o.T(this.f18648a, (l41) obj, (View) obj2));
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        o.U(this.f18648a, (l41) obj);
    }

    @Override
    public void run(boolean z10) {
        o oVar = this.f18648a;
        oVar.finishFragment();
        oVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-oVar.f18683b), null, oVar.D, Boolean.valueOf(z10));
    }
}
