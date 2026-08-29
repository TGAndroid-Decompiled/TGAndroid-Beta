package eg;

import android.view.View;
public final class b2 implements View.OnClickListener {
    public final int f5929a;
    public final g2 f5930b;

    public b2(g2 g2Var, int i10) {
        this.f5929a = i10;
        this.f5930b = g2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5929a) {
            case 0:
                g2 g2Var = this.f5930b;
                g2Var.f6003a0.clear();
                g2Var.U.d.b(true);
                g2Var.b0(true, false);
                return;
            default:
                this.f5930b.W(false);
                return;
        }
    }
}
