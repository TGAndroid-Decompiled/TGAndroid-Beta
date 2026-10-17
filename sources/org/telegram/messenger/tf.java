package org.telegram.messenger;

import java.util.ArrayList;
public final class tf implements Runnable {
    public final int f19579a;
    public final MessagesStorage f19580b;
    public final ArrayList f19581c;
    public final int d;

    public tf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19579a = 1;
        this.f19580b = messagesStorage;
        this.f19581c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19579a) {
            case 0:
                this.f19580b.lambda$putWallpapers$78(this.d, this.f19581c);
                return;
            case 1:
                this.f19580b.lambda$unpinAllDialogsExceptNew$247(this.f19581c, this.d);
                return;
            case 2:
                this.f19580b.lambda$getDownloadQueue$185(this.d, this.f19581c);
                return;
            default:
                this.f19580b.lambda$putWidgetDialogs$166(this.d, this.f19581c);
                return;
        }
    }

    public tf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19579a = i11;
        this.f19580b = messagesStorage;
        this.d = i10;
        this.f19581c = arrayList;
    }
}
