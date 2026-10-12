package c3;

import android.animation.ObjectAnimator;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.fm;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.wb;
public final class s implements vb {
    public long f4149a;

    @Override
    public void G(wb wbVar, hb hbVar, tg tgVar, fm fmVar) {
        wbVar.setInOutOffset(wbVar.getMeasuredHeight());
        fmVar.accept(Float.valueOf(wbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wbVar, wb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f4149a);
        ofFloat.setInterpolator(du.d);
        ofFloat.addListener(new ai.z(hbVar, tgVar, 16));
        ofFloat.addUpdateListener(new ai.x(13, fmVar, wbVar));
        ofFloat.start();
    }

    public boolean a(mf.m mVar) {
        if (mVar.f7923b == this.f4149a && mf.a.c(mVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void c(wb wbVar, hb hbVar, fb fbVar, ib ibVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wbVar, wb.IN_OUT_OFFSET_Y2, wbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(du.f25465c);
        ofFloat.addListener(new ai.z(hbVar, fbVar, 17));
        ofFloat.addUpdateListener(new ai.x(12, ibVar, wbVar));
        ofFloat.start();
    }
}
