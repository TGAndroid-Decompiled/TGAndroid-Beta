package defpackage;

import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.FragmentContextView;
public final class lp4 implements n7, wa9, fd, cka {
    public final FragmentContextView a;

    public lp4(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override
    public final void a(hd6 hd6Var) {
        float[] fArr = FragmentContextView.W0;
        this.a.k(hd6Var);
    }

    @Override
    public final void f(xa9 xa9Var) {
        float[] fArr = FragmentContextView.W0;
        FragmentContextView fragmentContextView = this.a;
        xa9 xa9Var2 = fragmentContextView.U0;
        float f = 1.0f - xa9Var2.a.d.c.a;
        fragmentContextView.d.setAlpha(f);
        fragmentContextView.d.setScaleX(hl.R1(0.7f, 1.0f, f));
        fragmentContextView.d.setScaleY(hl.R1(0.7f, 1.0f, f));
        Iterator it = xa9Var2.iterator();
        while (it.hasNext()) {
            y66 y66Var = (y66) it.next();
            float c = y66Var.c();
            Object obj = y66Var.a;
            float R1 = hl.R1(0.7f, 1.0f, c);
            vp4 vp4Var = (vp4) obj;
            v95 v95Var = vp4Var.b;
            v95 v95Var2 = vp4Var.b;
            v95Var.setAlpha(y66Var.c());
            v95Var2.setScaleX(R1);
            v95Var2.setScaleY(R1);
        }
    }

    @Override
    public final void g(int i) {
        float[] fArr = FragmentContextView.W0;
        if (i >= 0) {
            float[] fArr2 = FragmentContextView.W0;
            if (i < 6) {
                MediaController z = MediaController.z();
                FragmentContextView fragmentContextView = this.a;
                float A = z.A(fragmentContextView.W);
                float f = fArr2[i];
                MediaController.z().o0(fragmentContextView.W, f);
                if (A != f) {
                    fragmentContextView.l(A, f, false);
                }
            }
        }
    }

    @Override
    public final void w(id idVar, int i) {
        FragmentContextView fragmentContextView = this.a;
        float[] fArr = FragmentContextView.W0;
        e eVar = fragmentContextView.h;
        if (eVar instanceof uj3) {
            for (int i2 = 0; i2 < 4; i2++) {
                Utilities.d.c(new zc6(id6.f(i2), (byte) 5));
            }
            return;
        }
        id6.f(eVar.getCurrentAccount()).k(fragmentContextView.n.a());
    }

    @Override
    public final void c() {
    }
}
