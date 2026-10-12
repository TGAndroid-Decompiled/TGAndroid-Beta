package c3;

import ah.l0;
import android.animation.ObjectAnimator;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xt;
public final class s implements vb {
    public long f4279a;

    public boolean a(nf.m mVar) {
        if (mVar.f6169b == this.f4279a && nf.a.c(mVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void a0(wb wbVar, hb hbVar, qg qgVar, am amVar) {
        wbVar.setInOutOffset(wbVar.getMeasuredHeight());
        amVar.accept(Float.valueOf(wbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wbVar, wb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f4279a);
        ofFloat.setInterpolator(xt.d);
        ofFloat.addListener(new bi.t(hbVar, qgVar, 16));
        ofFloat.addUpdateListener(new l0(14, amVar, wbVar));
        ofFloat.start();
    }

    @Override
    public void d(wb wbVar, hb hbVar, fb fbVar, ib ibVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wbVar, wb.IN_OUT_OFFSET_Y2, wbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(xt.f31326c);
        ofFloat.addListener(new bi.t(hbVar, fbVar, 17));
        ofFloat.addUpdateListener(new l0(13, ibVar, wbVar));
        ofFloat.start();
    }
}
