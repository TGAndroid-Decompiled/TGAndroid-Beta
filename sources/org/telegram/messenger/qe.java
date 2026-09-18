package org.telegram.messenger;

import java.util.ArrayList;
public final class qe implements Runnable {
    public final int f17161a = 0;
    public final MessagesStorage f17162b;
    public final boolean f17163c;
    public final ArrayList d;

    public qe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f17162b = messagesStorage;
        this.d = arrayList;
        this.f17163c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17161a) {
            case 0:
                this.f17162b.lambda$putEphemeralMessages$204(this.d, this.f17163c);
                return;
            default:
                this.f17162b.lambda$putContacts$146(this.f17163c, this.d);
                return;
        }
    }

    public qe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f17162b = messagesStorage;
        this.f17163c = z10;
        this.d = arrayList;
    }
}
