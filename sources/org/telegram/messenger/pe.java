package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f17300a = 0;
    public final MessagesStorage f17301b;
    public final boolean f17302c;
    public final ArrayList d;

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f17301b = messagesStorage;
        this.d = arrayList;
        this.f17302c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17300a) {
            case 0:
                this.f17301b.lambda$putEphemeralMessages$204(this.d, this.f17302c);
                return;
            default:
                this.f17301b.lambda$putContacts$146(this.f17302c, this.d);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f17301b = messagesStorage;
        this.f17302c = z10;
        this.d = arrayList;
    }
}
