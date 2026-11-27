package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;
public abstract class oe8 extends View {
    public Bitmap a;
    public Paint b;
    public Paint c;
    public Paint d;
    public float e;
    public float f;
    public Path h;
    public Rect n;
    public RectF r;
    public int s;
    public boolean w;
    public pt2 x;
    public float y;

    public final void a(boolean z) {
        if (this.w) {
            return;
        }
        this.w = true;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.setInterpolator(k43.f);
        duration.addUpdateListener(new pv7(this, (byte) 10));
        duration.addListener(new gf4((byte) 22, this, z));
        duration.start();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((im2) this).E.r1.e();
        this.a.recycle();
        this.a = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        int i;
        float f;
        Rect rect = this.n;
        Paint paint = this.b;
        RectF rectF = this.r;
        Path path = this.h;
        super.onDraw(canvas);
        float min = Math.min(getWidth(), getHeight()) * 0.2f;
        float width = this.e * getWidth();
        float height = this.f * getHeight();
        int round = Math.round(this.e * this.a.getWidth());
        int round2 = Math.round(this.f * this.a.getHeight());
        int pixel = this.a.getPixel(Utilities.j(round, bitmap.getWidth() - 1, 0), Utilities.j(round2, this.a.getHeight() - 1, 0));
        this.s = pixel;
        Paint paint2 = this.d;
        paint2.setColor(pixel);
        float f2 = this.y;
        if (f2 != 0.0f && f2 != 1.0f) {
            RectF rectF2 = hl.P;
            f = 1.0f;
            i = round;
            rectF2.set(width - min, height - min, width + min, height + min);
            canvas.saveLayerAlpha(rectF2, (int) (this.y * 255.0f), 31);
        } else {
            i = round;
            f = 1.0f;
            canvas.save();
        }
        float f3 = (this.y * 0.5f) + 0.5f;
        canvas.scale(f3, f3, width, height);
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, height, min, direction);
        canvas.clipPath(path);
        rect.set(i - 4, round2 - 4, i + 4, round2 + 4);
        rectF.set(width - min, height - min, width + min, height + min);
        canvas.drawBitmap(this.a, rect, rectF, (Paint) null);
        float strokeWidth = min - (paint2.getStrokeWidth() / 2.0f);
        canvas.drawCircle(width, height, strokeWidth, paint2);
        float strokeWidth2 = (strokeWidth - (paint2.getStrokeWidth() / 2.0f)) - (paint.getStrokeWidth() / 2.0f);
        canvas.drawCircle(width, height, strokeWidth2, paint);
        float strokeWidth3 = strokeWidth2 - (paint.getStrokeWidth() / 2.0f);
        path.rewind();
        path.addCircle(width, height, strokeWidth3, direction);
        canvas.clipPath(path);
        float f4 = (strokeWidth3 * 2.0f) / 8.0f;
        path.rewind();
        for (float f5 = -3.5f; f5 < 4.5f; f5 += f) {
            float f6 = (f5 * f4) + width;
            path.moveTo(f6, height - strokeWidth3);
            path.lineTo(f6, height + strokeWidth3);
        }
        for (float f7 = -3.5f; f7 < 4.5f; f7 += f) {
            float f8 = (f7 * f4) + height;
            path.moveTo(width - strokeWidth3, f8);
            path.lineTo(width + strokeWidth3, f8);
        }
        canvas.drawPath(path, this.c);
        float f9 = f4 / 2.0f;
        rectF.set(width - f9, height - f9, width + f9, height + f9);
        canvas.drawRoundRect(rectF, hl.L(f), hl.L(f), paint);
        canvas.restore();
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != 0 && i2 != 0 && i3 != 0 && i4 != 0 && isLaidOut()) {
            this.e = (i3 * this.e) / i;
            this.f = (i4 * this.f) / i2;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return true;
                    }
                    a(false);
                    return true;
                }
                this.e = motionEvent.getX() / getWidth();
                this.f = motionEvent.getY() / getHeight();
                invalidate();
                return true;
            }
            a(true);
            return true;
        }
        this.e = motionEvent.getX() / getWidth();
        this.f = motionEvent.getY() / getHeight();
        invalidate();
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public void setColorListener(pt2 pt2Var) {
        this.x = pt2Var;
    }
}
