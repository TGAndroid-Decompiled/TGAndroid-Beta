package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f18900a = 0;
    public final MessagesStorage f18901b;
    public final boolean f18902c;
    public final ArrayList d;

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f18901b = messagesStorage;
        this.d = arrayList;
        this.f18902c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18900a) {
            case 0:
                this.f18901b.lambda$putEphemeralMessages$204(this.d, this.f18902c);
                return;
            default:
                this.f18901b.lambda$putContacts$146(this.f18902c, this.d);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f18901b = messagesStorage;
        this.f18902c = z10;
        this.d = arrayList;
    }
}
