package bi;

import org.telegram.messenger.u10;
public final class l2 implements u10 {
    public final int f4253a;
    public final Object f4254b;

    public l2(Object obj, int i7) {
        this.f4253a = i7;
        this.f4254b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f4253a) {
            case 0:
                return ((k7) this.f4254b).k();
            default:
                return ((org.telegram.ui.ActionBar.f2) this.f4254b).getSimpleMenuOverlay();
        }
    }
}
