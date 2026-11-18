package di;

import org.telegram.messenger.p10;
public final class a2 implements p10 {
    public final int f8464a;
    public final Object f8465b;

    public a2(Object obj, int i7) {
        this.f8464a = i7;
        this.f8465b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f8464a) {
            case 0:
                return ((f6) this.f8465b).k();
            default:
                return ((org.telegram.ui.ActionBar.h2) this.f8465b).getSimpleMenuOverlay();
        }
    }
}
