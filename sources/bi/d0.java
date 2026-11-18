package bi;

import android.view.View;
public final class d0 implements View.OnClickListener {
    public final int f3510a;
    public final Runnable f3511b;

    public d0(int i7, Runnable runnable) {
        this.f3510a = i7;
        this.f3511b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3510a) {
            case 0:
                this.f3511b.run();
                return;
            case 1:
                this.f3511b.run();
                return;
            case 2:
                this.f3511b.run();
                return;
            case 3:
                this.f3511b.run();
                return;
            case 4:
                this.f3511b.run();
                return;
            case 5:
                this.f3511b.run();
                return;
            default:
                this.f3511b.run();
                return;
        }
    }
}
