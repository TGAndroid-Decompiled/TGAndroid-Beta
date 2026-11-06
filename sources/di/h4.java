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
import org.telegram.ui.pu;
public final class h4 {
    public boolean f9074a;
    public Object f9075b;
    public Object f9076c;
    public Object d;
    public Object f9077e;
    public Object f9078f;
    public Object f9079g;

    public h4(Context context, int i7) {
        switch (i7) {
            case 3:
                this.d = vi.f.f57417a;
                this.f9074a = true;
                this.f9079g = vi.h.H;
                this.f9075b = context;
                return;
            default:
                this.f9075b = context;
                this.f9076c = n2.b.f20128f;
                return;
        }
    }

    public static void c(pu puVar) {
        ?? obj = new Object();
        obj.f9075b = new org.telegram.messenger.h5(obj, 0);
        obj.d = puVar;
        int i7 = p10.f24459s0;
        obj.f9079g = new org.telegram.messenger.a(obj, 6);
        obj.f9078f = org.telegram.messenger.g5.r(i7);
        obj.f9077e = qs.f(i7);
        obj.f9076c = new Handler(Looper.myLooper());
        if (!obj.d(false)) {
            ((qs) obj.f9077e).b((org.telegram.messenger.h5) obj.f9075b, qs.O);
            ((Handler) obj.f9076c).postDelayed((org.telegram.messenger.a) obj.f9079g, 1000L);
        }
    }

    public n2.q0 a() {
        boolean z9;
        n2.b bVar;
        Context context = (Context) this.f9075b;
        boolean z10 = true;
        ia.p(!this.f9074a);
        this.f9074a = true;
        if (((h6.m) this.d) == null) {
            this.d = new h6.m(new f2.n[0]);
        }
        if (((n2.h0) this.f9078f) == null) {
            if (((n2.k0) this.f9079g) == null) {
                this.f9079g = new n2.k0(context);
            }
            if (((n2.r0) this.f9077e) == null) {
                this.f9077e = n2.r0.f20297a;
            }
            n2.g0 g0Var = new n2.g0(context);
            if (context != null) {
                bVar = null;
            } else {
                bVar = (n2.b) this.f9076c;
            }
            Context context2 = g0Var.f20178a;
            if (context2 == null) {
                g0Var.d = bVar;
            }
            n2.k0 k0Var = (n2.k0) this.f9079g;
            g0Var.f20179b = k0Var;
            g0Var.f20180c = (n2.r0) this.f9077e;
            if (k0Var == null) {
                g0Var.f20179b = new n2.k0(context2);
            }
            this.f9078f = new n2.h0(g0Var);
        } else {
            if (((n2.k0) this.f9079g) == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.p(z9);
            if (((n2.r0) this.f9077e) != null) {
                z10 = false;
            }
            ia.p(z10);
        }
        return new n2.q0(this);
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.f9079g;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((View) arrayList.get(i7)).invalidate();
        }
    }

    public boolean d(boolean z9) {
        boolean z10 = this.f9074a;
        if (!z10) {
            if (((org.telegram.messenger.g5) this.f9078f).h || z9) {
                if (!z10) {
                    qs qsVar = (qs) this.f9077e;
                    if (qsVar != null) {
                        qsVar.n((org.telegram.messenger.h5) this.f9075b, qs.O);
                    }
                    Handler handler = (Handler) this.f9076c;
                    if (handler != null) {
                        handler.removeCallbacks((org.telegram.messenger.a) this.f9079g);
                    }
                    this.f9074a = true;
                }
                pu puVar = (pu) this.d;
                Intent intent = (Intent) puVar.f48924c;
                String str = LaunchActivity.B1;
                ((LaunchActivity) puVar.f48923b).W(intent, true, false, false, null, true, false);
                return true;
            }
            return false;
        }
        return false;
    }
}
