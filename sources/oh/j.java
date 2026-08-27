package oh;

import android.view.View;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.n41;
import r0.m1;

public final class j implements Utilities.Callback5, Utilities.Callback5Return, r0.o, MessagesStorage.BooleanCallback {

    public final o f19497a;

    public j(o oVar) {
        this.f19497a = oVar;
    }

    @Override
    public m1 I0(View view, m1 m1Var) {
        i0.c cVarF = m1Var.f46619a.f(519);
        this.f19497a.d.setPadding(0, cVarF.f10490b, 0, cVarF.d);
        return m1.f46618b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(o.U(this.f19497a, (n41) obj, (View) obj2));
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        o.V(this.f19497a, (n41) obj);
    }

    @Override
    public void run(boolean z10) {
        o oVar = this.f19497a;
        oVar.finishFragment();
        oVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-oVar.f19532b), null, oVar.D, Boolean.valueOf(z10));
    }
}
