package org.telegram.messenger;

import java.util.ArrayList;
public final class qe implements Runnable {
    public final int f17329a = 0;
    public final MessagesStorage f17330b;
    public final boolean f17331c;
    public final ArrayList d;

    public qe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f17330b = messagesStorage;
        this.d = arrayList;
        this.f17331c = z10;
    }

    @Override
    public final void run() {
        switch (this.f17329a) {
            case 0:
                this.f17330b.lambda$putEphemeralMessages$204(this.d, this.f17331c);
                return;
            default:
                this.f17330b.lambda$putContacts$146(this.f17331c, this.d);
                return;
        }
    }

    public qe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f17330b = messagesStorage;
        this.f17331c = z10;
        this.d = arrayList;
    }
}
