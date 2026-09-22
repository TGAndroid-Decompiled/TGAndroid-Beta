package org.telegram.messenger;

import java.util.ArrayList;
public final class wf implements Runnable {
    public final int f17779a;
    public final MessagesStorage f17780b;
    public final ArrayList f17781c;
    public final int d;

    public wf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f17779a = 1;
        this.f17780b = messagesStorage;
        this.f17781c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17779a) {
            case 0:
                this.f17780b.lambda$putWallpapers$78(this.d, this.f17781c);
                return;
            case 1:
                this.f17780b.lambda$unpinAllDialogsExceptNew$247(this.f17781c, this.d);
                return;
            case 2:
                this.f17780b.lambda$getDownloadQueue$185(this.d, this.f17781c);
                return;
            default:
                this.f17780b.lambda$putWidgetDialogs$166(this.d, this.f17781c);
                return;
        }
    }

    public wf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f17779a = i11;
        this.f17780b = messagesStorage;
        this.d = i10;
        this.f17781c = arrayList;
    }
}
