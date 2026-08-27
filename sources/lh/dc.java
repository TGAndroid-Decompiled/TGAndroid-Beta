package lh;

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
import org.telegram.ui.Components.er;

public class dc extends View implements q2 {

    public final Path f15879a;

    public final Paint f15880b;

    public final Paint f15881c;
    public boolean d;

    public final org.telegram.ui.Components.y5 f15882e;

    public Drawable f15883f;
    public Bitmap h;

    public int f15884n;

    public ValueAnimator f15885r;

    public dc(Context context) {
        super(context);
        this.f15879a = new Path();
        Paint paint = new Paint(1);
        this.f15880b = paint;
        Paint paint2 = new Paint(3);
        this.f15881c = paint2;
        this.f15882e = new org.telegram.ui.Components.y5(this, 0L, 380L, er.h);
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void a(v vVar, boolean z10) {
        if (this.f15883f == vVar) {
            return;
        }
        ValueAnimator valueAnimator = this.f15885r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f15885r = null;
        }
        if (!z10) {
            setDrawable(vVar);
            return;
        }
        this.f15885r = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        this.f15885r.addUpdateListener(new jh.g3(this, new AtomicBoolean(), vVar, 2));
        this.f15885r.start();
    }

    public final void b(boolean z10, boolean z11) {
        this.d = z10;
        if (!z11) {
            this.f15882e.d(z10 ? 1.0f : 0.0f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f15883f == null) {
            return;
        }
        float fE = this.f15882e.e(this.d);
        int intrinsicWidth = this.f15883f.getIntrinsicWidth();
        int intrinsicHeight = this.f15883f.getIntrinsicHeight();
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
        if (fE <= 0.0f) {
            this.f15883f.setBounds(rect);
            this.f15883f.draw(canvas);
        } else if (fE < 1.0f) {
            canvas.save();
            Path path = this.f15879a;
            path.rewind();
            path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * fE, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            this.f15883f.setBounds(rect);
            this.f15883f.draw(canvas);
            canvas.restore();
        }
        if (fE > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * fE, this.f15880b);
            canvas.save();
            Bitmap bitmap = this.h;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rect, this.f15881c);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h != null || this.f15884n == 0) {
            return;
        }
        this.h = BitmapFactory.decodeResource(getResources(), this.f15884n);
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
        this.f15883f = getContext().getResources().getDrawable(i10).mutate();
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
    public void setInvert(float f10) {
        Drawable drawable = this.f15883f;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i0.b.d(f10, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
        this.f15880b.setColor(i0.b.d(f10, -1, -16777216));
        invalidate();
    }

    @Override
    public void setSelected(boolean z10) {
        this.d = z10;
        invalidate();
    }

    public void setDrawable(Drawable drawable) {
        this.f15883f = drawable;
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        if (this.h == null && drawable != null && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            this.h = bitmapCreateBitmap;
            drawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), this.h.getHeight());
            drawable.draw(new Canvas(this.h));
        }
        invalidate();
    }
}
