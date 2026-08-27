package gh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import lh.r7;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.v8;

public final class s2 implements kg.a {

    public final int f7522a;

    public final Object f7523b;

    public s2(Object obj, int i10) {
        this.f7522a = i10;
        this.f7523b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.f7522a) {
            case 0:
                d4 d4Var = (d4) this.f7523b;
                for (View view : d4Var.h.getViewPages()) {
                    if (view instanceof t3) {
                        t3 t3Var = (t3) view;
                        if (t3Var.h == null) {
                            n3 n3Var = t3Var.f7537f;
                            ViewGroup viewGroup = d4Var.O;
                            Objects.requireNonNull(n3Var);
                            t3Var.h = new jg.k(n3Var, viewGroup, new v8(n3Var, 0));
                        }
                        t3Var.h.e(canvas, rectF);
                    }
                }
                break;
            default:
                r7 r7Var = (r7) this.f7523b;
                zk0 zk0Var = r7Var.d;
                pg.c.a(zk0Var, canvas, rectF, zk0Var, r7Var.getContainerView(), 255);
                break;
        }
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        switch (this.f7522a) {
        }
        yVar.f6327b = true;
    }
}
