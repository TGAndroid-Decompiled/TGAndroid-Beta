package di;

import org.telegram.messenger.r10;
public final class w1 implements r10 {
    public final int f9630a;
    public final Object f9631b;

    public w1(Object obj, int i7) {
        this.f9630a = i7;
        this.f9631b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f9630a) {
            case 0:
                return ((c6) this.f9631b).k();
            default:
                return ((org.telegram.ui.ActionBar.e2) this.f9631b).getSimpleMenuOverlay();
        }
    }
}
