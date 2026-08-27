package cg;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.qk0;

public final class o2 implements qk0, kt {

    public final int f2790a;

    public final int f2791b;

    public final KeyEvent.Callback f2792c;
    public final Object d;

    public o2(y2 y2Var, int i10, c6 c6Var, int i11) {
        this.f2792c = y2Var;
        this.f2790a = i10;
        this.d = c6Var;
        this.f2791b = i11;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        y2.Q((y2) this.f2792c, this.f2790a, (c6) this.d, this.f2791b, view);
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void run(String str) {
        lt.k((lt) this.f2792c, this.f2790a, this.f2791b, (Runnable) this.d, str);
    }

    public o2(lt ltVar, int i10, int i11, Runnable runnable) {
        this.f2792c = ltVar;
        this.f2790a = i10;
        this.f2791b = i11;
        this.d = runnable;
    }

    @Override
    public void c0(View view, float f10, float f11) {
    }
}
