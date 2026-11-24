package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
public final class bq8 extends Drawable {
    public final byte a;
    public final ShapeDrawable b;
    public final Rect c;

    public bq8(nca ncaVar) {
        this.a = (byte) 1;
        int L = gl.L(16.0f);
        int L2 = gl.L(16.0f);
        int i = bkb.c6;
        wjb wjbVar = ncaVar.c;
        this.b = bkb.c0(L, L2, bkb.v(bkb.v0(i, wjbVar), bkb.p1(0.04f, bkb.v0(bkb.F6, wjbVar))));
        this.c = new Rect();
    }

    @Override
    public final void draw(Canvas canvas) {
        byte b = this.a;
        ShapeDrawable shapeDrawable = this.b;
        Rect rect = this.c;
        switch (b) {
            case 0:
                rect.set(getBounds());
                rect.inset(gl.L(2.0f), gl.L(8.0f));
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                rect.set(getBounds());
                rect.inset(gl.L(2.0f), gl.L(8.0f));
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        byte b = this.a;
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(i);
                return;
            default:
                this.b.setAlpha(i);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    public bq8(lca lcaVar) {
        this.a = (byte) 0;
        this.b = bkb.c0(gl.L(16.0f), gl.L(16.0f), 0);
        this.c = new Rect();
    }
}
