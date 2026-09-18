package org.telegram.messenger;

import java.util.ArrayList;
public final class wf implements Runnable {
    public final int f17791a;
    public final MessagesStorage f17792b;
    public final ArrayList f17793c;
    public final int d;

    public wf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f17791a = 1;
        this.f17792b = messagesStorage;
        this.f17793c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17791a) {
            case 0:
                this.f17792b.lambda$putWallpapers$78(this.d, this.f17793c);
                return;
            case 1:
                this.f17792b.lambda$unpinAllDialogsExceptNew$247(this.f17793c, this.d);
                return;
            case 2:
                this.f17792b.lambda$getDownloadQueue$185(this.d, this.f17793c);
                return;
            default:
                this.f17792b.lambda$putWidgetDialogs$166(this.d, this.f17793c);
                return;
        }
    }

    public wf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f17791a = i11;
        this.f17792b = messagesStorage;
        this.d = i10;
        this.f17793c = arrayList;
    }
}
