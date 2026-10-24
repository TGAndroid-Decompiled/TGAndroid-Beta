package ai;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l61;
import org.telegram.ui.ag1;
public final class k implements org.telegram.ui.ActionBar.z1, Utilities.Callback5, Utilities.Callback5Return {
    public final x f1595a;

    public k(x xVar) {
        this.f1595a = xVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        x xVar = this.f1595a;
        xVar.getClass();
        xVar.presentFragment(new ag1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        l61 l61Var = (l61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f1595a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        x.W(this.f1595a, (l61) obj);
    }
}
