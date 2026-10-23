package org.telegram.messenger;

import java.util.ArrayList;
public final class xf implements Runnable {
    public final int f20085a;
    public final MessagesStorage f20086b;
    public final ArrayList f20087c;
    public final int d;

    public xf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f20085a = 1;
        this.f20086b = messagesStorage;
        this.f20087c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20085a) {
            case 0:
                this.f20086b.lambda$putWallpapers$78(this.d, this.f20087c);
                return;
            case 1:
                this.f20086b.lambda$unpinAllDialogsExceptNew$247(this.f20087c, this.d);
                return;
            case 2:
                this.f20086b.lambda$getDownloadQueue$185(this.d, this.f20087c);
                return;
            default:
                this.f20086b.lambda$putWidgetDialogs$166(this.d, this.f20087c);
                return;
        }
    }

    public xf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f20085a = i11;
        this.f20086b = messagesStorage;
        this.d = i10;
        this.f20087c = arrayList;
    }
}
