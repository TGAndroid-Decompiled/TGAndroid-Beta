package fi;

import a8.la;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.at;
public final class y3 {
    public boolean f12773a;
    public Object f12774b;
    public Object f12775c;
    public Object d;
    public Object f12776e;
    public Object f12777f;
    public Object f12778g;

    public y3(Context context, int i7) {
        switch (i7) {
            case 3:
                this.d = yi.g.f61309a;
                this.f12773a = true;
                this.f12778g = yi.j.H;
                this.f12774b = context;
                return;
            default:
                this.f12774b = context;
                this.f12775c = n2.b.f21069f;
                return;
        }
    }

    public static void c(at atVar) {
        ?? obj = new Object();
        obj.f12774b = new org.telegram.messenger.j5(obj, 0);
        obj.d = atVar;
        int i7 = j10.f24773t0;
        obj.f12778g = new org.telegram.messenger.a(obj, 6);
        obj.f12777f = org.telegram.messenger.i5.r(i7);
        obj.f12776e = ks.f(i7);
        obj.f12775c = new Handler(Looper.myLooper());
        if (!obj.d(false)) {
            ((ks) obj.f12776e).b((org.telegram.messenger.j5) obj.f12774b, ks.O);
            ((Handler) obj.f12775c).postDelayed((org.telegram.messenger.a) obj.f12778g, 1000L);
        }
    }

    public n2.r0 a() {
        boolean z10;
        n2.b bVar;
        Context context = (Context) this.f12774b;
        boolean z11 = true;
        la.p(!this.f12773a);
        this.f12773a = true;
        if (((h6.m) this.d) == null) {
            this.d = new h6.m(new f2.n[0]);
        }
        if (((n2.i0) this.f12777f) == null) {
            if (((n2.l0) this.f12778g) == null) {
                this.f12778g = new n2.l0(context);
            }
            if (((n2.s0) this.f12776e) == null) {
                this.f12776e = n2.s0.f21239a;
            }
            n2.h0 h0Var = new n2.h0(context);
            if (context != null) {
                bVar = null;
            } else {
                bVar = (n2.b) this.f12775c;
            }
            Context context2 = h0Var.f21120a;
            if (context2 == null) {
                h0Var.d = bVar;
            }
            n2.l0 l0Var = (n2.l0) this.f12778g;
            h0Var.f21121b = l0Var;
            h0Var.f21122c = (n2.s0) this.f12776e;
            if (l0Var == null) {
                h0Var.f21121b = new n2.l0(context2);
            }
            this.f12777f = new n2.i0(h0Var);
        } else {
            if (((n2.l0) this.f12778g) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
            if (((n2.s0) this.f12776e) != null) {
                z11 = false;
            }
            la.p(z11);
        }
        return new n2.r0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f12778g;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((View) arrayList.get(i7)).invalidate();
        }
    }

    public boolean d(boolean z10) {
        boolean z11 = this.f12773a;
        if (!z11) {
            if (((org.telegram.messenger.i5) this.f12777f).h || z10) {
                if (!z11) {
                    ks ksVar = (ks) this.f12776e;
                    if (ksVar != null) {
                        ksVar.n((org.telegram.messenger.j5) this.f12774b, ks.O);
                    }
                    Handler handler = (Handler) this.f12775c;
                    if (handler != null) {
                        handler.removeCallbacks((org.telegram.messenger.a) this.f12778g);
                    }
                    this.f12773a = true;
                }
                at atVar = (at) this.d;
                Intent intent = (Intent) atVar.f45668c;
                String str = LaunchActivity.C1;
                ((LaunchActivity) atVar.f45667b).W(intent, true, false, false, null, true, false);
                return true;
            }
            return false;
        }
        return false;
    }
}
