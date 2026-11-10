package bi;

import android.view.View;
public final class z6 implements View.OnClickListener {
    public final int f5164a;
    public final Runnable f5165b;

    public z6(int i7, Runnable runnable) {
        this.f5164a = i7;
        this.f5165b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5164a) {
            case 0:
                this.f5165b.run();
                return;
            case 1:
                this.f5165b.run();
                return;
            case 2:
                this.f5165b.run();
                return;
            case 3:
                this.f5165b.run();
                return;
            case 4:
                this.f5165b.run();
                return;
            case 5:
                this.f5165b.run();
                return;
            default:
                this.f5165b.run();
                return;
        }
    }
}
