package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class b3 implements Runnable {
    public final int f15709a;
    public final boolean f15710b;
    public final boolean f15711c;
    public final Object d;
    public final Object e;

    public b3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f15709a = 0;
        this.d = anonymousClass1;
        this.f15710b = z10;
        this.e = str;
        this.f15711c = z11;
    }

    @Override
    public final void run() {
        switch (this.f15709a) {
            case 0:
                boolean z10 = this.f15711c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f15710b, (String) this.e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.e, this.f15710b, this.f15711c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.e, this.f15710b, this.f15711c);
                return;
        }
    }

    public b3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f15709a = i10;
        this.d = messagesStorage;
        this.e = obj;
        this.f15710b = z10;
        this.f15711c = z11;
    }
}
