package org.telegram.messenger;

import java.util.ArrayList;
public final class ef implements Runnable {
    public final int f23291a;
    public final ff f23292b;

    public ef(ff ffVar, int i7) {
        this.f23291a = i7;
        this.f23292b = ffVar;
    }

    @Override
    public final void run() {
        switch (this.f23291a) {
            case 0:
                ff ffVar = this.f23292b;
                ffVar.d();
                g0.h3(new ef(ffVar, 1));
                return;
            default:
                ff ffVar2 = this.f23292b;
                ffVar2.X = false;
                ArrayList arrayList = ffVar2.Y;
                ffVar2.Y = null;
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
