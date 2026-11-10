package org.telegram.messenger;

import java.util.ArrayList;
public final class ff implements Runnable {
    public final int f22412a;
    public final gf f22413b;

    public ff(gf gfVar, int i7) {
        this.f22412a = i7;
        this.f22413b = gfVar;
    }

    @Override
    public final void run() {
        switch (this.f22412a) {
            case 0:
                gf gfVar = this.f22413b;
                gfVar.d();
                g0.h3(new ff(gfVar, 1));
                return;
            default:
                gf gfVar2 = this.f22413b;
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
