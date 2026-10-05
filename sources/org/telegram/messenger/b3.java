package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class b3 implements Runnable {
    public final int f17391a;
    public final boolean f17392b;
    public final boolean f17393c;
    public final Object d;
    public final Object f17394e;

    public b3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f17391a = 0;
        this.d = anonymousClass1;
        this.f17392b = z10;
        this.f17394e = str;
        this.f17393c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17391a) {
            case 0:
                boolean z10 = this.f17393c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f17392b, (String) this.f17394e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f17394e, this.f17392b, this.f17393c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.f17394e, this.f17392b, this.f17393c);
                return;
        }
    }

    public b3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f17391a = i10;
        this.d = messagesStorage;
        this.f17394e = obj;
        this.f17392b = z10;
        this.f17393c = z11;
    }
}
