package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class a3 implements Runnable {
    public final int f19686a;
    public final boolean f19687b;
    public final boolean f19688c;
    public final Object d;
    public final Object f19689e;

    public a3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f19686a = 0;
        this.d = anonymousClass1;
        this.f19687b = z10;
        this.f19689e = str;
        this.f19688c = z11;
    }

    @Override
    public final void run() {
        switch (this.f19686a) {
            case 0:
                boolean z10 = this.f19688c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f19687b, (String) this.f19689e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f19689e, this.f19687b, this.f19688c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.f19689e, this.f19687b, this.f19688c);
                return;
        }
    }

    public a3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i9) {
        this.f19686a = i9;
        this.d = messagesStorage;
        this.f19689e = obj;
        this.f19687b = z10;
        this.f19688c = z11;
    }
}
