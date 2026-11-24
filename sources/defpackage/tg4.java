package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class tg4 extends View implements vlb {
    public final ho a;
    public im0 b;
    public String c;

    public tg4(Activity activity) {
        super(activity);
        ho hoVar = new ho(true, false, false);
        this.a = hoVar;
        hoVar.u(-1);
        hoVar.b = 17;
        hoVar.x(gm.o());
        hoVar.w(gm.L(14.0f));
        hoVar.setCallback(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ho hoVar = this.a;
        int N = (int) (gm.N(30.0f) + hoVar.c());
        int width = (getWidth() - N) / 2;
        int i = N + width;
        im0 im0Var = this.b;
        if (im0Var != null) {
            im0Var.setBounds(width, 0, i, getHeight());
            this.b.draw(canvas);
        }
        hoVar.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.setBounds(0, 0, i, i2);
    }

    @Override
    public final void updateColors() {
        im0 im0Var = this.b;
        if (im0Var != null) {
            im0Var.updateColors();
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
