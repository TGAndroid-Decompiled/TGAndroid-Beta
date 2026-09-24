package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f17288a = 0;
    public final MessagesStorage f17289b;
    public final boolean f17290c;
    public final ArrayList d;

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f17289b = messagesStorage;
        this.d = arrayList;
        this.f17290c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17288a) {
            case 0:
                this.f17289b.lambda$putEphemeralMessages$204(this.d, this.f17290c);
                return;
            default:
                this.f17289b.lambda$putContacts$146(this.f17290c, this.d);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f17289b = messagesStorage;
        this.f17290c = z10;
        this.d = arrayList;
    }
}
