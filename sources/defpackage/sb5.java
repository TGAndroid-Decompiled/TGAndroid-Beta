package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
public final class sb5 extends RadialProgressView {
    public final byte O = 2;
    public final Paint P;
    public final Object Q;

    public sb5(wb5 wb5Var, Context context) {
        super(context, null);
        this.Q = wb5Var;
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
                wb5 wb5Var = (wb5) obj;
                bf0 bf0Var = wb5Var.b;
                if (bf0Var.getImageReceiver().E() && bf0Var.getAlpha() > 0.0f) {
                    paint.setAlpha((int) (bf0Var.getAlpha() * bf0Var.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                wb5Var.y.setProgressColor(on2.p(-1, (int) (bf0Var.getAlpha() * bf0Var.getImageReceiver().i1 * 255.0f)));
                super.onDraw(canvas);
                return;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                yo8 yo8Var = profileActivity.f0;
                if (yo8Var != null && yo8Var.getImageReceiver().E()) {
                    paint.setAlpha((int) (profileActivity.f0.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                super.onDraw(canvas);
                return;
            default:
                daa daaVar = (daa) obj;
                bf0 bf0Var2 = daaVar.H;
                if (bf0Var2 != null && bf0Var2.getImageReceiver().E()) {
                    paint.setAlpha((int) (daaVar.H.getImageReceiver().i1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                super.onDraw(canvas);
                return;
        }
    }

    public sb5(daa daaVar, Context context) {
        super(context, null);
        this.Q = daaVar;
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(1426063360);
    }

    public sb5(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.Q = profileActivity;
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(1426063360);
    }
}
