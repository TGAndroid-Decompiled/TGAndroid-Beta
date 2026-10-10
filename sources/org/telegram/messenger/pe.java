package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f18858a = 0;
    public final MessagesStorage f18859b;
    public final boolean f18860c;
    public final ArrayList d;

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f18859b = messagesStorage;
        this.d = arrayList;
        this.f18860c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18858a) {
            case 0:
                this.f18859b.lambda$putEphemeralMessages$204(this.d, this.f18860c);
                return;
            default:
                this.f18859b.lambda$putContacts$146(this.f18860c, this.d);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f18859b = messagesStorage;
        this.f18860c = z10;
        this.d = arrayList;
    }
}
