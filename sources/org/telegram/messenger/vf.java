package org.telegram.messenger;

import java.util.ArrayList;
public final class vf implements Runnable {
    public final int f19472a;
    public final MessagesStorage f19473b;
    public final ArrayList f19474c;
    public final int d;

    public vf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19472a = 1;
        this.f19473b = messagesStorage;
        this.f19474c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19472a) {
            case 0:
                this.f19473b.lambda$putWallpapers$78(this.d, this.f19474c);
                return;
            case 1:
                this.f19473b.lambda$unpinAllDialogsExceptNew$247(this.f19474c, this.d);
                return;
            case 2:
                this.f19473b.lambda$getDownloadQueue$185(this.d, this.f19474c);
                return;
            default:
                this.f19473b.lambda$putWidgetDialogs$166(this.d, this.f19474c);
                return;
        }
    }

    public vf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19472a = i11;
        this.f19473b = messagesStorage;
        this.d = i10;
        this.f19474c = arrayList;
    }
}
