package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
public final class dn4 extends iie implements tdc, e16, dq9, ko4 {
    public final Activity a;
    public final Context b;
    public final Handler c;
    public final ho4 d;
    public final en4 e;

    public dn4(en4 en4Var) {
        this.e = en4Var;
        Handler handler = new Handler();
        this.a = en4Var;
        this.b = en4Var;
        this.c = handler;
        this.d = new go4();
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
    public final sdc f() {
        return this.e.f();
    }

    @Override
    public final oo g() {
        return (oo) this.e.e.d;
    }

    @Override
    public final g16 m() {
        return this.e.L;
    }

    @Override
    public final void a() {
    }
}
