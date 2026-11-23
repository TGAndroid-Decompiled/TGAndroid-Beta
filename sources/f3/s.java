package f3;

import android.animation.ObjectAnimator;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.ws;
public final class s implements jb {
    public long f11195a;

    public s(fj fjVar) {
        this.f11195a = fj.B0(fjVar.f24073k);
        fjVar.e1();
    }

    @Override
    public void H(kb kbVar, va vaVar, ng ngVar, pl plVar) {
        kbVar.setInOutOffset(kbVar.getMeasuredHeight());
        plVar.accept(Float.valueOf(kbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kbVar, kb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f11195a);
        ofFloat.setInterpolator(ws.d);
        ofFloat.addListener(new ah.l(vaVar, ngVar, 19));
        ofFloat.addUpdateListener(new ch.w(13, plVar, kbVar));
        ofFloat.start();
    }

    public boolean a(tf.m mVar) {
        if (mVar.f912b == this.f11195a && tf.a.c(mVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void b(kb kbVar, va vaVar, ta taVar, wa waVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kbVar, kb.IN_OUT_OFFSET_Y2, kbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(ws.f41715c);
        ofFloat.addListener(new ah.l(vaVar, taVar, 20));
        ofFloat.addUpdateListener(new ch.w(12, waVar, kbVar));
        ofFloat.start();
    }
}
