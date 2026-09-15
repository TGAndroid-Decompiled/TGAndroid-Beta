package org.telegram.messenger;

import java.util.ArrayList;
public final class qe implements Runnable {
    public final int f17152a = 0;
    public final MessagesStorage f17153b;
    public final boolean f17154c;
    public final ArrayList d;

    public qe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f17153b = messagesStorage;
        this.d = arrayList;
        this.f17154c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17152a) {
            case 0:
                this.f17153b.lambda$putEphemeralMessages$204(this.d, this.f17154c);
                return;
            default:
                this.f17153b.lambda$putContacts$146(this.f17154c, this.d);
                return;
        }
    }

    public qe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f17153b = messagesStorage;
        this.f17154c = z10;
        this.d = arrayList;
    }
}
