package ci;

import android.view.View;
public final class m8 implements View.OnClickListener {
    public final int f5605a;
    public final u8 f5606b;

    public m8(u8 u8Var, int i10) {
        this.f5605a = i10;
        this.f5606b = u8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5605a) {
            case 0:
                this.f5606b.V();
                return;
            default:
                this.f5606b.Y();
                return;
        }
    }
}
