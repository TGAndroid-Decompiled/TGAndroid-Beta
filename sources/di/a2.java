package di;

import org.telegram.messenger.p10;
public final class a2 implements p10 {
    public final int f8467a;
    public final Object f8468b;

    public a2(Object obj, int i7) {
        this.f8467a = i7;
        this.f8468b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f8467a) {
            case 0:
                return ((f6) this.f8468b).k();
            default:
                return ((org.telegram.ui.ActionBar.h2) this.f8468b).getSimpleMenuOverlay();
        }
    }
}
