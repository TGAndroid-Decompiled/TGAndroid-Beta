package bi;

import android.view.View;
public final class p implements View.OnClickListener {
    public final int f3574a;
    public final Runnable f3575b;

    public p(int i10, Runnable runnable) {
        this.f3574a = i10;
        this.f3575b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3574a) {
            case 0:
                this.f3575b.run();
                return;
            case 1:
                this.f3575b.run();
                return;
            case 2:
                this.f3575b.run();
                return;
            case 3:
                this.f3575b.run();
                return;
            case 4:
                this.f3575b.run();
                return;
            case 5:
                this.f3575b.run();
                return;
            default:
                this.f3575b.run();
                return;
        }
    }
}
