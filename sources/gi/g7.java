package gi;

import android.view.View;
public final class g7 implements View.OnClickListener {
    public final int f12837a;
    public final m7 f12838b;

    public g7(m7 m7Var, int i3) {
        this.f12837a = i3;
        this.f12838b = m7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f12837a) {
            case 0:
                this.f12838b.e1();
                return;
            default:
                this.f12838b.h1();
                return;
        }
    }
}
