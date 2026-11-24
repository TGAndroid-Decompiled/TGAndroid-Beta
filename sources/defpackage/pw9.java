package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class pw9 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final Integer b;
    public final tx9 c;

    public pw9(tx9 tx9Var, Integer num) {
        this.c = tx9Var;
        this.b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        tx9 tx9Var = this.c;
        byte b = tx9Var.e1;
        Integer num = this.b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float L = intValue + gl.L(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        boolean m = tx9Var.m();
        Rect rect = this.a;
        if (m) {
            int paddingLeft = (int) ((L - (tx9Var.b1 * L)) + view.getPaddingLeft());
            float A = tb4.A(1.0f, tx9Var.c1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) tb4.A(1.0f, tx9Var.c1, gl.L(b), A), (int) (((width - L) * tx9Var.b1) + view.getPaddingLeft() + L), (int) tb4.A(1.0f, tx9Var.c1, gl.L(b), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((L - (tx9Var.b1 * L)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - L) * tx9Var.b1) + view.getPaddingLeft() + L), (int) ((height * tx9Var.c1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, gl.L(12.0f));
    }
}
