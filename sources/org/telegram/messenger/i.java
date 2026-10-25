package org.telegram.messenger;

import java.util.ArrayList;
public final class i implements Runnable {
    public final int f20295a;
    public final ArrayList f20296b;

    public i(ArrayList arrayList, int i10) {
        this.f20295a = i10;
        this.f20296b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20295a) {
            case 0:
                AndroidUtilities.B(this.f20296b);
                return;
            case 1:
                AndroidUtilities.j(this.f20296b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f20296b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f20296b);
                return;
            case 4:
                MessagesStorage.lambda$updateWidgets$168(this.f20296b);
                return;
            default:
                MessagesStorage.lambda$getWallpapers$83(this.f20296b);
                return;
        }
    }
}
