package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class w59 implements Runnable {
    public final byte a;
    public final RecyclerView b;

    public w59(RecyclerView recyclerView, byte b) {
        this.a = b;
        this.b = recyclerView;
    }

    @Override
    public final void run() {
        byte b = this.a;
        RecyclerView recyclerView = this.b;
        switch (b) {
            case 0:
                if (recyclerView.J && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.H) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.M) {
                        recyclerView.L = true;
                        return;
                    } else {
                        recyclerView.p();
                        return;
                    }
                }
                return;
            default:
                d69 d69Var = recyclerView.d0;
                if (d69Var != null) {
                    d69Var.m();
                }
                recyclerView.B0 = false;
                return;
        }
    }
}
