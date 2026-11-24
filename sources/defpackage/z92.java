package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
public final class z92 extends xib {
    public final byte a0 = 0;

    public z92(lq8 lq8Var, Context context, ylb ylbVar) {
        super(18, ylbVar, context, false, false);
    }

    @Override
    public final int e(int i) {
        switch (this.a0) {
            case 1:
                RectF rectF = ProfileActivity.e7;
                return i;
            default:
                return i;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        switch (this.a0) {
            case 0:
                if (jb6.a0) {
                    L = 0.0f;
                } else {
                    L = gm.L(20.0f);
                }
                float f = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (jb6.a0) {
                    i = gm.L(20.0f);
                } else {
                    i = 0;
                }
                canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    public z92(Context context) {
        super(context);
    }
}
