package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class b3 implements Runnable {
    public final int f19766a;
    public final boolean f19767b;
    public final boolean f19768c;
    public final Object d;
    public final Object f19769e;

    public b3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f19766a = 0;
        this.d = anonymousClass1;
        this.f19767b = z10;
        this.f19769e = str;
        this.f19768c = z11;
    }

    @Override
    public final void run() {
        switch (this.f19766a) {
            case 0:
                boolean z10 = this.f19768c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f19767b, (String) this.f19769e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f19769e, this.f19767b, this.f19768c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.f19769e, this.f19767b, this.f19768c);
                return;
        }
    }

    public b3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f19766a = i10;
        this.d = messagesStorage;
        this.f19769e = obj;
        this.f19767b = z10;
        this.f19768c = z11;
    }
}
