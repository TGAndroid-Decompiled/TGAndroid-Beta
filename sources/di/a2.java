package di;

import org.telegram.messenger.o10;
public final class a2 implements o10 {
    public final int f8458a;
    public final Object f8459b;

    public a2(Object obj, int i7) {
        this.f8458a = i7;
        this.f8459b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f8458a) {
            case 0:
                return ((f6) this.f8459b).k();
            default:
                return ((org.telegram.ui.ActionBar.g2) this.f8459b).getSimpleMenuOverlay();
        }
    }
}
