package org.telegram.messenger;

import java.util.ArrayList;
public final class ue implements Runnable {
    public final int f18594a = 0;
    public final MessagesStorage f18595b;
    public final boolean f18596c;
    public final ArrayList d;

    public ue(MessagesStorage messagesStorage, ArrayList arrayList, boolean z4) {
        this.f18595b = messagesStorage;
        this.d = arrayList;
        this.f18596c = z4;
    }

    @Override
    public final void run() {
        switch (this.f18594a) {
            case 0:
                this.f18595b.lambda$putEphemeralMessages$204(this.d, this.f18596c);
                return;
            default:
                this.f18595b.lambda$putContacts$146(this.f18596c, this.d);
                return;
        }
    }

    public ue(MessagesStorage messagesStorage, boolean z4, ArrayList arrayList) {
        this.f18595b = messagesStorage;
        this.f18596c = z4;
        this.d = arrayList;
    }
}
