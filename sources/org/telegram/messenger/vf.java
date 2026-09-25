package org.telegram.messenger;

import java.util.ArrayList;
public final class vf implements Runnable {
    public final int f17769a;
    public final MessagesStorage f17770b;
    public final ArrayList f17771c;
    public final int d;

    public vf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f17769a = 1;
        this.f17770b = messagesStorage;
        this.f17771c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17769a) {
            case 0:
                this.f17770b.lambda$putWallpapers$78(this.d, this.f17771c);
                return;
            case 1:
                this.f17770b.lambda$unpinAllDialogsExceptNew$247(this.f17771c, this.d);
                return;
            case 2:
                this.f17770b.lambda$getDownloadQueue$185(this.d, this.f17771c);
                return;
            default:
                this.f17770b.lambda$putWidgetDialogs$166(this.d, this.f17771c);
                return;
        }
    }

    public vf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f17769a = i11;
        this.f17770b = messagesStorage;
        this.d = i10;
        this.f17771c = arrayList;
    }
}
