package org.telegram.messenger;

import java.util.ArrayList;
public final class vf implements Runnable {
    public final int f19424a;
    public final MessagesStorage f19425b;
    public final ArrayList f19426c;
    public final int d;

    public vf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19424a = 1;
        this.f19425b = messagesStorage;
        this.f19426c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19424a) {
            case 0:
                this.f19425b.lambda$putWallpapers$78(this.d, this.f19426c);
                return;
            case 1:
                this.f19425b.lambda$unpinAllDialogsExceptNew$247(this.f19426c, this.d);
                return;
            case 2:
                this.f19425b.lambda$getDownloadQueue$185(this.d, this.f19426c);
                return;
            default:
                this.f19425b.lambda$putWidgetDialogs$166(this.d, this.f19426c);
                return;
        }
    }

    public vf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19424a = i11;
        this.f19425b = messagesStorage;
        this.d = i10;
        this.f19426c = arrayList;
    }
}
