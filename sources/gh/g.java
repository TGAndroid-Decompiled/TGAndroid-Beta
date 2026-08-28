package gh;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l41;
import org.telegram.ui.ag1;
public final class g implements org.telegram.ui.ActionBar.b2, Utilities.Callback5, Utilities.Callback5Return {
    public final r f8089a;

    public g(r rVar) {
        this.f8089a = rVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        r rVar = this.f8089a;
        rVar.getClass();
        rVar.presentFragment(new ag1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        l41 l41Var = (l41) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f8089a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        r.V(this.f8089a, (l41) obj);
    }
}
