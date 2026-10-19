package org.telegram.messenger;

import java.util.ArrayList;
public final class ne implements Runnable {
    public final int f19093a = 0;
    public final MessagesStorage f19094b;
    public final boolean f19095c;
    public final ArrayList d;

    public ne(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f19094b = messagesStorage;
        this.d = arrayList;
        this.f19095c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19093a) {
            case 0:
                this.f19094b.lambda$putEphemeralMessages$204(this.d, this.f19095c);
                return;
            default:
                this.f19094b.lambda$putContacts$146(this.f19095c, this.d);
                return;
        }
    }

    public ne(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f19094b = messagesStorage;
        this.f19095c = z10;
        this.d = arrayList;
    }
}
