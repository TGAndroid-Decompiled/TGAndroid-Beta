package m3;

import android.animation.ObjectAnimator;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.xs;
public final class n implements kb {
    public long f17244a;

    public boolean a(te.m mVar) {
        if (mVar.f4135b == this.f17244a && te.a.c(mVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void e(lb lbVar, wa waVar, ua uaVar, xa xaVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lbVar, lb.IN_OUT_OFFSET_Y2, lbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(xs.f34753c);
        ofFloat.addListener(new fg.j(waVar, uaVar, 15));
        ofFloat.addUpdateListener(new f2.g(8, xaVar, lbVar));
        ofFloat.start();
    }

    @Override
    public void g(lb lbVar, wa waVar, fg fgVar, dl dlVar) {
        lbVar.setInOutOffset(lbVar.getMeasuredHeight());
        dlVar.accept(Float.valueOf(lbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lbVar, lb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f17244a);
        ofFloat.setInterpolator(xs.d);
        ofFloat.addListener(new fg.j(waVar, fgVar, 14));
        ofFloat.addUpdateListener(new f2.g(9, dlVar, lbVar));
        ofFloat.start();
    }
}
