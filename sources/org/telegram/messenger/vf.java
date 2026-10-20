package org.telegram.messenger;

import java.util.ArrayList;
public final class vf implements Runnable {
    public final int f19751a;
    public final MessagesStorage f19752b;
    public final ArrayList f19753c;
    public final int d;

    public vf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19751a = 1;
        this.f19752b = messagesStorage;
        this.f19753c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19751a) {
            case 0:
                this.f19752b.lambda$putWallpapers$78(this.d, this.f19753c);
                return;
            case 1:
                this.f19752b.lambda$unpinAllDialogsExceptNew$247(this.f19753c, this.d);
                return;
            case 2:
                this.f19752b.lambda$getDownloadQueue$185(this.d, this.f19753c);
                return;
            default:
                this.f19752b.lambda$putWidgetDialogs$166(this.d, this.f19753c);
                return;
        }
    }

    public vf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19751a = i11;
        this.f19752b = messagesStorage;
        this.d = i10;
        this.f19753c = arrayList;
    }
}
