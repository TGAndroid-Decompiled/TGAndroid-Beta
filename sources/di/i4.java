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
import org.telegram.ui.ru;
public final class i4 {
    public boolean f9104a;
    public Object f9105b;
    public Object f9106c;
    public Object d;
    public Object f9107e;
    public Object f9108f;
    public Object f9109g;

    public i4(Context context, int i7) {
        switch (i7) {
            case 3:
                this.d = vi.f.f57546a;
                this.f9104a = true;
                this.f9109g = vi.h.H;
                this.f9105b = context;
                return;
            default:
                this.f9105b = context;
                this.f9106c = n2.b.f20131f;
                return;
        }
    }

    public static void c(ru ruVar) {
        ?? obj = new Object();
        obj.f9105b = new org.telegram.messenger.h5(obj, 0);
        obj.d = ruVar;
        int i7 = p10.f24470s0;
        obj.f9109g = new org.telegram.messenger.a(obj, 6);
        obj.f9108f = org.telegram.messenger.g5.r(i7);
        obj.f9107e = qs.f(i7);
        obj.f9106c = new Handler(Looper.myLooper());
        if (!obj.d(false)) {
            ((qs) obj.f9107e).b((org.telegram.messenger.h5) obj.f9105b, qs.O);
            ((Handler) obj.f9106c).postDelayed((org.telegram.messenger.a) obj.f9109g, 1000L);
        }
    }

    public n2.q0 a() {
        boolean z9;
        n2.b bVar;
        Context context = (Context) this.f9105b;
        boolean z10 = true;
        ia.p(!this.f9104a);
        this.f9104a = true;
        if (((h6.m) this.d) == null) {
            this.d = new h6.m(new f2.n[0]);
        }
        if (((n2.h0) this.f9108f) == null) {
            if (((n2.k0) this.f9109g) == null) {
                this.f9109g = new n2.k0(context);
            }
            if (((n2.r0) this.f9107e) == null) {
                this.f9107e = n2.r0.f20300a;
            }
            n2.g0 g0Var = new n2.g0(context);
            if (context != null) {
                bVar = null;
            } else {
                bVar = (n2.b) this.f9106c;
            }
            Context context2 = g0Var.f20181a;
            if (context2 == null) {
                g0Var.d = bVar;
            }
            n2.k0 k0Var = (n2.k0) this.f9109g;
            g0Var.f20182b = k0Var;
            g0Var.f20183c = (n2.r0) this.f9107e;
            if (k0Var == null) {
                g0Var.f20182b = new n2.k0(context2);
            }
            this.f9108f = new n2.h0(g0Var);
        } else {
            if (((n2.k0) this.f9109g) == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.p(z9);
            if (((n2.r0) this.f9107e) != null) {
                z10 = false;
            }
            ia.p(z10);
        }
        return new n2.q0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f9109g;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((View) arrayList.get(i7)).invalidate();
        }
    }

    public boolean d(boolean z9) {
        boolean z10 = this.f9104a;
        if (!z10) {
            if (((org.telegram.messenger.g5) this.f9108f).h || z9) {
                if (!z10) {
                    qs qsVar = (qs) this.f9107e;
                    if (qsVar != null) {
                        qsVar.n((org.telegram.messenger.h5) this.f9105b, qs.O);
                    }
                    Handler handler = (Handler) this.f9106c;
                    if (handler != null) {
                        handler.removeCallbacks((org.telegram.messenger.a) this.f9109g);
                    }
                    this.f9104a = true;
                }
                ru ruVar = (ru) this.d;
                Intent intent = (Intent) ruVar.f49605c;
                String str = LaunchActivity.B1;
                ((LaunchActivity) ruVar.f49604b).W(intent, true, false, false, null, true, false);
                return true;
            }
            return false;
        }
        return false;
    }
}
