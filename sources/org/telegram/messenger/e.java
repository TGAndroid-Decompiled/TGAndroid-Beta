package org.telegram.messenger;

import java.util.ArrayList;
public final class e implements Runnable {
    public final int f17074a;
    public final ArrayList f17075b;

    public e(ArrayList arrayList, int i10) {
        this.f17074a = i10;
        this.f17075b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17074a) {
            case 0:
                AndroidUtilities.h(this.f17075b);
                return;
            case 1:
                AndroidUtilities.B(this.f17075b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f17075b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f17075b);
                return;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f17075b);
                return;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f17075b);
                return;
        }
    }
}
