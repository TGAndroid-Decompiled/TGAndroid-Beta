package c3;

import android.animation.ObjectAnimator;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.nt;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.vb;
public final class s implements ub {
    public long f4101a;

    @Override
    public void L(vb vbVar, gb gbVar, qg qgVar, pl plVar) {
        vbVar.setInOutOffset(vbVar.getMeasuredHeight());
        plVar.accept(Float.valueOf(vbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vbVar, vb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f4101a);
        ofFloat.setInterpolator(nt.d);
        ofFloat.addListener(new ai.z(gbVar, qgVar, 16));
        ofFloat.addUpdateListener(new ai.x(13, plVar, vbVar));
        ofFloat.start();
    }

    public boolean a(lf.n nVar) {
        if (nVar.f7877b == this.f4101a && lf.a.c(nVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void c(vb vbVar, gb gbVar, eb ebVar, hb hbVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vbVar, vb.IN_OUT_OFFSET_Y2, vbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(nt.f29148c);
        ofFloat.addListener(new ai.z(gbVar, ebVar, 17));
        ofFloat.addUpdateListener(new ai.x(12, hbVar, vbVar));
        ofFloat.start();
    }
}
