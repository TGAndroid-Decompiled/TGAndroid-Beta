package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class au7 extends View {
    public int a;
    public float b;
    public final bu7 c;

    public au7(bu7 bu7Var, Context context) {
        super(context);
        this.c = bu7Var;
        setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        setLayoutParams(new g69(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        bu7 bu7Var = this.c;
        Paint paint = bu7Var.g3;
        bu7Var.f3.setColor(this.a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.b != 0.0f) {
            min -= (paint.getStrokeWidth() + gm.L(3.0f)) * this.b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        bu7.A1(width, height, min, this.a, canvas);
        if (this.b != 0.0f) {
            paint.setColor(this.a);
            paint.setAlpha(255);
            canvas.drawCircle(width, height, (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - gm.L(2.0f), paint);
        }
    }
}
