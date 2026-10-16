package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class e3 implements Runnable {
    public final int f16829a;
    public final boolean f16830b;
    public final boolean f16831c;
    public final Object d;
    public final Object e;

    public e3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f16829a = 0;
        this.d = anonymousClass1;
        this.f16830b = z10;
        this.e = str;
        this.f16831c = z11;
    }

    @Override
    public final void run() {
        switch (this.f16829a) {
            case 0:
                boolean z10 = this.f16831c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f16830b, (String) this.e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.e, this.f16830b, this.f16831c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.e, this.f16830b, this.f16831c);
                return;
        }
    }

    public e3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f16829a = i10;
        this.d = messagesStorage;
        this.e = obj;
        this.f16830b = z10;
        this.f16831c = z11;
    }
}
