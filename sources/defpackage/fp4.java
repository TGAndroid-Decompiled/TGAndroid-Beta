package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
public final class fp4 extends jke implements ufc, e36, es9, lq4 {
    public final Activity a;
    public final Context b;
    public final Handler c;
    public final iq4 d;
    public final gp4 e;

    public fp4(gp4 gp4Var) {
        this.e = gp4Var;
        Handler handler = new Handler();
        this.a = gp4Var;
        this.b = gp4Var;
        this.c = handler;
        this.d = new hq4();
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
    public final tfc f() {
        return this.e.f();
    }

    @Override
    public final op g() {
        return (op) this.e.e.d;
    }

    @Override
    public final g36 m() {
        return this.e.L;
    }

    @Override
    public final void a() {
    }
}
