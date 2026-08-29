package eg;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.st;
public final class m2 implements al0, rt {
    public final int f6092a;
    public final int f6093b;
    public final KeyEvent.Callback f6094c;
    public final Object d;

    public m2(w2 w2Var, int i10, c6 c6Var, int i11) {
        this.f6094c = w2Var;
        this.f6092a = i10;
        this.d = c6Var;
        this.f6093b = i11;
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        int i11 = this.f6093b;
        w2.Q((w2) this.f6094c, this.f6092a, (c6) this.d, i11, view);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void run(String str) {
        st.k((st) this.f6094c, this.f6092a, this.f6093b, (Runnable) this.d, str);
    }

    public m2(st stVar, int i10, int i11, Runnable runnable) {
        this.f6094c = stVar;
        this.f6092a = i10;
        this.f6093b = i11;
        this.d = runnable;
    }

    @Override
    public void o0(View view, float f9, float f10) {
    }
}
