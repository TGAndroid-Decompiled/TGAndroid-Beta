package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.ActionBar.a;
public final class kba implements ncc, occ, nr7 {
    public final tba a;

    public kba(tba tbaVar) {
        this.a = tbaVar;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        mq5 H0 = hl.H0(l2dVar, false);
        int i = H0.d;
        tba tbaVar = this.a;
        tbaVar.d0 = i;
        int i2 = H0.b;
        if (tbaVar.Q != null) {
            int currentActionBarHeight = a.getCurrentActionBarHeight() + i2;
            ViewGroup.LayoutParams layoutParams = tbaVar.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                tbaVar.Q.setLayoutParams(layoutParams);
            }
        }
        eg0.g(tbaVar.c, i2, i, hl.L(12.0f), tbaVar.e0);
        return l2d.b;
    }

    @Override
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.valueOf(this.a.i0(b8cVar, view));
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.h0((b8c) obj);
    }
}
