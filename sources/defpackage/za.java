package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class za extends Drawable {
    public final byte a;
    public final tgb b;
    public final bb c;

    public za(bb bbVar, String str, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = bbVar;
                this.b = new tgb(str, 14.0f, gl.o());
                return;
            default:
                this.c = bbVar;
                this.b = new tgb(str, 14.0f, gl.o());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        byte b = this.a;
        bb bbVar = this.c;
        tgb tgbVar = this.b;
        switch (b) {
            case 0:
                int i = bbVar.s;
                this.b.c(getBounds().centerX() - (tgbVar.c / 2.0f), getBounds().centerY(), 1.0f, i, canvas);
                return;
            default:
                int i2 = bbVar.s;
                this.b.c(getBounds().centerX() - (tgbVar.c / 2.0f), getBounds().centerY(), 1.0f, i2, canvas);
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
        byte b = this.a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
