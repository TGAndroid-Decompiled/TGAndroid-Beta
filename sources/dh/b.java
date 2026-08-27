package dh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import h7.n;
import org.telegram.messenger.Utilities;

public final class b extends Drawable {

    public final a f4970b;

    public Bitmap f4971c;
    public Canvas d;

    public int f4972e;

    public float f4973f;

    public int f4974g;
    public int h;

    public final Paint f4969a = new Paint(2);

    public int f4975i = 255;

    public b(a aVar) {
        this.f4970b = aVar;
    }

    public final void a(int i10, int i11, float f10, int i12) {
        int i13 = i12 * 2;
        int i14 = (int) ((i10 + i13) / f10);
        int i15 = (int) ((i11 + i13) / f10);
        Bitmap bitmap = this.f4971c;
        if (bitmap != null && bitmap.getWidth() == i14 && this.f4971c.getHeight() == i15) {
            this.f4971c.eraseColor(0);
        } else {
            Bitmap bitmap2 = this.f4971c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.f4971c = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
            this.d = new Canvas(this.f4971c);
        }
        this.f4973f = f10;
        this.f4972e = i12;
        this.d.save();
        float f11 = i12 / f10;
        this.d.translate(f11, f11);
        float f12 = 1.0f / f10;
        this.d.scale(f12, f12);
        this.f4970b.l(this.d, 255);
        Utilities.stackBlurBitmap(this.f4971c, (int) f11);
        this.d.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10 = this.f4975i;
        a aVar = this.f4970b;
        if (i10 == 255) {
            canvas.save();
            canvas.translate(this.f4974g, this.h);
            aVar.l(canvas, 255);
            canvas.restore();
            return;
        }
        if (i10 == 0) {
            return;
        }
        double d = ((double) i10) / 255.0d;
        double d10 = d / ((1.0d - d) * 6.0d);
        double d11 = 1.0d + d10;
        double dSqrt = ((-d11) + Math.sqrt((d11 * d11) - (((-d10) * 4.0d) * (-d)))) / ((-2.0d) * d10);
        int iB = n.b((int) (d10 * dSqrt * 255.0d), 0, 255);
        int iB2 = n.b((int) (dSqrt * 255.0d), 0, 255);
        if (iB2 > 0 && this.f4971c != null) {
            Paint paint = this.f4969a;
            paint.setAlpha(iB2);
            canvas.save();
            int i11 = this.f4974g;
            int i12 = this.f4972e;
            canvas.translate(i11 - i12, this.h - i12);
            float f10 = this.f4973f;
            canvas.scale(f10, f10);
            canvas.drawBitmap(this.f4971c, 0.0f, 0.0f, paint);
            canvas.restore();
        }
        if (iB > 0) {
            canvas.save();
            canvas.translate(this.f4974g, this.h);
            aVar.l(canvas, iB);
            canvas.restore();
        }
    }

    @Override
    public final int getAlpha() {
        return this.f4975i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f4975i = i10;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        this.f4974g = i10;
        this.h = i11;
        super.setBounds(i10, i11, i12, i13);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
