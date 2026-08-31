package jg;

import android.view.View;
public final class u implements View.OnClickListener {
    public final int f10070a;
    public final Runnable f10071b;

    public u(int i10, Runnable runnable) {
        this.f10070a = i10;
        this.f10071b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f10070a) {
            case 0:
                this.f10071b.run();
                return;
            case 1:
                this.f10071b.run();
                return;
            case 2:
                this.f10071b.run();
                return;
            case 3:
                this.f10071b.run();
                return;
            case 4:
                this.f10071b.run();
                return;
            case 5:
                this.f10071b.run();
                return;
            default:
                this.f10071b.run();
                return;
        }
    }
}
