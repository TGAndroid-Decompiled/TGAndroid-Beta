package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class b3 implements Runnable {
    public final int f17223a;
    public final boolean f17224b;
    public final boolean f17225c;
    public final Object d;
    public final Object f17226e;

    public b3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f17223a = 0;
        this.d = anonymousClass1;
        this.f17224b = z10;
        this.f17226e = str;
        this.f17225c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17223a) {
            case 0:
                boolean z10 = this.f17225c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f17224b, (String) this.f17226e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f17226e, this.f17224b, this.f17225c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.f17226e, this.f17224b, this.f17225c);
                return;
        }
    }

    public b3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f17223a = i10;
        this.d = messagesStorage;
        this.f17226e = obj;
        this.f17224b = z10;
        this.f17225c = z11;
    }
}
