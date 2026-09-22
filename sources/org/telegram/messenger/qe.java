package org.telegram.messenger;

import java.util.ArrayList;
public final class qe implements Runnable {
    public final int f17389a = 0;
    public final MessagesStorage f17390b;
    public final boolean f17391c;
    public final ArrayList d;

    public qe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f17390b = messagesStorage;
        this.d = arrayList;
        this.f17391c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17389a) {
            case 0:
                this.f17390b.lambda$putEphemeralMessages$204(this.d, this.f17391c);
                return;
            default:
                this.f17390b.lambda$putContacts$146(this.f17391c, this.d);
                return;
        }
    }

    public qe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f17390b = messagesStorage;
        this.f17391c = z10;
        this.d = arrayList;
    }
}
