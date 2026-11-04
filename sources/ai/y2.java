package ai;

import android.view.View;
import org.telegram.messenger.u10;
public final class y2 implements View.OnClickListener {
    public final int f1109a;
    public final u10 f1110b;
    public final int f1111c;

    public y2(int i3, int i10, u10 u10Var) {
        this.f1109a = i10;
        this.f1110b = u10Var;
        this.f1111c = i3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1109a) {
            case 0:
                u10 u10Var = this.f1110b;
                if (u10Var != null) {
                    u10Var.a(Integer.valueOf(this.f1111c));
                    return;
                }
                return;
            default:
                this.f1110b.a(Integer.valueOf(this.f1111c));
                return;
        }
    }
}
