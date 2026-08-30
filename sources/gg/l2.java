package gg;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.vt;
public final class l2 implements jl0, ut {
    public final int f6709a;
    public final int f6710b;
    public final KeyEvent.Callback f6711c;
    public final Object d;

    public l2(v2 v2Var, int i10, f6 f6Var, int i11) {
        this.f6711c = v2Var;
        this.f6709a = i10;
        this.d = f6Var;
        this.f6710b = i11;
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        int i11 = this.f6710b;
        v2.Q((v2) this.f6711c, this.f6709a, (f6) this.d, i11, view);
    }

    @Override
    public boolean e1(View view) {
        return false;
    }

    @Override
    public void run(String str) {
        vt.k((vt) this.f6711c, this.f6709a, this.f6710b, (Runnable) this.d, str);
    }

    public l2(vt vtVar, int i10, int i11, Runnable runnable) {
        this.f6711c = vtVar;
        this.f6709a = i10;
        this.f6710b = i11;
        this.d = runnable;
    }

    @Override
    public void o0(View view, float f10, float f11) {
    }
}
