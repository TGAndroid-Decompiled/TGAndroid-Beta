package org.telegram.messenger;

import java.util.ArrayList;
public final class vf implements Runnable {
    public final int f19269a;
    public final MessagesStorage f19270b;
    public final ArrayList f19271c;
    public final int d;

    public vf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19269a = 1;
        this.f19270b = messagesStorage;
        this.f19271c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19269a) {
            case 0:
                this.f19270b.lambda$putWallpapers$78(this.d, this.f19271c);
                return;
            case 1:
                this.f19270b.lambda$unpinAllDialogsExceptNew$247(this.f19271c, this.d);
                return;
            case 2:
                this.f19270b.lambda$getDownloadQueue$185(this.d, this.f19271c);
                return;
            default:
                this.f19270b.lambda$putWidgetDialogs$166(this.d, this.f19271c);
                return;
        }
    }

    public vf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19269a = i11;
        this.f19270b = messagesStorage;
        this.d = i10;
        this.f19271c = arrayList;
    }
}
