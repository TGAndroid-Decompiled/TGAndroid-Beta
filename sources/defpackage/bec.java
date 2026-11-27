package defpackage;

import android.graphics.Point;
import android.view.View;
public final class bec implements View.OnLayoutChangeListener {
    public Boolean a;
    public boolean b;
    public final ko9 c;

    public bec(ko9 ko9Var, View view) {
        this.c = ko9Var;
        vpa vpaVar = new vpa((Object) view, (vk4) vpa.p, 0.0f);
        ko9Var.c = vpaVar;
        vpaVar.m.a(1.0f);
        ((vpa) ko9Var.c).m.b(350.0f);
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        Point point = hl.q;
        if (point.x > point.y) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = this.a;
        if (bool == null || bool.booleanValue() != z) {
            this.a = Boolean.valueOf(z);
            this.b = true;
        }
        if (i6 != 0 && i6 != i2 && !this.b) {
            ko9 ko9Var = this.c;
            ((vpa) ko9Var.c).d();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((vpa) ko9Var.c).m.i = 0.0d;
            view.setTranslationY((i6 - i2) + 0.0f);
            ((vpa) ko9Var.c).h();
            return;
        }
        this.b = false;
    }
}
