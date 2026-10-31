package k2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.d20;
import org.telegram.messenger.i5;
import org.telegram.messenger.j5;
import org.telegram.messenger.zs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rv;
import v7.t6;
public final class t0 {
    public Object f10766a;
    public boolean f10767b;
    public Object f10768c;
    public Object d;
    public Object e;
    public Object f10769f;
    public Object f10770g;

    public t0(Context context, int i10) {
        switch (i10) {
            case 1:
                this.d = ki.i.f11406a;
                this.f10767b = true;
                this.f10770g = ki.k.H;
                this.f10766a = context;
                return;
            default:
                this.f10766a = context;
                this.f10768c = b.f10601f;
                return;
        }
    }

    public static void c(rv rvVar) {
        ?? obj = new Object();
        obj.f10766a = new j5(obj, 0);
        obj.d = rvVar;
        int i10 = d20.f15147s0;
        obj.f10770g = new org.telegram.messenger.a((Object) obj, 6);
        obj.f10769f = i5.r(i10);
        obj.e = zs.f(i10);
        obj.f10768c = new Handler(Looper.myLooper());
        if (!obj.d(false)) {
            ((zs) obj.e).b((j5) obj.f10766a, zs.O);
            ((Handler) obj.f10768c).postDelayed((org.telegram.messenger.a) obj.f10770g, 1000L);
        }
    }

    public w0 a() {
        boolean z10;
        b bVar;
        Context context = (Context) this.f10766a;
        boolean z11 = true;
        t6.p(!this.f10767b);
        this.f10767b = true;
        if (((android.support.v4.media.session.a0) this.d) == null) {
            this.d = new android.support.v4.media.session.a0(new c2.m[0]);
        }
        if (((n0) this.f10769f) == null) {
            if (((q0) this.f10770g) == null) {
                this.f10770g = new q0(context);
            }
            if (((x0) this.e) == null) {
                this.e = x0.f10809a;
            }
            l0 l0Var = new l0(context);
            if (context != null) {
                bVar = null;
            } else {
                bVar = (b) this.f10768c;
            }
            Context context2 = l0Var.f10697a;
            if (context2 == null) {
                l0Var.d = bVar;
            }
            q0 q0Var = (q0) this.f10770g;
            l0Var.f10698b = q0Var;
            l0Var.f10699c = (x0) this.e;
            if (q0Var == null) {
                l0Var.f10698b = new q0(context2);
            }
            this.f10769f = new n0(l0Var);
        } else {
            if (((q0) this.f10770g) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            t6.p(z10);
            if (((x0) this.e) != null) {
                z11 = false;
            }
            t6.p(z11);
        }
        return new w0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f10770g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }

    public boolean d(boolean z10) {
        boolean z11 = this.f10767b;
        if (!z11) {
            if (((i5) this.f10769f).h || z10) {
                if (!z11) {
                    zs zsVar = (zs) this.e;
                    if (zsVar != null) {
                        zsVar.n((j5) this.f10766a, zs.O);
                    }
                    Handler handler = (Handler) this.f10768c;
                    if (handler != null) {
                        handler.removeCallbacks((org.telegram.messenger.a) this.f10770g);
                    }
                    this.f10767b = true;
                }
                rv rvVar = (rv) this.d;
                Intent intent = (Intent) rvVar.f41299c;
                Pattern pattern = LaunchActivity.D1;
                ((LaunchActivity) rvVar.f41298b).W(intent, true, false, false, null, true, false);
                return true;
            }
            return false;
        }
        return false;
    }
}
