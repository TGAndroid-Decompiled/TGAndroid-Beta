package l2;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class i implements t0 {
    public static i h;
    public boolean f19404a;
    public boolean f19405b;
    public final Object f19406c;
    public final Object d;
    public Object f19407e;
    public Object f19408f;

    public i() {
        this.f19406c = new ArrayList();
        this.d = new ArrayList();
        this.f19407e = new wi.p(this);
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
        if (this.f19404a) {
            return ((q1) this.f19406c).a();
        }
        t0 t0Var = (t0) this.f19408f;
        t0Var.getClass();
        return t0Var.a();
    }

    @Override
    public boolean b() {
        if (this.f19404a) {
            ((q1) this.f19406c).getClass();
            return false;
        }
        t0 t0Var = (t0) this.f19408f;
        t0Var.getClass();
        return t0Var.b();
    }

    public wi.n c() {
        ArrayList arrayList = (ArrayList) this.f19406c;
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
        t0 t0Var = (t0) this.f19408f;
        if (t0Var != null) {
            t0Var.e(w0Var);
            w0Var = ((t0) this.f19408f).j();
        }
        ((q1) this.f19406c).e(w0Var);
    }

    public void f() {
        ((wi.p) this.f19407e).j();
    }

    public void h(b bVar) {
        t0 t0Var;
        t0 h7 = bVar.h();
        if (h7 != null && h7 != (t0Var = (t0) this.f19408f)) {
            if (t0Var == null) {
                this.f19408f = h7;
                this.f19407e = bVar;
                h7.e((e2.w0) ((q1) this.f19406c).f19533e);
                return;
            }
            throw new l(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public void i(wi.n nVar, int i7) {
        g("dismissed, prevState=" + i7);
        ((ArrayList) this.f19406c).remove(nVar);
        wi.p pVar = (wi.p) this.f19407e;
        if (nVar == pVar.f59999e) {
            pVar.f59999e = null;
        }
        if (nVar == pVar.f60000f) {
            wi.o oVar = pVar.f60001g;
            View view = pVar.h;
            pVar.f60000f = null;
            pVar.f60001g = null;
            pVar.h = null;
            wi.q qVar = pVar.f59998c;
            if (qVar != null) {
                qVar.a(null, null);
            }
            if (oVar != null) {
                SurfaceTexture surfaceTexture = oVar.f59993a;
                oVar.f59993a = null;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
            }
            if (view != null) {
                nVar.f59987a.w(view);
            }
            LaunchActivity launchActivity = pVar.f59997b;
            if (launchActivity != null && pVar.f60002i && org.telegram.messenger.g0.H1(launchActivity)) {
                pVar.f59997b.moveTaskToBack(false);
            }
            pVar.f60002i = false;
            bg.v0 v0Var = pVar.d;
            if (v0Var != null) {
                v0Var.b(false);
            }
        }
        f();
    }

    @Override
    public e2.w0 j() {
        t0 t0Var = (t0) this.f19408f;
        if (t0Var != null) {
            return t0Var.j();
        }
        return (e2.w0) ((q1) this.f19406c).f19533e;
    }

    public wi.n k(wi.l lVar) {
        wi.n nVar = new wi.n(this, lVar);
        ((ArrayList) this.f19406c).add(nVar);
        g("register " + lVar);
        f();
        return nVar;
    }

    public i(o0 o0Var, h2.g0 g0Var) {
        this.d = o0Var;
        ?? obj = new Object();
        obj.d = g0Var;
        obj.f19533e = e2.w0.d;
        this.f19406c = obj;
        this.f19404a = true;
    }
}
