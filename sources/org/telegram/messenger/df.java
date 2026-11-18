package org.telegram.messenger;

import java.util.ArrayList;
public final class df implements Runnable {
    public final int f23513a;
    public final ef f23514b;

    public df(ef efVar, int i7) {
        this.f23513a = i7;
        this.f23514b = efVar;
    }

    @Override
    public final void run() {
        switch (this.f23513a) {
            case 0:
                ef efVar = this.f23514b;
                efVar.d();
                g0.g3(new df(efVar, 1));
                return;
            default:
                ef efVar2 = this.f23514b;
                efVar2.X = false;
                ArrayList arrayList = efVar2.Y;
                efVar2.Y = null;
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
