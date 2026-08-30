package ig;

import android.view.View;
public final class u implements View.OnClickListener {
    public final int f7546a;
    public final Runnable f7547b;

    public u(int i10, Runnable runnable) {
        this.f7546a = i10;
        this.f7547b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f7546a) {
            case 0:
                this.f7547b.run();
                return;
            case 1:
                this.f7547b.run();
                return;
            case 2:
                this.f7547b.run();
                return;
            case 3:
                this.f7547b.run();
                return;
            case 4:
                this.f7547b.run();
                return;
            case 5:
                this.f7547b.run();
                return;
            default:
                this.f7547b.run();
                return;
        }
    }
}
