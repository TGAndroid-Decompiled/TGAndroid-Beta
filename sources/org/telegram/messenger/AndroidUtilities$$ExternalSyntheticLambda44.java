package org.telegram.messenger;

import java.util.ArrayList;

public final class AndroidUtilities$$ExternalSyntheticLambda44 implements Runnable {
    public final int $r8$classId;
    public final ArrayList f$0;

    public AndroidUtilities$$ExternalSyntheticLambda44(ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.lambda$recycleBitmaps$1(this.f$0);
                break;
            case 1:
                AndroidUtilities.lambda$recycleBitmaps$0(this.f$0);
                break;
            case 2:
                DispatchQueuePoolBackground.lambda$finishCollectUpdateRunnables$3(this.f$0);
                break;
            case 3:
                DispatchQueuePoolBackground.lambda$finishCollectUpdateRunnables$2(this.f$0);
                break;
            case 4:
                MessagesStorage.lambda$getWallpapers$80(this.f$0);
                break;
            default:
                MessagesStorage.lambda$updateWidgets$165(this.f$0);
                break;
        }
    }
}
