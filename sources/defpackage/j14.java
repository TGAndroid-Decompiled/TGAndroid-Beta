package defpackage;

import android.content.Context;
import android.view.View;
public final class j14 extends q9c {
    public j14(Context context, int i, icc iccVar, ncc nccVar, vnb vnbVar) {
        super(context, i, -1, false, iccVar, nccVar, null, vnbVar, -1, 0);
        this.z2 = true;
        setOverScrollMode(2);
    }

    public final void M1(View view) {
        int i;
        if (view != null) {
            float L = hl.L(92.0f);
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
                hl.J(this, new bf7(this, view, i, (byte) 28));
            }
        }
    }
}
