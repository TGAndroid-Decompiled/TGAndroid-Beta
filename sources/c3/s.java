package c3;

import android.animation.ObjectAnimator;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.sb;
public final class s implements rb {
    public long f3798a;

    @Override
    public void U(sb sbVar, db dbVar, ng ngVar, ml mlVar) {
        sbVar.setInOutOffset(sbVar.getMeasuredHeight());
        mlVar.accept(Float.valueOf(sbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(sbVar, sb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f3798a);
        ofFloat.setInterpolator(kt.d);
        ofFloat.addListener(new ai.z(dbVar, ngVar, 16));
        ofFloat.addUpdateListener(new ai.x(13, mlVar, sbVar));
        ofFloat.start();
    }

    public boolean a(lf.o oVar) {
        if (oVar.f7307b == this.f3798a && lf.a.c(oVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void g(sb sbVar, db dbVar, bb bbVar, eb ebVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(sbVar, sb.IN_OUT_OFFSET_Y2, sbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(kt.f25684c);
        ofFloat.addListener(new ai.z(dbVar, bbVar, 17));
        ofFloat.addUpdateListener(new ai.x(12, ebVar, sbVar));
        ofFloat.start();
    }
}
