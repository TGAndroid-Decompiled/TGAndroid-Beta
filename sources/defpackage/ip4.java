package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
public final class ip4 extends ane implements shc, i36, vt9, oq4 {
    public final Activity a;
    public final Context b;
    public final Handler c;
    public final lq4 d;
    public final jp4 e;

    public ip4(jp4 jp4Var) {
        this.e = jp4Var;
        Handler handler = new Handler();
        this.a = jp4Var;
        this.b = jp4Var;
        this.c = handler;
        this.d = new kq4();
    }

    @Override
    public final View b(int i) {
        return this.e.findViewById(i);
    }

    @Override
    public final boolean c() {
        Window window = this.e.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override
    public final rhc f() {
        return this.e.f();
    }

    @Override
    public final po g() {
        return (po) this.e.e.d;
    }

    @Override
    public final k36 m() {
        return this.e.L;
    }

    @Override
    public final void a() {
    }
}
