package ag;

import android.widget.FrameLayout;
import eg.c1;
import eg.o2;
import oh.a8;
import org.telegram.messenger.AndroidUtilities;
import qh.b5;
public final class c implements o1.g {
    public final int f192a;
    public final FrameLayout f193b;

    public c(int i10, FrameLayout frameLayout) {
        this.f192a = i10;
        this.f193b = frameLayout;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.f192a) {
            case 0:
                o oVar = (o) this.f193b;
                float f12 = f10 / 1000.0f;
                l lVar = oVar.f222a;
                lVar.setPivotX(AndroidUtilities.dp(28.0f));
                lVar.setPivotY(AndroidUtilities.dp(28.0f));
                lVar.setScaleX(f12);
                lVar.setScaleY(f12);
                lVar.setAlpha(k7.o.a(f12, 0.0f, 1.0f));
                oVar.invalidate();
                return;
            case 1:
                c1 c1Var = (c1) this.f193b;
                float f13 = f10 / 1000.0f;
                c1Var.A1 = f13;
                o2 o2Var = c1Var.f5128s1;
                o2Var.setAlpha(f13);
                o2Var.invalidate();
                c1Var.f5101a1.invalidate();
                c1Var.f5127r1.getTypefaceCell().setAlpha(1.0f - c1Var.A1);
                return;
            case 2:
                a8 a8Var = (a8) this.f193b;
                a8Var.f16846a0 = f10;
                a8Var.f16848c0 = f11;
                return;
            default:
                b5 b5Var = (b5) this.f193b;
                float f14 = f10 / 1000.0f;
                b5Var.f44975q1 = f14;
                o2 o2Var2 = b5Var.f44962j1;
                o2Var2.setAlpha(f14);
                o2Var2.invalidate();
                b5Var.R0.invalidate();
                b5Var.f44960i1.getTypefaceCell().setAlpha(1.0f - b5Var.f44975q1);
                return;
        }
    }
}
