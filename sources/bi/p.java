package bi;

import android.view.View;
public final class p implements View.OnClickListener {
    public final int f3860a;
    public final Runnable f3861b;

    public p(int i10, Runnable runnable) {
        this.f3860a = i10;
        this.f3861b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3860a) {
            case 0:
                this.f3861b.run();
                return;
            case 1:
                this.f3861b.run();
                return;
            case 2:
                this.f3861b.run();
                return;
            case 3:
                this.f3861b.run();
                return;
            case 4:
                this.f3861b.run();
                return;
            case 5:
                this.f3861b.run();
                return;
            default:
                this.f3861b.run();
                return;
        }
    }
}
