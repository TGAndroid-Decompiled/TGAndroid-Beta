package l2;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class i implements w0 {
    public static i h;
    public boolean f17847a;
    public boolean f17848b;
    public final Object f17849c;
    public final Object d;
    public Object f17850e;
    public Object f17851f;

    public i() {
        this.f17849c = new ArrayList();
        this.d = new ArrayList();
        this.f17850e = new ti.q(this);
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
        if (this.f17847a) {
            return ((u1) this.f17849c).a();
        }
        w0 w0Var = (w0) this.f17851f;
        w0Var.getClass();
        return w0Var.a();
    }

    @Override
    public boolean b() {
        if (this.f17847a) {
            ((u1) this.f17849c).getClass();
            return false;
        }
        w0 w0Var = (w0) this.f17851f;
        w0Var.getClass();
        return w0Var.b();
    }

    public ti.o c() {
        ArrayList arrayList = (ArrayList) this.f17849c;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ti.o oVar = (ti.o) arrayList.get(i7);
            if (oVar.e()) {
                return oVar;
            }
        }
        return null;
    }

    @Override
    public void e(e2.w0 w0Var) {
        w0 w0Var2 = (w0) this.f17851f;
        if (w0Var2 != null) {
            w0Var2.e(w0Var);
            w0Var = ((w0) this.f17851f).j();
        }
        ((u1) this.f17849c).e(w0Var);
    }

    public void f() {
        ((ti.q) this.f17850e).j();
    }

    public void h(b bVar) {
        w0 w0Var;
        w0 h7 = bVar.h();
        if (h7 != null && h7 != (w0Var = (w0) this.f17851f)) {
            if (w0Var == null) {
                this.f17851f = h7;
                this.f17850e = bVar;
                h7.e((e2.w0) ((u1) this.f17849c).f18064e);
                return;
            }
            throw new l(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public void i(ti.o oVar, int i7) {
        g("dismissed, prevState=" + i7);
        ((ArrayList) this.f17849c).remove(oVar);
        ti.q qVar = (ti.q) this.f17850e;
        if (oVar == qVar.f56135e) {
            qVar.f56135e = null;
        }
        if (oVar == qVar.f56136f) {
            ti.p pVar = qVar.f56137g;
            View view = qVar.h;
            qVar.f56136f = null;
            qVar.f56137g = null;
            qVar.h = null;
            ti.r rVar = qVar.f56134c;
            if (rVar != null) {
                rVar.a(null, null);
            }
            if (pVar != null) {
                SurfaceTexture surfaceTexture = pVar.f56129a;
                pVar.f56129a = null;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
            }
            if (view != null) {
                oVar.f56123a.y(view);
            }
            LaunchActivity launchActivity = qVar.f56133b;
            if (launchActivity != null && qVar.f56138i && org.telegram.messenger.g0.H1(launchActivity)) {
                qVar.f56133b.moveTaskToBack(false);
            }
            qVar.f56138i = false;
            bg.v0 v0Var = qVar.d;
            if (v0Var != null) {
                v0Var.c(false);
            }
        }
        f();
    }

    @Override
    public e2.w0 j() {
        w0 w0Var = (w0) this.f17851f;
        if (w0Var != null) {
            return w0Var.j();
        }
        return (e2.w0) ((u1) this.f17849c).f18064e;
    }

    public ti.o k(ti.m mVar) {
        ti.o oVar = new ti.o(this, mVar);
        ((ArrayList) this.f17849c).add(oVar);
        g("register " + mVar);
        f();
        return oVar;
    }

    public i(r0 r0Var, h2.g0 g0Var) {
        this.d = r0Var;
        ?? obj = new Object();
        obj.d = g0Var;
        obj.f18064e = e2.w0.d;
        this.f17849c = obj;
        this.f17847a = true;
    }
}
