package bi;

import android.view.View;
public final class d0 implements View.OnClickListener {
    public final int f3440a;
    public final Runnable f3441b;

    public d0(int i7, Runnable runnable) {
        this.f3440a = i7;
        this.f3441b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3440a) {
            case 0:
                this.f3441b.run();
                return;
            case 1:
                this.f3441b.run();
                return;
            case 2:
                this.f3441b.run();
                return;
            case 3:
                this.f3441b.run();
                return;
            case 4:
                this.f3441b.run();
                return;
            case 5:
                this.f3441b.run();
                return;
            default:
                this.f3441b.run();
                return;
        }
    }
}
