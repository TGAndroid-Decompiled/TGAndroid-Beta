package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class b3 implements Runnable {
    public final int f17389a;
    public final boolean f17390b;
    public final boolean f17391c;
    public final Object d;
    public final Object f17392e;

    public b3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f17389a = 0;
        this.d = anonymousClass1;
        this.f17390b = z10;
        this.f17392e = str;
        this.f17391c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17389a) {
            case 0:
                boolean z10 = this.f17391c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f17390b, (String) this.f17392e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f17392e, this.f17390b, this.f17391c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.f17392e, this.f17390b, this.f17391c);
                return;
        }
    }

    public b3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f17389a = i10;
        this.d = messagesStorage;
        this.f17392e = obj;
        this.f17390b = z10;
        this.f17391c = z11;
    }
}
