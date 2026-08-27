package eg;

import android.view.View;

public final class v implements View.OnClickListener {

    public final int f5449a;

    public final Runnable f5450b;

    public v(int i10, Runnable runnable) {
        this.f5449a = i10;
        this.f5450b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5449a) {
            case 0:
                this.f5450b.run();
                break;
            case 1:
                this.f5450b.run();
                break;
            case 2:
                this.f5450b.run();
                break;
            case 3:
                this.f5450b.run();
                break;
            case 4:
                this.f5450b.run();
                break;
            case 5:
                this.f5450b.run();
                break;
            default:
                this.f5450b.run();
                break;
        }
    }
}
