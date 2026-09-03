package org.telegram.messenger;

import java.util.ArrayList;
public final class ue implements Runnable {
    public final int f20205a = 0;
    public final MessagesStorage f20206b;
    public final boolean f20207c;
    public final ArrayList d;

    public ue(MessagesStorage messagesStorage, ArrayList arrayList, boolean z4) {
        this.f20206b = messagesStorage;
        this.d = arrayList;
        this.f20207c = z4;
    }

    @Override
    public final void run() {
        switch (this.f20205a) {
            case 0:
                this.f20206b.lambda$putEphemeralMessages$204(this.d, this.f20207c);
                return;
            default:
                this.f20206b.lambda$putContacts$146(this.f20207c, this.d);
                return;
        }
    }

    public ue(MessagesStorage messagesStorage, boolean z4, ArrayList arrayList) {
        this.f20206b = messagesStorage;
        this.f20207c = z4;
        this.d = arrayList;
    }
}
