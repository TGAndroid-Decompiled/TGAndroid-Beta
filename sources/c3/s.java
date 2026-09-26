package c3;

import android.animation.ObjectAnimator;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.ol;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ub;
public final class s implements tb {
    public long f3790a;

    @Override
    public void U(ub ubVar, fb fbVar, pg pgVar, ol olVar) {
        ubVar.setInOutOffset(ubVar.getMeasuredHeight());
        olVar.accept(Float.valueOf(ubVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f3790a);
        ofFloat.setInterpolator(mt.d);
        ofFloat.addListener(new ai.z(fbVar, pgVar, 16));
        ofFloat.addUpdateListener(new ai.x(13, olVar, ubVar));
        ofFloat.start();
    }

    public boolean a(lf.n nVar) {
        if (nVar.f7286b == this.f3790a && lf.a.c(nVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void g(ub ubVar, fb fbVar, db dbVar, gb gbVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, ubVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(mt.f26507c);
        ofFloat.addListener(new ai.z(fbVar, dbVar, 17));
        ofFloat.addUpdateListener(new ai.x(12, gbVar, ubVar));
        ofFloat.start();
    }
}
