package org.telegram.messenger;

import java.util.ArrayList;
public final class i implements Runnable {
    public final int f20290a;
    public final ArrayList f20291b;

    public i(ArrayList arrayList, int i10) {
        this.f20290a = i10;
        this.f20291b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20290a) {
            case 0:
                AndroidUtilities.B(this.f20291b);
                return;
            case 1:
                AndroidUtilities.j(this.f20291b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f20291b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f20291b);
                return;
            case 4:
                MessagesStorage.lambda$updateWidgets$169(this.f20291b);
                return;
            default:
                MessagesStorage.lambda$getWallpapers$83(this.f20291b);
                return;
        }
    }
}
