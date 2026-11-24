package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class yc3 implements fm6 {
    public static yc3 h;
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public yc3() {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new efb(this);
    }

    public static yc3 c() {
        yc3 yc3Var = h;
        if (yc3Var == null) {
            yc3 yc3Var2 = new yc3();
            h = yc3Var2;
            return yc3Var2;
        }
        return yc3Var;
    }

    public static void e(String str) {
        Log.d("PIP_DEBUG", "[utils.pip] ".concat(str));
    }

    public final ad8 a() {
        ArrayList arrayList = (ArrayList) this.c;
        for (int i = 0; i < arrayList.size(); i++) {
            ad8 ad8Var = (ad8) arrayList.get(i);
            if (ad8Var.f()) {
                return ad8Var;
            }
        }
        return null;
    }

    @Override
    public final void b(ce8 ce8Var) {
        fm6 fm6Var = (fm6) this.f;
        if (fm6Var != null) {
            fm6Var.b(ce8Var);
            ce8Var = ((fm6) this.f).g();
        }
        ((tf2) this.c).b(ce8Var);
    }

    public final void d() {
        ((efb) this.e).j();
    }

    public final void f(uh0 uh0Var) {
        fm6 fm6Var;
        fm6 k = uh0Var.k();
        if (k != null && k != (fm6Var = (fm6) this.f)) {
            if (fm6Var == null) {
                this.f = k;
                this.e = uh0Var;
                k.b((ce8) ((tf2) this.c).e);
                return;
            }
            throw new u64(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    @Override
    public final ce8 g() {
        fm6 fm6Var = (fm6) this.f;
        if (fm6Var != null) {
            return fm6Var.g();
        }
        return (ce8) ((tf2) this.c).e;
    }

    @Override
    public final long h() {
        if (this.a) {
            return ((tf2) this.c).h();
        }
        fm6 fm6Var = (fm6) this.f;
        fm6Var.getClass();
        return fm6Var.h();
    }

    @Override
    public final boolean i() {
        if (this.a) {
            return false;
        }
        fm6 fm6Var = (fm6) this.f;
        fm6Var.getClass();
        return fm6Var.i();
    }

    public final void j(ad8 ad8Var, int i) {
        e("dismissed, prevState=" + i);
        ((ArrayList) this.c).remove(ad8Var);
        efb efbVar = (efb) this.e;
        if (ad8Var == efbVar.e) {
            efbVar.e = null;
        }
        if (ad8Var == efbVar.f) {
            bd8 bd8Var = efbVar.g;
            View view = efbVar.h;
            efbVar.f = null;
            efbVar.g = null;
            efbVar.h = null;
            hfb hfbVar = efbVar.c;
            if (hfbVar != null) {
                hfbVar.a(null, null);
            }
            if (bd8Var != null) {
                SurfaceTexture surfaceTexture = bd8Var.a;
                bd8Var.a = null;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
            }
            if (view != null) {
                ad8Var.a.K(view);
            }
            LaunchActivity launchActivity = efbVar.b;
            if (launchActivity != null && efbVar.i && gm.F1(launchActivity)) {
                efbVar.b.moveTaskToBack(false);
            }
            efbVar.i = false;
            a26 a26Var = efbVar.d;
            if (a26Var != null) {
                a26Var.b(false);
            }
        }
        d();
    }

    public final ad8 k(vc8 vc8Var) {
        ad8 ad8Var = new ad8(this, vc8Var);
        ((ArrayList) this.c).add(ad8Var);
        e("register " + vc8Var);
        d();
        return ad8Var;
    }

    public yc3(r74 r74Var, bfb bfbVar) {
        this.d = r74Var;
        ?? obj = new Object();
        obj.d = bfbVar;
        obj.e = ce8.d;
        this.c = obj;
        this.a = true;
    }
}
