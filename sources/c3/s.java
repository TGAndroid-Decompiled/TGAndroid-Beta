package c3;

import android.animation.ObjectAnimator;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.nl;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ub;
public final class s implements tb {
    public long f3790a;

    @Override
    public void U(ub ubVar, fb fbVar, og ogVar, nl nlVar) {
        ubVar.setInOutOffset(ubVar.getMeasuredHeight());
        nlVar.accept(Float.valueOf(ubVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f3790a);
        ofFloat.setInterpolator(lt.d);
        ofFloat.addListener(new ai.z(fbVar, ogVar, 16));
        ofFloat.addUpdateListener(new ai.x(13, nlVar, ubVar));
        ofFloat.start();
    }

    public boolean a(lf.o oVar) {
        if (oVar.f7290b == this.f3790a && lf.a.c(oVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void g(ub ubVar, fb fbVar, db dbVar, gb gbVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, ubVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(lt.f25942c);
        ofFloat.addListener(new ai.z(fbVar, dbVar, 17));
        ofFloat.addUpdateListener(new ai.x(12, gbVar, ubVar));
        ofFloat.start();
    }
}
