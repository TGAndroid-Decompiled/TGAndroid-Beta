package ji;

import org.telegram.ui.Components.fc;
import org.telegram.ui.wm;
public final class e0 implements Runnable {
    public final int f16300a = 0;
    public final wm f16301b;
    public final boolean f16302c;
    public final int d;

    public e0(int i3, wm wmVar, boolean z10) {
        this.d = i3;
        this.f16301b = wmVar;
        this.f16302c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16300a) {
            case 0:
                int i3 = this.d;
                wm wmVar = this.f16301b;
                if (i3 != 2) {
                    wmVar.ua();
                    wmVar.Bc();
                }
                j0.f(fc.a0(wmVar), i3, this.f16302c);
                return;
            default:
                boolean z10 = this.f16302c;
                this.f16301b.cd(this.d, z10);
                return;
        }
    }

    public e0(wm wmVar, boolean z10, int i3) {
        this.f16301b = wmVar;
        this.f16302c = z10;
        this.d = i3;
    }
}
