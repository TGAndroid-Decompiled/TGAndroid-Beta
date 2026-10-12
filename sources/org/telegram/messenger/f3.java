package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class f3 implements Runnable {
    public final int f17565a;
    public final boolean f17566b;
    public final boolean f17567c;
    public final Object d;
    public final Object f17568e;

    public f3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f17565a = 0;
        this.d = anonymousClass1;
        this.f17566b = z10;
        this.f17568e = str;
        this.f17567c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17565a) {
            case 0:
                boolean z10 = this.f17567c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f17566b, (String) this.f17568e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f17568e, this.f17566b, this.f17567c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.f17568e, this.f17566b, this.f17567c);
                return;
        }
    }

    public f3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f17565a = i10;
        this.d = messagesStorage;
        this.f17568e = obj;
        this.f17566b = z10;
        this.f17567c = z11;
    }
}
