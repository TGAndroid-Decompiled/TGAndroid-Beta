package n2;

import android.graphics.BlendMode;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.WindowManager;
import com.google.android.gms.tasks.OnSuccessListener;
import org.telegram.messenger.a8;
import org.telegram.messenger.j9;
import org.telegram.messenger.s2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
public final class a0 implements h2.o, g9.k, l5.g, j9, OnSuccessListener, q1 {
    public final int f21088a;

    public a0(int i7) {
        this.f21088a = i7;
    }

    public static BlendMode c(Object obj) {
        return (BlendMode) obj;
    }

    public static RenderNode d(Object obj) {
        return (RenderNode) obj;
    }

    public static void g(WindowManager.LayoutParams layoutParams, int i7) {
        layoutParams.layoutInDisplayCutoutMode = i7;
    }

    @Override
    public Object apply(Object obj) {
        return h9.i0.u(Integer.valueOf(((y2.i) obj).f60737a));
    }

    @Override
    public void h(t1 t1Var, int i7) {
        t1Var.dismiss();
    }

    @Override
    public void invoke(Object obj) {
        long j3;
        v vVar;
        switch (this.f21088a) {
            case 0:
                n0 n0Var = (n0) obj;
                r0 r0Var = n0Var.f21220b;
                if (n0Var.equals(r0Var.f21251j) && r0Var.f21255n != null) {
                    o0 o0Var = r0Var.f21257p;
                    int i7 = o0Var.f21222b;
                    if (i7 != -1) {
                        long j10 = ((n) o0Var.f21224e).f21214f / i7;
                        g0 g0Var = r0Var.f21261t;
                        g0Var.getClass();
                        j3 = h2.l0.Y(g0Var.f21131a.getSampleRate(), j10);
                    } else {
                        j3 = -9223372036854775807L;
                    }
                    r0Var.f21255n.W1(h2.l0.h0(j3), ((n) r0Var.f21257p.f21224e).f21214f, SystemClock.elapsedRealtime() - r0Var.W);
                    return;
                }
                return;
            case 1:
                n0 n0Var2 = (n0) obj;
                n0Var2.getClass();
                r0.f21241c0.getAndDecrement();
                v vVar2 = n0Var2.f21220b.f21255n;
                if (vVar2 != 0) {
                    int i10 = n0Var2.f21219a.f21210a;
                    vVar2.k(new Object());
                    return;
                }
                return;
            case 2:
                n0 n0Var3 = (n0) obj;
                r0 r0Var2 = n0Var3.f21220b;
                if (n0Var3.equals(r0Var2.f21251j) && (vVar = r0Var2.f21255n) != null && r0Var2.O) {
                    vVar.D1();
                    return;
                }
                return;
            case 3:
                n0 n0Var4 = (n0) obj;
                r0 r0Var3 = n0Var4.f21220b;
                if (n0Var4.equals(r0Var3.f21251j) && r0Var3.M) {
                    r0Var3.N = true;
                    return;
                }
                return;
            default:
                v vVar3 = ((m0) obj).f21209a.f21255n;
                if (vVar3 != null) {
                    vVar3.M0();
                    return;
                }
                return;
        }
    }

    @Override
    public Object m(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f21088a) {
            case 15:
                Typeface typeface = org.telegram.messenger.g0.f24018a;
                return "%s";
            default:
                return "%" + (num.intValue() + 1) + "$s";
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Void r12 = (Void) obj;
        boolean z10 = s2.f26730a;
        a8.b("sms listener registered");
    }

    @Override
    public void a(Exception exc) {
    }
}
