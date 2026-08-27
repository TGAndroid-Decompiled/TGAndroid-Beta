package org.telegram.messenger;

import java.util.ArrayList;

public final class uf implements Runnable {

    public final int f21732a;

    public final MessagesStorage f21733b;

    public final ArrayList f21734c;
    public final int d;

    public uf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f21732a = 1;
        this.f21733b = messagesStorage;
        this.f21734c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f21732a) {
            case 0:
                this.f21733b.lambda$putWallpapers$78(this.d, this.f21734c);
                break;
            case 1:
                this.f21733b.lambda$unpinAllDialogsExceptNew$247(this.f21734c, this.d);
                break;
            case 2:
                this.f21733b.lambda$getDownloadQueue$185(this.d, this.f21734c);
                break;
            default:
                this.f21733b.lambda$putWidgetDialogs$166(this.d, this.f21734c);
                break;
        }
    }

    public uf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f21732a = i11;
        this.f21733b = messagesStorage;
        this.d = i10;
        this.f21734c = arrayList;
    }
}
