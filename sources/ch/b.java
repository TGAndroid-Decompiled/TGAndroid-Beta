package ch;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import g7.n;
import org.telegram.messenger.Utilities;
public final class b extends Drawable {
    public final a f2426b;
    public Bitmap f2427c;
    public Canvas d;
    public int f2428e;
    public float f2429f;
    public int f2430g;
    public int h;
    public final Paint f2425a = new Paint(2);
    public int f2431i = 255;

    public b(a aVar) {
        this.f2426b = aVar;
    }

    public final void a(int i9, int i10, float f10, int i11) {
        int i12 = i11 * 2;
        int i13 = (int) ((i9 + i12) / f10);
        int i14 = (int) ((i10 + i12) / f10);
        Bitmap bitmap = this.f2427c;
        if (bitmap != null && bitmap.getWidth() == i13 && this.f2427c.getHeight() == i14) {
            this.f2427c.eraseColor(0);
        } else {
            Bitmap bitmap2 = this.f2427c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.f2427c = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
            this.d = new Canvas(this.f2427c);
        }
        this.f2429f = f10;
        this.f2428e = i11;
        this.d.save();
        float f11 = i11 / f10;
        this.d.translate(f11, f11);
        float f12 = 1.0f / f10;
        this.d.scale(f12, f12);
        this.f2426b.l(this.d, 255);
        Utilities.stackBlurBitmap(this.f2427c, (int) f11);
        this.d.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i9 = this.f2431i;
        a aVar = this.f2426b;
        if (i9 == 255) {
            canvas.save();
            canvas.translate(this.f2430g, this.h);
            aVar.l(canvas, 255);
            canvas.restore();
        } else if (i9 != 0) {
            double d = i9 / 255.0d;
            double d9 = d / ((1.0d - d) * 6.0d);
            double d10 = 1.0d + d9;
            double sqrt = ((-d10) + Math.sqrt((d10 * d10) - (((-d9) * 4.0d) * (-d)))) / ((-2.0d) * d9);
            int b10 = n.b((int) (d9 * sqrt * 255.0d), 0, 255);
            int b11 = n.b((int) (sqrt * 255.0d), 0, 255);
            if (b11 > 0 && this.f2427c != null) {
                Paint paint = this.f2425a;
                paint.setAlpha(b11);
                canvas.save();
                int i10 = this.f2430g;
                int i11 = this.f2428e;
                canvas.translate(i10 - i11, this.h - i11);
                float f10 = this.f2429f;
                canvas.scale(f10, f10);
                canvas.drawBitmap(this.f2427c, 0.0f, 0.0f, paint);
                canvas.restore();
            }
            if (b10 > 0) {
                canvas.save();
                canvas.translate(this.f2430g, this.h);
                aVar.l(canvas, b10);
                canvas.restore();
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f2431i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i9) {
        this.f2431i = i9;
    }

    @Override
    public final void setBounds(int i9, int i10, int i11, int i12) {
        this.f2430g = i9;
        this.h = i10;
        super.setBounds(i9, i10, i11, i12);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
