package org.telegram.messenger;

import java.util.ArrayList;
public final class g implements Runnable {
    public final int f18406a;
    public final ArrayList f18407b;

    public g(ArrayList arrayList, int i10) {
        this.f18406a = i10;
        this.f18407b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18406a) {
            case 0:
                AndroidUtilities.B(this.f18407b);
                return;
            case 1:
                AndroidUtilities.j(this.f18407b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f18407b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f18407b);
                return;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f18407b);
                return;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f18407b);
                return;
        }
    }
}
