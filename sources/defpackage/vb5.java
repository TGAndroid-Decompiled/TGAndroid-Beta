package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
public final class vb5 extends RadialProgressView {
    public final byte O = 1;
    public final Paint P;
    public final Object Q;

    public vb5(zb5 zb5Var, Context context) {
        super(context, null);
        this.Q = zb5Var;
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
                zb5 zb5Var = (zb5) obj;
                de0 de0Var = zb5Var.b;
                if (de0Var.getImageReceiver().E() && de0Var.getAlpha() > 0.0f) {
                    paint.setAlpha((int) (de0Var.getAlpha() * de0Var.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                zb5Var.y.setProgressColor(vm2.o(-1, (int) (de0Var.getAlpha() * de0Var.getImageReceiver().i1 * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                iq8 iq8Var = profileActivity.f0;
                if (iq8Var != null && iq8Var.getImageReceiver().E()) {
                    paint.setAlpha((int) (profileActivity.f0.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                super.onDraw(canvas);
                return;
            default:
                tba tbaVar = (tba) obj;
                de0 de0Var2 = tbaVar.H;
                if (de0Var2 != null && de0Var2.getImageReceiver().E()) {
                    paint.setAlpha((int) (tbaVar.H.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public vb5(tba tbaVar, Context context) {
        super(context, null);
        this.Q = tbaVar;
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(1426063360);
    }

    public vb5(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.Q = profileActivity;
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(1426063360);
    }
}
