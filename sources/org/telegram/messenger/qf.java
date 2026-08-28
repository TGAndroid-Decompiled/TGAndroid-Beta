package org.telegram.messenger;

import java.util.ArrayList;
public final class qf implements Runnable {
    public final int f21332a;
    public final MessagesStorage f21333b;
    public final ArrayList f21334c;
    public final int d;

    public qf(int i9, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f21332a = 1;
        this.f21333b = messagesStorage;
        this.f21334c = arrayList;
        this.d = i9;
    }

    @Override
    public final void run() {
        switch (this.f21332a) {
            case 0:
                this.f21333b.lambda$putWallpapers$78(this.d, this.f21334c);
                return;
            case 1:
                this.f21333b.lambda$unpinAllDialogsExceptNew$247(this.f21334c, this.d);
                return;
            case 2:
                this.f21333b.lambda$getDownloadQueue$185(this.d, this.f21334c);
                return;
            default:
                this.f21333b.lambda$putWidgetDialogs$166(this.d, this.f21334c);
                return;
        }
    }

    public qf(MessagesStorage messagesStorage, int i9, ArrayList arrayList, int i10) {
        this.f21332a = i10;
        this.f21333b = messagesStorage;
        this.d = i9;
        this.f21334c = arrayList;
    }
}
