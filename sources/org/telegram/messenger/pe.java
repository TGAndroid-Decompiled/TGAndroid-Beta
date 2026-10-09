package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f18854a = 0;
    public final MessagesStorage f18855b;
    public final boolean f18856c;
    public final ArrayList d;

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f18855b = messagesStorage;
        this.d = arrayList;
        this.f18856c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18854a) {
            case 0:
                this.f18855b.lambda$putEphemeralMessages$204(this.d, this.f18856c);
                return;
            default:
                this.f18855b.lambda$putContacts$146(this.f18856c, this.d);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f18855b = messagesStorage;
        this.f18856c = z10;
        this.d = arrayList;
    }
}
