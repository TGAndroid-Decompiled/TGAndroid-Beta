package org.telegram.messenger;

import java.util.ArrayList;
public final class uf implements Runnable {
    public final int f19661a;
    public final MessagesStorage f19662b;
    public final ArrayList f19663c;
    public final int d;

    public uf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f19661a = 1;
        this.f19662b = messagesStorage;
        this.f19663c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19661a) {
            case 0:
                this.f19662b.lambda$putWallpapers$78(this.d, this.f19663c);
                return;
            case 1:
                this.f19662b.lambda$unpinAllDialogsExceptNew$247(this.f19663c, this.d);
                return;
            case 2:
                this.f19662b.lambda$getDownloadQueue$185(this.d, this.f19663c);
                return;
            default:
                this.f19662b.lambda$putWidgetDialogs$166(this.d, this.f19663c);
                return;
        }
    }

    public uf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f19661a = i11;
        this.f19662b = messagesStorage;
        this.d = i10;
        this.f19663c = arrayList;
    }
}
