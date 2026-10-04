package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class b3 implements Runnable {
    public final int f17381a;
    public final boolean f17382b;
    public final boolean f17383c;
    public final Object d;
    public final Object f17384e;

    public b3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f17381a = 0;
        this.d = anonymousClass1;
        this.f17382b = z10;
        this.f17384e = str;
        this.f17383c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17381a) {
            case 0:
                boolean z10 = this.f17383c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f17382b, (String) this.f17384e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f17384e, this.f17382b, this.f17383c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.f17384e, this.f17382b, this.f17383c);
                return;
        }
    }

    public b3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f17381a = i10;
        this.d = messagesStorage;
        this.f17384e = obj;
        this.f17382b = z10;
        this.f17383c = z11;
    }
}
