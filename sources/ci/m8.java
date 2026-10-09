package ci;

import android.view.View;
public final class m8 implements View.OnClickListener {
    public final int f5607a;
    public final u8 f5608b;

    public m8(u8 u8Var, int i10) {
        this.f5607a = i10;
        this.f5608b = u8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5607a) {
            case 0:
                this.f5608b.V();
                return;
            default:
                this.f5608b.Y();
                return;
        }
    }
}
