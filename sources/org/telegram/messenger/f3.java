package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class f3 implements Runnable {
    public final int f17564a;
    public final boolean f17565b;
    public final boolean f17566c;
    public final Object d;
    public final Object f17567e;

    public f3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f17564a = 0;
        this.d = anonymousClass1;
        this.f17565b = z10;
        this.f17567e = str;
        this.f17566c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17564a) {
            case 0:
                boolean z10 = this.f17566c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f17565b, (String) this.f17567e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f17567e, this.f17565b, this.f17566c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.f17567e, this.f17565b, this.f17566c);
                return;
        }
    }

    public f3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f17564a = i10;
        this.d = messagesStorage;
        this.f17567e = obj;
        this.f17565b = z10;
        this.f17566c = z11;
    }
}
