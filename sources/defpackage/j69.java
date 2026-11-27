package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class j69 extends Drawable {
    public final Paint a = new Paint(1);
    public final View b;
    public final Path c;
    public final RectF d;
    public final d79 e;

    public j69(d79 d79Var, View view, Path path, RectF rectF) {
        this.e = d79Var;
        this.b = view;
        this.c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.c);
        int v0 = aob.v0(aob.d6, this.e.o2);
        Paint paint = this.a;
        paint.setColor(vm2.o(v0, paint.getAlpha()));
        canvas.drawRect(this.d, paint);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
