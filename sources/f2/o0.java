package f2;

import androidx.recyclerview.widget.RecyclerView;

public final class o0 implements Runnable {

    public final int f5786a;

    public final RecyclerView f5787b;

    public o0(RecyclerView recyclerView, int i10) {
        this.f5786a = i10;
        this.f5787b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f5786a) {
            case 0:
                RecyclerView recyclerView = this.f5787b;
                if (recyclerView.E && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.C) {
                        recyclerView.requestLayout();
                    } else if (!recyclerView.H) {
                        recyclerView.p();
                    } else {
                        recyclerView.G = true;
                    }
                    break;
                }
                break;
            default:
                RecyclerView recyclerView2 = this.f5787b;
                v0 v0Var = recyclerView2.V;
                if (v0Var != null) {
                    v0Var.m();
                }
                recyclerView2.f1861v0 = false;
                break;
        }
    }
}
