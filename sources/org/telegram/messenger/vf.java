package org.telegram.messenger;

import java.util.ArrayList;
public final class vf implements Runnable {
    public final int f19242a;
    public final MessagesStorage f19243b;
    public final ArrayList f19244c;
    public final int d;

    public vf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19242a = 1;
        this.f19243b = messagesStorage;
        this.f19244c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19242a) {
            case 0:
                this.f19243b.lambda$putWallpapers$78(this.d, this.f19244c);
                return;
            case 1:
                this.f19243b.lambda$unpinAllDialogsExceptNew$247(this.f19244c, this.d);
                return;
            case 2:
                this.f19243b.lambda$getDownloadQueue$185(this.d, this.f19244c);
                return;
            default:
                this.f19243b.lambda$putWidgetDialogs$166(this.d, this.f19244c);
                return;
        }
    }

    public vf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19242a = i11;
        this.f19243b = messagesStorage;
        this.d = i10;
        this.f19244c = arrayList;
    }
}
