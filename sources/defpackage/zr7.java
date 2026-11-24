package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class zr7 extends View {
    public int a;
    public float b;
    public final as7 c;

    public zr7(as7 as7Var, Context context) {
        super(context);
        this.c = as7Var;
        setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        setLayoutParams(new e49(-2, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        as7 as7Var = this.c;
        Paint paint = as7Var.g3;
        as7Var.f3.setColor(this.a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.b != 0.0f) {
            min -= (paint.getStrokeWidth() + gl.L(3.0f)) * this.b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        as7.A1(width, height, min, this.a, canvas);
        if (this.b != 0.0f) {
            paint.setColor(this.a);
            paint.setAlpha(255);
            canvas.drawCircle(width, height, (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - gl.L(2.0f), paint);
        }
    }
}
