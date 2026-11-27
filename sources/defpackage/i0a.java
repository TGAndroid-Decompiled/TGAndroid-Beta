package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class i0a extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final Integer b;
    public final n1a c;

    public i0a(n1a n1aVar, Integer num) {
        this.c = n1aVar;
        this.b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        n1a n1aVar = this.c;
        byte b = n1aVar.e1;
        Integer num = this.b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float L = intValue + hl.L(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        boolean m = n1aVar.m();
        Rect rect = this.a;
        if (m) {
            int paddingLeft = (int) ((L - (n1aVar.b1 * L)) + view.getPaddingLeft());
            float A = qd4.A(1.0f, n1aVar.c1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) qd4.A(1.0f, n1aVar.c1, hl.L(b), A), (int) (((width - L) * n1aVar.b1) + view.getPaddingLeft() + L), (int) qd4.A(1.0f, n1aVar.c1, hl.L(b), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((L - (n1aVar.b1 * L)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - L) * n1aVar.b1) + view.getPaddingLeft() + L), (int) ((height * n1aVar.c1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, hl.L(12.0f));
    }
}
