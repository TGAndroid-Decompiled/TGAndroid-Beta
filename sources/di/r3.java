package di;

import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;
public final class r3 implements Runnable {
    public final int f9664a;
    public final f6 f9665b;

    public r3(f6 f6Var, int i7) {
        this.f9664a = i7;
        this.f9665b = f6Var;
    }

    @Override
    public final void run() {
        switch (this.f9664a) {
            case 0:
                f6 f6Var = this.f9665b;
                f6Var.dismiss();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                TL_stars.TL_starGiftUnique M1 = f6Var.M1();
                if (T != null && M1 != null) {
                    cx cxVar = new cx(org.telegram.ui.Cells.c0.l(4, "onlySelect", "dialogsType", true));
                    cxVar.E2 = new a3.h(f6Var, M1, cxVar, 6);
                    T.presentFragment(cxVar);
                    return;
                }
                return;
            case 1:
                this.f9665b.j2();
                return;
            default:
                this.f9665b.onBackPressed();
                return;
        }
    }
}
