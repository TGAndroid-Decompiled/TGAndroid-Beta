package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class c3 implements Runnable {
    public final int f18318a;
    public final boolean f18319b;
    public final boolean f18320c;
    public final Object d;
    public final Object f18321e;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z4, String str, boolean z10) {
        this.f18318a = 0;
        this.d = anonymousClass1;
        this.f18319b = z4;
        this.f18321e = str;
        this.f18320c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18318a) {
            case 0:
                boolean z4 = this.f18320c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f18319b, (String) this.f18321e, z4);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f18321e, this.f18319b, this.f18320c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.f18321e, this.f18319b, this.f18320c);
                return;
        }
    }

    public c3(MessagesStorage messagesStorage, Object obj, boolean z4, boolean z10, int i10) {
        this.f18318a = i10;
        this.d = messagesStorage;
        this.f18321e = obj;
        this.f18319b = z4;
        this.f18320c = z10;
    }
}
