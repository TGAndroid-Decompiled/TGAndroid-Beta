package c3;

import ai.me;
import android.animation.ObjectAnimator;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.xl;
public final class s implements tb {
    public long f4655a;

    @Override
    public void D0(ub ubVar, fb fbVar, pg pgVar, xl xlVar) {
        ubVar.setInOutOffset(ubVar.getMeasuredHeight());
        xlVar.accept(Float.valueOf(ubVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f4655a);
        ofFloat.setInterpolator(st.d);
        ofFloat.addListener(new me(fbVar, pgVar, 17));
        ofFloat.addUpdateListener(new ah.l0(15, xlVar, ubVar));
        ofFloat.start();
    }

    public boolean a(nf.m mVar) {
        if (mVar.f7626b == this.f4655a && nf.a.c(mVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void d(ub ubVar, fb fbVar, db dbVar, gb gbVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ubVar, ub.IN_OUT_OFFSET_Y2, ubVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(st.f30360c);
        ofFloat.addListener(new me(fbVar, dbVar, 18));
        ofFloat.addUpdateListener(new ah.l0(14, gbVar, ubVar));
        ofFloat.start();
    }
}
