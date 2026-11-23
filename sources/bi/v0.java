package bi;

import android.view.View;
public final class v0 implements View.OnClickListener {
    public final int f4168a;
    public final b1 f4169b;
    public final Runnable f4170c;

    public v0(b1 b1Var, Runnable runnable, int i7) {
        this.f4168a = i7;
        this.f4169b = b1Var;
        this.f4170c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f4168a) {
            case 0:
                this.f4169b.c(this.f4170c);
                return;
            default:
                this.f4169b.c(this.f4170c);
                return;
        }
    }
}
