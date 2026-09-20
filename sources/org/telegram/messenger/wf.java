package org.telegram.messenger;

import java.util.ArrayList;
public final class wf implements Runnable {
    public final int f18007a;
    public final MessagesStorage f18008b;
    public final ArrayList f18009c;
    public final int d;

    public wf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f18007a = 1;
        this.f18008b = messagesStorage;
        this.f18009c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18007a) {
            case 0:
                this.f18008b.lambda$putWallpapers$78(this.d, this.f18009c);
                return;
            case 1:
                this.f18008b.lambda$unpinAllDialogsExceptNew$247(this.f18009c, this.d);
                return;
            case 2:
                this.f18008b.lambda$getDownloadQueue$185(this.d, this.f18009c);
                return;
            default:
                this.f18008b.lambda$putWidgetDialogs$166(this.d, this.f18009c);
                return;
        }
    }

    public wf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f18007a = i11;
        this.f18008b = messagesStorage;
        this.d = i10;
        this.f18009c = arrayList;
    }
}
