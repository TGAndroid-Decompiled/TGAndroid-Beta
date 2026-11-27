package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class i79 implements Runnable {
    public final byte a;
    public final RecyclerView b;

    public i79(RecyclerView recyclerView, byte b) {
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
                        recyclerView.q();
                        return;
                    }
                }
                return;
            default:
                o79 o79Var = recyclerView.d0;
                if (o79Var != null) {
                    o79Var.m();
                }
                recyclerView.B0 = false;
                return;
        }
    }
}
