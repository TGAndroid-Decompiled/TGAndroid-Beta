package org.telegram.messenger;

import java.util.ArrayList;
public final class vf implements Runnable {
    public final int f17514a;
    public final MessagesStorage f17515b;
    public final ArrayList f17516c;
    public final int d;

    public vf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f17514a = 1;
        this.f17515b = messagesStorage;
        this.f17516c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17514a) {
            case 0:
                this.f17515b.lambda$putWallpapers$78(this.d, this.f17516c);
                return;
            case 1:
                this.f17515b.lambda$unpinAllDialogsExceptNew$247(this.f17516c, this.d);
                return;
            case 2:
                this.f17515b.lambda$getDownloadQueue$185(this.d, this.f17516c);
                return;
            default:
                this.f17515b.lambda$putWidgetDialogs$166(this.d, this.f17516c);
                return;
        }
    }

    public vf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f17514a = i11;
        this.f17515b = messagesStorage;
        this.d = i10;
        this.f17516c = arrayList;
    }
}
