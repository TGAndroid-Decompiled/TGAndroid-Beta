package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
public final class cn2 extends ScrollView {
    public final LinearLayout a;
    public final ln2 b;

    public cn2(ln2 ln2Var, Context context, LinearLayout linearLayout) {
        super(context);
        this.b = ln2Var;
        this.a = linearLayout;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float y = this.a.getY() + gm.L(1.0f);
        int L = gm.L(36.0f);
        RectF rectF = gm.P;
        rectF.set((getMeasuredWidth() - L) / 2.0f, y, (getMeasuredWidth() + L) / 2.0f, gm.L(4.0f) + y);
        cmb.s0.setColor(-10790053);
        canvas.drawRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), cmb.s0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ((LinearLayout.LayoutParams) this.b.l1.getLayoutParams()).height = (int) (((View.MeasureSpec.getSize(i) - gm.L(24.0f)) * 0.8333333f) + gm.L(88.0f));
    }
}
