package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f17303a = 0;
    public final MessagesStorage f17304b;
    public final boolean f17305c;
    public final ArrayList d;

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f17304b = messagesStorage;
        this.d = arrayList;
        this.f17305c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17303a) {
            case 0:
                this.f17304b.lambda$putEphemeralMessages$204(this.d, this.f17305c);
                return;
            default:
                this.f17304b.lambda$putContacts$146(this.f17305c, this.d);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f17304b = messagesStorage;
        this.f17305c = z10;
        this.d = arrayList;
    }
}
