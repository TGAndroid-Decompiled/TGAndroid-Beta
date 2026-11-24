package defpackage;

import android.graphics.Point;
import android.view.View;
public final class ccc implements View.OnLayoutChangeListener {
    public Boolean a;
    public boolean b;
    public final wm9 c;

    public ccc(wm9 wm9Var, View view) {
        this.c = wm9Var;
        zna znaVar = new zna((Object) view, (vk4) zna.p, 0.0f);
        wm9Var.c = znaVar;
        znaVar.m.a(1.0f);
        ((zna) wm9Var.c).m.b(350.0f);
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        Point point = gm.q;
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
            wm9 wm9Var = this.c;
            ((zna) wm9Var.c).d();
            if (view.getVisibility() != 0) {
                view.setTranslationY(0.0f);
                return;
            }
            ((zna) wm9Var.c).m.i = 0.0d;
            view.setTranslationY((i6 - i2) + 0.0f);
            ((zna) wm9Var.c).h();
            return;
        }
        this.b = false;
    }
}
