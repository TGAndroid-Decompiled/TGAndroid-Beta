package c3;

import android.animation.ObjectAnimator;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.tb;
public final class s implements sb {
    public long f3798a;

    @Override
    public void U(tb tbVar, eb ebVar, og ogVar, ml mlVar) {
        tbVar.setInOutOffset(tbVar.getMeasuredHeight());
        mlVar.accept(Float.valueOf(tbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tbVar, tb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f3798a);
        ofFloat.setInterpolator(kt.d);
        ofFloat.addListener(new ai.z(ebVar, ogVar, 16));
        ofFloat.addUpdateListener(new ai.x(13, mlVar, tbVar));
        ofFloat.start();
    }

    public boolean a(lf.n nVar) {
        if (nVar.f7304b == this.f3798a && lf.a.c(nVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void g(tb tbVar, eb ebVar, cb cbVar, fb fbVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tbVar, tb.IN_OUT_OFFSET_Y2, tbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(kt.f25864c);
        ofFloat.addListener(new ai.z(ebVar, cbVar, 17));
        ofFloat.addUpdateListener(new ai.x(12, fbVar, tbVar));
        ofFloat.start();
    }
}
