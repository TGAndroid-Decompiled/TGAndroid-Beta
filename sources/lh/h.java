package lh;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i51;
import org.telegram.ui.og1;
public final class h implements org.telegram.ui.ActionBar.c2, Utilities.Callback5, Utilities.Callback5Return {
    public final q f12524a;

    public h(q qVar) {
        this.f12524a = qVar;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        q qVar = this.f12524a;
        qVar.getClass();
        qVar.presentFragment(new og1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f12524a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        q.W(this.f12524a, (i51) obj);
    }
}
