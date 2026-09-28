package ci;

import android.view.View;
public final class m8 implements View.OnClickListener {
    public final int f5177a;
    public final u8 f5178b;

    public m8(u8 u8Var, int i10) {
        this.f5177a = i10;
        this.f5178b = u8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5177a) {
            case 0:
                this.f5178b.U();
                return;
            default:
                this.f5178b.X();
                return;
        }
    }
}
