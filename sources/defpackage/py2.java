package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
public final class py2 extends p79 {
    public final n15 a = new n15(2);
    public final vnb b;
    public final ry2 c;

    public py2(ry2 ry2Var, vnb vnbVar) {
        this.c = ry2Var;
        this.b = vnbVar;
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        ry2 ry2Var = this.c;
        int max = Math.max(0, hl.L(80.0f) + ((int) ry2Var.b2.getTranslationY()) + ((int) ry2Var.S1.f));
        int v0 = aob.v0(aob.h5, this.b);
        n15 n15Var = this.a;
        n15Var.b(v0);
        n15Var.setBounds(0, max, recyclerView.getWidth(), hl.L(8.0f) + max);
        n15Var.draw(canvas);
        ry2Var.Z0();
        ry2Var.a1();
    }
}
