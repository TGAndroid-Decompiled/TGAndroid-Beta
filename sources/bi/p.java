package bi;

import android.view.View;
public final class p implements View.OnClickListener {
    public final int f3576a;
    public final Runnable f3577b;

    public p(int i10, Runnable runnable) {
        this.f3576a = i10;
        this.f3577b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3576a) {
            case 0:
                this.f3577b.run();
                return;
            case 1:
                this.f3577b.run();
                return;
            case 2:
                this.f3577b.run();
                return;
            case 3:
                this.f3577b.run();
                return;
            case 4:
                this.f3577b.run();
                return;
            case 5:
                this.f3577b.run();
                return;
            default:
                this.f3577b.run();
                return;
        }
    }
}
