package hi;

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
import org.telegram.ui.Components.kr;
public class yb extends View implements v2 {
    public final Path f15882a;
    public final Paint f15883b;
    public final Paint f15884c;
    public boolean d;
    public final org.telegram.ui.Components.c6 f15885e;
    public Drawable f15886f;
    public Bitmap h;
    public int f15887n;
    public ValueAnimator f15888r;

    public yb(Context context) {
        super(context);
        this.f15882a = new Path();
        Paint paint = new Paint(1);
        this.f15883b = paint;
        Paint paint2 = new Paint(3);
        this.f15884c = paint2;
        this.f15885e = new org.telegram.ui.Components.c6(this, 0L, 380L, kr.h);
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void a(d0 d0Var, boolean z10) {
        if (this.f15886f == d0Var) {
            return;
        }
        ValueAnimator valueAnimator = this.f15888r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f15888r = null;
        }
        if (z10) {
            this.f15888r = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            this.f15888r.addUpdateListener(new fi.z2(this, new AtomicBoolean(), d0Var, 2));
            this.f15888r.start();
            return;
        }
        setDrawable(d0Var);
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        this.d = z10;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f15885e.e(true, f10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f15886f != null) {
            float d = this.f15885e.d(this.d);
            int intrinsicWidth = this.f15886f.getIntrinsicWidth();
            int intrinsicHeight = this.f15886f.getIntrinsicHeight();
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
            if (d <= 0.0f) {
                this.f15886f.setBounds(rect);
                this.f15886f.draw(canvas);
            } else if (d < 1.0f) {
                canvas.save();
                Path path = this.f15882a;
                path.rewind();
                path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f) * d, Path.Direction.CW);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                this.f15886f.setBounds(rect);
                this.f15886f.draw(canvas);
                canvas.restore();
            }
            if (d > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f) * d, this.f15883b);
                canvas.save();
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, this.f15884c);
                }
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h == null && this.f15887n != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), this.f15887n);
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
        this.f15886f = getContext().getResources().getDrawable(i7).mutate();
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
        Drawable drawable = this.f15886f;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(f10, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
        this.f15883b.setColor(i0.a.f(f10, -1, -16777216));
        invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        this.d = z10;
        invalidate();
    }

    public void setDrawable(Drawable drawable) {
        this.f15886f = drawable;
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
