package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
public final class nt8 extends Drawable {
    public final byte a;
    public final ShapeDrawable b;
    public final Rect c;

    public nt8(ega egaVar) {
        this.a = (byte) 1;
        int L = hl.L(16.0f);
        int L2 = hl.L(16.0f);
        int i = aob.d6;
        vnb vnbVar = egaVar.c;
        this.b = aob.c0(L, L2, aob.v(aob.v0(i, vnbVar), aob.p1(0.04f, aob.v0(aob.G6, vnbVar))));
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
                rect.inset(hl.L(2.0f), hl.L(8.0f));
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                return;
            default:
                rect.set(getBounds());
                rect.inset(hl.L(2.0f), hl.L(8.0f));
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

    public nt8(cga cgaVar) {
        this.a = (byte) 0;
        this.b = aob.c0(hl.L(16.0f), hl.L(16.0f), 0);
        this.c = new Rect();
    }
}
