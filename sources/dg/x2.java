package dg;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mr;
public abstract class x2 extends View {
    public Bitmap f4851a;
    public Paint f4852b;
    public Paint f4853c;
    public Paint d;
    public float e;
    public float f4854f;
    public Path h;
    public Rect f4855n;
    public RectF f4856r;
    public int f4857s;
    public boolean v;
    public q0.a f4858w;
    public float f4859x;

    public final void a(boolean z4) {
        if (this.v) {
            return;
        }
        this.v = true;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.setInterpolator(mr.f27122f);
        duration.addUpdateListener(new o1(this, 2));
        duration.addListener(new w2(0, this, z4));
        duration.start();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((cg.p) this).f2473y.f2346n.d();
        this.f4851a.recycle();
        this.f4851a = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        Rect rect = this.f4855n;
        Paint paint = this.f4852b;
        RectF rectF = this.f4856r;
        Path path = this.h;
        super.onDraw(canvas);
        float min = Math.min(getWidth(), getHeight()) * 0.2f;
        float width = this.e * getWidth();
        float height = this.f4854f * getHeight();
        int round = Math.round(this.e * this.f4851a.getWidth());
        int round2 = Math.round(this.f4854f * this.f4851a.getHeight());
        Bitmap bitmap = this.f4851a;
        int pixel = bitmap.getPixel(Utilities.clamp(round, bitmap.getWidth() - 1, 0), Utilities.clamp(round2, this.f4851a.getHeight() - 1, 0));
        this.f4857s = pixel;
        Paint paint2 = this.d;
        paint2.setColor(pixel);
        float f11 = this.f4859x;
        if (f11 != 0.0f && f11 != 1.0f) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            f10 = 1.0f;
            i10 = round;
            rectF2.set(width - min, height - min, width + min, height + min);
            canvas.saveLayerAlpha(rectF2, (int) (this.f4859x * 255.0f), 31);
        } else {
            i10 = round;
            f10 = 1.0f;
            canvas.save();
        }
        float f12 = (this.f4859x * 0.5f) + 0.5f;
        canvas.scale(f12, f12, width, height);
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, height, min, direction);
        canvas.clipPath(path);
        int round3 = Math.round(3.5f);
        rect.set(i10 - round3, round2 - round3, i10 + round3, round2 + round3);
        rectF.set(width - min, height - min, width + min, height + min);
        canvas.drawBitmap(this.f4851a, rect, rectF, (Paint) null);
        float strokeWidth = min - (paint2.getStrokeWidth() / 2.0f);
        canvas.drawCircle(width, height, strokeWidth, paint2);
        float strokeWidth2 = (strokeWidth - (paint2.getStrokeWidth() / 2.0f)) - (paint.getStrokeWidth() / 2.0f);
        canvas.drawCircle(width, height, strokeWidth2, paint);
        float strokeWidth3 = strokeWidth2 - (paint.getStrokeWidth() / 2.0f);
        path.rewind();
        path.addCircle(width, height, strokeWidth3, direction);
        canvas.clipPath(path);
        float f13 = (strokeWidth3 * 2.0f) / 8.0f;
        path.rewind();
        for (float f14 = -3.5f; f14 < 4.5f; f14 += f10) {
            float f15 = (f14 * f13) + width;
            path.moveTo(f15, height - strokeWidth3);
            path.lineTo(f15, height + strokeWidth3);
        }
        for (float f16 = -3.5f; f16 < 4.5f; f16 += f10) {
            float f17 = (f16 * f13) + height;
            path.moveTo(width - strokeWidth3, f17);
            path.lineTo(width + strokeWidth3, f17);
        }
        canvas.drawPath(path, this.f4853c);
        float f18 = f13 / 2.0f;
        rectF.set(width - f18, height - f18, width + f18, height + f18);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint);
        canvas.restore();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != 0 && i11 != 0 && i12 != 0 && i13 != 0 && isLaidOut()) {
            this.e = (i12 * this.e) / i10;
            this.f4854f = (i13 * this.f4854f) / i11;
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
                this.f4854f = motionEvent.getY() / getHeight();
                invalidate();
                return true;
            }
            a(true);
            return true;
        }
        this.e = motionEvent.getX() / getWidth();
        this.f4854f = motionEvent.getY() / getHeight();
        invalidate();
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public void setColorListener(q0.a aVar) {
        this.f4858w = aVar;
    }
}
