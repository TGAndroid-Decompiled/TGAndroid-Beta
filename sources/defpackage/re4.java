package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class re4 extends View implements tjb {
    public final gn a;
    public il0 b;
    public String c;

    public re4(Activity activity) {
        super(activity);
        gn gnVar = new gn(true, false, false);
        this.a = gnVar;
        gnVar.u(-1);
        gnVar.b = 17;
        gnVar.x(gl.o());
        gnVar.w(gl.L(14.0f));
        gnVar.setCallback(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gn gnVar = this.a;
        int N = (int) (gl.N(30.0f) + gnVar.c());
        int width = (getWidth() - N) / 2;
        int i = N + width;
        il0 il0Var = this.b;
        if (il0Var != null) {
            il0Var.setBounds(width, 0, i, getHeight());
            this.b.draw(canvas);
        }
        gnVar.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.setBounds(0, 0, i, i2);
    }

    @Override
    public final void updateColors() {
        il0 il0Var = this.b;
        if (il0Var != null) {
            il0Var.updateColors();
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
