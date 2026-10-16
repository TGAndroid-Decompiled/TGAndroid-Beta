package di;

import android.view.View;
public final class l8 implements View.OnClickListener {
    public final int f7366a;
    public final t8 f7367b;

    public l8(t8 t8Var, int i10) {
        this.f7366a = i10;
        this.f7367b = t8Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f7366a) {
            case 0:
                this.f7367b.V();
                return;
            default:
                this.f7367b.Y();
                return;
        }
    }
}
