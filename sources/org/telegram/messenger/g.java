package org.telegram.messenger;

import java.util.ArrayList;
public final class g implements Runnable {
    public final int f17900a;
    public final ArrayList f17901b;

    public g(ArrayList arrayList, int i10) {
        this.f17900a = i10;
        this.f17901b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17900a) {
            case 0:
                AndroidUtilities.B(this.f17901b);
                return;
            case 1:
                AndroidUtilities.j(this.f17901b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f17901b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f17901b);
                return;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f17901b);
                return;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f17901b);
                return;
        }
    }
}
