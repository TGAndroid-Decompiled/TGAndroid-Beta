package defpackage;

import android.content.Context;
import android.view.View;
public final class z14 extends q7c {
    public z14(Context context, int i, jac jacVar, oac oacVar, ylb ylbVar) {
        super(context, i, -1, false, jacVar, oacVar, null, ylbVar, -1, 0);
        this.z2 = true;
        setOverScrollMode(2);
    }

    public final void L1(View view) {
        int i;
        if (view != null) {
            float L = gm.L(92.0f);
            float width = getWidth() - L;
            float x = view.getX();
            float width2 = view.getWidth() + x;
            if (x < L) {
                i = (int) (x - L);
            } else if (width2 > width) {
                i = (int) (width2 - width);
            } else {
                i = 0;
            }
            if (i != 0) {
                gm.J(this, new wc7(this, view, i, (byte) 28));
            }
        }
    }
}
