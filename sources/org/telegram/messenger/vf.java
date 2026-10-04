package org.telegram.messenger;

import java.util.ArrayList;
public final class vf implements Runnable {
    public final int f19423a;
    public final MessagesStorage f19424b;
    public final ArrayList f19425c;
    public final int d;

    public vf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19423a = 1;
        this.f19424b = messagesStorage;
        this.f19425c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19423a) {
            case 0:
                this.f19424b.lambda$putWallpapers$78(this.d, this.f19425c);
                return;
            case 1:
                this.f19424b.lambda$unpinAllDialogsExceptNew$247(this.f19425c, this.d);
                return;
            case 2:
                this.f19424b.lambda$getDownloadQueue$185(this.d, this.f19425c);
                return;
            default:
                this.f19424b.lambda$putWidgetDialogs$166(this.d, this.f19425c);
                return;
        }
    }

    public vf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19423a = i11;
        this.f19424b = messagesStorage;
        this.d = i10;
        this.f19425c = arrayList;
    }
}
