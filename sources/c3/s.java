package c3;

import android.animation.ObjectAnimator;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ub;
public final class s implements tb {
    public long f3798a;

    @Override
    public void U(ub ubVar, fb fbVar, og ogVar, ml mlVar) {
        ubVar.setInOutOffset(ubVar.getMeasuredHeight());
        mlVar.accept(Float.valueOf(ubVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f3798a);
        ofFloat.setInterpolator(kt.d);
        ofFloat.addListener(new ai.z(fbVar, ogVar, 16));
        ofFloat.addUpdateListener(new ai.x(13, mlVar, ubVar));
        ofFloat.start();
    }

    public boolean a(lf.o oVar) {
        if (oVar.f7303b == this.f3798a && lf.a.c(oVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void g(ub ubVar, fb fbVar, db dbVar, gb gbVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, ubVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(kt.f25788c);
        ofFloat.addListener(new ai.z(fbVar, dbVar, 17));
        ofFloat.addUpdateListener(new ai.x(12, gbVar, ubVar));
        ofFloat.start();
    }
}
