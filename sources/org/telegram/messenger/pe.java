package org.telegram.messenger;

import java.util.ArrayList;

public final class pe implements Runnable {

    public final int f21269a = 0;

    public final MessagesStorage f21270b;

    public final boolean f21271c;
    public final ArrayList d;

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f21270b = messagesStorage;
        this.d = arrayList;
        this.f21271c = z10;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f21269a) {
            case 0:
                this.f21270b.lambda$putEphemeralMessages$204(this.d, this.f21271c);
                break;
            default:
                this.f21270b.lambda$putContacts$146(this.f21271c, this.d);
                break;
        }
    }

    public pe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f21270b = messagesStorage;
        this.f21271c = z10;
        this.d = arrayList;
    }
}
