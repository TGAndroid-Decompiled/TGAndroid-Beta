package org.telegram.messenger;

import java.util.ArrayList;
public final class e implements Runnable {
    public final int f18527a;
    public final ArrayList f18528b;

    public e(ArrayList arrayList, int i10) {
        this.f18527a = i10;
        this.f18528b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f18527a) {
            case 0:
                AndroidUtilities.h(this.f18528b);
                return;
            case 1:
                AndroidUtilities.B(this.f18528b);
                return;
            case 2:
                DispatchQueuePoolBackground.d(this.f18528b);
                return;
            case 3:
                DispatchQueuePoolBackground.b(this.f18528b);
                return;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f18528b);
                return;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f18528b);
                return;
        }
    }
}
