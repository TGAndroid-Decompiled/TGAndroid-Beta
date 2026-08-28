package org.telegram.messenger;

import java.util.ArrayList;
public final class e implements Runnable {
    public final int f20137a;
    public final ArrayList f20138b;

    public e(ArrayList arrayList, int i9) {
        this.f20137a = i9;
        this.f20138b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20137a) {
            case 0:
                AndroidUtilities.g(this.f20138b);
                return;
            case 1:
                AndroidUtilities.B(this.f20138b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f20138b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f20138b);
                return;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f20138b);
                return;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f20138b);
                return;
        }
    }
}
