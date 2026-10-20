package org.telegram.messenger;

import java.util.ArrayList;
public final class g implements Runnable {
    public final int f18402a;
    public final ArrayList f18403b;

    public g(ArrayList arrayList, int i10) {
        this.f18402a = i10;
        this.f18403b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18402a) {
            case 0:
                AndroidUtilities.B(this.f18403b);
                return;
            case 1:
                AndroidUtilities.j(this.f18403b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f18403b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f18403b);
                return;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f18403b);
                return;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f18403b);
                return;
        }
    }
}
