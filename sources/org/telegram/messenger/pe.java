package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f19262a = 0;
    public final MessagesStorage f19263b;
    public final boolean f19264c;
    public final ArrayList d;

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f19263b = messagesStorage;
        this.d = arrayList;
        this.f19264c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19262a) {
            case 0:
                this.f19263b.lambda$putEphemeralMessages$204(this.d, this.f19264c);
                return;
            default:
                this.f19263b.lambda$putContacts$146(this.f19264c, this.d);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f19263b = messagesStorage;
        this.f19264c = z10;
        this.d = arrayList;
    }
}
