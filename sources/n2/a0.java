package n2;

import android.graphics.BlendMode;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.view.WindowManager;
import com.google.android.gms.tasks.OnSuccessListener;
import org.telegram.messenger.a8;
import org.telegram.messenger.j9;
import org.telegram.messenger.r2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
public final class a0 implements h2.o, g9.k, l5.g, j9, OnSuccessListener, q1 {
    public final int f20696a;

    public a0(int i7) {
        this.f20696a = i7;
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
        return h9.i0.u(Integer.valueOf(((y2.i) obj).f60126a));
    }

    @Override
    public void h(t1 t1Var, int i7) {
        t1Var.dismiss();
    }

    @Override
    public void invoke(Object obj) {
        v vVar;
        switch (this.f20696a) {
            case 0:
                n0 n0Var = (n0) obj;
                n0Var.getClass();
                r0.f20849c0.getAndDecrement();
                v vVar2 = n0Var.f20828b.f20863n;
                if (vVar2 != 0) {
                    int i7 = n0Var.f20827a.f20818a;
                    vVar2.f(new Object());
                    return;
                }
                return;
            case 1:
                n0 n0Var2 = (n0) obj;
                r0 r0Var = n0Var2.f20828b;
                if (n0Var2.equals(r0Var.f20859j) && (vVar = r0Var.f20863n) != null && r0Var.O) {
                    vVar.n0();
                    return;
                }
                return;
            case 2:
                n0 n0Var3 = (n0) obj;
                r0 r0Var2 = n0Var3.f20828b;
                if (n0Var3.equals(r0Var2.f20859j) && r0Var2.M) {
                    r0Var2.N = true;
                    return;
                }
                return;
            default:
                v vVar3 = ((m0) obj).f20817a.f20863n;
                if (vVar3 != null) {
                    vVar3.G();
                    return;
                }
                return;
        }
    }

    @Override
    public Object o(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f20696a) {
            case 14:
                Typeface typeface = org.telegram.messenger.g0.f23583a;
                return "%s";
            default:
                return "%" + (num.intValue() + 1) + "$s";
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Void r12 = (Void) obj;
        boolean z10 = r2.f26206a;
        a8.b("sms listener registered");
    }

    @Override
    public void a(Exception exc) {
    }
}
