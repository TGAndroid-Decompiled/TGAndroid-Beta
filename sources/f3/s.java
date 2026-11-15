package f3;

import android.animation.ObjectAnimator;
import org.telegram.messenger.gj;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.qs;
public final class s implements bb {
    public long f10877a;

    public s(gj gjVar) {
        this.f10877a = gj.B0(gjVar.f23819k);
        gjVar.e1();
    }

    public boolean a(tf.m mVar) {
        if (mVar.f913b == this.f10877a && tf.a.c(mVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void b(cb cbVar, na naVar, la laVar, oa oaVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cbVar, cb.IN_OUT_OFFSET_Y2, cbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(qs.f38756c);
        ofFloat.addListener(new ah.l(naVar, laVar, 20));
        ofFloat.addUpdateListener(new ch.v(12, oaVar, cbVar));
        ofFloat.start();
    }

    @Override
    public void y(cb cbVar, na naVar, dg dgVar, il ilVar) {
        cbVar.setInOutOffset(cbVar.getMeasuredHeight());
        ilVar.accept(Float.valueOf(cbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cbVar, cb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f10877a);
        ofFloat.setInterpolator(qs.d);
        ofFloat.addListener(new ah.l(naVar, dgVar, 19));
        ofFloat.addUpdateListener(new ch.v(13, ilVar, cbVar));
        ofFloat.start();
    }
}
