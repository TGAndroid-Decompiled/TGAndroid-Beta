package org.telegram.messenger;

import java.util.ArrayList;
public final class vf implements Runnable {
    public final int f17796a;
    public final MessagesStorage f17797b;
    public final ArrayList f17798c;
    public final int d;

    public vf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f17796a = 1;
        this.f17797b = messagesStorage;
        this.f17798c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17796a) {
            case 0:
                this.f17797b.lambda$putWallpapers$78(this.d, this.f17798c);
                return;
            case 1:
                this.f17797b.lambda$unpinAllDialogsExceptNew$247(this.f17798c, this.d);
                return;
            case 2:
                this.f17797b.lambda$getDownloadQueue$185(this.d, this.f17798c);
                return;
            default:
                this.f17797b.lambda$putWidgetDialogs$166(this.d, this.f17798c);
                return;
        }
    }

    public vf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f17796a = i11;
        this.f17797b = messagesStorage;
        this.d = i10;
        this.f17798c = arrayList;
    }
}
