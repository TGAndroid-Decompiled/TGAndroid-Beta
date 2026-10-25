package org.telegram.messenger;

import java.util.ArrayList;
public final class pg implements Runnable {
    public final int f20970a = 1;
    public final MessagesStorage f20971b;
    public final ArrayList f20972c;
    public final boolean d;

    public pg(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f20971b = messagesStorage;
        this.f20972c = arrayList;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20970a) {
            case 0:
                this.f20971b.lambda$putContacts$149(this.d, this.f20972c);
                return;
            default:
                this.f20971b.lambda$putEphemeralMessages$207(this.f20972c, this.d);
                return;
        }
    }

    public pg(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f20971b = messagesStorage;
        this.d = z10;
        this.f20972c = arrayList;
    }
}
