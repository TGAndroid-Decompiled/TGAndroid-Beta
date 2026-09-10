package org.telegram.messenger;

import java.util.ArrayList;
public final class eg implements Runnable {
    public final int f15092a;
    public final MessagesStorage f15093b;
    public final ArrayList f15094c;
    public final int d;

    public eg(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f15092a = 1;
        this.f15093b = messagesStorage;
        this.f15094c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f15092a) {
            case 0:
                this.f15093b.lambda$putWallpapers$78(this.d, this.f15094c);
                return;
            case 1:
                this.f15093b.lambda$unpinAllDialogsExceptNew$247(this.f15094c, this.d);
                return;
            case 2:
                this.f15093b.lambda$getDownloadQueue$185(this.d, this.f15094c);
                return;
            default:
                this.f15093b.lambda$putWidgetDialogs$166(this.d, this.f15094c);
                return;
        }
    }

    public eg(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f15092a = i11;
        this.f15093b = messagesStorage;
        this.d = i10;
        this.f15094c = arrayList;
    }
}
