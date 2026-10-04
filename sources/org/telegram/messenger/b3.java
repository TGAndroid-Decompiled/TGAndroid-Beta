package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class b3 implements Runnable {
    public final int f17380a;
    public final boolean f17381b;
    public final boolean f17382c;
    public final Object d;
    public final Object f17383e;

    public b3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f17380a = 0;
        this.d = anonymousClass1;
        this.f17381b = z10;
        this.f17383e = str;
        this.f17382c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17380a) {
            case 0:
                boolean z10 = this.f17382c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f17381b, (String) this.f17383e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f17383e, this.f17381b, this.f17382c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.f17383e, this.f17381b, this.f17382c);
                return;
        }
    }

    public b3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f17380a = i10;
        this.d = messagesStorage;
        this.f17383e = obj;
        this.f17381b = z10;
        this.f17382c = z11;
    }
}
