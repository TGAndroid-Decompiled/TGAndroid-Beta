package org.telegram.messenger;

import java.util.ArrayList;

public final class MessagesStorage$$ExternalSyntheticLambda182 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final int f$1;
    public final ArrayList f$2;

    public MessagesStorage$$ExternalSyntheticLambda182(int i, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.$r8$classId = 1;
        this.f$0 = messagesStorage;
        this.f$2 = arrayList;
        this.f$1 = i;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$putWallpapers$78(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$unpinAllDialogsExceptNew$247(this.f$2, this.f$1);
                break;
            case 2:
                this.f$0.lambda$getDownloadQueue$185(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$putWidgetDialogs$166(this.f$1, this.f$2);
                break;
        }
    }

    public MessagesStorage$$ExternalSyntheticLambda182(MessagesStorage messagesStorage, int i, ArrayList arrayList, int i2) {
        this.$r8$classId = i2;
        this.f$0 = messagesStorage;
        this.f$1 = i;
        this.f$2 = arrayList;
    }
}
