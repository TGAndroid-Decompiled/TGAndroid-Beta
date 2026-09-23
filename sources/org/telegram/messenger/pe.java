package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f17050a = 0;
    public final MessagesStorage f17051b;
    public final boolean f17052c;
    public final ArrayList d;

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f17051b = messagesStorage;
        this.d = arrayList;
        this.f17052c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17050a) {
            case 0:
                this.f17051b.lambda$putEphemeralMessages$204(this.d, this.f17052c);
                return;
            default:
                this.f17051b.lambda$putContacts$146(this.f17052c, this.d);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f17051b = messagesStorage;
        this.f17052c = z10;
        this.d = arrayList;
    }
}
