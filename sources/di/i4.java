package di;

import a8.ia;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.su;
public final class i4 {
    public boolean f9109a;
    public Object f9110b;
    public Object f9111c;
    public Object d;
    public Object f9112e;
    public Object f9113f;
    public Object f9114g;

    public i4(Context context, int i7) {
        switch (i7) {
            case 3:
                this.d = vi.f.f57545a;
                this.f9109a = true;
                this.f9114g = vi.h.H;
                this.f9110b = context;
                return;
            default:
                this.f9110b = context;
                this.f9111c = n2.b.f20136f;
                return;
        }
    }

    public static void c(su suVar) {
        ?? obj = new Object();
        obj.f9110b = new org.telegram.messenger.h5(obj, 0);
        obj.d = suVar;
        int i7 = p10.f24474s0;
        obj.f9114g = new org.telegram.messenger.a(obj, 6);
        obj.f9113f = org.telegram.messenger.g5.r(i7);
        obj.f9112e = qs.f(i7);
        obj.f9111c = new Handler(Looper.myLooper());
        if (!obj.d(false)) {
            ((qs) obj.f9112e).b((org.telegram.messenger.h5) obj.f9110b, qs.O);
            ((Handler) obj.f9111c).postDelayed((org.telegram.messenger.a) obj.f9114g, 1000L);
        }
    }

    public n2.q0 a() {
        boolean z9;
        n2.b bVar;
        Context context = (Context) this.f9110b;
        boolean z10 = true;
        ia.p(!this.f9109a);
        this.f9109a = true;
        if (((h6.m) this.d) == null) {
            this.d = new h6.m(new f2.n[0]);
        }
        if (((n2.h0) this.f9113f) == null) {
            if (((n2.k0) this.f9114g) == null) {
                this.f9114g = new n2.k0(context);
            }
            if (((n2.r0) this.f9112e) == null) {
                this.f9112e = n2.r0.f20305a;
            }
            n2.g0 g0Var = new n2.g0(context);
            if (context != null) {
                bVar = null;
            } else {
                bVar = (n2.b) this.f9111c;
            }
            Context context2 = g0Var.f20186a;
            if (context2 == null) {
                g0Var.d = bVar;
            }
            n2.k0 k0Var = (n2.k0) this.f9114g;
            g0Var.f20187b = k0Var;
            g0Var.f20188c = (n2.r0) this.f9112e;
            if (k0Var == null) {
                g0Var.f20187b = new n2.k0(context2);
            }
            this.f9113f = new n2.h0(g0Var);
        } else {
            if (((n2.k0) this.f9114g) == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.p(z9);
            if (((n2.r0) this.f9112e) != null) {
                z10 = false;
            }
            ia.p(z10);
        }
        return new n2.q0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f9114g;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((View) arrayList.get(i7)).invalidate();
        }
    }

    public boolean d(boolean z9) {
        boolean z10 = this.f9109a;
        if (!z10) {
            if (((org.telegram.messenger.g5) this.f9113f).h || z9) {
                if (!z10) {
                    qs qsVar = (qs) this.f9112e;
                    if (qsVar != null) {
                        qsVar.n((org.telegram.messenger.h5) this.f9110b, qs.O);
                    }
                    Handler handler = (Handler) this.f9111c;
                    if (handler != null) {
                        handler.removeCallbacks((org.telegram.messenger.a) this.f9114g);
                    }
                    this.f9109a = true;
                }
                su suVar = (su) this.d;
                Intent intent = (Intent) suVar.f49959c;
                String str = LaunchActivity.B1;
                ((LaunchActivity) suVar.f49958b).W(intent, true, false, false, null, true, false);
                return true;
            }
            return false;
        }
        return false;
    }
}
