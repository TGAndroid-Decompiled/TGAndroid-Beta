package bi;

import android.view.View;
public final class w6 implements View.OnClickListener {
    public final int f5605a;
    public final Runnable f5606b;

    public w6(int i10, Runnable runnable) {
        this.f5605a = i10;
        this.f5606b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5605a) {
            case 0:
                this.f5606b.run();
                return;
            case 1:
                this.f5606b.run();
                return;
            case 2:
                this.f5606b.run();
                return;
            case 3:
                this.f5606b.run();
                return;
            case 4:
                this.f5606b.run();
                return;
            case 5:
                this.f5606b.run();
                return;
            default:
                this.f5606b.run();
                return;
        }
    }
}
