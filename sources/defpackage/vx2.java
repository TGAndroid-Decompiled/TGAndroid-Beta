package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
public final class vx2 extends c49 {
    public final jz4 a = new jz4(2);
    public final wjb b;
    public final xx2 c;

    public vx2(xx2 xx2Var, wjb wjbVar) {
        this.c = xx2Var;
        this.b = wjbVar;
    }

    @Override
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        xx2 xx2Var = this.c;
        int max = Math.max(0, gl.L(80.0f) + ((int) xx2Var.b2.getTranslationY()) + ((int) xx2Var.S1.f));
        int v0 = bkb.v0(bkb.g5, this.b);
        jz4 jz4Var = this.a;
        jz4Var.b(v0);
        jz4Var.setBounds(0, max, recyclerView.getWidth(), gl.L(8.0f) + max);
        jz4Var.draw(canvas);
        xx2Var.Y0();
        xx2Var.Z0();
    }
}
