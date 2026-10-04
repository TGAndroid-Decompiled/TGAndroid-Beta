package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class b3 implements Runnable {
    public final int f17386a;
    public final boolean f17387b;
    public final boolean f17388c;
    public final Object d;
    public final Object f17389e;

    public b3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f17386a = 0;
        this.d = anonymousClass1;
        this.f17387b = z10;
        this.f17389e = str;
        this.f17388c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17386a) {
            case 0:
                boolean z10 = this.f17388c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f17387b, (String) this.f17389e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f17389e, this.f17387b, this.f17388c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.f17389e, this.f17387b, this.f17388c);
                return;
        }
    }

    public b3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f17386a = i10;
        this.d = messagesStorage;
        this.f17389e = obj;
        this.f17387b = z10;
        this.f17388c = z11;
    }
}
