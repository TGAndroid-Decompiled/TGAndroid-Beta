package org.telegram.messenger;

import java.util.ArrayList;
public final class xf implements Runnable {
    public final int f20150a;
    public final MessagesStorage f20151b;
    public final ArrayList f20152c;
    public final int d;

    public xf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f20150a = 1;
        this.f20151b = messagesStorage;
        this.f20152c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20150a) {
            case 0:
                this.f20151b.lambda$putWallpapers$78(this.d, this.f20152c);
                return;
            case 1:
                this.f20151b.lambda$unpinAllDialogsExceptNew$247(this.f20152c, this.d);
                return;
            case 2:
                this.f20151b.lambda$getDownloadQueue$185(this.d, this.f20152c);
                return;
            default:
                this.f20151b.lambda$putWidgetDialogs$166(this.d, this.f20152c);
                return;
        }
    }

    public xf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f20150a = i11;
        this.f20151b = messagesStorage;
        this.d = i10;
        this.f20152c = arrayList;
    }
}
