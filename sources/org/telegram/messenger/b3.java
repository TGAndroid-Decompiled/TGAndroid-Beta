package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class b3 implements Runnable {
    public final int f17425a;
    public final boolean f17426b;
    public final boolean f17427c;
    public final Object d;
    public final Object f17428e;

    public b3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f17425a = 0;
        this.d = anonymousClass1;
        this.f17426b = z10;
        this.f17428e = str;
        this.f17427c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17425a) {
            case 0:
                boolean z10 = this.f17427c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f17426b, (String) this.f17428e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f17428e, this.f17426b, this.f17427c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.f17428e, this.f17426b, this.f17427c);
                return;
        }
    }

    public b3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f17425a = i10;
        this.d = messagesStorage;
        this.f17428e = obj;
        this.f17426b = z10;
        this.f17427c = z11;
    }
}
