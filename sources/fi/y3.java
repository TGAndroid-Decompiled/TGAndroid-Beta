package fi;

import a8.ma;
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
    public boolean f12765a;
    public Object f12766b;
    public Object f12767c;
    public Object d;
    public Object f12768e;
    public Object f12769f;
    public Object f12770g;

    public y3(Context context, int i7) {
        switch (i7) {
            case 3:
                this.d = yi.g.f61320a;
                this.f12765a = true;
                this.f12770g = yi.j.H;
                this.f12766b = context;
                return;
            default:
                this.f12766b = context;
                this.f12767c = n2.b.f21063f;
                return;
        }
    }

    public static void c(at atVar) {
        ?? obj = new Object();
        obj.f12766b = new org.telegram.messenger.j5(obj, 0);
        obj.d = atVar;
        int i7 = k10.f24932t0;
        obj.f12770g = new org.telegram.messenger.a(obj, 6);
        obj.f12769f = org.telegram.messenger.i5.r(i7);
        obj.f12768e = ls.f(i7);
        obj.f12767c = new Handler(Looper.myLooper());
        if (!obj.d(false)) {
            ((ls) obj.f12768e).b((org.telegram.messenger.j5) obj.f12766b, ls.O);
            ((Handler) obj.f12767c).postDelayed((org.telegram.messenger.a) obj.f12770g, 1000L);
        }
    }

    public n2.r0 a() {
        boolean z10;
        n2.b bVar;
        Context context = (Context) this.f12766b;
        boolean z11 = true;
        ma.p(!this.f12765a);
        this.f12765a = true;
        if (((h6.m) this.d) == null) {
            this.d = new h6.m(new f2.n[0]);
        }
        if (((n2.i0) this.f12769f) == null) {
            if (((n2.l0) this.f12770g) == null) {
                this.f12770g = new n2.l0(context);
            }
            if (((n2.s0) this.f12768e) == null) {
                this.f12768e = n2.s0.f21233a;
            }
            n2.h0 h0Var = new n2.h0(context);
            if (context != null) {
                bVar = null;
            } else {
                bVar = (n2.b) this.f12767c;
            }
            Context context2 = h0Var.f21114a;
            if (context2 == null) {
                h0Var.d = bVar;
            }
            n2.l0 l0Var = (n2.l0) this.f12770g;
            h0Var.f21115b = l0Var;
            h0Var.f21116c = (n2.s0) this.f12768e;
            if (l0Var == null) {
                h0Var.f21115b = new n2.l0(context2);
            }
            this.f12769f = new n2.i0(h0Var);
        } else {
            if (((n2.l0) this.f12770g) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ma.p(z10);
            if (((n2.s0) this.f12768e) != null) {
                z11 = false;
            }
            ma.p(z11);
        }
        return new n2.r0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f12770g;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((View) arrayList.get(i7)).invalidate();
        }
    }

    public boolean d(boolean z10) {
        boolean z11 = this.f12765a;
        if (!z11) {
            if (((org.telegram.messenger.i5) this.f12769f).h || z10) {
                if (!z11) {
                    ls lsVar = (ls) this.f12768e;
                    if (lsVar != null) {
                        lsVar.n((org.telegram.messenger.j5) this.f12766b, ls.O);
                    }
                    Handler handler = (Handler) this.f12767c;
                    if (handler != null) {
                        handler.removeCallbacks((org.telegram.messenger.a) this.f12770g);
                    }
                    this.f12765a = true;
                }
                at atVar = (at) this.d;
                Intent intent = (Intent) atVar.f45646c;
                String str = LaunchActivity.C1;
                ((LaunchActivity) atVar.f45645b).W(intent, true, false, false, null, true, false);
                return true;
            }
            return false;
        }
        return false;
    }
}
