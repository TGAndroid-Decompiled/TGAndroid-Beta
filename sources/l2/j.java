package l2;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public final class j implements u0 {
    public static j h;
    public boolean f19505a;
    public boolean f19506b;
    public final Object f19507c;
    public final Object d;
    public Object f19508e;
    public Object f19509f;

    public j() {
        this.f19507c = new ArrayList();
        this.d = new ArrayList();
        this.f19508e = new wi.p(this);
    }

    public static j d() {
        if (h == null) {
            h = new j();
        }
        return h;
    }

    public static void g(String str) {
        Log.d("PIP_DEBUG", "[utils.pip] " + str);
    }

    @Override
    public long a() {
        if (this.f19505a) {
            return ((r1) this.f19507c).a();
        }
        u0 u0Var = (u0) this.f19509f;
        u0Var.getClass();
        return u0Var.a();
    }

    @Override
    public boolean b() {
        if (this.f19505a) {
            ((r1) this.f19507c).getClass();
            return false;
        }
        u0 u0Var = (u0) this.f19509f;
        u0Var.getClass();
        return u0Var.b();
    }

    public wi.n c() {
        ArrayList arrayList = (ArrayList) this.f19507c;
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
        u0 u0Var = (u0) this.f19509f;
        if (u0Var != null) {
            u0Var.e(w0Var);
            w0Var = ((u0) this.f19509f).l();
        }
        ((r1) this.f19507c).e(w0Var);
    }

    public void f() {
        ((wi.p) this.f19508e).j();
    }

    public void h(b bVar) {
        u0 u0Var;
        u0 h7 = bVar.h();
        if (h7 != null && h7 != (u0Var = (u0) this.f19509f)) {
            if (u0Var == null) {
                this.f19509f = h7;
                this.f19508e = bVar;
                h7.e((e2.w0) ((r1) this.f19507c).f19634e);
                return;
            }
            throw new m(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public void i(wi.n nVar, int i7) {
        g("dismissed, prevState=" + i7);
        ((ArrayList) this.f19507c).remove(nVar);
        wi.p pVar = (wi.p) this.f19508e;
        if (nVar == pVar.f60127e) {
            pVar.f60127e = null;
        }
        if (nVar == pVar.f60128f) {
            wi.o oVar = pVar.f60129g;
            View view = pVar.h;
            pVar.f60128f = null;
            pVar.f60129g = null;
            pVar.h = null;
            wi.q qVar = pVar.f60126c;
            if (qVar != null) {
                qVar.a(null, null);
            }
            if (oVar != null) {
                SurfaceTexture surfaceTexture = oVar.f60121a;
                oVar.f60121a = null;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
            }
            if (view != null) {
                nVar.f60115a.z0(view);
            }
            LaunchActivity launchActivity = pVar.f60125b;
            if (launchActivity != null && pVar.f60130i && org.telegram.messenger.g0.H1(launchActivity)) {
                pVar.f60125b.moveTaskToBack(false);
            }
            pVar.f60130i = false;
            bg.v0 v0Var = pVar.d;
            if (v0Var != null) {
                v0Var.b(false);
            }
        }
        f();
    }

    public wi.n j(wi.l lVar) {
        wi.n nVar = new wi.n(this, lVar);
        ((ArrayList) this.f19507c).add(nVar);
        g("register " + lVar);
        f();
        return nVar;
    }

    @Override
    public e2.w0 l() {
        u0 u0Var = (u0) this.f19509f;
        if (u0Var != null) {
            return u0Var.l();
        }
        return (e2.w0) ((r1) this.f19507c).f19634e;
    }

    public j(p0 p0Var, h2.g0 g0Var) {
        this.d = p0Var;
        ?? obj = new Object();
        obj.d = g0Var;
        obj.f19634e = e2.w0.d;
        this.f19507c = obj;
        this.f19505a = true;
    }
}
