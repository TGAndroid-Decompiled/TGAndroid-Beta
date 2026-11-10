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
import org.telegram.ui.Components.wq;
public class gb extends View implements o2 {
    public final Path f12115a;
    public final Paint f12116b;
    public final Paint f12117c;
    public boolean d;
    public final org.telegram.ui.Components.v5 f12118e;
    public Drawable f12119f;
    public Bitmap h;
    public int f12120n;
    public ValueAnimator f12121r;

    public gb(Context context) {
        super(context);
        this.f12115a = new Path();
        Paint paint = new Paint(1);
        this.f12116b = paint;
        Paint paint2 = new Paint(3);
        this.f12117c = paint2;
        this.f12118e = new org.telegram.ui.Components.v5(this, 0L, 380L, wq.h);
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void a(u uVar, boolean z9) {
        if (this.f12119f == uVar) {
            return;
        }
        ValueAnimator valueAnimator = this.f12121r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12121r = null;
        }
        if (z9) {
            this.f12121r = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            this.f12121r.addUpdateListener(new di.g3(this, new AtomicBoolean(), uVar, 2));
            this.f12121r.start();
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
            this.f12118e.e(true, f10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f12119f != null) {
            float d = this.f12118e.d(this.d);
            int intrinsicWidth = this.f12119f.getIntrinsicWidth();
            int intrinsicHeight = this.f12119f.getIntrinsicHeight();
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
            if (d <= 0.0f) {
                this.f12119f.setBounds(rect);
                this.f12119f.draw(canvas);
            } else if (d < 1.0f) {
                canvas.save();
                Path path = this.f12115a;
                path.rewind();
                path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f) * d, Path.Direction.CW);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                this.f12119f.setBounds(rect);
                this.f12119f.draw(canvas);
                canvas.restore();
            }
            if (d > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f) * d, this.f12116b);
                canvas.save();
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, this.f12117c);
                }
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h == null && this.f12120n != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), this.f12120n);
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
        this.f12119f = getContext().getResources().getDrawable(i7).mutate();
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
        Drawable drawable = this.f12119f;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(f10, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
        this.f12116b.setColor(i0.a.f(f10, -1, -16777216));
        invalidate();
    }

    @Override
    public void setSelected(boolean z9) {
        this.d = z9;
        invalidate();
    }

    public void setDrawable(Drawable drawable) {
        this.f12119f = drawable;
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
