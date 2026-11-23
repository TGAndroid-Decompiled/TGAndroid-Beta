package fi;

import a8.ma;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zs;
public final class y3 {
    public boolean f12775a;
    public Object f12776b;
    public Object f12777c;
    public Object d;
    public Object f12778e;
    public Object f12779f;
    public Object f12780g;

    public y3(Context context, int i7) {
        switch (i7) {
            case 3:
                this.d = yi.g.f61439a;
                this.f12775a = true;
                this.f12780g = yi.j.H;
                this.f12776b = context;
                return;
            default:
                this.f12776b = context;
                this.f12777c = n2.b.f21153f;
                return;
        }
    }

    public static void c(zs zsVar) {
        ?? obj = new Object();
        obj.f12776b = new org.telegram.messenger.j5(obj, 0);
        obj.d = zsVar;
        int i7 = i10.f24637t0;
        obj.f12780g = new org.telegram.messenger.a(obj, 6);
        obj.f12779f = org.telegram.messenger.i5.r(i7);
        obj.f12778e = ks.f(i7);
        obj.f12777c = new Handler(Looper.myLooper());
        if (!obj.d(false)) {
            ((ks) obj.f12778e).b((org.telegram.messenger.j5) obj.f12776b, ks.O);
            ((Handler) obj.f12777c).postDelayed((org.telegram.messenger.a) obj.f12780g, 1000L);
        }
    }

    public n2.s0 a() {
        boolean z10;
        n2.b bVar;
        Context context = (Context) this.f12776b;
        boolean z11 = true;
        ma.p(!this.f12775a);
        this.f12775a = true;
        if (((h6.m) this.d) == null) {
            this.d = new h6.m(new f2.n[0]);
        }
        if (((n2.j0) this.f12779f) == null) {
            if (((n2.m0) this.f12780g) == null) {
                this.f12780g = new n2.m0(context);
            }
            if (((n2.t0) this.f12778e) == null) {
                this.f12778e = n2.t0.f21334a;
            }
            n2.i0 i0Var = new n2.i0(context);
            if (context != null) {
                bVar = null;
            } else {
                bVar = (n2.b) this.f12777c;
            }
            Context context2 = i0Var.f21220a;
            if (context2 == null) {
                i0Var.d = bVar;
            }
            n2.m0 m0Var = (n2.m0) this.f12780g;
            i0Var.f21221b = m0Var;
            i0Var.f21222c = (n2.t0) this.f12778e;
            if (m0Var == null) {
                i0Var.f21221b = new n2.m0(context2);
            }
            this.f12779f = new n2.j0(i0Var);
        } else {
            if (((n2.m0) this.f12780g) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ma.p(z10);
            if (((n2.t0) this.f12778e) != null) {
                z11 = false;
            }
            ma.p(z11);
        }
        return new n2.s0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f12780g;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((View) arrayList.get(i7)).invalidate();
        }
    }

    public boolean d(boolean z10) {
        boolean z11 = this.f12775a;
        if (!z11) {
            if (((org.telegram.messenger.i5) this.f12779f).h || z10) {
                if (!z11) {
                    ks ksVar = (ks) this.f12778e;
                    if (ksVar != null) {
                        ksVar.n((org.telegram.messenger.j5) this.f12776b, ks.O);
                    }
                    Handler handler = (Handler) this.f12777c;
                    if (handler != null) {
                        handler.removeCallbacks((org.telegram.messenger.a) this.f12780g);
                    }
                    this.f12775a = true;
                }
                zs zsVar = (zs) this.d;
                Intent intent = (Intent) zsVar.f54714c;
                String str = LaunchActivity.C1;
                ((LaunchActivity) zsVar.f54713b).W(intent, true, false, false, null, true, false);
                return true;
            }
            return false;
        }
        return false;
    }
}
