package org.telegram.messenger;

import java.util.ArrayList;
public final class ff implements Runnable {
    public final int f22374a;
    public final gf f22375b;

    public ff(gf gfVar, int i7) {
        this.f22374a = i7;
        this.f22375b = gfVar;
    }

    @Override
    public final void run() {
        switch (this.f22374a) {
            case 0:
                gf gfVar = this.f22375b;
                gfVar.d();
                g0.h3(new ff(gfVar, 1));
                return;
            default:
                gf gfVar2 = this.f22375b;
                gfVar2.X = false;
                ArrayList arrayList = gfVar2.Y;
                gfVar2.Y = null;
                if (arrayList != null) {
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        ((Runnable) arrayList.get(i7)).run();
                    }
                    return;
                }
                return;
        }
    }
}
