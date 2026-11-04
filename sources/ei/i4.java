package ei;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import b8.zb;
import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.i41;
import org.telegram.ui.LaunchActivity;
public final class i4 {
    public boolean f10402a;
    public Object f10403b;
    public Object f10404c;
    public Object d;
    public Object f10405e;
    public Object f10406f;
    public Object f10407g;

    public i4(Context context, int i3) {
        switch (i3) {
            case 3:
                this.d = vi.h.f56974a;
                this.f10402a = true;
                this.f10407g = vi.j.H;
                this.f10403b = context;
                return;
            default:
                this.f10403b = context;
                this.f10404c = m2.b.f18818f;
                return;
        }
    }

    public static void c(i41 i41Var) {
        ?? obj = new Object();
        obj.f10403b = new org.telegram.messenger.h5(obj, 0);
        obj.d = i41Var;
        int i3 = h10.f22829t0;
        obj.f10407g = new org.telegram.messenger.a(obj, 6);
        obj.f10406f = org.telegram.messenger.g5.r(i3);
        obj.f10405e = hs.f(i3);
        obj.f10404c = new Handler(Looper.myLooper());
        if (!obj.d(false)) {
            ((hs) obj.f10405e).b((org.telegram.messenger.h5) obj.f10403b, hs.O);
            ((Handler) obj.f10404c).postDelayed((org.telegram.messenger.a) obj.f10407g, 1000L);
        }
    }

    public m2.s0 a() {
        boolean z10;
        m2.b bVar;
        Context context = (Context) this.f10403b;
        boolean z11 = true;
        zb.p(!this.f10402a);
        this.f10402a = true;
        if (((k4.j) this.d) == null) {
            this.d = new k4.j(new e2.m[0]);
        }
        if (((m2.j0) this.f10406f) == null) {
            if (((m2.m0) this.f10407g) == null) {
                this.f10407g = new m2.m0(context);
            }
            if (((m2.t0) this.f10405e) == null) {
                this.f10405e = m2.t0.f19008a;
            }
            m2.i0 i0Var = new m2.i0(context);
            if (context != null) {
                bVar = null;
            } else {
                bVar = (m2.b) this.f10404c;
            }
            Context context2 = i0Var.f18889a;
            if (context2 == null) {
                i0Var.d = bVar;
            }
            m2.m0 m0Var = (m2.m0) this.f10407g;
            i0Var.f18890b = m0Var;
            i0Var.f18891c = (m2.t0) this.f10405e;
            if (m0Var == null) {
                i0Var.f18890b = new m2.m0(context2);
            }
            this.f10406f = new m2.j0(i0Var);
        } else {
            if (((m2.m0) this.f10407g) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            zb.p(z10);
            if (((m2.t0) this.f10405e) != null) {
                z11 = false;
            }
            zb.p(z11);
        }
        return new m2.s0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f10407g;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((View) arrayList.get(i3)).invalidate();
        }
    }

    public boolean d(boolean z10) {
        boolean z11 = this.f10402a;
        if (!z11) {
            if (((org.telegram.messenger.g5) this.f10406f).h || z10) {
                if (!z11) {
                    hs hsVar = (hs) this.f10405e;
                    if (hsVar != null) {
                        hsVar.n((org.telegram.messenger.h5) this.f10403b, hs.O);
                    }
                    Handler handler = (Handler) this.f10404c;
                    if (handler != null) {
                        handler.removeCallbacks((org.telegram.messenger.a) this.f10407g);
                    }
                    this.f10402a = true;
                }
                i41 i41Var = (i41) this.d;
                Intent intent = (Intent) i41Var.f34592c;
                String str = LaunchActivity.E1;
                ((LaunchActivity) i41Var.f34591b).W(intent, true, false, false, null, true, false);
                return true;
            }
            return false;
        }
        return false;
    }
}
