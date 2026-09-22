package org.telegram.messenger;

import java.util.ArrayList;
public final class wf implements Runnable {
    public final int f18022a;
    public final MessagesStorage f18023b;
    public final ArrayList f18024c;
    public final int d;

    public wf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f18022a = 1;
        this.f18023b = messagesStorage;
        this.f18024c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18022a) {
            case 0:
                this.f18023b.lambda$putWallpapers$78(this.d, this.f18024c);
                return;
            case 1:
                this.f18023b.lambda$unpinAllDialogsExceptNew$247(this.f18024c, this.d);
                return;
            case 2:
                this.f18023b.lambda$getDownloadQueue$185(this.d, this.f18024c);
                return;
            default:
                this.f18023b.lambda$putWidgetDialogs$166(this.d, this.f18024c);
                return;
        }
    }

    public wf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f18022a = i11;
        this.f18023b = messagesStorage;
        this.d = i10;
        this.f18024c = arrayList;
    }
}
