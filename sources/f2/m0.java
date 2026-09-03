package f2;

import androidx.recyclerview.widget.RecyclerView;
public final class m0 implements Runnable {
    public final int f5796a;
    public final RecyclerView f5797b;

    public m0(RecyclerView recyclerView, int i10) {
        this.f5796a = i10;
        this.f5797b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f5796a) {
            case 0:
                RecyclerView recyclerView = this.f5797b;
                if (recyclerView.F && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.D) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.I) {
                        recyclerView.H = true;
                        return;
                    } else {
                        recyclerView.p();
                        return;
                    }
                }
                return;
            default:
                RecyclerView recyclerView2 = this.f5797b;
                t0 t0Var = recyclerView2.W;
                if (t0Var != null) {
                    t0Var.m();
                }
                recyclerView2.f1260w0 = false;
                return;
        }
    }
}
