package bi;

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
import org.telegram.ui.Components.wr;
public class ne extends View implements l3 {
    public final Path f3254a;
    public final Paint f3255b;
    public final Paint f3256c;
    public boolean d;
    public final org.telegram.ui.Components.d6 e;
    public Drawable f3257f;
    public Bitmap h;
    public int f3258n;
    public ValueAnimator f3259r;

    public ne(Context context) {
        super(context);
        this.f3254a = new Path();
        Paint paint = new Paint(1);
        this.f3255b = paint;
        Paint paint2 = new Paint(3);
        this.f3256c = paint2;
        this.e = new org.telegram.ui.Components.d6(this, 0L, 380L, wr.h);
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void a(y yVar, boolean z10) {
        if (this.f3257f == yVar) {
            return;
        }
        ValueAnimator valueAnimator = this.f3259r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f3259r = null;
        }
        if (z10) {
            this.f3259r = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            this.f3259r.addUpdateListener(new v5(this, new AtomicBoolean(), yVar, 1));
            this.f3259r.start();
            return;
        }
        setDrawable(yVar);
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
        if (this.f3257f != null) {
            float e = this.e.e(this.d);
            int intrinsicWidth = this.f3257f.getIntrinsicWidth();
            int intrinsicHeight = this.f3257f.getIntrinsicHeight();
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
            if (e <= 0.0f) {
                this.f3257f.setBounds(rect);
                this.f3257f.draw(canvas);
            } else if (e < 1.0f) {
                canvas.save();
                Path path = this.f3254a;
                path.rewind();
                path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * e, Path.Direction.CW);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                this.f3257f.setBounds(rect);
                this.f3257f.draw(canvas);
                canvas.restore();
            }
            if (e > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * e, this.f3255b);
                canvas.save();
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, this.f3256c);
                }
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h == null && this.f3258n != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), this.f3258n);
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
        this.f3257f = getContext().getResources().getDrawable(i10).mutate();
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
        Drawable drawable = this.f3257f;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(f7, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
        this.f3255b.setColor(i0.a.d(f7, -1, -16777216));
        invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        this.d = z10;
        invalidate();
    }

    public void setDrawable(Drawable drawable) {
        this.f3257f = drawable;
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
