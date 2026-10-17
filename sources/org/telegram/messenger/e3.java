package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class e3 implements Runnable {
    public final int f18228a;
    public final boolean f18229b;
    public final boolean f18230c;
    public final Object d;
    public final Object e;

    public e3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f18228a = 0;
        this.d = anonymousClass1;
        this.f18229b = z10;
        this.e = str;
        this.f18230c = z11;
    }

    @Override
    public final void run() {
        switch (this.f18228a) {
            case 0:
                boolean z10 = this.f18230c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f18229b, (String) this.e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.e, this.f18229b, this.f18230c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.e, this.f18229b, this.f18230c);
                return;
        }
    }

    public e3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f18228a = i10;
        this.d = messagesStorage;
        this.e = obj;
        this.f18229b = z10;
        this.f18230c = z11;
    }
}
