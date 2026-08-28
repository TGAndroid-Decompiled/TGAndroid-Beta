package f2;

import androidx.recyclerview.widget.RecyclerView;
public final class q0 implements Runnable {
    public final int f5498a;
    public final RecyclerView f5499b;

    public q0(RecyclerView recyclerView, int i9) {
        this.f5498a = i9;
        this.f5499b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f5498a) {
            case 0:
                RecyclerView recyclerView = this.f5499b;
                if (recyclerView.E && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.C) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.H) {
                        recyclerView.G = true;
                        return;
                    } else {
                        recyclerView.p();
                        return;
                    }
                }
                return;
            default:
                RecyclerView recyclerView2 = this.f5499b;
                w0 w0Var = recyclerView2.V;
                if (w0Var != null) {
                    w0Var.m();
                }
                recyclerView2.f1365v0 = false;
                return;
        }
    }
}
