package org.telegram.messenger;

import java.util.ArrayList;
public final class qe implements Runnable {
    public final int f17148a = 0;
    public final MessagesStorage f17149b;
    public final boolean f17150c;
    public final ArrayList d;

    public qe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f17149b = messagesStorage;
        this.d = arrayList;
        this.f17150c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17148a) {
            case 0:
                this.f17149b.lambda$putEphemeralMessages$204(this.d, this.f17150c);
                return;
            default:
                this.f17149b.lambda$putContacts$146(this.f17150c, this.d);
                return;
        }
    }

    public qe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f17149b = messagesStorage;
        this.f17150c = z10;
        this.d = arrayList;
    }
}
