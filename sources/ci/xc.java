package ci;

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
import org.telegram.ui.Components.sr;
public class xc extends View implements w2 {
    public final Path f5852a;
    public final Paint f5853b;
    public final Paint f5854c;
    public boolean d;
    public final org.telegram.ui.Components.e6 e;
    public Drawable f5855f;
    public Bitmap h;
    public int f5856n;
    public ValueAnimator f5857r;

    public xc(Context context) {
        super(context);
        this.f5852a = new Path();
        Paint paint = new Paint(1);
        this.f5853b = paint;
        Paint paint2 = new Paint(3);
        this.f5854c = paint2;
        this.e = new org.telegram.ui.Components.e6(this, 0L, 380L, sr.h);
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void a(u uVar, boolean z10) {
        if (this.f5855f == uVar) {
            return;
        }
        ValueAnimator valueAnimator = this.f5857r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5857r = null;
        }
        if (z10) {
            this.f5857r = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            this.f5857r.addUpdateListener(new ai.x4(this, new AtomicBoolean(), uVar, 2));
            this.f5857r.start();
            return;
        }
        setDrawable(uVar);
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        this.d = z10;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.e.d(f7, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f5855f != null) {
            float e = this.e.e(this.d);
            int intrinsicWidth = this.f5855f.getIntrinsicWidth();
            int intrinsicHeight = this.f5855f.getIntrinsicHeight();
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
            if (e <= 0.0f) {
                this.f5855f.setBounds(rect);
                this.f5855f.draw(canvas);
            } else if (e < 1.0f) {
                canvas.save();
                Path path = this.f5852a;
                path.rewind();
                path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * e, Path.Direction.CW);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                this.f5855f.setBounds(rect);
                this.f5855f.draw(canvas);
                canvas.restore();
            }
            if (e > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * e, this.f5853b);
                canvas.save();
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, this.f5854c);
                }
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h == null && this.f5856n != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), this.f5856n);
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

    public void setDrawable(int i10) {
        this.f5855f = getContext().getResources().getDrawable(i10).mutate();
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        if (this.h == null && i10 != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), i10);
        }
        invalidate();
    }

    @Override
    public void setInvert(float f7) {
        Drawable drawable = this.f5855f;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(f7, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
        this.f5853b.setColor(i0.a.d(f7, -1, -16777216));
        invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        this.d = z10;
        invalidate();
    }

    public void setDrawable(Drawable drawable) {
        this.f5855f = drawable;
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
