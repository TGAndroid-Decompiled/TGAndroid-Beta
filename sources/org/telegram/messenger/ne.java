package org.telegram.messenger;

import java.util.ArrayList;
public final class ne implements Runnable {
    public final int f19096a = 0;
    public final MessagesStorage f19097b;
    public final boolean f19098c;
    public final ArrayList d;

    public ne(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f19097b = messagesStorage;
        this.d = arrayList;
        this.f19098c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19096a) {
            case 0:
                this.f19097b.lambda$putEphemeralMessages$204(this.d, this.f19098c);
                return;
            default:
                this.f19097b.lambda$putContacts$146(this.f19098c, this.d);
                return;
        }
    }

    public ne(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f19097b = messagesStorage;
        this.f19098c = z10;
        this.d = arrayList;
    }
}
