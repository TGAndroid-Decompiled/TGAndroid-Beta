package ci;

import android.view.View;
public final class m8 implements View.OnClickListener {
    public final int f5606a;
    public final u8 f5607b;

    public m8(u8 u8Var, int i10) {
        this.f5606a = i10;
        this.f5607b = u8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5606a) {
            case 0:
                this.f5607b.V();
                return;
            default:
                this.f5607b.Y();
                return;
        }
    }
}
