package di;

import a8.ee;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class i8 implements o1.g {
    public final int f8686a;
    public final FrameLayout f8687b;

    public i8(int i10, FrameLayout frameLayout) {
        this.f8686a = i10;
        this.f8687b = frameLayout;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f8686a) {
            case 0:
                p8 p8Var = (p8) this.f8687b;
                p8Var.f8912d0 = f7;
                p8Var.f8914f0 = f10;
                return;
            case 1:
                fi.e6 e6Var = (fi.e6) this.f8687b;
                float f11 = f7 / 1000.0f;
                e6Var.f10793i1 = f11;
                sg.u1 u1Var = e6Var.f10779b1;
                u1Var.setAlpha(f11);
                u1Var.invalidate();
                e6Var.J0.invalidate();
                e6Var.f10778a1.getTypefaceCell().setAlpha(1.0f - e6Var.f10793i1);
                return;
            case 2:
                og.i iVar = (og.i) this.f8687b;
                float f12 = f7 / 1000.0f;
                bh.p pVar = iVar.f19407a;
                pVar.setPivotX(AndroidUtilities.dp(28.0f));
                pVar.setPivotY(AndroidUtilities.dp(28.0f));
                pVar.setScaleX(f12);
                pVar.setScaleY(f12);
                pVar.setAlpha(ee.a(f12, 0.0f, 1.0f));
                iVar.invalidate();
                return;
            default:
                sg.m0 m0Var = (sg.m0) this.f8687b;
                float f13 = f7 / 1000.0f;
                m0Var.f48381s1 = f13;
                sg.u1 u1Var2 = m0Var.f48370k1;
                u1Var2.setAlpha(f13);
                u1Var2.invalidate();
                m0Var.S0.invalidate();
                m0Var.f48369j1.getTypefaceCell().setAlpha(1.0f - m0Var.f48381s1);
                return;
        }
    }
}
