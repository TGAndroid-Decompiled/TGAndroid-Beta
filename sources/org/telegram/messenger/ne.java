package org.telegram.messenger;

import java.util.ArrayList;
public final class ne implements Runnable {
    public final int f19092a = 0;
    public final MessagesStorage f19093b;
    public final boolean f19094c;
    public final ArrayList d;

    public ne(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f19093b = messagesStorage;
        this.d = arrayList;
        this.f19094c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19092a) {
            case 0:
                this.f19093b.lambda$putEphemeralMessages$204(this.d, this.f19094c);
                return;
            default:
                this.f19093b.lambda$putContacts$146(this.f19094c, this.d);
                return;
        }
    }

    public ne(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f19093b = messagesStorage;
        this.f19094c = z10;
        this.d = arrayList;
    }
}
