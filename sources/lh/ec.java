package lh;

import android.app.Activity;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

public final class ec extends View implements q2 {

    public final Drawable f15940a;

    public final int f15941b;

    public Bitmap f15942c;
    public final Paint d;

    public final Paint f15943e;

    public float f15944f;
    public final org.telegram.ui.Components.y5 h;

    public final Path f15945n;

    public ec(Activity activity, int i10, int i11) {
        super(activity);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(3);
        this.f15943e = paint2;
        this.h = new org.telegram.ui.Components.y5(this, 0L, 350L, er.h);
        this.f15945n = new Path();
        this.f15940a = activity.getResources().getDrawable(i10).mutate();
        this.f15941b = i11;
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15942c == null) {
            this.f15942c = BitmapFactory.decodeResource(getResources(), this.f15941b);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f15942c;
        if (bitmap != null) {
            bitmap.recycle();
            this.f15942c = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float fD = this.h.d(this.f15944f, false);
        Drawable drawable = this.f15940a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
        if (fD <= 0.0f) {
            drawable.setBounds(rect);
            drawable.draw(canvas);
        } else if (fD < 1.0f) {
            canvas.save();
            Path path = this.f15945n;
            path.rewind();
            path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * fD, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            drawable.setBounds(rect);
            drawable.draw(canvas);
            canvas.restore();
        }
        if (fD > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * fD, this.d);
            canvas.save();
            Bitmap bitmap = this.f15942c;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rect, this.f15943e);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public void setInvert(float f10) {
        this.f15940a.setColorFilter(new PorterDuffColorFilter(i0.b.d(f10, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.d.setColor(i0.b.d(f10, -1, -16777216));
    }

    public void setValue(boolean z10) {
        this.f15944f = z10 ? 1.0f : 0.0f;
        invalidate();
    }
}
