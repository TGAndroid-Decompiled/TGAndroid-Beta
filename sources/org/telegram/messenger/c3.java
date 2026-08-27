package org.telegram.messenger;

import java.util.ArrayList;

public final class c3 implements Runnable {

    public final int f19874a;

    public final boolean f19875b;

    public final boolean f19876c;
    public final Object d;

    public final Object f19877e;

    public c3(FileLoader.AnonymousClass1 anonymousClass1, boolean z10, String str, boolean z11) {
        this.f19874a = 0;
        this.d = anonymousClass1;
        this.f19875b = z10;
        this.f19877e = str;
        this.f19876c = z11;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f19874a) {
            case 0:
                ((FileLoader.AnonymousClass1) this.d).lambda$didFailedUploadingFile$1(this.f19875b, (String) this.f19877e, this.f19876c);
                break;
            case 1:
                ((MessagesStorage) this.d).lambda$saveDialogFilter$74((MessagesController.DialogFilter) this.f19877e, this.f19875b, this.f19876c);
                break;
            default:
                ((MessagesStorage) this.d).lambda$updateUsers$215((ArrayList) this.f19877e, this.f19875b, this.f19876c);
                break;
        }
    }

    public c3(MessagesStorage messagesStorage, Object obj, boolean z10, boolean z11, int i10) {
        this.f19874a = i10;
        this.d = messagesStorage;
        this.f19877e = obj;
        this.f19875b = z10;
        this.f19876c = z11;
    }
}
