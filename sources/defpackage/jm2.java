package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
public final class jm2 extends ScrollView {
    public final LinearLayout a;
    public final sm2 b;

    public jm2(sm2 sm2Var, Context context, LinearLayout linearLayout) {
        super(context);
        this.b = sm2Var;
        this.a = linearLayout;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float y = this.a.getY() + hl.L(1.0f);
        int L = hl.L(36.0f);
        RectF rectF = hl.P;
        rectF.set((getMeasuredWidth() - L) / 2.0f, y, (getMeasuredWidth() + L) / 2.0f, hl.L(4.0f) + y);
        aob.s0.setColor(-10790053);
        canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), aob.s0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ((LinearLayout.LayoutParams) this.b.l1.getLayoutParams()).height = (int) (((View.MeasureSpec.getSize(i) - hl.L(24.0f)) * 0.8333333f) + hl.L(88.0f));
    }
}
