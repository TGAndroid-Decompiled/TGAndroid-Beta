package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class ge5 extends View implements li4 {
    public final gn a;

    public ge5(Context context) {
        super(context);
        gn gnVar = new gn(true, true, true);
        this.a = gnVar;
        gnVar.n(0.35f, 300L, s33.h);
        gnVar.u(-1);
        gnVar.w(gl.L(14.0f));
        gnVar.s(gl.L(1.4f), gl.L(0.4f), 1275068416);
        gnVar.b = 1;
        gnVar.setCallback(this);
        gnVar.N = gl.q.x;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        gn gnVar = this.a;
        gnVar.setBounds(0, 0, width, height);
        gnVar.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.N = getMeasuredWidth();
    }

    @Override
    public void setInvert(float f) {
        this.a.u(bm2.f(f, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.a && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
