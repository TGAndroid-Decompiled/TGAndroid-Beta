package bi;

import android.view.View;
import org.telegram.messenger.z10;
public final class p2 implements View.OnClickListener {
    public final int f3784a;
    public final z10 f3785b;
    public final int f3786c;

    public p2(z10 z10Var, int i7, int i10) {
        this.f3784a = i10;
        this.f3785b = z10Var;
        this.f3786c = i7;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3784a) {
            case 0:
                z10 z10Var = this.f3785b;
                if (z10Var != null) {
                    z10Var.a(Integer.valueOf(this.f3786c));
                    return;
                }
                return;
            default:
                this.f3785b.a(Integer.valueOf(this.f3786c));
                return;
        }
    }
}
