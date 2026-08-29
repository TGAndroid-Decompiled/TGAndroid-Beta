package ag;

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
public final class s extends View {
    public final int f651a = 0;
    public Paint f652b;
    public Paint f653c;
    public float d;
    public Object f654e;

    public s(Context context) {
        super(context);
    }

    public void a() {
        this.f652b.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{0, ((f0) this.f654e).f466f}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public void b(float f9) {
        float dp = AndroidUtilities.dp(6.0f);
        float a2 = i7.w.a(((f9 - dp) + (AndroidUtilities.dp(13.0f) - (this.f653c.getStrokeWidth() / 2.0f))) / (getWidth() - (dp * 2.0f)), 0.0f, 1.0f);
        this.d = a2;
        f0 f0Var = (f0) this.f654e;
        f0Var.m(i0.a.k(f0Var.f466f, (int) (a2 * 255.0f)), 1);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f651a) {
            case 0:
                super.onDraw(canvas);
                float height = getHeight() / 2.0f;
                float dp = AndroidUtilities.dp(6.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f9 = height - dp;
                float f10 = height + dp;
                rectF.set(dp, f9, getWidth() - dp, f10);
                canvas.save();
                f0 f0Var = (f0) this.f654e;
                f0Var.f465e.rewind();
                f0Var.f465e.addRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
                canvas.clipPath(f0Var.f465e);
                bg.h2.w1(canvas, rectF, AndroidUtilities.dp(6.0f));
                canvas.restore();
                rectF.set(dp, f9, getWidth() - dp, f10);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.f652b);
                float dp2 = AndroidUtilities.dp(13.0f);
                Paint paint = this.f653c;
                float strokeWidth = dp2 - (paint.getStrokeWidth() / 2.0f);
                float max = Math.max(dp + strokeWidth, (((getWidth() - (2.0f * dp)) * this.d) + dp) - strokeWidth);
                canvas.drawCircle(max, height, dp2, paint);
                bg.h2.x1(max, height, strokeWidth, i0.a.k(f0Var.f466f, (int) (this.d * 255.0f)), canvas);
                return;
            default:
                super.onDraw(canvas);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.f653c);
                rectF2.set(0.0f, 0.0f, ((d6) this.f654e).d(this.d, false) * getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.f652b);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f651a) {
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
        switch (this.f651a) {
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

    public s(f0 f0Var, Context context) {
        super(context);
        this.f654e = f0Var;
        this.f652b = new Paint(1);
        Paint paint = new Paint(1);
        this.f653c = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
    }
}
