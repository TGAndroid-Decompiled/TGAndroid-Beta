package di;

import org.telegram.messenger.p10;
public final class a2 implements p10 {
    public final int f8493a;
    public final Object f8494b;

    public a2(Object obj, int i7) {
        this.f8493a = i7;
        this.f8494b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f8493a) {
            case 0:
                return ((f6) this.f8494b).k();
            default:
                return ((org.telegram.ui.ActionBar.g2) this.f8494b).getSimpleMenuOverlay();
        }
    }
}
