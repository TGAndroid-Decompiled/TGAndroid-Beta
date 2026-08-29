package jh;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w41;
import org.telegram.ui.cg1;
public final class g implements org.telegram.ui.ActionBar.b2, Utilities.Callback5, Utilities.Callback5Return {
    public final q f12087a;

    public g(q qVar) {
        this.f12087a = qVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        q qVar = this.f12087a;
        qVar.getClass();
        qVar.presentFragment(new cg1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        w41 w41Var = (w41) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f12087a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        q.W(this.f12087a, (w41) obj);
    }
}
