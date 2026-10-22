package org.telegram.messenger;

import java.util.ArrayList;
public final class g implements Runnable {
    public final int f18394a;
    public final ArrayList f18395b;

    public g(ArrayList arrayList, int i10) {
        this.f18394a = i10;
        this.f18395b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18394a) {
            case 0:
                AndroidUtilities.B(this.f18395b);
                return;
            case 1:
                AndroidUtilities.j(this.f18395b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f18395b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f18395b);
                return;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f18395b);
                return;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f18395b);
                return;
        }
    }
}
