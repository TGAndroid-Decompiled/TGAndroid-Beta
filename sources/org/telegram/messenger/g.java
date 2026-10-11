package org.telegram.messenger;

import java.util.ArrayList;
public final class g implements Runnable {
    public final int f17888a;
    public final ArrayList f17889b;

    public g(ArrayList arrayList, int i10) {
        this.f17888a = i10;
        this.f17889b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17888a) {
            case 0:
                AndroidUtilities.B(this.f17889b);
                return;
            case 1:
                AndroidUtilities.j(this.f17889b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f17889b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f17889b);
                return;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f17889b);
                return;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f17889b);
                return;
        }
    }
}
