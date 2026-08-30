package f2;

import androidx.recyclerview.widget.RecyclerView;
public final class m0 implements Runnable {
    public final int f5807a;
    public final RecyclerView f5808b;

    public m0(RecyclerView recyclerView, int i10) {
        this.f5807a = i10;
        this.f5808b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f5807a) {
            case 0:
                RecyclerView recyclerView = this.f5808b;
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
                RecyclerView recyclerView2 = this.f5808b;
                t0 t0Var = recyclerView2.W;
                if (t0Var != null) {
                    t0Var.m();
                }
                recyclerView2.f1249w0 = false;
                return;
        }
    }
}
