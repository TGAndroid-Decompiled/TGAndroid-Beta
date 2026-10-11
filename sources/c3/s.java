package c3;

import android.animation.ObjectAnimator;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.wb;
public final class s implements vb {
    public long f4150a;

    public boolean a(mf.m mVar) {
        if (mVar.f7925b == this.f4150a && mf.a.c(mVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void c(wb wbVar, hb hbVar, fb fbVar, ib ibVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wbVar, wb.IN_OUT_OFFSET_Y2, wbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(bu.f25096c);
        ofFloat.addListener(new ai.z(hbVar, fbVar, 17));
        ofFloat.addUpdateListener(new ai.x(12, ibVar, wbVar));
        ofFloat.start();
    }

    @Override
    public void y(wb wbVar, hb hbVar, rg rgVar, dm dmVar) {
        wbVar.setInOutOffset(wbVar.getMeasuredHeight());
        dmVar.accept(Float.valueOf(wbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wbVar, wb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f4150a);
        ofFloat.setInterpolator(bu.d);
        ofFloat.addListener(new ai.z(hbVar, rgVar, 16));
        ofFloat.addUpdateListener(new ai.x(13, dmVar, wbVar));
        ofFloat.start();
    }
}
