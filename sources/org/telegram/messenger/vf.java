package org.telegram.messenger;

import java.util.ArrayList;
public final class vf implements Runnable {
    public final int f19436a;
    public final MessagesStorage f19437b;
    public final ArrayList f19438c;
    public final int d;

    public vf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19436a = 1;
        this.f19437b = messagesStorage;
        this.f19438c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19436a) {
            case 0:
                this.f19437b.lambda$putWallpapers$78(this.d, this.f19438c);
                return;
            case 1:
                this.f19437b.lambda$unpinAllDialogsExceptNew$247(this.f19438c, this.d);
                return;
            case 2:
                this.f19437b.lambda$getDownloadQueue$185(this.d, this.f19438c);
                return;
            default:
                this.f19437b.lambda$putWidgetDialogs$166(this.d, this.f19438c);
                return;
        }
    }

    public vf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19436a = i11;
        this.f19437b = messagesStorage;
        this.d = i10;
        this.f19438c = arrayList;
    }
}
