package org.telegram.messenger;

import java.util.ArrayList;
public final class re implements Runnable {
    public final int f19441a = 0;
    public final MessagesStorage f19442b;
    public final boolean f19443c;
    public final ArrayList d;

    public re(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f19442b = messagesStorage;
        this.d = arrayList;
        this.f19443c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19441a) {
            case 0:
                this.f19442b.lambda$putEphemeralMessages$204(this.d, this.f19443c);
                return;
            default:
                this.f19442b.lambda$putContacts$146(this.f19443c, this.d);
                return;
        }
    }

    public re(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f19442b = messagesStorage;
        this.f19443c = z10;
        this.d = arrayList;
    }
}
