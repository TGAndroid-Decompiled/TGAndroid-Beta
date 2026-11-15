package l2;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class i implements t0 {
    public static i h;
    public boolean f19040a;
    public boolean f19041b;
    public final Object f19042c;
    public final Object d;
    public Object f19043e;
    public Object f19044f;

    public i() {
        this.f19042c = new ArrayList();
        this.d = new ArrayList();
        this.f19043e = new wi.p(this);
    }

    public static i d() {
        if (h == null) {
            h = new i();
        }
        return h;
    }

    public static void g(String str) {
        Log.d("PIP_DEBUG", "[utils.pip] " + str);
    }

    @Override
    public long a() {
        if (this.f19040a) {
            return ((q1) this.f19042c).a();
        }
        t0 t0Var = (t0) this.f19044f;
        t0Var.getClass();
        return t0Var.a();
    }

    @Override
    public boolean b() {
        if (this.f19040a) {
            ((q1) this.f19042c).getClass();
            return false;
        }
        t0 t0Var = (t0) this.f19044f;
        t0Var.getClass();
        return t0Var.b();
    }

    public wi.n c() {
        ArrayList arrayList = (ArrayList) this.f19042c;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            wi.n nVar = (wi.n) arrayList.get(i7);
            if (nVar.e()) {
                return nVar;
            }
        }
        return null;
    }

    @Override
    public void e(e2.w0 w0Var) {
        t0 t0Var = (t0) this.f19044f;
        if (t0Var != null) {
            t0Var.e(w0Var);
            w0Var = ((t0) this.f19044f).j();
        }
        ((q1) this.f19042c).e(w0Var);
    }

    public void f() {
        ((wi.p) this.f19043e).j();
    }

    public void h(b bVar) {
        t0 t0Var;
        t0 h7 = bVar.h();
        if (h7 != null && h7 != (t0Var = (t0) this.f19044f)) {
            if (t0Var == null) {
                this.f19044f = h7;
                this.f19043e = bVar;
                h7.e((e2.w0) ((q1) this.f19042c).f19169e);
                return;
            }
            throw new l(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public void i(wi.n nVar, int i7) {
        g("dismissed, prevState=" + i7);
        ((ArrayList) this.f19042c).remove(nVar);
        wi.p pVar = (wi.p) this.f19043e;
        if (nVar == pVar.f59434e) {
            pVar.f59434e = null;
        }
        if (nVar == pVar.f59435f) {
            wi.o oVar = pVar.f59436g;
            View view = pVar.h;
            pVar.f59435f = null;
            pVar.f59436g = null;
            pVar.h = null;
            wi.q qVar = pVar.f59433c;
            if (qVar != null) {
                qVar.a(null, null);
            }
            if (oVar != null) {
                SurfaceTexture surfaceTexture = oVar.f59428a;
                oVar.f59428a = null;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
            }
            if (view != null) {
                nVar.f59422a.x(view);
            }
            LaunchActivity launchActivity = pVar.f59432b;
            if (launchActivity != null && pVar.f59437i && org.telegram.messenger.g0.H1(launchActivity)) {
                pVar.f59432b.moveTaskToBack(false);
            }
            pVar.f59437i = false;
            bg.u0 u0Var = pVar.d;
            if (u0Var != null) {
                u0Var.c(false);
            }
        }
        f();
    }

    @Override
    public e2.w0 j() {
        t0 t0Var = (t0) this.f19044f;
        if (t0Var != null) {
            return t0Var.j();
        }
        return (e2.w0) ((q1) this.f19042c).f19169e;
    }

    public wi.n k(wi.l lVar) {
        wi.n nVar = new wi.n(this, lVar);
        ((ArrayList) this.f19042c).add(nVar);
        g("register " + lVar);
        f();
        return nVar;
    }

    public i(o0 o0Var, h2.g0 g0Var) {
        this.d = o0Var;
        ?? obj = new Object();
        obj.d = g0Var;
        obj.f19169e = e2.w0.d;
        this.f19042c = obj;
        this.f19040a = true;
    }
}
