package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class ry9 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final Integer b;
    public final vz9 c;

    public ry9(vz9 vz9Var, Integer num) {
        this.c = vz9Var;
        this.b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        vz9 vz9Var = this.c;
        byte b = vz9Var.e1;
        Integer num = this.b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float L = intValue + gm.L(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        boolean m = vz9Var.m();
        Rect rect = this.a;
        if (m) {
            int paddingLeft = (int) ((L - (vz9Var.b1 * L)) + view.getPaddingLeft());
            float A = td4.A(1.0f, vz9Var.c1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) td4.A(1.0f, vz9Var.c1, gm.L(b), A), (int) (((width - L) * vz9Var.b1) + view.getPaddingLeft() + L), (int) td4.A(1.0f, vz9Var.c1, gm.L(b), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((L - (vz9Var.b1 * L)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - L) * vz9Var.b1) + view.getPaddingLeft() + L), (int) ((height * vz9Var.c1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, gm.L(12.0f));
    }
}
