package f2;

import androidx.recyclerview.widget.RecyclerView;
public final class n0 implements Runnable {
    public final int f6429a;
    public final RecyclerView f6430b;

    public n0(RecyclerView recyclerView, int i10) {
        this.f6429a = i10;
        this.f6430b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f6429a) {
            case 0:
                RecyclerView recyclerView = this.f6430b;
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
                RecyclerView recyclerView2 = this.f6430b;
                u0 u0Var = recyclerView2.V;
                if (u0Var != null) {
                    u0Var.m();
                }
                recyclerView2.f1855v0 = false;
                return;
        }
    }
}
