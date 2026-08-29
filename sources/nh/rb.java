package nh;

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
import org.telegram.ui.Components.jr;
public class rb extends View implements o2 {
    public final Path f18533a;
    public final Paint f18534b;
    public final Paint f18535c;
    public boolean d;
    public final org.telegram.ui.Components.d6 f18536e;
    public Drawable f18537f;
    public Bitmap h;
    public int f18538n;
    public ValueAnimator f18539r;

    public rb(Context context) {
        super(context);
        this.f18533a = new Path();
        Paint paint = new Paint(1);
        this.f18534b = paint;
        Paint paint2 = new Paint(3);
        this.f18535c = paint2;
        this.f18536e = new org.telegram.ui.Components.d6(this, 0L, 380L, jr.h);
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void a(u uVar, boolean z10) {
        if (this.f18537f == uVar) {
            return;
        }
        ValueAnimator valueAnimator = this.f18539r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f18539r = null;
        }
        if (z10) {
            this.f18539r = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            this.f18539r.addUpdateListener(new bg.s(this, new AtomicBoolean(), uVar, 3));
            this.f18539r.start();
            return;
        }
        setDrawable(uVar);
    }

    public final void b(boolean z10, boolean z11) {
        float f9;
        this.d = z10;
        if (!z11) {
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            this.f18536e.d(f9, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f18537f != null) {
            float e10 = this.f18536e.e(this.d);
            int intrinsicWidth = this.f18537f.getIntrinsicWidth();
            int intrinsicHeight = this.f18537f.getIntrinsicHeight();
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
            if (e10 <= 0.0f) {
                this.f18537f.setBounds(rect);
                this.f18537f.draw(canvas);
            } else if (e10 < 1.0f) {
                canvas.save();
                Path path = this.f18533a;
                path.rewind();
                path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * e10, Path.Direction.CW);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                this.f18537f.setBounds(rect);
                this.f18537f.draw(canvas);
                canvas.restore();
            }
            if (e10 > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * e10, this.f18534b);
                canvas.save();
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, this.f18535c);
                }
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h == null && this.f18538n != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), this.f18538n);
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
        this.f18537f = getContext().getResources().getDrawable(i10).mutate();
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
    public void setInvert(float f9) {
        Drawable drawable = this.f18537f;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(f9, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
        this.f18534b.setColor(i0.a.d(f9, -1, -16777216));
        invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        this.d = z10;
        invalidate();
    }

    public void setDrawable(Drawable drawable) {
        this.f18537f = drawable;
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
