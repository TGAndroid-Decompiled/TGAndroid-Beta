package org.telegram.messenger;

import java.util.ArrayList;
public final class e implements Runnable {
    public final int f20081a;
    public final ArrayList f20082b;

    public e(ArrayList arrayList, int i10) {
        this.f20081a = i10;
        this.f20082b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20081a) {
            case 0:
                AndroidUtilities.g(this.f20082b);
                return;
            case 1:
                AndroidUtilities.B(this.f20082b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f20082b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f20082b);
                return;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f20082b);
                return;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f20082b);
                return;
        }
    }
}
