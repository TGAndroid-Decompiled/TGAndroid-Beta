package org.telegram.messenger;

import java.util.ArrayList;
public final class wf implements Runnable {
    public final int f17966a;
    public final MessagesStorage f17967b;
    public final ArrayList f17968c;
    public final int d;

    public wf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f17966a = 1;
        this.f17967b = messagesStorage;
        this.f17968c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17966a) {
            case 0:
                this.f17967b.lambda$putWallpapers$78(this.d, this.f17968c);
                return;
            case 1:
                this.f17967b.lambda$unpinAllDialogsExceptNew$247(this.f17968c, this.d);
                return;
            case 2:
                this.f17967b.lambda$getDownloadQueue$185(this.d, this.f17968c);
                return;
            default:
                this.f17967b.lambda$putWidgetDialogs$166(this.d, this.f17968c);
                return;
        }
    }

    public wf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f17966a = i11;
        this.f17967b = messagesStorage;
        this.d = i10;
        this.f17968c = arrayList;
    }
}
