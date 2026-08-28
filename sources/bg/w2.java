package bg;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.nk0;
public final class w2 implements nk0, lt {
    public final int f1986a;
    public final int f1987b;
    public final KeyEvent.Callback f1988c;
    public final Object d;

    public w2(g3 g3Var, int i9, b6 b6Var, int i10) {
        this.f1988c = g3Var;
        this.f1986a = i9;
        this.d = b6Var;
        this.f1987b = i10;
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        int i10 = this.f1987b;
        g3.P((g3) this.f1988c, this.f1986a, (b6) this.d, i10, view);
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void run(String str) {
        mt.k((mt) this.f1988c, this.f1986a, this.f1987b, (Runnable) this.d, str);
    }

    public w2(mt mtVar, int i9, int i10, Runnable runnable) {
        this.f1988c = mtVar;
        this.f1986a = i9;
        this.f1987b = i10;
        this.d = runnable;
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }
}
