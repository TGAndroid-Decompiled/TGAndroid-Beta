package org.telegram.messenger;

import java.util.ArrayList;
public final class xf implements Runnable {
    public final int f21845a;
    public final MessagesStorage f21846b;
    public final ArrayList f21847c;
    public final int d;

    public xf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f21845a = 1;
        this.f21846b = messagesStorage;
        this.f21847c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f21845a) {
            case 0:
                this.f21846b.lambda$putWallpapers$81(this.d, this.f21847c);
                return;
            case 1:
                this.f21846b.lambda$unpinAllDialogsExceptNew$251(this.f21847c, this.d);
                return;
            case 2:
                this.f21846b.lambda$putWidgetDialogs$170(this.d, this.f21847c);
                return;
            default:
                this.f21846b.lambda$getDownloadQueue$189(this.d, this.f21847c);
                return;
        }
    }

    public xf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f21845a = i11;
        this.f21846b = messagesStorage;
        this.d = i10;
        this.f21847c = arrayList;
    }
}
