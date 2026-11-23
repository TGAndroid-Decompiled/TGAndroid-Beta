package di;

import org.telegram.messenger.q10;
public final class a2 implements q10 {
    public final int f8459a;
    public final Object f8460b;

    public a2(Object obj, int i7) {
        this.f8459a = i7;
        this.f8460b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f8459a) {
            case 0:
                return ((f6) this.f8460b).k();
            default:
                return ((org.telegram.ui.ActionBar.g2) this.f8460b).getSimpleMenuOverlay();
        }
    }
}
