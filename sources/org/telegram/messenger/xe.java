package org.telegram.messenger;

import java.util.ArrayList;
public final class xe implements Runnable {
    public final int f26368a;
    public final ye f26369b;

    public xe(ye yeVar, int i3) {
        this.f26368a = i3;
        this.f26369b = yeVar;
    }

    @Override
    public final void run() {
        switch (this.f26368a) {
            case 0:
                ye yeVar = this.f26369b;
                yeVar.d();
                g0.h3(new xe(yeVar, 1));
                return;
            default:
                ye yeVar2 = this.f26369b;
                yeVar2.X = false;
                ArrayList arrayList = yeVar2.Y;
                yeVar2.Y = null;
                if (arrayList != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        ((Runnable) arrayList.get(i3)).run();
                    }
                    return;
                }
                return;
        }
    }
}
