package org.telegram.messenger;

import java.util.ArrayList;
public final class qe implements Runnable {
    public final int f18802a = 0;
    public final MessagesStorage f18803b;
    public final boolean f18804c;
    public final ArrayList d;

    public qe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f18803b = messagesStorage;
        this.d = arrayList;
        this.f18804c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18802a) {
            case 0:
                this.f18803b.lambda$putEphemeralMessages$204(this.d, this.f18804c);
                return;
            default:
                this.f18803b.lambda$putContacts$146(this.f18804c, this.d);
                return;
        }
    }

    public qe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f18803b = messagesStorage;
        this.f18804c = z10;
        this.d = arrayList;
    }
}
