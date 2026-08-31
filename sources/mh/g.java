package mh;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j51;
import org.telegram.ui.qg1;
public final class g implements org.telegram.ui.ActionBar.c2, Utilities.Callback5, Utilities.Callback5Return {
    public final p f14061a;

    public g(p pVar) {
        this.f14061a = pVar;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        p pVar = this.f14061a;
        pVar.getClass();
        pVar.presentFragment(new qg1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        j51 j51Var = (j51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f14061a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        p.W(this.f14061a, (j51) obj);
    }
}
