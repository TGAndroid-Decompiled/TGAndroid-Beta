package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
public final class pg4 extends View implements snb {
    public final hn a;
    public jl0 b;
    public String c;

    public pg4(Activity activity) {
        super(activity);
        hn hnVar = new hn(true, false, false);
        this.a = hnVar;
        hnVar.u(-1);
        hnVar.b = 17;
        hnVar.x(hl.o());
        hnVar.w(hl.L(14.0f));
        hnVar.setCallback(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        hn hnVar = this.a;
        int N = (int) (hl.N(30.0f) + hnVar.c());
        int width = (getWidth() - N) / 2;
        int i = N + width;
        jl0 jl0Var = this.b;
        if (jl0Var != null) {
            jl0Var.setBounds(width, 0, i, getHeight());
            this.b.draw(canvas);
        }
        hnVar.draw(canvas);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.setBounds(0, 0, i, i2);
    }

    @Override
    public final void updateColors() {
        jl0 jl0Var = this.b;
        if (jl0Var != null) {
            jl0Var.updateColors();
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
