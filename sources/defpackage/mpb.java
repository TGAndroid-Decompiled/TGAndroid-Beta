package defpackage;

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
public class mpb extends View implements li4 {
    public final Path a;
    public final Paint b;
    public final Paint c;
    public boolean d;
    public final lm e;
    public Drawable f;
    public Bitmap h;
    public int n;
    public ValueAnimator r;

    public mpb(Context context) {
        super(context);
        this.a = new Path();
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(3);
        this.c = paint2;
        this.e = new lm(this, 0L, 380L, s33.h);
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void a(gk2 gk2Var, boolean z) {
        if (this.f == gk2Var) {
            return;
        }
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.r = null;
        }
        if (z) {
            this.r = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            this.r.addUpdateListener(new nk(this, new AtomicBoolean(), gk2Var, (byte) 7));
            this.r.start();
            return;
        }
        setDrawable(gk2Var);
    }

    public final void b(boolean z, boolean z2) {
        float f;
        this.d = z;
        if (!z2) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.e.e(true, f);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f != null) {
            float d = this.e.d(this.d);
            int intrinsicWidth = this.f.getIntrinsicWidth();
            int intrinsicHeight = this.f.getIntrinsicHeight();
            Rect rect = gl.Q;
            rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
            if (d <= 0.0f) {
                this.f.setBounds(rect);
                this.f.draw(canvas);
            } else if (d < 1.0f) {
                canvas.save();
                Path path = this.a;
                path.rewind();
                path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, gl.L(16.0f) * d, Path.Direction.CW);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                this.f.setBounds(rect);
                this.f.draw(canvas);
                canvas.restore();
            }
            if (d > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, gl.L(16.0f) * d, this.b);
                canvas.save();
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, this.c);
                }
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h == null && this.n != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), this.n);
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

    public void setDrawable(Drawable drawable) {
        this.f = drawable;
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

    @Override
    public void setInvert(float f) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(bm2.f(f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
        this.b.setColor(bm2.f(f, -1, -16777216));
        invalidate();
    }

    @Override
    public void setSelected(boolean z) {
        this.d = z;
        invalidate();
    }

    public void setDrawable(int i) {
        this.f = getContext().getResources().getDrawable(i).mutate();
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        if (this.h == null && i != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), i);
        }
        invalidate();
    }
}
