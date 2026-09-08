package org.telegram.messenger;

import java.util.ArrayList;
public final class qe implements Runnable {
    public final int f18829a = 0;
    public final MessagesStorage f18830b;
    public final boolean f18831c;
    public final ArrayList d;

    public qe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f18830b = messagesStorage;
        this.d = arrayList;
        this.f18831c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18829a) {
            case 0:
                this.f18830b.lambda$putEphemeralMessages$204(this.d, this.f18831c);
                return;
            default:
                this.f18830b.lambda$putContacts$146(this.f18831c, this.d);
                return;
        }
    }

    public qe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f18830b = messagesStorage;
        this.f18831c = z10;
        this.d = arrayList;
    }
}
