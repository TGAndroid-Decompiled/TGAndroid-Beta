package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f18859a = 0;
    public final MessagesStorage f18860b;
    public final boolean f18861c;
    public final ArrayList d;

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f18860b = messagesStorage;
        this.d = arrayList;
        this.f18861c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18859a) {
            case 0:
                this.f18860b.lambda$putEphemeralMessages$204(this.d, this.f18861c);
                return;
            default:
                this.f18860b.lambda$putContacts$146(this.f18861c, this.d);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f18860b = messagesStorage;
        this.f18861c = z10;
        this.d = arrayList;
    }
}
