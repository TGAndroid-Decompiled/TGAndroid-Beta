package fi;

import a8.la;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.at;
public final class y3 {
    public boolean f12813a;
    public Object f12814b;
    public Object f12815c;
    public Object d;
    public Object f12816e;
    public Object f12817f;
    public Object f12818g;

    public y3(Context context, int i7) {
        switch (i7) {
            case 3:
                this.d = yi.g.f61355a;
                this.f12813a = true;
                this.f12818g = yi.j.H;
                this.f12814b = context;
                return;
            default:
                this.f12814b = context;
                this.f12815c = n2.b.f21097f;
                return;
        }
    }

    public static void c(at atVar) {
        ?? obj = new Object();
        obj.f12814b = new org.telegram.messenger.j5(obj, 0);
        obj.d = atVar;
        int i7 = k10.f24968t0;
        obj.f12818g = new org.telegram.messenger.a(obj, 6);
        obj.f12817f = org.telegram.messenger.i5.r(i7);
        obj.f12816e = ls.f(i7);
        obj.f12815c = new Handler(Looper.myLooper());
        if (!obj.d(false)) {
            ((ls) obj.f12816e).b((org.telegram.messenger.j5) obj.f12814b, ls.O);
            ((Handler) obj.f12815c).postDelayed((org.telegram.messenger.a) obj.f12818g, 1000L);
        }
    }

    public n2.r0 a() {
        boolean z10;
        n2.b bVar;
        Context context = (Context) this.f12814b;
        boolean z11 = true;
        la.p(!this.f12813a);
        this.f12813a = true;
        if (((h6.m) this.d) == null) {
            this.d = new h6.m(new f2.n[0]);
        }
        if (((n2.i0) this.f12817f) == null) {
            if (((n2.l0) this.f12818g) == null) {
                this.f12818g = new n2.l0(context);
            }
            if (((n2.s0) this.f12816e) == null) {
                this.f12816e = n2.s0.f21267a;
            }
            n2.h0 h0Var = new n2.h0(context);
            if (context != null) {
                bVar = null;
            } else {
                bVar = (n2.b) this.f12815c;
            }
            Context context2 = h0Var.f21148a;
            if (context2 == null) {
                h0Var.d = bVar;
            }
            n2.l0 l0Var = (n2.l0) this.f12818g;
            h0Var.f21149b = l0Var;
            h0Var.f21150c = (n2.s0) this.f12816e;
            if (l0Var == null) {
                h0Var.f21149b = new n2.l0(context2);
            }
            this.f12817f = new n2.i0(h0Var);
        } else {
            if (((n2.l0) this.f12818g) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
            if (((n2.s0) this.f12816e) != null) {
                z11 = false;
            }
            la.p(z11);
        }
        return new n2.r0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f12818g;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((View) arrayList.get(i7)).invalidate();
        }
    }

    public boolean d(boolean z10) {
        boolean z11 = this.f12813a;
        if (!z11) {
            if (((org.telegram.messenger.i5) this.f12817f).h || z10) {
                if (!z11) {
                    ls lsVar = (ls) this.f12816e;
                    if (lsVar != null) {
                        lsVar.n((org.telegram.messenger.j5) this.f12814b, ls.O);
                    }
                    Handler handler = (Handler) this.f12815c;
                    if (handler != null) {
                        handler.removeCallbacks((org.telegram.messenger.a) this.f12818g);
                    }
                    this.f12813a = true;
                }
                at atVar = (at) this.d;
                Intent intent = (Intent) atVar.f45698c;
                String str = LaunchActivity.C1;
                ((LaunchActivity) atVar.f45697b).W(intent, true, false, false, null, true, false);
                return true;
            }
            return false;
        }
        return false;
    }
}
