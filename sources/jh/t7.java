package jh;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class t7 implements o1.g {

    public final int f14004a;

    public final FrameLayout f14005b;

    public t7(int i10, FrameLayout frameLayout) {
        this.f14004a = i10;
        this.f14005b = frameLayout;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f14004a) {
            case 0:
                a8 a8Var = (a8) this.f14005b;
                a8Var.W = f10;
                a8Var.f13047b0 = f11;
                break;
            case 1:
                lh.f6 f6Var = (lh.f6) this.f14005b;
                float f12 = f10 / 1000.0f;
                f6Var.f15986p1 = f12;
                zf.t1 t1Var = f6Var.f15973i1;
                t1Var.setAlpha(f12);
                t1Var.invalidate();
                f6Var.Q0.invalidate();
                f6Var.f15971h1.getTypefaceCell().setAlpha(1.0f - f6Var.f15986p1);
                break;
            case 2:
                vf.i iVar = (vf.i) this.f14005b;
                float f13 = f10 / 1000.0f;
                vf.g gVar = iVar.f48906a;
                gVar.setPivotX(AndroidUtilities.dp(28.0f));
                gVar.setPivotY(AndroidUtilities.dp(28.0f));
                gVar.setScaleX(f13);
                gVar.setScaleY(f13);
                gVar.setAlpha(h7.n.a(f13, 0.0f, 1.0f));
                iVar.invalidate();
                break;
            default:
                zf.l0 l0Var = (zf.l0) this.f14005b;
                float f14 = f10 / 1000.0f;
                l0Var.f50542z1 = f14;
                zf.t1 t1Var2 = l0Var.f50530r1;
                t1Var2.setAlpha(f14);
                t1Var2.invalidate();
                l0Var.Z0.invalidate();
                l0Var.f50529q1.getTypefaceCell().setAlpha(1.0f - l0Var.f50542z1);
                break;
        }
    }
}
