package k2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
import org.telegram.messenger.i5;
import org.telegram.messenger.j5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qv;
import v7.t6;
public final class t0 {
    public Object f10767a;
    public boolean f10768b;
    public Object f10769c;
    public Object d;
    public Object e;
    public Object f10770f;
    public Object f10771g;

    public t0(Context context, int i10) {
        switch (i10) {
            case 1:
                this.d = ki.i.f11407a;
                this.f10768b = true;
                this.f10771g = ki.k.H;
                this.f10767a = context;
                return;
            default:
                this.f10767a = context;
                this.f10769c = b.f10602f;
                return;
        }
    }

    public static void c(qv qvVar) {
        ?? obj = new Object();
        obj.f10767a = new j5(obj, 0);
        obj.d = qvVar;
        int i10 = e20.f15506s0;
        obj.f10771g = new org.telegram.messenger.a((Object) obj, 6);
        obj.f10770f = i5.r(i10);
        obj.e = at.f(i10);
        obj.f10769c = new Handler(Looper.myLooper());
        if (!obj.d(false)) {
            ((at) obj.e).b((j5) obj.f10767a, at.O);
            ((Handler) obj.f10769c).postDelayed((org.telegram.messenger.a) obj.f10771g, 1000L);
        }
    }

    public w0 a() {
        boolean z10;
        b bVar;
        Context context = (Context) this.f10767a;
        boolean z11 = true;
        t6.p(!this.f10768b);
        this.f10768b = true;
        if (((android.support.v4.media.session.a0) this.d) == null) {
            this.d = new android.support.v4.media.session.a0(new c2.m[0]);
        }
        if (((n0) this.f10770f) == null) {
            if (((q0) this.f10771g) == null) {
                this.f10771g = new q0(context);
            }
            if (((x0) this.e) == null) {
                this.e = x0.f10810a;
            }
            l0 l0Var = new l0(context);
            if (context != null) {
                bVar = null;
            } else {
                bVar = (b) this.f10769c;
            }
            Context context2 = l0Var.f10698a;
            if (context2 == null) {
                l0Var.d = bVar;
            }
            q0 q0Var = (q0) this.f10771g;
            l0Var.f10699b = q0Var;
            l0Var.f10700c = (x0) this.e;
            if (q0Var == null) {
                l0Var.f10699b = new q0(context2);
            }
            this.f10770f = new n0(l0Var);
        } else {
            if (((q0) this.f10771g) == null) {
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
        ArrayList arrayList = (ArrayList) this.f10771g;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((View) arrayList.get(i10)).invalidate();
        }
    }

    public boolean d(boolean z10) {
        boolean z11 = this.f10768b;
        if (!z11) {
            if (((i5) this.f10770f).h || z10) {
                if (!z11) {
                    at atVar = (at) this.e;
                    if (atVar != null) {
                        atVar.n((j5) this.f10767a, at.O);
                    }
                    Handler handler = (Handler) this.f10769c;
                    if (handler != null) {
                        handler.removeCallbacks((org.telegram.messenger.a) this.f10771g);
                    }
                    this.f10768b = true;
                }
                qv qvVar = (qv) this.d;
                Intent intent = (Intent) qvVar.f40911c;
                Pattern pattern = LaunchActivity.D1;
                ((LaunchActivity) qvVar.f40910b).W(intent, true, false, false, null, true, false);
                return true;
            }
            return false;
        }
        return false;
    }
}
