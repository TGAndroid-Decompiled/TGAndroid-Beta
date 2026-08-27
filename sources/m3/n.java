package m3;

import ag.t2;
import ag.x1;
import android.animation.ObjectAnimator;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.ws;
import org.telegram.ui.Components.zk;

public final class n implements ib {

    public long f17620a;

    public boolean a(ue.m mVar) {
        return mVar.f4577b == this.f17620a && ue.a.c(mVar);
    }

    @Override
    public void c(jb jbVar, ua uaVar, sa saVar, va vaVar) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(jbVar, jb.IN_OUT_OFFSET_Y2, jbVar.getHeight());
        objectAnimatorOfFloat.setDuration(175L);
        objectAnimatorOfFloat.setInterpolator(ws.f34318c);
        objectAnimatorOfFloat.addListener(new x1(uaVar, saVar, 17));
        objectAnimatorOfFloat.addUpdateListener(new t2(9, vaVar, jbVar));
        objectAnimatorOfFloat.start();
    }

    @Override
    public void g(jb jbVar, ua uaVar, bg bgVar, zk zkVar) {
        jbVar.setInOutOffset(jbVar.getMeasuredHeight());
        zkVar.accept(Float.valueOf(jbVar.getTranslationY()));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(jbVar, jb.IN_OUT_OFFSET_Y2, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f17620a);
        objectAnimatorOfFloat.setInterpolator(ws.d);
        objectAnimatorOfFloat.addListener(new x1(uaVar, bgVar, 16));
        objectAnimatorOfFloat.addUpdateListener(new t2(10, zkVar, jbVar));
        objectAnimatorOfFloat.start();
    }
}
