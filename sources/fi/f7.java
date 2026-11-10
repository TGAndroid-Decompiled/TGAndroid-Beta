package fi;

import android.view.View;
public final class f7 implements View.OnClickListener {
    public final int f11989a;
    public final m7 f11990b;

    public f7(m7 m7Var, int i7) {
        this.f11989a = i7;
        this.f11990b = m7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f11989a) {
            case 0:
                this.f11990b.e1();
                return;
            default:
                this.f11990b.h1();
                return;
        }
    }
}
