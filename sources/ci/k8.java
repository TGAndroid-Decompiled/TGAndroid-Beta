package ci;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class k8 implements o1.g {
    public final int f5503a;
    public final FrameLayout f5504b;

    public k8(int i10, FrameLayout frameLayout) {
        this.f5503a = i10;
        this.f5504b = frameLayout;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f5503a) {
            case 0:
                r8 r8Var = (r8) this.f5504b;
                r8Var.f5878d0 = f7;
                r8Var.f5880f0 = f10;
                return;
            case 1:
                ei.f6 f6Var = (ei.f6) this.f5504b;
                float f11 = f7 / 1000.0f;
                f6Var.f9046t1 = f11;
                rg.u1 u1Var = f6Var.f9032m1;
                u1Var.setAlpha(f11);
                u1Var.invalidate();
                f6Var.U0.invalidate();
                f6Var.l1.getTypefaceCell().setAlpha(1.0f - f6Var.f9046t1);
                return;
            case 2:
                ng.i iVar = (ng.i) this.f5504b;
                float f12 = f7 / 1000.0f;
                ah.v vVar = iVar.f17527a;
                vVar.setPivotX(AndroidUtilities.dp(28.0f));
                vVar.setPivotY(AndroidUtilities.dp(28.0f));
                vVar.setScaleX(f12);
                vVar.setScaleY(f12);
                vVar.setAlpha(w7.r.a(f12, 0.0f, 1.0f));
                iVar.invalidate();
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.f5504b;
                float f13 = f7 / 1000.0f;
                m0Var.D1 = f13;
                rg.u1 u1Var2 = m0Var.f45916v1;
                u1Var2.setAlpha(f13);
                u1Var2.invalidate();
                m0Var.f45888d1.invalidate();
                m0Var.f45915u1.getTypefaceCell().setAlpha(1.0f - m0Var.D1);
                return;
        }
    }
}
