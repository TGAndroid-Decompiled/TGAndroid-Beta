package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f17323a = 0;
    public final MessagesStorage f17324b;
    public final boolean f17325c;
    public final ArrayList d;

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f17324b = messagesStorage;
        this.d = arrayList;
        this.f17325c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17323a) {
            case 0:
                this.f17324b.lambda$putEphemeralMessages$204(this.d, this.f17325c);
                return;
            default:
                this.f17324b.lambda$putContacts$146(this.f17325c, this.d);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f17324b = messagesStorage;
        this.f17325c = z10;
        this.d = arrayList;
    }
}
