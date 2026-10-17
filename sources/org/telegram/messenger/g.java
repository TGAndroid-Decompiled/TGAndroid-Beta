package org.telegram.messenger;

import java.util.ArrayList;
public final class g implements Runnable {
    public final int f18405a;
    public final ArrayList f18406b;

    public g(ArrayList arrayList, int i10) {
        this.f18405a = i10;
        this.f18406b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18405a) {
            case 0:
                AndroidUtilities.B(this.f18406b);
                return;
            case 1:
                AndroidUtilities.j(this.f18406b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f18406b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f18406b);
                return;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f18406b);
                return;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f18406b);
                return;
        }
    }
}
