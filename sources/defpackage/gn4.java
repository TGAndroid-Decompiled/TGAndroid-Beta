package defpackage;

import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;
public final class gn4 implements m7, j79, ed, jga {
    public final FragmentContextView a;

    public gn4(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override
    public final void e(db6 db6Var) {
        float[] fArr = FragmentContextView.W0;
        this.a.k(db6Var);
    }

    @Override
    public final void f(k79 k79Var) {
        float[] fArr = FragmentContextView.W0;
        FragmentContextView fragmentContextView = this.a;
        k79 k79Var2 = fragmentContextView.U0;
        float f = 1.0f - k79Var2.a.d.c.a;
        fragmentContextView.d.setAlpha(f);
        fragmentContextView.d.setScaleX(gl.R1(0.7f, 1.0f, f));
        fragmentContextView.d.setScaleY(gl.R1(0.7f, 1.0f, f));
        Iterator it = k79Var2.iterator();
        while (it.hasNext()) {
            u46 u46Var = (u46) it.next();
            float c = u46Var.c();
            Object obj = u46Var.a;
            float R1 = gl.R1(0.7f, 1.0f, c);
            qn4 qn4Var = (qn4) obj;
            t75 t75Var = qn4Var.b;
            t75 t75Var2 = qn4Var.b;
            t75Var.setAlpha(u46Var.c());
            t75Var2.setScaleX(R1);
            t75Var2.setScaleY(R1);
        }
    }

    @Override
    public final void h(int i) {
        float[] fArr = FragmentContextView.W0;
        if (i >= 0) {
            float[] fArr2 = FragmentContextView.W0;
            if (i < 6) {
                MediaController w = MediaController.w();
                FragmentContextView fragmentContextView = this.a;
                float x = w.x(fragmentContextView.W);
                float f = fArr2[i];
                MediaController.w().l0(fragmentContextView.W, f);
                if (x != f) {
                    fragmentContextView.l(x, f, false);
                }
            }
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        FragmentContextView fragmentContextView = this.a;
        float[] fArr = FragmentContextView.W0;
        d dVar = fragmentContextView.h;
        if (dVar instanceof cj3) {
            for (int i2 = 0; i2 < 4; i2++) {
                Utilities.d.c(new va6(eb6.f(i2), (byte) 6));
            }
            return;
        }
        eb6.f(dVar.getCurrentAccount()).k(fragmentContextView.n.a());
    }

    @Override
    public final void c() {
    }
}
