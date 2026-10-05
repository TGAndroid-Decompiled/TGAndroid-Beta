package org.telegram.messenger;

import java.util.ArrayList;
public final class vf implements Runnable {
    public final int f19429a;
    public final MessagesStorage f19430b;
    public final ArrayList f19431c;
    public final int d;

    public vf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19429a = 1;
        this.f19430b = messagesStorage;
        this.f19431c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19429a) {
            case 0:
                this.f19430b.lambda$putWallpapers$78(this.d, this.f19431c);
                return;
            case 1:
                this.f19430b.lambda$unpinAllDialogsExceptNew$247(this.f19431c, this.d);
                return;
            case 2:
                this.f19430b.lambda$getDownloadQueue$185(this.d, this.f19431c);
                return;
            default:
                this.f19430b.lambda$putWidgetDialogs$166(this.d, this.f19431c);
                return;
        }
    }

    public vf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19429a = i11;
        this.f19430b = messagesStorage;
        this.d = i10;
        this.f19431c = arrayList;
    }
}
