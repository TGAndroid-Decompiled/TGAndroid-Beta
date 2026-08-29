package fh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import i7.w;
import org.telegram.messenger.Utilities;
public final class b extends Drawable {
    public final a f6765b;
    public Bitmap f6766c;
    public Canvas d;
    public int f6767e;
    public float f6768f;
    public int f6769g;
    public int h;
    public final Paint f6764a = new Paint(2);
    public int f6770i = 255;

    public b(a aVar) {
        this.f6765b = aVar;
    }

    public final void a(int i10, int i11, float f9, int i12) {
        int i13 = i12 * 2;
        int i14 = (int) ((i10 + i13) / f9);
        int i15 = (int) ((i11 + i13) / f9);
        Bitmap bitmap = this.f6766c;
        if (bitmap != null && bitmap.getWidth() == i14 && this.f6766c.getHeight() == i15) {
            this.f6766c.eraseColor(0);
        } else {
            Bitmap bitmap2 = this.f6766c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.f6766c = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
            this.d = new Canvas(this.f6766c);
        }
        this.f6768f = f9;
        this.f6767e = i12;
        this.d.save();
        float f10 = i12 / f9;
        this.d.translate(f10, f10);
        float f11 = 1.0f / f9;
        this.d.scale(f11, f11);
        this.f6765b.p(this.d, 255);
        Utilities.stackBlurBitmap(this.f6766c, (int) f10);
        this.d.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = this.f6770i;
        a aVar = this.f6765b;
        if (i10 == 255) {
            canvas.save();
            canvas.translate(this.f6769g, this.h);
            aVar.p(canvas, 255);
            canvas.restore();
        } else if (i10 != 0) {
            double d = i10 / 255.0d;
            double d10 = d / ((1.0d - d) * 6.0d);
            double d11 = 1.0d + d10;
            double sqrt = ((-d11) + Math.sqrt((d11 * d11) - (((-d10) * 4.0d) * (-d)))) / ((-2.0d) * d10);
            int b10 = w.b((int) (d10 * sqrt * 255.0d), 0, 255);
            int b11 = w.b((int) (sqrt * 255.0d), 0, 255);
            if (b11 > 0 && this.f6766c != null) {
                Paint paint = this.f6764a;
                paint.setAlpha(b11);
                canvas.save();
                int i11 = this.f6769g;
                int i12 = this.f6767e;
                canvas.translate(i11 - i12, this.h - i12);
                float f9 = this.f6768f;
                canvas.scale(f9, f9);
                canvas.drawBitmap(this.f6766c, 0.0f, 0.0f, paint);
                canvas.restore();
            }
            if (b10 > 0) {
                canvas.save();
                canvas.translate(this.f6769g, this.h);
                aVar.p(canvas, b10);
                canvas.restore();
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f6770i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f6770i = i10;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        this.f6769g = i10;
        this.h = i11;
        super.setBounds(i10, i11, i12, i13);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
