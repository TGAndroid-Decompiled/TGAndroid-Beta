package og;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d6;
public final class p extends View {
    public final int f14443a = 1;
    public Paint f14444b;
    public Paint f14445c;
    public float d;
    public Object e;

    public p(Context context) {
        super(context);
    }

    public void a() {
        this.f14444b.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{0, ((a0) this.e).f14319f}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public void b(float f7) {
        float dp = AndroidUtilities.dp(6.0f);
        float a2 = w7.q.a(((f7 - dp) + (AndroidUtilities.dp(13.0f) - (this.f14445c.getStrokeWidth() / 2.0f))) / (getWidth() - (dp * 2.0f)), 0.0f, 1.0f);
        this.d = a2;
        a0 a0Var = (a0) this.e;
        a0Var.m(i0.a.k(a0Var.f14319f, (int) (a2 * 255.0f)), 1);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f14443a) {
            case 0:
                super.onDraw(canvas);
                float height = getHeight() / 2.0f;
                float dp = AndroidUtilities.dp(6.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = height - dp;
                float f10 = height + dp;
                rectF.set(dp, f7, getWidth() - dp, f10);
                canvas.save();
                a0 a0Var = (a0) this.e;
                a0Var.e.rewind();
                a0Var.e.addRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
                canvas.clipPath(a0Var.e);
                pg.i1.v1(canvas, rectF, AndroidUtilities.dp(6.0f));
                canvas.restore();
                rectF.set(dp, f7, getWidth() - dp, f10);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.f14444b);
                float dp2 = AndroidUtilities.dp(13.0f);
                Paint paint = this.f14445c;
                float strokeWidth = dp2 - (paint.getStrokeWidth() / 2.0f);
                float max = Math.max(dp + strokeWidth, (((getWidth() - (2.0f * dp)) * this.d) + dp) - strokeWidth);
                canvas.drawCircle(max, height, dp2, paint);
                pg.i1.w1(max, height, strokeWidth, i0.a.k(a0Var.f14319f, (int) (this.d * 255.0f)), canvas);
                return;
            default:
                super.onDraw(canvas);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.f14445c);
                rectF2.set(0.0f, 0.0f, ((d6) this.e).d(this.d, false) * getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.f14444b);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f14443a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                a();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f14443a) {
            case 0:
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                getParent().requestDisallowInterceptTouchEvent(false);
                            }
                        }
                    } else {
                        b(motionEvent.getX());
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    return true;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                b(motionEvent.getX());
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public p(a0 a0Var, Context context) {
        super(context);
        this.e = a0Var;
        this.f14444b = new Paint(1);
        Paint paint = new Paint(1);
        this.f14445c = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
    }
}
