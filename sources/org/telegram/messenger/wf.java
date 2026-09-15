package org.telegram.messenger;

import java.util.ArrayList;
public final class wf implements Runnable {
    public final int f17782a;
    public final MessagesStorage f17783b;
    public final ArrayList f17784c;
    public final int d;

    public wf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f17782a = 1;
        this.f17783b = messagesStorage;
        this.f17784c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17782a) {
            case 0:
                this.f17783b.lambda$putWallpapers$78(this.d, this.f17784c);
                return;
            case 1:
                this.f17783b.lambda$unpinAllDialogsExceptNew$247(this.f17784c, this.d);
                return;
            case 2:
                this.f17783b.lambda$getDownloadQueue$185(this.d, this.f17784c);
                return;
            default:
                this.f17783b.lambda$putWidgetDialogs$166(this.d, this.f17784c);
                return;
        }
    }

    public wf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f17782a = i11;
        this.f17783b = messagesStorage;
        this.d = i10;
        this.f17784c = arrayList;
    }
}
