package ig;

import android.view.View;
public final class u implements View.OnClickListener {
    public final int f7528a;
    public final Runnable f7529b;

    public u(int i10, Runnable runnable) {
        this.f7528a = i10;
        this.f7529b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f7528a) {
            case 0:
                this.f7529b.run();
                return;
            case 1:
                this.f7529b.run();
                return;
            case 2:
                this.f7529b.run();
                return;
            case 3:
                this.f7529b.run();
                return;
            case 4:
                this.f7529b.run();
                return;
            case 5:
                this.f7529b.run();
                return;
            default:
                this.f7529b.run();
                return;
        }
    }
}
