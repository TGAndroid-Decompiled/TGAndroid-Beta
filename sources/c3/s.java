package c3;

import android.animation.ObjectAnimator;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xb;
public final class s implements wb {
    public long f4150a;

    public boolean a(mf.n nVar) {
        if (nVar.f7926b == this.f4150a && mf.a.c(nVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void d(xb xbVar, ib ibVar, gb gbVar, jb jbVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xbVar, xb.IN_OUT_OFFSET_Y2, xbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(bu.f25058c);
        ofFloat.addListener(new ai.z(ibVar, gbVar, 17));
        ofFloat.addUpdateListener(new ai.x(12, jbVar, xbVar));
        ofFloat.start();
    }

    @Override
    public void z(xb xbVar, ib ibVar, rg rgVar, dm dmVar) {
        xbVar.setInOutOffset(xbVar.getMeasuredHeight());
        dmVar.accept(Float.valueOf(xbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(xbVar, xb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f4150a);
        ofFloat.setInterpolator(bu.d);
        ofFloat.addListener(new ai.z(ibVar, rgVar, 16));
        ofFloat.addUpdateListener(new ai.x(13, dmVar, xbVar));
        ofFloat.start();
    }
}
