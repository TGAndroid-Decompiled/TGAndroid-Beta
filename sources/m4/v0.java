package m4;

import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.view.WindowManager;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.List;
import org.telegram.messenger.f8;
import org.telegram.messenger.l9;
import org.telegram.messenger.v2;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.wb0;
import v7.p8;
public final class v0 implements g1, h1, e2.j, org.telegram.ui.ActionBar.u1, wb0, n2.l, d9.k, l9, OnSuccessListener {
    public final int f12965a;

    public v0(int i10) {
        this.f12965a = i10;
    }

    public static RenderNode b(Object obj) {
        return (RenderNode) obj;
    }

    public static void c(WindowManager.LayoutParams layoutParams, int i10) {
        layoutParams.layoutInDisplayCutoutMode = i10;
    }

    @Override
    public void a(n1 n1Var, w wVar, List list) {
        switch (this.f12965a) {
            case 0:
                n1Var.x0(list);
                return;
            default:
                n1Var.x0(list);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        n1 n1Var = (n1) obj;
        switch (this.f12965a) {
            case 3:
                n1Var.stop();
                return;
            case 4:
                n1Var.b0();
                return;
            case 5:
                n1Var.G();
                return;
            case 6:
            default:
                n1Var.u();
                return;
            case 7:
                n1Var.a();
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.n0.u(e9.s.x(qVar.Y.f49994b, new th.m1(4)));
    }

    @Override
    public String e(int i10) {
        switch (this.f12965a) {
            case 14:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override
    public Object f(f0 f0Var, w wVar, int i10) {
        switch (this.f12965a) {
            case 2:
                f0Var.getClass();
                throw new ClassCastException();
            case 6:
                f0Var.getClass();
                throw new ClassCastException();
            case 8:
                f0Var.getClass();
                throw new ClassCastException();
            case 10:
                f0Var.getClass();
                throw new ClassCastException();
            default:
                oa.d dVar = f0Var.e;
                f0Var.s(wVar);
                dVar.getClass();
                return p8.b(new t1(-6));
        }
    }

    @Override
    public void h(x1 x1Var, int i10) {
        switch (this.f12965a) {
            case 13:
                return;
            case 14:
            case 15:
            default:
                x1Var.dismiss();
                return;
            case 16:
                x1Var.dismiss();
                return;
            case 17:
                x1Var.dismiss();
                return;
        }
    }

    @Override
    public Object l(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f12965a) {
            case 24:
                Typeface typeface = org.telegram.messenger.i0.f15999a;
                return "%s";
            default:
                return "%" + (num.intValue() + 1) + "$s";
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Void r12 = (Void) obj;
        boolean z10 = v2.f18448a;
        f8.b("sms listener registered");
    }

    public v0(Object obj, int i10) {
        this.f12965a = i10;
    }

    public v0(String str, int i10, int i11, r rVar) {
        this.f12965a = 2;
    }

    public v0(String str, r rVar, int i10) {
        this.f12965a = i10;
    }

    @Override
    public void release() {
    }

    private final void d(x1 x1Var, int i10) {
    }
}
