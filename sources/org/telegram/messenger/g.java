package org.telegram.messenger;

import java.util.ArrayList;
public final class g implements Runnable {
    public final int f17885a;
    public final ArrayList f17886b;

    public g(ArrayList arrayList, int i10) {
        this.f17885a = i10;
        this.f17886b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17885a) {
            case 0:
                AndroidUtilities.B(this.f17886b);
                return;
            case 1:
                AndroidUtilities.j(this.f17886b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f17886b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f17886b);
                return;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f17886b);
                return;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f17886b);
                return;
        }
    }
}
