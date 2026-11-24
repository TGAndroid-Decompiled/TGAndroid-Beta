package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
public final class pl2 extends ScrollView {
    public final LinearLayout a;
    public final yl2 b;

    public pl2(yl2 yl2Var, Context context, LinearLayout linearLayout) {
        super(context);
        this.b = yl2Var;
        this.a = linearLayout;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float y = this.a.getY() + gl.L(1.0f);
        int L = gl.L(36.0f);
        RectF rectF = gl.P;
        rectF.set((getMeasuredWidth() - L) / 2.0f, y, (getMeasuredWidth() + L) / 2.0f, gl.L(4.0f) + y);
        bkb.s0.setColor(-10790053);
        canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), bkb.s0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ((LinearLayout.LayoutParams) this.b.l1.getLayoutParams()).height = (int) (((View.MeasureSpec.getSize(i) - gl.L(24.0f)) * 0.8333333f) + gl.L(88.0f));
    }
}
