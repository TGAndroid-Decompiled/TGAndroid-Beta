package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class b3 implements Runnable {
    public final int f17246a;
    public final boolean f17247b;
    public final boolean f17248c;
    public final Object d;
    public final Object f17249e;

    public b3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f17246a = 0;
        this.d = anonymousClass1;
        this.f17247b = z10;
        this.f17249e = str;
        this.f17248c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17246a) {
            case 0:
                boolean z10 = this.f17248c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f17247b, (String) this.f17249e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f17249e, this.f17247b, this.f17248c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.f17249e, this.f17247b, this.f17248c);
                return;
        }
    }

    public b3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f17246a = i10;
        this.d = messagesStorage;
        this.f17249e = obj;
        this.f17247b = z10;
        this.f17248c = z11;
    }
}
