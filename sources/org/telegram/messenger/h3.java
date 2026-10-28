package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class h3 implements Runnable {
    public final int f20213a;
    public final boolean f20214b;
    public final boolean f20215c;
    public final Object d;
    public final Object e;

    public h3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f20213a = 0;
        this.d = anonymousClass1;
        this.f20214b = z10;
        this.e = str;
        this.f20215c = z11;
    }

    @Override
    public final void run() {
        switch (this.f20213a) {
            case 0:
                boolean z10 = this.f20215c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f20214b, (String) this.e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$77((MessagesController.DialogFilter) this.e, this.f20214b, this.f20215c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$219((ArrayList) this.e, this.f20214b, this.f20215c);
                return;
        }
    }

    public h3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f20213a = i10;
        this.d = messagesStorage;
        this.e = obj;
        this.f20214b = z10;
        this.f20215c = z11;
    }
}
