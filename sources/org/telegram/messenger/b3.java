package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class b3 implements Runnable {
    public final int f17396a;
    public final boolean f17397b;
    public final boolean f17398c;
    public final Object d;
    public final Object f17399e;

    public b3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f17396a = 0;
        this.d = anonymousClass1;
        this.f17397b = z10;
        this.f17399e = str;
        this.f17398c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17396a) {
            case 0:
                boolean z10 = this.f17398c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f17397b, (String) this.f17399e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f17399e, this.f17397b, this.f17398c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.f17399e, this.f17397b, this.f17398c);
                return;
        }
    }

    public b3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f17396a = i10;
        this.d = messagesStorage;
        this.f17399e = obj;
        this.f17397b = z10;
        this.f17398c = z11;
    }
}
