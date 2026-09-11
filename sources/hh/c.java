package hh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
public final class c extends Drawable {
    public final int f11336a = 2;
    public final int f11337b;
    public final int f11338c;
    public Object d;

    public c(int i10, int i11, Drawable drawable) {
        this.f11337b = i10;
        this.f11338c = i11;
        this.d = drawable;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        float f7;
        switch (this.f11336a) {
            case 0:
                ((Drawable) this.d).draw(canvas);
                return;
            case 1:
                Rect bounds = getBounds();
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), this.f11338c / 2.0f, (Paint) this.d);
                return;
            default:
                Rect bounds2 = getBounds();
                int i11 = this.f11338c;
                int i12 = this.f11337b;
                if (i12 == 7) {
                    if (((RectF) this.d) == null) {
                        this.d = new RectF();
                    }
                    ((RectF) this.d).set(bounds2);
                    if (i11 <= 0) {
                        f7 = AndroidUtilities.dp(6.0f);
                    } else {
                        f7 = i11;
                    }
                    canvas.drawRoundRect((RectF) this.d, f7, f7, j6.f21054z);
                    return;
                }
                if (i12 != 1 && i12 != 6) {
                    if (i12 == 3) {
                        i10 = Math.max(bounds2.width(), bounds2.height()) / 2;
                    } else {
                        i10 = (int) Math.ceil(Math.sqrt(((bounds2.top - bounds2.centerY()) * (bounds2.top - bounds2.centerY())) + ((bounds2.left - bounds2.centerX()) * (bounds2.left - bounds2.centerX()))));
                    }
                } else {
                    if (i11 <= 0) {
                        i11 = AndroidUtilities.dp(20.0f);
                    }
                    i10 = i11;
                }
                canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), i10, j6.f21054z);
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f11336a) {
            case 0:
                return ((Drawable) this.d).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f11336a) {
            case 1:
                return this.f11338c + this.f11337b;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f11336a) {
            case 1:
                return this.f11338c + this.f11337b;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f11336a) {
            case 0:
                return ((Drawable) this.d).getOpacity();
            case 1:
                return -2;
            default:
                return 0;
        }
    }

    @Override
    public void onBoundsChange(Rect rect) {
        switch (this.f11336a) {
            case 0:
                super.onBoundsChange(rect);
                int width = rect.width();
                int i10 = this.f11337b;
                int i11 = (width - i10) / 2;
                int height = rect.height();
                int i12 = this.f11338c;
                int i13 = (height - i12) / 2;
                ((Drawable) this.d).setBounds(i11, i13, i10 + i11, i12 + i13);
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f11336a) {
            case 0:
                ((Drawable) this.d).setAlpha(i10);
                return;
            case 1:
                ((Paint) this.d).setAlpha(i10);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f11336a) {
            case 0:
                return;
            case 1:
                ((Paint) this.d).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public c(int i10, int i11, int i12) {
        this.f11337b = i10;
        this.f11338c = i12;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i10);
        paint.setColor(i11);
    }

    public c(int i10, int i11) {
        this.f11337b = i10;
        this.f11338c = i11;
    }

    private final void a(int i10) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
