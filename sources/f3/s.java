package f3;

import android.animation.ObjectAnimator;
import org.telegram.messenger.gj;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.zs;
public final class s implements kb {
    public long f11228a;

    public s(gj gjVar) {
        this.f11228a = gj.B0(gjVar.f24213k);
        gjVar.e1();
    }

    @Override
    public void J(lb lbVar, wa waVar, og ogVar, rl rlVar) {
        lbVar.setInOutOffset(lbVar.getMeasuredHeight());
        rlVar.accept(Float.valueOf(lbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lbVar, lb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f11228a);
        ofFloat.setInterpolator(zs.d);
        ofFloat.addListener(new ah.l(waVar, ogVar, 19));
        ofFloat.addUpdateListener(new ch.w(13, rlVar, lbVar));
        ofFloat.start();
    }

    public boolean a(tf.m mVar) {
        if (mVar.f912b == this.f11228a && tf.a.c(mVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void j(lb lbVar, wa waVar, ua uaVar, xa xaVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lbVar, lb.IN_OUT_OFFSET_Y2, lbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(zs.f42976c);
        ofFloat.addListener(new ah.l(waVar, uaVar, 20));
        ofFloat.addUpdateListener(new ch.w(12, xaVar, lbVar));
        ofFloat.start();
    }
}
