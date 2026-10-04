package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f18896a = 0;
    public final MessagesStorage f18897b;
    public final boolean f18898c;
    public final ArrayList d;

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f18897b = messagesStorage;
        this.d = arrayList;
        this.f18898c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18896a) {
            case 0:
                this.f18897b.lambda$putEphemeralMessages$204(this.d, this.f18898c);
                return;
            default:
                this.f18897b.lambda$putContacts$146(this.f18898c, this.d);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f18897b = messagesStorage;
        this.f18898c = z10;
        this.d = arrayList;
    }
}
