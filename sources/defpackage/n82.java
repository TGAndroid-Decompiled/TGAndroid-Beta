package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
public final class n82 extends wgb {
    public final byte a0 = 0;

    public n82(ko8 ko8Var, Context context, wjb wjbVar) {
        super(18, wjbVar, context, false, false);
    }

    @Override
    public final int e(int i) {
        switch (this.a0) {
            case 1:
                RectF rectF = ProfileActivity.Z6;
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
                if (k96.a0) {
                    L = 0.0f;
                } else {
                    L = gl.L(20.0f);
                }
                float f = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (k96.a0) {
                    i = gl.L(20.0f);
                } else {
                    i = 0;
                }
                canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    public n82(Context context) {
        super(context);
    }
}
