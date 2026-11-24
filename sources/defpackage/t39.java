package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class t39 implements Runnable {
    public final byte a;
    public final RecyclerView b;

    public t39(RecyclerView recyclerView, byte b) {
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
                b49 b49Var = recyclerView.d0;
                if (b49Var != null) {
                    b49Var.m();
                }
                recyclerView.B0 = false;
                return;
        }
    }
}
