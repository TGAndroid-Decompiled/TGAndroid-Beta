package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class fv7 extends View {
    public int a;
    public float b;
    public final gv7 c;

    public fv7(gv7 gv7Var, Context context) {
        super(context);
        this.c = gv7Var;
        setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        setLayoutParams(new r79(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gv7 gv7Var = this.c;
        Paint paint = gv7Var.g3;
        gv7Var.f3.setColor(this.a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.b != 0.0f) {
            min -= (paint.getStrokeWidth() + hl.L(3.0f)) * this.b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        gv7.B1(width, height, min, this.a, canvas);
        if (this.b != 0.0f) {
            paint.setColor(this.a);
            paint.setAlpha(255);
            canvas.drawCircle(width, height, (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - hl.L(2.0f), paint);
        }
    }
}
