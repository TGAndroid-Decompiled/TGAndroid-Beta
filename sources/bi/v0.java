package bi;

import android.view.View;
public final class v0 implements View.OnClickListener {
    public final int f4166a;
    public final b1 f4167b;
    public final Runnable f4168c;

    public v0(b1 b1Var, Runnable runnable, int i7) {
        this.f4166a = i7;
        this.f4167b = b1Var;
        this.f4168c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f4166a) {
            case 0:
                this.f4167b.c(this.f4168c);
                return;
            default:
                this.f4167b.c(this.f4168c);
                return;
        }
    }
}
