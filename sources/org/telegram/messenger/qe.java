package org.telegram.messenger;

import java.util.ArrayList;
public final class qe implements Runnable {
    public final int f17374a = 0;
    public final MessagesStorage f17375b;
    public final boolean f17376c;
    public final ArrayList d;

    public qe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f17375b = messagesStorage;
        this.d = arrayList;
        this.f17376c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17374a) {
            case 0:
                this.f17375b.lambda$putEphemeralMessages$204(this.d, this.f17376c);
                return;
            default:
                this.f17375b.lambda$putContacts$146(this.f17376c, this.d);
                return;
        }
    }

    public qe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f17375b = messagesStorage;
        this.f17376c = z10;
        this.d = arrayList;
    }
}
