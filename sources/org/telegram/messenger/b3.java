package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class b3 implements Runnable {
    public final int f17392a;
    public final boolean f17393b;
    public final boolean f17394c;
    public final Object d;
    public final Object f17395e;

    public b3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f17392a = 0;
        this.d = anonymousClass1;
        this.f17393b = z10;
        this.f17395e = str;
        this.f17394c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17392a) {
            case 0:
                boolean z10 = this.f17394c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f17393b, (String) this.f17395e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f17395e, this.f17393b, this.f17394c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.f17395e, this.f17393b, this.f17394c);
                return;
        }
    }

    public b3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f17392a = i10;
        this.d = messagesStorage;
        this.f17395e = obj;
        this.f17393b = z10;
        this.f17394c = z11;
    }
}
