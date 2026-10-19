package org.telegram.messenger;

import java.util.ArrayList;
public final class uf implements Runnable {
    public final int f19664a;
    public final MessagesStorage f19665b;
    public final ArrayList f19666c;
    public final int d;

    public uf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19664a = 1;
        this.f19665b = messagesStorage;
        this.f19666c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19664a) {
            case 0:
                this.f19665b.lambda$putWallpapers$78(this.d, this.f19666c);
                return;
            case 1:
                this.f19665b.lambda$unpinAllDialogsExceptNew$247(this.f19666c, this.d);
                return;
            case 2:
                this.f19665b.lambda$getDownloadQueue$185(this.d, this.f19666c);
                return;
            default:
                this.f19665b.lambda$putWidgetDialogs$166(this.d, this.f19666c);
                return;
        }
    }

    public uf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19664a = i11;
        this.f19665b = messagesStorage;
        this.d = i10;
        this.f19666c = arrayList;
    }
}
