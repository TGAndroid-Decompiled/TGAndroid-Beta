package di;

import a8.ee;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class i8 implements o1.g {
    public final int f8687a;
    public final FrameLayout f8688b;

    public i8(int i10, FrameLayout frameLayout) {
        this.f8687a = i10;
        this.f8688b = frameLayout;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f8687a) {
            case 0:
                p8 p8Var = (p8) this.f8688b;
                p8Var.f8913d0 = f7;
                p8Var.f8915f0 = f10;
                return;
            case 1:
                fi.e6 e6Var = (fi.e6) this.f8688b;
                float f11 = f7 / 1000.0f;
                e6Var.f10794i1 = f11;
                sg.v1 v1Var = e6Var.f10780b1;
                v1Var.setAlpha(f11);
                v1Var.invalidate();
                e6Var.J0.invalidate();
                e6Var.f10779a1.getTypefaceCell().setAlpha(1.0f - e6Var.f10794i1);
                return;
            case 2:
                og.i iVar = (og.i) this.f8688b;
                float f12 = f7 / 1000.0f;
                bh.p pVar = iVar.f19408a;
                pVar.setPivotX(AndroidUtilities.dp(28.0f));
                pVar.setPivotY(AndroidUtilities.dp(28.0f));
                pVar.setScaleX(f12);
                pVar.setScaleY(f12);
                pVar.setAlpha(ee.a(f12, 0.0f, 1.0f));
                iVar.invalidate();
                return;
            default:
                sg.n0 n0Var = (sg.n0) this.f8688b;
                float f13 = f7 / 1000.0f;
                n0Var.f48352s1 = f13;
                sg.v1 v1Var2 = n0Var.f48341k1;
                v1Var2.setAlpha(f13);
                v1Var2.invalidate();
                n0Var.S0.invalidate();
                n0Var.f48340j1.getTypefaceCell().setAlpha(1.0f - n0Var.f48352s1);
                return;
        }
    }
}
