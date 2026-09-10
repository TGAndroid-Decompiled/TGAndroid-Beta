package c3;

import android.animation.ObjectAnimator;
import bi.u3;
import gg.t1;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.tb;
public final class s implements sb {
    public long f4212a;

    @Override
    public void I(tb tbVar, eb ebVar, rg rgVar, rl rlVar) {
        tbVar.setInOutOffset(tbVar.getMeasuredHeight());
        rlVar.accept(Float.valueOf(tbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tbVar, tb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f4212a);
        ofFloat.setInterpolator(pt.d);
        ofFloat.addListener(new u3(ebVar, rgVar, 14));
        ofFloat.addUpdateListener(new t1(11, rlVar, tbVar));
        ofFloat.start();
    }

    public boolean a(lf.n nVar) {
        if (nVar.f6077b == this.f4212a && lf.a.c(nVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void k(tb tbVar, eb ebVar, cb cbVar, fb fbVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tbVar, tb.IN_OUT_OFFSET_Y2, tbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(pt.f26248c);
        ofFloat.addListener(new u3(ebVar, cbVar, 15));
        ofFloat.addUpdateListener(new t1(10, fbVar, tbVar));
        ofFloat.start();
    }
}
