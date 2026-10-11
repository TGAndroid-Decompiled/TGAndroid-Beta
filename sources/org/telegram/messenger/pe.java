package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f18895a = 0;
    public final MessagesStorage f18896b;
    public final boolean f18897c;
    public final ArrayList d;

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f18896b = messagesStorage;
        this.d = arrayList;
        this.f18897c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18895a) {
            case 0:
                this.f18896b.lambda$putEphemeralMessages$204(this.d, this.f18897c);
                return;
            default:
                this.f18896b.lambda$putContacts$146(this.f18897c, this.d);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f18896b = messagesStorage;
        this.f18897c = z10;
        this.d = arrayList;
    }
}
