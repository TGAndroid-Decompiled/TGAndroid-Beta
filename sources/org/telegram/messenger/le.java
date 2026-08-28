package org.telegram.messenger;

import java.util.ArrayList;
public final class le implements Runnable {
    public final int f20890a = 0;
    public final MessagesStorage f20891b;
    public final boolean f20892c;
    public final ArrayList d;

    public le(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f20891b = messagesStorage;
        this.d = arrayList;
        this.f20892c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20890a) {
            case 0:
                this.f20891b.lambda$putEphemeralMessages$204(this.d, this.f20892c);
                return;
            default:
                this.f20891b.lambda$putContacts$146(this.f20892c, this.d);
                return;
        }
    }

    public le(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f20891b = messagesStorage;
        this.f20892c = z10;
        this.d = arrayList;
    }
}
