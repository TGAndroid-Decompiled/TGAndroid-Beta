package defpackage;

import android.graphics.Point;
import android.view.View;
public final class bac implements View.OnLayoutChangeListener {
    public Boolean a;
    public boolean b;
    public final vk9 c;

    public bac(vk9 vk9Var, View view) {
        this.c = vk9Var;
        yla ylaVar = new yla((Object) view, (ri4) yla.p, 0.0f);
        vk9Var.c = ylaVar;
        ylaVar.m.a(1.0f);
        ((yla) vk9Var.c).m.b(350.0f);
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        Point point = gl.q;
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
            vk9 vk9Var = this.c;
            ((yla) vk9Var.c).d();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((yla) vk9Var.c).m.i = 0.0d;
            view.setTranslationY((i6 - i2) + 0.0f);
            ((yla) vk9Var.c).h();
            return;
        }
        this.b = false;
    }
}
