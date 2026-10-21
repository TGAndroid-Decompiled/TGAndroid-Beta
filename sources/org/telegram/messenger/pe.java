package org.telegram.messenger;

import java.util.ArrayList;
public final class pe implements Runnable {
    public final int f19259a = 0;
    public final MessagesStorage f19260b;
    public final boolean f19261c;
    public final ArrayList d;

    public pe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f19260b = messagesStorage;
        this.d = arrayList;
        this.f19261c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19259a) {
            case 0:
                this.f19260b.lambda$putEphemeralMessages$204(this.d, this.f19261c);
                return;
            default:
                this.f19260b.lambda$putContacts$146(this.f19261c, this.d);
                return;
        }
    }

    public pe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f19260b = messagesStorage;
        this.f19261c = z10;
        this.d = arrayList;
    }
}
