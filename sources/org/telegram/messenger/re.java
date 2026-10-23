package org.telegram.messenger;

import java.util.ArrayList;
public final class re implements Runnable {
    public final int f19510a = 0;
    public final MessagesStorage f19511b;
    public final boolean f19512c;
    public final ArrayList d;

    public re(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f19511b = messagesStorage;
        this.d = arrayList;
        this.f19512c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19510a) {
            case 0:
                this.f19511b.lambda$putEphemeralMessages$204(this.d, this.f19512c);
                return;
            default:
                this.f19511b.lambda$putContacts$146(this.f19512c, this.d);
                return;
        }
    }

    public re(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f19511b = messagesStorage;
        this.f19512c = z10;
        this.d = arrayList;
    }
}
