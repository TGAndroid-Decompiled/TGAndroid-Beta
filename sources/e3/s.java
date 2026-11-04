package e3;

import android.animation.ObjectAnimator;
import ci.uc;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.vf;
import org.telegram.ui.Components.zk;
public final class s implements eb {
    public long f9506a;

    public s(zi ziVar) {
        this.f9506a = zi.B0(ziVar.f26868k);
        ziVar.f1();
    }

    @Override
    public void G(fb fbVar, qa qaVar, vf vfVar, zk zkVar) {
        fbVar.setInOutOffset(fbVar.getMeasuredHeight());
        zkVar.accept(Float.valueOf(fbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fbVar, fb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f9506a);
        ofFloat.setInterpolator(ks.d);
        ofFloat.addListener(new bh.j(qaVar, vfVar, 18));
        ofFloat.addUpdateListener(new uc(14, zkVar, fbVar));
        ofFloat.start();
    }

    public boolean a(qf.m mVar) {
        if (mVar.f54501b == this.f9506a && qf.a.c(mVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void e(fb fbVar, qa qaVar, oa oaVar, ra raVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fbVar, fb.IN_OUT_OFFSET_Y2, fbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(ks.f35476c);
        ofFloat.addListener(new bh.j(qaVar, oaVar, 19));
        ofFloat.addUpdateListener(new uc(13, raVar, fbVar));
        ofFloat.start();
    }
}
