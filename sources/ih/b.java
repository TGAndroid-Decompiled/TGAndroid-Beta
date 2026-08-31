package ih;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import k7.o;
import org.telegram.messenger.Utilities;
public final class b extends Drawable {
    public final a f8107b;
    public Bitmap f8108c;
    public Canvas d;
    public int f8109e;
    public float f8110f;
    public int f8111g;
    public int h;
    public final Paint f8106a = new Paint(2);
    public int f8112i = 255;

    public b(a aVar) {
        this.f8107b = aVar;
    }

    public final void a(int i10, int i11, float f10, int i12) {
        int i13 = i12 * 2;
        int i14 = (int) ((i10 + i13) / f10);
        int i15 = (int) ((i11 + i13) / f10);
        Bitmap bitmap = this.f8108c;
        if (bitmap != null && bitmap.getWidth() == i14 && this.f8108c.getHeight() == i15) {
            this.f8108c.eraseColor(0);
        } else {
            Bitmap bitmap2 = this.f8108c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.f8108c = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
            this.d = new Canvas(this.f8108c);
        }
        this.f8110f = f10;
        this.f8109e = i12;
        this.d.save();
        float f11 = i12 / f10;
        this.d.translate(f11, f11);
        float f12 = 1.0f / f10;
        this.d.scale(f12, f12);
        this.f8107b.p(this.d, 255);
        Utilities.stackBlurBitmap(this.f8108c, (int) f11);
        this.d.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = this.f8112i;
        a aVar = this.f8107b;
        if (i10 == 255) {
            canvas.save();
            canvas.translate(this.f8111g, this.h);
            aVar.p(canvas, 255);
            canvas.restore();
        } else if (i10 != 0) {
            double d = i10 / 255.0d;
            double d10 = d / ((1.0d - d) * 6.0d);
            double d11 = 1.0d + d10;
            double sqrt = ((-d11) + Math.sqrt((d11 * d11) - (((-d10) * 4.0d) * (-d)))) / ((-2.0d) * d10);
            int b10 = o.b((int) (d10 * sqrt * 255.0d), 0, 255);
            int b11 = o.b((int) (sqrt * 255.0d), 0, 255);
            if (b11 > 0 && this.f8108c != null) {
                Paint paint = this.f8106a;
                paint.setAlpha(b11);
                canvas.save();
                int i11 = this.f8111g;
                int i12 = this.f8109e;
                canvas.translate(i11 - i12, this.h - i12);
                float f10 = this.f8110f;
                canvas.scale(f10, f10);
                canvas.drawBitmap(this.f8108c, 0.0f, 0.0f, paint);
                canvas.restore();
            }
            if (b10 > 0) {
                canvas.save();
                canvas.translate(this.f8111g, this.h);
                aVar.p(canvas, b10);
                canvas.restore();
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f8112i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f8112i = i10;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        this.f8111g = i10;
        this.h = i11;
        super.setBounds(i10, i11, i12, i13);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
