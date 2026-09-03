package gg;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.ut;
public final class l2 implements il0, tt {
    public final int f6696a;
    public final int f6697b;
    public final KeyEvent.Callback f6698c;
    public final Object d;

    public l2(v2 v2Var, int i10, f6 f6Var, int i11) {
        this.f6698c = v2Var;
        this.f6696a = i10;
        this.d = f6Var;
        this.f6697b = i11;
    }

    @Override
    public boolean Z0(View view) {
        return false;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        int i11 = this.f6697b;
        v2.Q((v2) this.f6698c, this.f6696a, (f6) this.d, i11, view);
    }

    @Override
    public void run(String str) {
        ut.k((ut) this.f6698c, this.f6696a, this.f6697b, (Runnable) this.d, str);
    }

    public l2(ut utVar, int i10, int i11, Runnable runnable) {
        this.f6698c = utVar;
        this.f6696a = i10;
        this.f6697b = i11;
        this.d = runnable;
    }

    @Override
    public void n0(View view, float f10, float f11) {
    }
}
