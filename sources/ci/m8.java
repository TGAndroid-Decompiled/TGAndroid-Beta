package ci;

import android.view.View;
public final class m8 implements View.OnClickListener {
    public final int f5184a;
    public final u8 f5185b;

    public m8(u8 u8Var, int i10) {
        this.f5184a = i10;
        this.f5185b = u8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5184a) {
            case 0:
                this.f5185b.U();
                return;
            default:
                this.f5185b.X();
                return;
        }
    }
}
