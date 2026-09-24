package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class b3 implements Runnable {
    public final int f15934a;
    public final boolean f15935b;
    public final boolean f15936c;
    public final Object d;
    public final Object e;

    public b3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f15934a = 0;
        this.d = anonymousClass1;
        this.f15935b = z10;
        this.e = str;
        this.f15936c = z11;
    }

    @Override
    public final void run() {
        switch (this.f15934a) {
            case 0:
                boolean z10 = this.f15936c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f15935b, (String) this.e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.e, this.f15935b, this.f15936c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.e, this.f15935b, this.f15936c);
                return;
        }
    }

    public b3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f15934a = i10;
        this.d = messagesStorage;
        this.e = obj;
        this.f15935b = z10;
        this.f15936c = z11;
    }
}
