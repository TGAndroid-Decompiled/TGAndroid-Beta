package oh;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.n41;
import r0.m1;

public final class p implements Utilities.Callback5, Utilities.Callback5Return, r0.o {

    public final r f19544a;

    @Override
    public m1 I0(View view, m1 m1Var) {
        this.f19544a.V(m1Var.f46619a.f(519).d);
        return m1.f46618b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.f19544a.getClass();
        return Boolean.FALSE;
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        r.U(this.f19544a, (n41) obj);
    }
}
