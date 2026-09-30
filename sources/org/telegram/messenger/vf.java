package org.telegram.messenger;

import java.util.ArrayList;
public final class vf implements Runnable {
    public final int f17780a;
    public final MessagesStorage f17781b;
    public final ArrayList f17782c;
    public final int d;

    public vf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f17780a = 1;
        this.f17781b = messagesStorage;
        this.f17782c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17780a) {
            case 0:
                this.f17781b.lambda$putWallpapers$78(this.d, this.f17782c);
                return;
            case 1:
                this.f17781b.lambda$unpinAllDialogsExceptNew$247(this.f17782c, this.d);
                return;
            case 2:
                this.f17781b.lambda$getDownloadQueue$185(this.d, this.f17782c);
                return;
            default:
                this.f17781b.lambda$putWidgetDialogs$166(this.d, this.f17782c);
                return;
        }
    }

    public vf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f17780a = i11;
        this.f17781b = messagesStorage;
        this.d = i10;
        this.f17782c = arrayList;
    }
}
