package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f17307a = 0;
    public final MessagesStorage f17308b;
    public final boolean f17309c;
    public final ArrayList d;

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f17308b = messagesStorage;
        this.d = arrayList;
        this.f17309c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17307a) {
            case 0:
                this.f17308b.lambda$putEphemeralMessages$204(this.d, this.f17309c);
                return;
            default:
                this.f17308b.lambda$putContacts$146(this.f17309c, this.d);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f17308b = messagesStorage;
        this.f17309c = z10;
        this.d = arrayList;
    }
}
