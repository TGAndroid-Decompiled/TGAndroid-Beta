package l2;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class i implements w0 {
    public static i h;
    public boolean f17844a;
    public boolean f17845b;
    public final Object f17846c;
    public final Object d;
    public Object f17847e;
    public Object f17848f;

    public i() {
        this.f17846c = new ArrayList();
        this.d = new ArrayList();
        this.f17847e = new ti.r(this);
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
        if (this.f17844a) {
            return ((u1) this.f17846c).a();
        }
        w0 w0Var = (w0) this.f17848f;
        w0Var.getClass();
        return w0Var.a();
    }

    @Override
    public boolean b() {
        if (this.f17844a) {
            ((u1) this.f17846c).getClass();
            return false;
        }
        w0 w0Var = (w0) this.f17848f;
        w0Var.getClass();
        return w0Var.b();
    }

    public ti.o c() {
        ArrayList arrayList = (ArrayList) this.f17846c;
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
        w0 w0Var2 = (w0) this.f17848f;
        if (w0Var2 != null) {
            w0Var2.e(w0Var);
            w0Var = ((w0) this.f17848f).j();
        }
        ((u1) this.f17846c).e(w0Var);
    }

    public void f() {
        ((ti.r) this.f17847e).j();
    }

    public void h(b bVar) {
        w0 w0Var;
        w0 h7 = bVar.h();
        if (h7 != null && h7 != (w0Var = (w0) this.f17848f)) {
            if (w0Var == null) {
                this.f17848f = h7;
                this.f17847e = bVar;
                h7.e((e2.w0) ((u1) this.f17846c).f18061e);
                return;
            }
            throw new l(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public void i(ti.o oVar, int i7) {
        g("dismissed, prevState=" + i7);
        ((ArrayList) this.f17846c).remove(oVar);
        ti.r rVar = (ti.r) this.f17847e;
        if (oVar == rVar.f56046e) {
            rVar.f56046e = null;
        }
        if (oVar == rVar.f56047f) {
            ti.q qVar = rVar.f56048g;
            View view = rVar.h;
            rVar.f56047f = null;
            rVar.f56048g = null;
            rVar.h = null;
            ti.s sVar = rVar.f56045c;
            if (sVar != null) {
                sVar.a(null, null);
            }
            if (qVar != null) {
                SurfaceTexture surfaceTexture = qVar.f56040a;
                qVar.f56040a = null;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
            }
            if (view != null) {
                oVar.f56031a.y(view);
            }
            LaunchActivity launchActivity = rVar.f56044b;
            if (launchActivity != null && rVar.f56049i && org.telegram.messenger.g0.H1(launchActivity)) {
                rVar.f56044b.moveTaskToBack(false);
            }
            rVar.f56049i = false;
            bg.v0 v0Var = rVar.d;
            if (v0Var != null) {
                v0Var.c(false);
            }
        }
        f();
    }

    @Override
    public e2.w0 j() {
        w0 w0Var = (w0) this.f17848f;
        if (w0Var != null) {
            return w0Var.j();
        }
        return (e2.w0) ((u1) this.f17846c).f18061e;
    }

    public ti.o k(ti.m mVar) {
        ti.o oVar = new ti.o(this, mVar);
        ((ArrayList) this.f17846c).add(oVar);
        g("register " + mVar);
        f();
        return oVar;
    }

    public i(r0 r0Var, h2.g0 g0Var) {
        this.d = r0Var;
        ?? obj = new Object();
        obj.d = g0Var;
        obj.f18061e = e2.w0.d;
        this.f17846c = obj;
        this.f17844a = true;
    }
}
