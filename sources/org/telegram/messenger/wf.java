package org.telegram.messenger;

import java.util.ArrayList;
public final class wf implements Runnable {
    public final int f19501a;
    public final MessagesStorage f19502b;
    public final ArrayList f19503c;
    public final int d;

    public wf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19501a = 1;
        this.f19502b = messagesStorage;
        this.f19503c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19501a) {
            case 0:
                this.f19502b.lambda$putWallpapers$78(this.d, this.f19503c);
                return;
            case 1:
                this.f19502b.lambda$unpinAllDialogsExceptNew$247(this.f19503c, this.d);
                return;
            case 2:
                this.f19502b.lambda$getDownloadQueue$185(this.d, this.f19503c);
                return;
            default:
                this.f19502b.lambda$putWidgetDialogs$166(this.d, this.f19503c);
                return;
        }
    }

    public wf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19501a = i11;
        this.f19502b = messagesStorage;
        this.d = i10;
        this.f19503c = arrayList;
    }
}
