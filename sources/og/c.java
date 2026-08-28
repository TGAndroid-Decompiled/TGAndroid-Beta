package og;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class c extends Drawable {
    public final int f19567a = 2;
    public final int f19568b;
    public final int f19569c;
    public Object d;

    public c(int i9, int i10, Drawable drawable) {
        this.f19568b = i9;
        this.f19569c = i10;
        this.d = drawable;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i9;
        float f10;
        switch (this.f19567a) {
            case 0:
                ((Drawable) this.d).draw(canvas);
                return;
            case 1:
                Rect bounds = getBounds();
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), this.f19569c / 2.0f, (Paint) this.d);
                return;
            default:
                Rect bounds2 = getBounds();
                int i10 = this.f19569c;
                int i11 = this.f19568b;
                if (i11 == 7) {
                    if (((RectF) this.d) == null) {
                        this.d = new RectF();
                    }
                    ((RectF) this.d).set(bounds2);
                    if (i10 <= 0) {
                        f10 = AndroidUtilities.dp(6.0f);
                    } else {
                        f10 = i10;
                    }
                    canvas.drawRoundRect((RectF) this.d, f10, f10, f6.f23379z);
                    return;
                }
                if (i11 != 1 && i11 != 6) {
                    if (i11 == 3) {
                        i9 = Math.max(bounds2.width(), bounds2.height()) / 2;
                    } else {
                        i9 = (int) Math.ceil(Math.sqrt(((bounds2.top - bounds2.centerY()) * (bounds2.top - bounds2.centerY())) + ((bounds2.left - bounds2.centerX()) * (bounds2.left - bounds2.centerX()))));
                    }
                } else {
                    if (i10 <= 0) {
                        i10 = AndroidUtilities.dp(20.0f);
                    }
                    i9 = i10;
                }
                canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), i9, f6.f23379z);
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f19567a) {
            case 0:
                return ((Drawable) this.d).getAlpha();
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f19567a) {
            case 1:
                return this.f19569c + this.f19568b;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f19567a) {
            case 1:
                return this.f19569c + this.f19568b;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f19567a) {
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
        switch (this.f19567a) {
            case 0:
                super.onBoundsChange(rect);
                int width = rect.width();
                int i9 = this.f19568b;
                int i10 = (width - i9) / 2;
                int height = rect.height();
                int i11 = this.f19569c;
                int i12 = (height - i11) / 2;
                ((Drawable) this.d).setBounds(i10, i12, i9 + i10, i11 + i12);
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i9) {
        switch (this.f19567a) {
            case 0:
                ((Drawable) this.d).setAlpha(i9);
                return;
            case 1:
                ((Paint) this.d).setAlpha(i9);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f19567a) {
            case 0:
                return;
            case 1:
                ((Paint) this.d).setColorFilter(colorFilter);
                return;
            default:
                return;
        }
    }

    public c(int i9, int i10, int i11) {
        this.f19568b = i9;
        this.f19569c = i11;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i9);
        paint.setColor(i10);
    }

    public c(int i9, int i10) {
        this.f19568b = i9;
        this.f19569c = i10;
    }

    private final void a(int i9) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
