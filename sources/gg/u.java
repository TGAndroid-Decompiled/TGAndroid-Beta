package gg;

import android.view.View;
public final class u implements View.OnClickListener {
    public final int f7340a;
    public final Runnable f7341b;

    public u(int i10, Runnable runnable) {
        this.f7340a = i10;
        this.f7341b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f7340a) {
            case 0:
                this.f7341b.run();
                return;
            case 1:
                this.f7341b.run();
                return;
            case 2:
                this.f7341b.run();
                return;
            case 3:
                this.f7341b.run();
                return;
            case 4:
                this.f7341b.run();
                return;
            case 5:
                this.f7341b.run();
                return;
            default:
                this.f7341b.run();
                return;
        }
    }
}
