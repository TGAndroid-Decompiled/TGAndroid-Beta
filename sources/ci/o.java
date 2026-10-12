package ci;

import android.view.View;
public final class o implements View.OnClickListener {
    public final int f4768a;
    public final Runnable f4769b;

    public o(int i10, Runnable runnable) {
        this.f4768a = i10;
        this.f4769b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f4768a) {
            case 0:
                this.f4769b.run();
                return;
            case 1:
                this.f4769b.run();
                return;
            case 2:
                this.f4769b.run();
                return;
            case 3:
                this.f4769b.run();
                return;
            case 4:
                this.f4769b.run();
                return;
            case 5:
                this.f4769b.run();
                return;
            default:
                this.f4769b.run();
                return;
        }
    }
}
