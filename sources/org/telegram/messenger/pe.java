package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f17306a = 0;
    public final MessagesStorage f17307b;
    public final boolean f17308c;
    public final ArrayList d;

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f17307b = messagesStorage;
        this.d = arrayList;
        this.f17308c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17306a) {
            case 0:
                this.f17307b.lambda$putEphemeralMessages$204(this.d, this.f17308c);
                return;
            default:
                this.f17307b.lambda$putContacts$146(this.f17308c, this.d);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f17307b = messagesStorage;
        this.f17308c = z10;
        this.d = arrayList;
    }
}
