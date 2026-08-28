package c5;

import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.qn;
public final class b implements Runnable {
    public final int f2309a;
    public boolean f2310b;
    public final Object f2311c;

    public b(Object obj, int i9) {
        this.f2309a = i9;
        this.f2311c = obj;
    }

    @Override
    public final void run() {
        switch (this.f2309a) {
            case 0:
                this.f2310b = false;
                ((c) this.f2311c).getClass();
                return;
            default:
                if (!this.f2310b) {
                    this.f2310b = true;
                    ((qn) this.f2311c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
