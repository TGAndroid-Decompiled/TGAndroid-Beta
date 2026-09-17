package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f18749a = 0;
    public final MessagesStorage f18750b;
    public final boolean f18751c;
    public final ArrayList d;

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f18750b = messagesStorage;
        this.d = arrayList;
        this.f18751c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18749a) {
            case 0:
                this.f18750b.lambda$putEphemeralMessages$204(this.d, this.f18751c);
                return;
            default:
                this.f18750b.lambda$putContacts$146(this.f18751c, this.d);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f18750b = messagesStorage;
        this.f18751c = z10;
        this.d = arrayList;
    }
}
