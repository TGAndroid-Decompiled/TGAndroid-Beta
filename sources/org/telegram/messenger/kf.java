package org.telegram.messenger;

import java.util.ArrayList;
public final class kf implements Runnable {
    public final int f20522a;
    public final MessagesStorage f20523b;
    public final int f20524c;
    public final ArrayList d;

    public kf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f20522a = 2;
        this.f20523b = messagesStorage;
        this.d = arrayList;
        this.f20524c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20522a) {
            case 0:
                this.f20523b.lambda$getDownloadQueue$188(this.f20524c, this.d);
                return;
            case 1:
                this.f20523b.lambda$putWallpapers$81(this.f20524c, this.d);
                return;
            case 2:
                this.f20523b.lambda$unpinAllDialogsExceptNew$250(this.d, this.f20524c);
                return;
            default:
                this.f20523b.lambda$putWidgetDialogs$169(this.f20524c, this.d);
                return;
        }
    }

    public kf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f20522a = i11;
        this.f20523b = messagesStorage;
        this.f20524c = i10;
        this.d = arrayList;
    }
}
