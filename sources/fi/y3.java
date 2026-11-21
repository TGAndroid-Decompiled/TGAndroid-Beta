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
    public boolean f12810a;
    public Object f12811b;
    public Object f12812c;
    public Object d;
    public Object f12813e;
    public Object f12814f;
    public Object f12815g;

    public y3(Context context, int i7) {
        switch (i7) {
            case 3:
                this.d = yi.g.f61351a;
                this.f12810a = true;
                this.f12815g = yi.j.H;
                this.f12811b = context;
                return;
            default:
                this.f12811b = context;
                this.f12812c = n2.b.f21094f;
                return;
        }
    }

    public static void c(at atVar) {
        ?? obj = new Object();
        obj.f12811b = new org.telegram.messenger.j5(obj, 0);
        obj.d = atVar;
        int i7 = j10.f24798t0;
        obj.f12815g = new org.telegram.messenger.a(obj, 6);
        obj.f12814f = org.telegram.messenger.i5.r(i7);
        obj.f12813e = ks.f(i7);
        obj.f12812c = new Handler(Looper.myLooper());
        if (!obj.d(false)) {
            ((ks) obj.f12813e).b((org.telegram.messenger.j5) obj.f12811b, ks.O);
            ((Handler) obj.f12812c).postDelayed((org.telegram.messenger.a) obj.f12815g, 1000L);
        }
    }

    public n2.r0 a() {
        boolean z10;
        n2.b bVar;
        Context context = (Context) this.f12811b;
        boolean z11 = true;
        la.p(!this.f12810a);
        this.f12810a = true;
        if (((h6.m) this.d) == null) {
            this.d = new h6.m(new f2.n[0]);
        }
        if (((n2.i0) this.f12814f) == null) {
            if (((n2.l0) this.f12815g) == null) {
                this.f12815g = new n2.l0(context);
            }
            if (((n2.s0) this.f12813e) == null) {
                this.f12813e = n2.s0.f21264a;
            }
            n2.h0 h0Var = new n2.h0(context);
            if (context != null) {
                bVar = null;
            } else {
                bVar = (n2.b) this.f12812c;
            }
            Context context2 = h0Var.f21145a;
            if (context2 == null) {
                h0Var.d = bVar;
            }
            n2.l0 l0Var = (n2.l0) this.f12815g;
            h0Var.f21146b = l0Var;
            h0Var.f21147c = (n2.s0) this.f12813e;
            if (l0Var == null) {
                h0Var.f21146b = new n2.l0(context2);
            }
            this.f12814f = new n2.i0(h0Var);
        } else {
            if (((n2.l0) this.f12815g) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
            if (((n2.s0) this.f12813e) != null) {
                z11 = false;
            }
            la.p(z11);
        }
        return new n2.r0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f12815g;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((View) arrayList.get(i7)).invalidate();
        }
    }

    public boolean d(boolean z10) {
        boolean z11 = this.f12810a;
        if (!z11) {
            if (((org.telegram.messenger.i5) this.f12814f).h || z10) {
                if (!z11) {
                    ks ksVar = (ks) this.f12813e;
                    if (ksVar != null) {
                        ksVar.n((org.telegram.messenger.j5) this.f12811b, ks.O);
                    }
                    Handler handler = (Handler) this.f12812c;
                    if (handler != null) {
                        handler.removeCallbacks((org.telegram.messenger.a) this.f12815g);
                    }
                    this.f12810a = true;
                }
                at atVar = (at) this.d;
                Intent intent = (Intent) atVar.f45694c;
                String str = LaunchActivity.C1;
                ((LaunchActivity) atVar.f45693b).W(intent, true, false, false, null, true, false);
                return true;
            }
            return false;
        }
        return false;
    }
}
