package ci;

import org.telegram.messenger.m10;
public final class c2 implements m10 {
    public final int f4906a;
    public final Object f4907b;

    public c2(Object obj, int i3) {
        this.f4906a = i3;
        this.f4907b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f4906a) {
            case 0:
                return ((l6) this.f4907b).k();
            default:
                return ((org.telegram.ui.ActionBar.d2) this.f4907b).getSimpleMenuOverlay();
        }
    }
}
