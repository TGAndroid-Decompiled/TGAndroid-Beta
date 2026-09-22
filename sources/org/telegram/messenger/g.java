package org.telegram.messenger;

import java.util.ArrayList;
public final class g implements Runnable {
    public final int f16158a;
    public final ArrayList f16159b;

    public g(ArrayList arrayList, int i10) {
        this.f16158a = i10;
        this.f16159b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f16158a) {
            case 0:
                AndroidUtilities.B(this.f16159b);
                return;
            case 1:
                AndroidUtilities.j(this.f16159b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f16159b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f16159b);
                return;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f16159b);
                return;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f16159b);
                return;
        }
    }
}
