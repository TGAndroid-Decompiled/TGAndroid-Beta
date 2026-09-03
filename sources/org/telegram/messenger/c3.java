package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class c3 implements Runnable {
    public final int f16885a;
    public final boolean f16886b;
    public final boolean f16887c;
    public final Object d;
    public final Object e;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z4, String str, boolean z10) {
        this.f16885a = 0;
        this.d = anonymousClass1;
        this.f16886b = z4;
        this.e = str;
        this.f16887c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16885a) {
            case 0:
                boolean z4 = this.f16887c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f16886b, (String) this.e, z4);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.e, this.f16886b, this.f16887c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.e, this.f16886b, this.f16887c);
                return;
        }
    }

    public c3(MessagesStorage messagesStorage, Object obj, boolean z4, boolean z10, int i10) {
        this.f16885a = i10;
        this.d = messagesStorage;
        this.e = obj;
        this.f16886b = z4;
        this.f16887c = z10;
    }
}
