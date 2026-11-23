package bi;

import android.view.View;
public final class v0 implements View.OnClickListener {
    public final int f4133a;
    public final b1 f4134b;
    public final Runnable f4135c;

    public v0(b1 b1Var, Runnable runnable, int i7) {
        this.f4133a = i7;
        this.f4134b = b1Var;
        this.f4135c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f4133a) {
            case 0:
                this.f4134b.c(this.f4135c);
                return;
            default:
                this.f4134b.c(this.f4135c);
                return;
        }
    }
}
