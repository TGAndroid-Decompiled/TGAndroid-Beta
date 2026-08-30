package hh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import k7.n;
import org.telegram.messenger.Utilities;
public final class b extends Drawable {
    public final a f7109b;
    public Bitmap f7110c;
    public Canvas d;
    public int e;
    public float f7111f;
    public int f7112g;
    public int h;
    public final Paint f7108a = new Paint(2);
    public int f7113i = 255;

    public b(a aVar) {
        this.f7109b = aVar;
    }

    public final void a(int i10, int i11, float f10, int i12) {
        int i13 = i12 * 2;
        int i14 = (int) ((i10 + i13) / f10);
        int i15 = (int) ((i11 + i13) / f10);
        Bitmap bitmap = this.f7110c;
        if (bitmap != null && bitmap.getWidth() == i14 && this.f7110c.getHeight() == i15) {
            this.f7110c.eraseColor(0);
        } else {
            Bitmap bitmap2 = this.f7110c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.f7110c = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
            this.d = new Canvas(this.f7110c);
        }
        this.f7111f = f10;
        this.e = i12;
        this.d.save();
        float f11 = i12 / f10;
        this.d.translate(f11, f11);
        float f12 = 1.0f / f10;
        this.d.scale(f12, f12);
        this.f7109b.p(this.d, 255);
        Utilities.stackBlurBitmap(this.f7110c, (int) f11);
        this.d.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = this.f7113i;
        a aVar = this.f7109b;
        if (i10 == 255) {
            canvas.save();
            canvas.translate(this.f7112g, this.h);
            aVar.p(canvas, 255);
            canvas.restore();
        } else if (i10 != 0) {
            double d = i10 / 255.0d;
            double d10 = d / ((1.0d - d) * 6.0d);
            double d11 = 1.0d + d10;
            double sqrt = ((-d11) + Math.sqrt((d11 * d11) - (((-d10) * 4.0d) * (-d)))) / ((-2.0d) * d10);
            int b10 = n.b((int) (d10 * sqrt * 255.0d), 0, 255);
            int b11 = n.b((int) (sqrt * 255.0d), 0, 255);
            if (b11 > 0 && this.f7110c != null) {
                Paint paint = this.f7108a;
                paint.setAlpha(b11);
                canvas.save();
                int i11 = this.f7112g;
                int i12 = this.e;
                canvas.translate(i11 - i12, this.h - i12);
                float f10 = this.f7111f;
                canvas.scale(f10, f10);
                canvas.drawBitmap(this.f7110c, 0.0f, 0.0f, paint);
                canvas.restore();
            }
            if (b10 > 0) {
                canvas.save();
                canvas.translate(this.f7112g, this.h);
                aVar.p(canvas, b10);
                canvas.restore();
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f7113i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f7113i = i10;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        this.f7112g = i10;
        this.h = i11;
        super.setBounds(i10, i11, i12, i13);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
