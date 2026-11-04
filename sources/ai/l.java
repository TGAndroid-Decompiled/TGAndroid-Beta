package ai;

import org.telegram.ui.m91;
import org.telegram.ui.wm;
public final class l implements Runnable {
    public final int f775a;
    public final wm f776b;

    public l(wm wmVar, int i3) {
        this.f775a = i3;
        this.f776b = wmVar;
    }

    @Override
    public final void run() {
        switch (this.f775a) {
            case 0:
                this.f776b.Bc();
                return;
            default:
                wm wmVar = this.f776b;
                if (wmVar.getParentLayout() != null) {
                    m91.M0(wmVar);
                    return;
                }
                return;
        }
    }
}
