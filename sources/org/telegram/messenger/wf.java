package org.telegram.messenger;

import java.util.ArrayList;
public final class wf implements Runnable {
    public final int f19528a;
    public final MessagesStorage f19529b;
    public final ArrayList f19530c;
    public final int d;

    public wf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19528a = 1;
        this.f19529b = messagesStorage;
        this.f19530c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19528a) {
            case 0:
                this.f19529b.lambda$putWallpapers$78(this.d, this.f19530c);
                return;
            case 1:
                this.f19529b.lambda$unpinAllDialogsExceptNew$247(this.f19530c, this.d);
                return;
            case 2:
                this.f19529b.lambda$getDownloadQueue$185(this.d, this.f19530c);
                return;
            default:
                this.f19529b.lambda$putWidgetDialogs$166(this.d, this.f19530c);
                return;
        }
    }

    public wf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19528a = i11;
        this.f19529b = messagesStorage;
        this.d = i10;
        this.f19530c = arrayList;
    }
}
