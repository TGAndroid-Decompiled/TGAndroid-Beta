package org.telegram.messenger;

import java.util.ArrayList;
public final class e implements Runnable {
    public final int f17089a;
    public final ArrayList f17090b;

    public e(ArrayList arrayList, int i10) {
        this.f17089a = i10;
        this.f17090b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17089a) {
            case 0:
                AndroidUtilities.g(this.f17090b);
                return;
            case 1:
                AndroidUtilities.B(this.f17090b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f17090b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f17090b);
                return;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f17090b);
                return;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f17090b);
                return;
        }
    }
}
