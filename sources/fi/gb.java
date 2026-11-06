package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Components.xq;
public class gb extends View implements o2 {
    public final Path f12111a;
    public final Paint f12112b;
    public final Paint f12113c;
    public boolean d;
    public final org.telegram.ui.Components.w5 f12114e;
    public Drawable f12115f;
    public Bitmap h;
    public int f12116n;
    public ValueAnimator f12117r;

    public gb(Context context) {
        super(context);
        this.f12111a = new Path();
        Paint paint = new Paint(1);
        this.f12112b = paint;
        Paint paint2 = new Paint(3);
        this.f12113c = paint2;
        this.f12114e = new org.telegram.ui.Components.w5(this, 0L, 380L, xq.h);
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void a(u uVar, boolean z9) {
        if (this.f12115f == uVar) {
            return;
        }
        ValueAnimator valueAnimator = this.f12117r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12117r = null;
        }
        if (z9) {
            this.f12117r = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            this.f12117r.addUpdateListener(new di.g3(this, new AtomicBoolean(), uVar, 2));
            this.f12117r.start();
            return;
        }
        setDrawable(uVar);
    }

    public final void b(boolean z9, boolean z10) {
        float f10;
        this.d = z9;
        if (!z10) {
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f12114e.e(true, f10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f12115f != null) {
            float d = this.f12114e.d(this.d);
            int intrinsicWidth = this.f12115f.getIntrinsicWidth();
            int intrinsicHeight = this.f12115f.getIntrinsicHeight();
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
            if (d <= 0.0f) {
                this.f12115f.setBounds(rect);
                this.f12115f.draw(canvas);
            } else if (d < 1.0f) {
                canvas.save();
                Path path = this.f12111a;
                path.rewind();
                path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f) * d, Path.Direction.CW);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                this.f12115f.setBounds(rect);
                this.f12115f.draw(canvas);
                canvas.restore();
            }
            if (d > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f) * d, this.f12112b);
                canvas.save();
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, this.f12113c);
                }
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h == null && this.f12116n != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), this.f12116n);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
    }

    public void setDrawable(int i7) {
        this.f12115f = getContext().getResources().getDrawable(i7).mutate();
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        if (this.h == null && i7 != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), i7);
        }
        invalidate();
    }

    @Override
    public void setInvert(float f10) {
        Drawable drawable = this.f12115f;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(f10, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
        this.f12112b.setColor(i0.a.f(f10, -1, -16777216));
        invalidate();
    }

    @Override
    public void setSelected(boolean z9) {
        this.d = z9;
        invalidate();
    }

    public void setDrawable(Drawable drawable) {
        this.f12115f = drawable;
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        if (this.h == null && drawable != null && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            this.h = createBitmap;
            drawable.setBounds(0, 0, createBitmap.getWidth(), this.h.getHeight());
            drawable.draw(new Canvas(this.h));
        }
        invalidate();
    }
}
