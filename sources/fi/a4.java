package fi;

import a8.ja;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tr;
public final class a4 {
    public boolean f11405a;
    public Object f11406b;
    public Object f11407c;
    public Object d;
    public Object f11408e;
    public Object f11409f;
    public Object f11410g;

    public a4(Context context, int i7) {
        switch (i7) {
            case 3:
                this.d = yi.h.f60745a;
                this.f11405a = true;
                this.f11410g = yi.j.H;
                this.f11406b = context;
                return;
            default:
                this.f11406b = context;
                this.f11407c = n2.b.f20705f;
                return;
        }
    }

    public static void c(tr trVar) {
        ?? obj = new Object();
        obj.f11406b = new org.telegram.messenger.h5(obj, 0);
        obj.d = trVar;
        int i7 = m10.f24934t0;
        obj.f11410g = new org.telegram.messenger.a(obj, 6);
        obj.f11409f = org.telegram.messenger.g5.r(i7);
        obj.f11408e = ns.f(i7);
        obj.f11407c = new Handler(Looper.myLooper());
        if (!obj.d(false)) {
            ((ns) obj.f11408e).b((org.telegram.messenger.h5) obj.f11406b, ns.O);
            ((Handler) obj.f11407c).postDelayed((org.telegram.messenger.a) obj.f11410g, 1000L);
        }
    }

    public n2.r0 a() {
        boolean z10;
        n2.b bVar;
        Context context = (Context) this.f11406b;
        boolean z11 = true;
        ja.p(!this.f11405a);
        this.f11405a = true;
        if (((h6.m) this.d) == null) {
            this.d = new h6.m(new f2.m[0]);
        }
        if (((n2.i0) this.f11409f) == null) {
            if (((n2.l0) this.f11410g) == null) {
                this.f11410g = new n2.l0(context);
            }
            if (((n2.s0) this.f11408e) == null) {
                this.f11408e = n2.s0.f20875a;
            }
            n2.h0 h0Var = new n2.h0(context);
            if (context != null) {
                bVar = null;
            } else {
                bVar = (n2.b) this.f11407c;
            }
            Context context2 = h0Var.f20756a;
            if (context2 == null) {
                h0Var.d = bVar;
            }
            n2.l0 l0Var = (n2.l0) this.f11410g;
            h0Var.f20757b = l0Var;
            h0Var.f20758c = (n2.s0) this.f11408e;
            if (l0Var == null) {
                h0Var.f20757b = new n2.l0(context2);
            }
            this.f11409f = new n2.i0(h0Var);
        } else {
            if (((n2.l0) this.f11410g) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ja.p(z10);
            if (((n2.s0) this.f11408e) != null) {
                z11 = false;
            }
            ja.p(z11);
        }
        return new n2.r0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f11410g;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((View) arrayList.get(i7)).invalidate();
        }
    }

    public boolean d(boolean z10) {
        boolean z11 = this.f11405a;
        if (!z11) {
            if (((org.telegram.messenger.g5) this.f11409f).h || z10) {
                if (!z11) {
                    ns nsVar = (ns) this.f11408e;
                    if (nsVar != null) {
                        nsVar.n((org.telegram.messenger.h5) this.f11406b, ns.O);
                    }
                    Handler handler = (Handler) this.f11407c;
                    if (handler != null) {
                        handler.removeCallbacks((org.telegram.messenger.a) this.f11410g);
                    }
                    this.f11405a = true;
                }
                tr trVar = (tr) this.d;
                Intent intent = (Intent) trVar.f51654c;
                String str = LaunchActivity.C1;
                ((LaunchActivity) trVar.f51653b).W(intent, true, false, false, null, true, false);
                return true;
            }
            return false;
        }
        return false;
    }
}
