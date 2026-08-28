package kh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
public class hc extends View implements r2 {
    public final Path f15403a;
    public final Paint f15404b;
    public final Paint f15405c;
    public boolean d;
    public final org.telegram.ui.Components.y5 f15406e;
    public Drawable f15407f;
    public Bitmap h;
    public int f15408n;
    public ValueAnimator f15409r;

    public hc(Context context) {
        super(context);
        this.f15403a = new Path();
        Paint paint = new Paint(1);
        this.f15404b = paint;
        Paint paint2 = new Paint(3);
        this.f15405c = paint2;
        this.f15406e = new org.telegram.ui.Components.y5(this, 0L, 380L, gr.h);
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void a(v vVar, boolean z10) {
        if (this.f15407f == vVar) {
            return;
        }
        ValueAnimator valueAnimator = this.f15409r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f15409r = null;
        }
        if (z10) {
            this.f15409r = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            this.f15409r.addUpdateListener(new ih.i3(this, new AtomicBoolean(), vVar, 2));
            this.f15409r.start();
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
            this.f15406e.d(f10, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f15407f != null) {
            float e10 = this.f15406e.e(this.d);
            int intrinsicWidth = this.f15407f.getIntrinsicWidth();
            int intrinsicHeight = this.f15407f.getIntrinsicHeight();
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
            if (e10 <= 0.0f) {
                this.f15407f.setBounds(rect);
                this.f15407f.draw(canvas);
            } else if (e10 < 1.0f) {
                canvas.save();
                Path path = this.f15403a;
                path.rewind();
                path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * e10, Path.Direction.CW);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                this.f15407f.setBounds(rect);
                this.f15407f.draw(canvas);
                canvas.restore();
            }
            if (e10 > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * e10, this.f15404b);
                canvas.save();
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, this.f15405c);
                }
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h == null && this.f15408n != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), this.f15408n);
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

    public void setDrawable(int i9) {
        this.f15407f = getContext().getResources().getDrawable(i9).mutate();
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        if (this.h == null && i9 != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), i9);
        }
        invalidate();
    }

    @Override
    public void setInvert(float f10) {
        Drawable drawable = this.f15407f;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(f10, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
        this.f15404b.setColor(i0.a.d(f10, -1, -16777216));
        invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        this.d = z10;
        invalidate();
    }

    public void setDrawable(Drawable drawable) {
        this.f15407f = drawable;
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
