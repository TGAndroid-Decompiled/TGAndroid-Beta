package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
public final class ve4 extends ImageSpan {
    public int a;

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (paint.getColor() != this.a && getDrawable() != null) {
            Drawable drawable = getDrawable();
            int color = paint.getColor();
            this.a = color;
            drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
        }
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }
}
