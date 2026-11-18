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
import org.telegram.ui.Components.lr;
public class eb extends View implements n2 {
    public final Path f14601a;
    public final Paint f14602b;
    public final Paint f14603c;
    public boolean d;
    public final org.telegram.ui.Components.c6 f14604e;
    public Drawable f14605f;
    public Bitmap h;
    public int f14606n;
    public ValueAnimator f14607r;

    public eb(Context context) {
        super(context);
        this.f14601a = new Path();
        Paint paint = new Paint(1);
        this.f14602b = paint;
        Paint paint2 = new Paint(3);
        this.f14603c = paint2;
        this.f14604e = new org.telegram.ui.Components.c6(this, 0L, 380L, lr.h);
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void a(v vVar, boolean z10) {
        if (this.f14605f == vVar) {
            return;
        }
        ValueAnimator valueAnimator = this.f14607r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14607r = null;
        }
        if (z10) {
            this.f14607r = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            this.f14607r.addUpdateListener(new fi.z2(this, new AtomicBoolean(), vVar, 2));
            this.f14607r.start();
            return;
        }
        setDrawable(vVar);
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
            this.f14604e.e(true, f10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f14605f != null) {
            float d = this.f14604e.d(this.d);
            int intrinsicWidth = this.f14605f.getIntrinsicWidth();
            int intrinsicHeight = this.f14605f.getIntrinsicHeight();
            Rect rect = org.telegram.messenger.g0.Q;
            rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
            if (d <= 0.0f) {
                this.f14605f.setBounds(rect);
                this.f14605f.draw(canvas);
            } else if (d < 1.0f) {
                canvas.save();
                Path path = this.f14601a;
                path.rewind();
                path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f) * d, Path.Direction.CW);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                this.f14605f.setBounds(rect);
                this.f14605f.draw(canvas);
                canvas.restore();
            }
            if (d > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.g0.L(16.0f) * d, this.f14602b);
                canvas.save();
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, this.f14603c);
                }
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h == null && this.f14606n != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), this.f14606n);
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
        this.f14605f = getContext().getResources().getDrawable(i7).mutate();
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
        Drawable drawable = this.f14605f;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(f10, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
        this.f14602b.setColor(i0.a.f(f10, -1, -16777216));
        invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        this.d = z10;
        invalidate();
    }

    public void setDrawable(Drawable drawable) {
        this.f14605f = drawable;
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
