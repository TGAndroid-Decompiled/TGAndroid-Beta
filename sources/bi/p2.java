package bi;

import android.view.View;
import org.telegram.messenger.z10;
public final class p2 implements View.OnClickListener {
    public final int f3781a;
    public final z10 f3782b;
    public final int f3783c;

    public p2(z10 z10Var, int i7, int i10) {
        this.f3781a = i10;
        this.f3782b = z10Var;
        this.f3783c = i7;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3781a) {
            case 0:
                z10 z10Var = this.f3782b;
                if (z10Var != null) {
                    z10Var.a(Integer.valueOf(this.f3783c));
                    return;
                }
                return;
            default:
                this.f3782b.a(Integer.valueOf(this.f3783c));
                return;
        }
    }
}
