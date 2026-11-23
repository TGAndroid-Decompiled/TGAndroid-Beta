package n2;

import android.graphics.BlendMode;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.WindowManager;
import com.google.android.gms.tasks.OnSuccessListener;
import org.telegram.messenger.a8;
import org.telegram.messenger.i9;
import org.telegram.messenger.s2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
public final class a0 implements h2.o, g9.k, l5.g, i9, OnSuccessListener, q1 {
    public final int f21150a;

    public a0(int i7) {
        this.f21150a = i7;
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
        return h9.i0.u(Integer.valueOf(((y2.i) obj).f60820a));
    }

    @Override
    public Object h(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f21150a) {
            case 15:
                Typeface typeface = org.telegram.messenger.g0.f24198a;
                return "%s";
            default:
                return "%" + (num.intValue() + 1) + "$s";
        }
    }

    @Override
    public void i(t1 t1Var, int i7) {
        t1Var.dismiss();
    }

    @Override
    public void invoke(Object obj) {
        long j3;
        v vVar;
        switch (this.f21150a) {
            case 0:
                o0 o0Var = (o0) obj;
                s0 s0Var = o0Var.f21286b;
                if (o0Var.equals(s0Var.f21317j) && s0Var.f21321n != null) {
                    p0 p0Var = s0Var.f21323p;
                    int i7 = p0Var.f21291b;
                    if (i7 != -1) {
                        long j10 = ((n) p0Var.f21293e).f21279f / i7;
                        h0 h0Var = s0Var.f21327t;
                        h0Var.getClass();
                        j3 = h2.l0.Y(h0Var.f21197a.getSampleRate(), j10);
                    } else {
                        j3 = -9223372036854775807L;
                    }
                    s0Var.f21321n.k0(h2.l0.h0(j3), ((n) s0Var.f21323p.f21293e).f21279f, SystemClock.elapsedRealtime() - s0Var.W);
                    return;
                }
                return;
            case 1:
                o0 o0Var2 = (o0) obj;
                o0Var2.getClass();
                s0.f21307c0.getAndDecrement();
                v vVar2 = o0Var2.f21286b.f21321n;
                if (vVar2 != 0) {
                    int i10 = o0Var2.f21285a.f21275a;
                    vVar2.f(new Object());
                    return;
                }
                return;
            case 2:
                o0 o0Var3 = (o0) obj;
                s0 s0Var2 = o0Var3.f21286b;
                if (o0Var3.equals(s0Var2.f21317j) && (vVar = s0Var2.f21321n) != null && s0Var2.O) {
                    vVar.f0();
                    return;
                }
                return;
            case 3:
                o0 o0Var4 = (o0) obj;
                s0 s0Var3 = o0Var4.f21286b;
                if (o0Var4.equals(s0Var3.f21317j) && s0Var3.M) {
                    s0Var3.N = true;
                    return;
                }
                return;
            default:
                v vVar3 = ((n0) obj).f21284a.f21321n;
                if (vVar3 != null) {
                    vVar3.N();
                    return;
                }
                return;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Void r12 = (Void) obj;
        boolean z10 = s2.f26829a;
        a8.b("sms listener registered");
    }

    @Override
    public void a(Exception exc) {
    }
}
