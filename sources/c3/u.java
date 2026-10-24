package c3;

import ai.ne;
import android.animation.ObjectAnimator;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.sb;
import org.telegram.ui.Components.vl;
public final class u implements rb {
    public long f4664a;

    @Override
    public void D0(sb sbVar, db dbVar, ng ngVar, vl vlVar) {
        sbVar.setInOutOffset(sbVar.getMeasuredHeight());
        vlVar.accept(Float.valueOf(sbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(sbVar, sb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f4664a);
        ofFloat.setInterpolator(qt.d);
        ofFloat.addListener(new ne(dbVar, ngVar, 17));
        ofFloat.addUpdateListener(new ah.l0(15, vlVar, sbVar));
        ofFloat.start();
    }

    public boolean a(nf.m mVar) {
        if (mVar.f7638b == this.f4664a && nf.a.c(mVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void c(sb sbVar, db dbVar, bb bbVar, eb ebVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(sbVar, sb.IN_OUT_OFFSET_Y2, sbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(qt.f29993c);
        ofFloat.addListener(new ne(dbVar, bbVar, 18));
        ofFloat.addUpdateListener(new ah.l0(14, ebVar, sbVar));
        ofFloat.start();
    }
}
