package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class i39 extends v79 {
    public final x46 a;
    public final o39 b;

    public i39(o39 o39Var, x46 x46Var) {
        this.b = o39Var;
        this.a = x46Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int loadCount;
        o39 o39Var = this.b;
        if (o39Var.x && o39Var.y && !o39Var.w) {
            int M0 = this.a.M0();
            loadCount = o39Var.getLoadCount();
            if (M0 >= (o39Var.f.b() - 1) - loadCount) {
                o39Var.c();
            }
        }
    }
}
