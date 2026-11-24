package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
public final class ds8 extends Drawable {
    public final byte a;
    public final ShapeDrawable b;
    public final Rect c;

    public ds8(nea neaVar) {
        this.a = (byte) 1;
        int L = gm.L(16.0f);
        int L2 = gm.L(16.0f);
        int i = cmb.c6;
        ylb ylbVar = neaVar.c;
        this.b = cmb.c0(L, L2, cmb.v(cmb.v0(i, ylbVar), cmb.p1(0.04f, cmb.v0(cmb.F6, ylbVar))));
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
                rect.inset(gm.L(2.0f), gm.L(8.0f));
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                rect.set(getBounds());
                rect.inset(gm.L(2.0f), gm.L(8.0f));
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

    public ds8(lea leaVar) {
        this.a = (byte) 0;
        this.b = cmb.c0(gm.L(16.0f), gm.L(16.0f), 0);
        this.c = new Rect();
    }
}
