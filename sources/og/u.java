package og;

import android.view.View;
public final class u implements View.OnClickListener {
    public final int f14228a;
    public final Runnable f14229b;

    public u(int i10, Runnable runnable) {
        this.f14228a = i10;
        this.f14229b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f14228a) {
            case 0:
                this.f14229b.run();
                return;
            case 1:
                this.f14229b.run();
                return;
            case 2:
                this.f14229b.run();
                return;
            case 3:
                this.f14229b.run();
                return;
            case 4:
                this.f14229b.run();
                return;
            case 5:
                this.f14229b.run();
                return;
            default:
                this.f14229b.run();
                return;
        }
    }
}
