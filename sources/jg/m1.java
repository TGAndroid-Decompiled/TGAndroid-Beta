package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class m1 extends View {
    public int f10093a;
    public float f10094b;
    public final n1 f10095c;

    public m1(n1 n1Var, Context context) {
        super(context);
        this.f10095c = n1Var;
        setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        setLayoutParams(new s4.o0(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        n1 n1Var = this.f10095c;
        n1Var.f10109e3.setColor(this.f10093a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.f10094b != 0.0f) {
            min -= (n1Var.f10110f3.getStrokeWidth() + org.telegram.messenger.i0.L(3.0f)) * this.f10094b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        n1.A1(width, height, min, this.f10093a, canvas);
        if (this.f10094b != 0.0f) {
            float min2 = (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - org.telegram.messenger.i0.L(2.0f);
            n1Var.f10110f3.setColor(this.f10093a);
            n1Var.f10110f3.setAlpha(255);
            canvas.drawCircle(width, height, min2, n1Var.f10110f3);
        }
    }
}
