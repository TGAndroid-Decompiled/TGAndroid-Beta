package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class w19 extends k69 {
    public final u46 a;
    public final c29 b;

    public w19(c29 c29Var, u46 u46Var) {
        this.b = c29Var;
        this.a = u46Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int loadCount;
        c29 c29Var = this.b;
        if (c29Var.x && c29Var.y && !c29Var.w) {
            int M0 = this.a.M0();
            loadCount = c29Var.getLoadCount();
            if (M0 >= (c29Var.f.b() - 1) - loadCount) {
                c29Var.c();
            }
        }
    }
}
