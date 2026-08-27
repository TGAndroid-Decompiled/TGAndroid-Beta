package c5;

import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.rn;

public final class b implements Runnable {

    public final int f2442a;

    public boolean f2443b;

    public final Object f2444c;

    public b(Object obj, int i10) {
        this.f2442a = i10;
        this.f2444c = obj;
    }

    @Override
    public final void run() {
        switch (this.f2442a) {
            case 0:
                this.f2443b = false;
                ((c) this.f2444c).getClass();
                break;
            default:
                if (!this.f2443b) {
                    this.f2443b = true;
                    ((rn) this.f2444c).presentFragment(new NotificationsSettingsActivity());
                    break;
                }
                break;
        }
    }
}
