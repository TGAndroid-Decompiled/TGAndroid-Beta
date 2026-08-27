package ag;

import androidx.recyclerview.widget.RecyclerView;

public final class v1 extends f2.b1 {

    public final int f682a;

    public final g2 f683b;

    public v1(g2 g2Var, int i10) {
        this.f682a = i10;
        this.f683b = g2Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f682a) {
            case 0:
                g2 g2Var = this.f683b;
                ((org.telegram.ui.ActionBar.e3) g2Var).containerView.invalidate();
                g2Var.z();
                break;
            default:
                g2 g2Var2 = this.f683b;
                ((org.telegram.ui.ActionBar.e3) g2Var2).containerView.invalidate();
                g2Var2.z();
                break;
        }
    }
}
