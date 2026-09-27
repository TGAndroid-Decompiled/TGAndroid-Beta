package org.telegram.messenger;

import java.util.ArrayList;
public final class vf implements Runnable {
    public final int f17763a;
    public final MessagesStorage f17764b;
    public final ArrayList f17765c;
    public final int d;

    public vf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f17763a = 1;
        this.f17764b = messagesStorage;
        this.f17765c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17763a) {
            case 0:
                this.f17764b.lambda$putWallpapers$78(this.d, this.f17765c);
                return;
            case 1:
                this.f17764b.lambda$unpinAllDialogsExceptNew$247(this.f17765c, this.d);
                return;
            case 2:
                this.f17764b.lambda$getDownloadQueue$185(this.d, this.f17765c);
                return;
            default:
                this.f17764b.lambda$putWidgetDialogs$166(this.d, this.f17765c);
                return;
        }
    }

    public vf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f17763a = i11;
        this.f17764b = messagesStorage;
        this.d = i10;
        this.f17765c = arrayList;
    }
}
