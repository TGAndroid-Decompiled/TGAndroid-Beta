package fi;

import android.view.View;
public final class f7 implements View.OnClickListener {
    public final int f11985a;
    public final m7 f11986b;

    public f7(m7 m7Var, int i7) {
        this.f11985a = i7;
        this.f11986b = m7Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f11985a) {
            case 0:
                this.f11986b.e1();
                return;
            default:
                this.f11986b.h1();
                return;
        }
    }
}
