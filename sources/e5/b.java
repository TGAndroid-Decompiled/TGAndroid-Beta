package e5;

import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.tn;
public final class b implements Runnable {
    public final int f5821a;
    public boolean f5822b;
    public final Object f5823c;

    public b(Object obj, int i10) {
        this.f5821a = i10;
        this.f5823c = obj;
    }

    @Override
    public final void run() {
        switch (this.f5821a) {
            case 0:
                this.f5822b = false;
                ((c) this.f5823c).getClass();
                return;
            default:
                if (!this.f5822b) {
                    this.f5822b = true;
                    ((tn) this.f5823c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
