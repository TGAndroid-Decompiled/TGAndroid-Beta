package org.telegram.messenger;

import java.util.ArrayList;
public final class xf implements Runnable {
    public final int f22178a;
    public final MessagesStorage f22179b;
    public final ArrayList f22180c;
    public final int d;

    public xf(int i10, ArrayList arrayList, MessagesStorage messagesStorage) {
        this.f22178a = 1;
        this.f22179b = messagesStorage;
        this.f22180c = arrayList;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f22178a) {
            case 0:
                this.f22179b.lambda$putWallpapers$78(this.d, this.f22180c);
                return;
            case 1:
                this.f22179b.lambda$unpinAllDialogsExceptNew$247(this.f22180c, this.d);
                return;
            case 2:
                this.f22179b.lambda$getDownloadQueue$185(this.d, this.f22180c);
                return;
            default:
                this.f22179b.lambda$putWidgetDialogs$166(this.d, this.f22180c);
                return;
        }
    }

    public xf(MessagesStorage messagesStorage, int i10, ArrayList arrayList, int i11) {
        this.f22178a = i11;
        this.f22179b = messagesStorage;
        this.d = i10;
        this.f22180c = arrayList;
    }
}
