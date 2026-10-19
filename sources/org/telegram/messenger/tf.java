package org.telegram.messenger;

import java.util.ArrayList;
public final class tf implements Runnable {
    public final int f19582a;
    public final MessagesStorage f19583b;
    public final ArrayList f19584c;
    public final int d;

    public tf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19582a = 1;
        this.f19583b = messagesStorage;
        this.f19584c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19582a) {
            case 0:
                this.f19583b.lambda$putWallpapers$78(this.d, this.f19584c);
                return;
            case 1:
                this.f19583b.lambda$unpinAllDialogsExceptNew$247(this.f19584c, this.d);
                return;
            case 2:
                this.f19583b.lambda$getDownloadQueue$185(this.d, this.f19584c);
                return;
            default:
                this.f19583b.lambda$putWidgetDialogs$166(this.d, this.f19584c);
                return;
        }
    }

    public tf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19582a = i11;
        this.f19583b = messagesStorage;
        this.d = i10;
        this.f19584c = arrayList;
    }
}
