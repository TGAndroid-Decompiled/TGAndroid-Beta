package dg;

import android.view.View;
public final class w implements View.OnClickListener {
    public final int f4558a;
    public final Runnable f4559b;

    public w(int i9, Runnable runnable) {
        this.f4558a = i9;
        this.f4559b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f4558a) {
            case 0:
                this.f4559b.run();
                return;
            case 1:
                this.f4559b.run();
                return;
            case 2:
                this.f4559b.run();
                return;
            case 3:
                this.f4559b.run();
                return;
            case 4:
                this.f4559b.run();
                return;
            case 5:
                this.f4559b.run();
                return;
            default:
                this.f4559b.run();
                return;
        }
    }
}
