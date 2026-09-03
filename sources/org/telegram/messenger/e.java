package org.telegram.messenger;

import java.util.ArrayList;
public final class e implements Runnable {
    public final int f18529a;
    public final ArrayList f18530b;

    public e(ArrayList arrayList, int i10) {
        this.f18529a = i10;
        this.f18530b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18529a) {
            case 0:
                AndroidUtilities.h(this.f18530b);
                return;
            case 1:
                AndroidUtilities.B(this.f18530b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f18530b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f18530b);
                return;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f18530b);
                return;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f18530b);
                return;
        }
    }
}
