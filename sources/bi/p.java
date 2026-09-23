package bi;

import android.view.View;
public final class p implements View.OnClickListener {
    public final int f3571a;
    public final Runnable f3572b;

    public p(int i10, Runnable runnable) {
        this.f3571a = i10;
        this.f3572b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3571a) {
            case 0:
                this.f3572b.run();
                return;
            case 1:
                this.f3572b.run();
                return;
            case 2:
                this.f3572b.run();
                return;
            case 3:
                this.f3572b.run();
                return;
            case 4:
                this.f3572b.run();
                return;
            case 5:
                this.f3572b.run();
                return;
            default:
                this.f3572b.run();
                return;
        }
    }
}
