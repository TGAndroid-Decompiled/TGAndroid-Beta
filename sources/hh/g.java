package hh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.n41;
import org.telegram.ui.zf1;

public final class g implements org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {

    public final r f9290a;

    public g(r rVar) {
        this.f9290a = rVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        r rVar = this.f9290a;
        rVar.getClass();
        rVar.presentFragment(new zf1(6, null));
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f9290a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        r.W(this.f9290a, (n41) obj);
    }
}
