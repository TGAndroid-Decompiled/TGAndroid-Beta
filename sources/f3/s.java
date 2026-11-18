package f3;

import android.animation.ObjectAnimator;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.xs;
public final class s implements kb {
    public long f11196a;

    public s(fj fjVar) {
        this.f11196a = fj.B0(fjVar.f23965k);
        fjVar.e1();
    }

    public boolean a(tf.m mVar) {
        if (mVar.f912b == this.f11196a && tf.a.c(mVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void j(lb lbVar, wa waVar, ua uaVar, xa xaVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lbVar, lb.IN_OUT_OFFSET_Y2, lbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(xs.f42177c);
        ofFloat.addListener(new ah.l(waVar, uaVar, 20));
        ofFloat.addUpdateListener(new ch.w(12, xaVar, lbVar));
        ofFloat.start();
    }

    @Override
    public void u(lb lbVar, wa waVar, lg lgVar, pl plVar) {
        lbVar.setInOutOffset(lbVar.getMeasuredHeight());
        plVar.accept(Float.valueOf(lbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lbVar, lb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f11196a);
        ofFloat.setInterpolator(xs.d);
        ofFloat.addListener(new ah.l(waVar, lgVar, 19));
        ofFloat.addUpdateListener(new ch.w(13, plVar, lbVar));
        ofFloat.start();
    }
}
