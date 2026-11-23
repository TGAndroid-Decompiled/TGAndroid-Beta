package di;

import org.telegram.messenger.q10;
public final class a2 implements q10 {
    public final int f8496a;
    public final Object f8497b;

    public a2(Object obj, int i7) {
        this.f8496a = i7;
        this.f8497b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f8496a) {
            case 0:
                return ((f6) this.f8497b).k();
            default:
                return ((org.telegram.ui.ActionBar.g2) this.f8497b).getSimpleMenuOverlay();
        }
    }
}
