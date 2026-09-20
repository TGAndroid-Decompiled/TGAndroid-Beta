package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class b3 implements Runnable {
    public final int f15932a;
    public final boolean f15933b;
    public final boolean f15934c;
    public final Object d;
    public final Object e;

    public b3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f15932a = 0;
        this.d = anonymousClass1;
        this.f15933b = z10;
        this.e = str;
        this.f15934c = z11;
    }

    @Override
    public final void run() {
        switch (this.f15932a) {
            case 0:
                boolean z10 = this.f15934c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f15933b, (String) this.e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.e, this.f15933b, this.f15934c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.e, this.f15933b, this.f15934c);
                return;
        }
    }

    public b3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f15932a = i10;
        this.d = messagesStorage;
        this.e = obj;
        this.f15933b = z10;
        this.f15934c = z11;
    }
}
