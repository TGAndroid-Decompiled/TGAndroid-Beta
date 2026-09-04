package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class b3 implements Runnable {
    public final int f17196a;
    public final boolean f17197b;
    public final boolean f17198c;
    public final Object d;
    public final Object f17199e;

    public b3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f17196a = 0;
        this.d = anonymousClass1;
        this.f17197b = z10;
        this.f17199e = str;
        this.f17198c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17196a) {
            case 0:
                boolean z10 = this.f17198c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f17197b, (String) this.f17199e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f17199e, this.f17197b, this.f17198c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.f17199e, this.f17197b, this.f17198c);
                return;
        }
    }

    public b3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f17196a = i10;
        this.d = messagesStorage;
        this.f17199e = obj;
        this.f17197b = z10;
        this.f17198c = z11;
    }
}
