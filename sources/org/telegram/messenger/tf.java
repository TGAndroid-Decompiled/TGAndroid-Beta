package org.telegram.messenger;

import java.util.ArrayList;
public final class tf implements Runnable {
    public final int f19585a;
    public final MessagesStorage f19586b;
    public final ArrayList f19587c;
    public final int d;

    public tf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19585a = 1;
        this.f19586b = messagesStorage;
        this.f19587c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19585a) {
            case 0:
                this.f19586b.lambda$putWallpapers$78(this.d, this.f19587c);
                return;
            case 1:
                this.f19586b.lambda$unpinAllDialogsExceptNew$247(this.f19587c, this.d);
                return;
            case 2:
                this.f19586b.lambda$getDownloadQueue$185(this.d, this.f19587c);
                return;
            default:
                this.f19586b.lambda$putWidgetDialogs$166(this.d, this.f19587c);
                return;
        }
    }

    public tf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19585a = i11;
        this.f19586b = messagesStorage;
        this.d = i10;
        this.f19587c = arrayList;
    }
}
