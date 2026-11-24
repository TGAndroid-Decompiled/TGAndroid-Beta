package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
public final class u95 extends RadialProgressView {
    public final byte O = 2;
    public final Paint P;
    public final Object Q;

    public u95(y95 y95Var, Context context) {
        super(context, null);
        this.Q = y95Var;
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(1426063360);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b = this.O;
        Object obj = this.Q;
        Paint paint = this.P;
        switch (b) {
            case 0:
                y95 y95Var = (y95) obj;
                be0 be0Var = y95Var.b;
                if (be0Var.getImageReceiver().E() && be0Var.getAlpha() > 0.0f) {
                    paint.setAlpha((int) (be0Var.getAlpha() * be0Var.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                y95Var.y.setProgressColor(bm2.o(-1, (int) (be0Var.getAlpha() * be0Var.getImageReceiver().i1 * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                xm8 xm8Var = profileActivity.f0;
                if (xm8Var != null && xm8Var.getImageReceiver().E()) {
                    paint.setAlpha((int) (profileActivity.f0.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                super.onDraw(canvas);
                return;
            default:
                d8a d8aVar = (d8a) obj;
                be0 be0Var2 = d8aVar.H;
                if (be0Var2 != null && be0Var2.getImageReceiver().E()) {
                    paint.setAlpha((int) (d8aVar.H.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public u95(d8a d8aVar, Context context) {
        super(context, null);
        this.Q = d8aVar;
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(1426063360);
    }

    public u95(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.Q = profileActivity;
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(1426063360);
    }
}
