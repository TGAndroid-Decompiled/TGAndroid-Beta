package org.telegram.messenger;

import java.util.ArrayList;
public final class e implements Runnable {
    public final int f17547a;
    public final ArrayList f17548b;

    public e(ArrayList arrayList, int i10) {
        this.f17547a = i10;
        this.f17548b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17547a) {
            case 0:
                AndroidUtilities.h(this.f17548b);
                return;
            case 1:
                AndroidUtilities.B(this.f17548b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f17548b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f17548b);
                return;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f17548b);
                return;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f17548b);
                return;
        }
    }
}
