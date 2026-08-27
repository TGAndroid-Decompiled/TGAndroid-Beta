package org.telegram.messenger;

import java.util.ArrayList;

public final class e implements Runnable {

    public final int f20091a;

    public final ArrayList f20092b;

    public e(ArrayList arrayList, int i10) {
        this.f20091a = i10;
        this.f20092b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f20091a) {
            case 0:
                AndroidUtilities.lambda$recycleBitmaps$1(this.f20092b);
                break;
            case 1:
                AndroidUtilities.lambda$recycleBitmaps$0(this.f20092b);
                break;
            case 2:
                DispatchQueuePoolBackground.lambda$finishCollectUpdateRunnables$3(this.f20092b);
                break;
            case 3:
                DispatchQueuePoolBackground.lambda$finishCollectUpdateRunnables$2(this.f20092b);
                break;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f20092b);
                break;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f20092b);
                break;
        }
    }
}
