package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessagesController;
public final class b3 implements Runnable {
    public final int f17219a;
    public final boolean f17220b;
    public final boolean f17221c;
    public final Object d;
    public final Object f17222e;

    public b3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f17219a = 0;
        this.d = anonymousClass1;
        this.f17220b = z10;
        this.f17222e = str;
        this.f17221c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17219a) {
            case 0:
                boolean z10 = this.f17221c;
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f17220b, (String) this.f17222e, z10);
                return;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f17222e, this.f17220b, this.f17221c);
                return;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.f17222e, this.f17220b, this.f17221c);
                return;
        }
    }

    public b3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f17219a = i10;
        this.d = messagesStorage;
        this.f17222e = obj;
        this.f17220b = z10;
        this.f17221c = z11;
    }
}
