package bg;

import android.widget.FrameLayout;
import lh.a8;
import nh.t5;
import org.telegram.messenger.AndroidUtilities;
public final class z implements o1.h {
    public final int f2632a;
    public final FrameLayout f2633b;

    public z(int i10, FrameLayout frameLayout) {
        this.f2632a = i10;
        this.f2633b = frameLayout;
    }

    @Override
    public final void a(o1.i iVar, float f9, float f10) {
        switch (this.f2632a) {
            case 0:
                g1 g1Var = (g1) this.f2633b;
                float f11 = f9 / 1000.0f;
                g1Var.f2261z1 = f11;
                t2 t2Var = g1Var.f2249r1;
                t2Var.setAlpha(f11);
                t2Var.invalidate();
                g1Var.Z0.invalidate();
                g1Var.f2248q1.getTypefaceCell().setAlpha(1.0f - g1Var.f2261z1);
                return;
            case 1:
                a8 a8Var = (a8) this.f2633b;
                a8Var.W = f9;
                a8Var.f15341b0 = f10;
                return;
            case 2:
                t5 t5Var = (t5) this.f2633b;
                float f12 = f9 / 1000.0f;
                t5Var.f18651p1 = f12;
                t2 t2Var2 = t5Var.f18638i1;
                t2Var2.setAlpha(f12);
                t2Var2.invalidate();
                t5Var.Q0.invalidate();
                t5Var.f18636h1.getTypefaceCell().setAlpha(1.0f - t5Var.f18651p1);
                return;
            default:
                xf.j jVar = (xf.j) this.f2633b;
                float f13 = f9 / 1000.0f;
                rf.d dVar = jVar.f50141a;
                dVar.setPivotX(AndroidUtilities.dp(28.0f));
                dVar.setPivotY(AndroidUtilities.dp(28.0f));
                dVar.setScaleX(f13);
                dVar.setScaleY(f13);
                dVar.setAlpha(i7.w.a(f13, 0.0f, 1.0f));
                jVar.invalidate();
                return;
        }
    }
}
