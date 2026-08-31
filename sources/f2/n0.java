package f2;

import androidx.recyclerview.widget.RecyclerView;
public final class n0 implements Runnable {
    public final int f5896a;
    public final RecyclerView f5897b;

    public n0(RecyclerView recyclerView, int i10) {
        this.f5896a = i10;
        this.f5897b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f5896a) {
            case 0:
                RecyclerView recyclerView = this.f5897b;
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
                RecyclerView recyclerView2 = this.f5897b;
                u0 u0Var = recyclerView2.W;
                if (u0Var != null) {
                    u0Var.m();
                }
                recyclerView2.f1348w0 = false;
                return;
        }
    }
}
