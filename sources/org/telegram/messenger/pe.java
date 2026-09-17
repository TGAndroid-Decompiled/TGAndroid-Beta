package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f18722a = 0;
    public final MessagesStorage f18723b;
    public final boolean f18724c;
    public final ArrayList d;

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f18723b = messagesStorage;
        this.d = arrayList;
        this.f18724c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18722a) {
            case 0:
                this.f18723b.lambda$putEphemeralMessages$204(this.d, this.f18724c);
                return;
            default:
                this.f18723b.lambda$putContacts$146(this.f18724c, this.d);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f18723b = messagesStorage;
        this.f18724c = z10;
        this.d = arrayList;
    }
}
