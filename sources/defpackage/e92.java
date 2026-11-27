package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
public final class e92 extends skb {
    public final byte a0 = 0;

    public e92(wr8 wr8Var, Context context, vnb vnbVar) {
        super(18, vnbVar, context, false, false);
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
                if (ob6.a0) {
                    L = 0.0f;
                } else {
                    L = hl.L(20.0f);
                }
                float f = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (ob6.a0) {
                    i = hl.L(20.0f);
                } else {
                    i = 0;
                }
                canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    public e92(Context context) {
        super(context);
    }
}
