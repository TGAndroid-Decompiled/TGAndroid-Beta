package defpackage;

import android.content.Context;
import android.view.View;
public final class o04 extends q5c {
    public o04(Context context, int i, i8c i8cVar, n8c n8cVar, wjb wjbVar) {
        super(context, i, -1, false, i8cVar, n8cVar, null, wjbVar, -1, 0);
        this.z2 = true;
        setOverScrollMode(2);
    }

    public final void L1(View view) {
        int i;
        if (view != null) {
            float L = gl.L(92.0f);
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
                gl.J(this, new va7(this, view, i, (byte) 28));
            }
        }
    }
}
