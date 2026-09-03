package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class c3 implements Runnable {
    public final int f18320a;
    public final boolean f18321b;
    public final boolean f18322c;
    public final Object d;
    public final Object f18323e;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z4, String str, boolean z10) {
        this.f18320a = 0;
        this.d = anonymousClass1;
        this.f18321b = z4;
        this.f18323e = str;
        this.f18322c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18320a) {
            case 0:
                boolean z4 = this.f18322c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f18321b, (String) this.f18323e, z4);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f18323e, this.f18321b, this.f18322c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.f18323e, this.f18321b, this.f18322c);
                return;
        }
    }

    public c3(MessagesStorage messagesStorage, Object obj, boolean z4, boolean z10, int i10) {
        this.f18320a = i10;
        this.d = messagesStorage;
        this.f18323e = obj;
        this.f18321b = z4;
        this.f18322c = z10;
    }
}
