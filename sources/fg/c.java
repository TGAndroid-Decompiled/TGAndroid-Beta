package fg;

import android.widget.FrameLayout;
import jg.a2;
import jg.r0;
import org.telegram.messenger.i0;
import th.j6;
import vh.b4;
import w7.u;
public final class c implements o1.g {
    public final int f7062a;
    public final FrameLayout f7063b;

    public c(int i10, FrameLayout frameLayout) {
        this.f7062a = i10;
        this.f7063b = frameLayout;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.f7062a) {
            case 0:
                l lVar = (l) this.f7063b;
                float f11 = f7 / 1000.0f;
                i iVar = lVar.f7086a;
                iVar.setPivotX(i0.L(28.0f));
                iVar.setPivotY(i0.L(28.0f));
                iVar.setScaleX(f11);
                iVar.setScaleY(f11);
                iVar.setAlpha(u.a(f11, 0.0f, 1.0f));
                lVar.invalidate();
                return;
            case 1:
                r0 r0Var = (r0) this.f7063b;
                float f12 = f7 / 1000.0f;
                r0Var.f10178m1 = f12;
                a2 a2Var = r0Var.f10168e1;
                a2Var.setAlpha(f12);
                a2Var.invalidate();
                r0Var.M0.invalidate();
                r0Var.f10167d1.getTypefaceCell().setAlpha(1.0f - r0Var.f10178m1);
                return;
            case 2:
                j6 j6Var = (j6) this.f7063b;
                j6Var.f49129d0 = f7;
                j6Var.f49131f0 = f10;
                return;
            default:
                b4 b4Var = (b4) this.f7063b;
                float f13 = f7 / 1000.0f;
                b4Var.f50964c1 = f13;
                a2 a2Var2 = b4Var.V0;
                a2Var2.setAlpha(f13);
                a2Var2.invalidate();
                b4Var.D0.invalidate();
                b4Var.U0.getTypefaceCell().setAlpha(1.0f - b4Var.f50964c1);
                return;
        }
    }
}
