package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class uz8 extends i49 {
    public final t26 a;
    public final a09 b;

    public uz8(a09 a09Var, t26 t26Var) {
        this.b = a09Var;
        this.a = t26Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int loadCount;
        a09 a09Var = this.b;
        if (a09Var.x && a09Var.y && !a09Var.w) {
            int M0 = this.a.M0();
            loadCount = a09Var.getLoadCount();
            if (M0 >= (a09Var.f.b() - 1) - loadCount) {
                a09Var.c();
            }
        }
    }
}
