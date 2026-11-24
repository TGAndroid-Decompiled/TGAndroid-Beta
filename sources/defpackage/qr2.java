package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class qr2 extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public int d;
    public int e;
    public final ArrayList c = new ArrayList();
    public boolean f = false;
    public final ln g = new ln(new xf2(this, (byte) 11), 420, d53.h);
    public int h = 255;

    public qr2(Drawable drawable, Drawable drawable2) {
        this.a = drawable;
        this.b = drawable2;
    }

    public final void a(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    public final void b(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((View) obj).invalidate();
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float d = this.g.d(this.f);
        int i = this.h;
        Drawable drawable = this.a;
        drawable.setAlpha(i);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (d > 0.0f) {
            Drawable drawable2 = this.b;
            drawable2.setAlpha((int) (this.h * d));
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.e);
            float R1 = gm.R1(0.5f, 1.0f, d);
            canvas.save();
            canvas.scale(R1, R1, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.h = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
    }
}
