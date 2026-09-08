package org.telegram.messenger;

import java.util.ArrayList;
public final class e implements Runnable {
    public final int f17534a;
    public final ArrayList f17535b;

    public e(ArrayList arrayList, int i10) {
        this.f17534a = i10;
        this.f17535b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17534a) {
            case 0:
                AndroidUtilities.h(this.f17535b);
                return;
            case 1:
                AndroidUtilities.B(this.f17535b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f17535b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f17535b);
                return;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f17535b);
                return;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f17535b);
                return;
        }
    }
}
