package org.telegram.messenger;

import java.util.ArrayList;
public final class oe implements Runnable {
    public final int f19169a = 0;
    public final MessagesStorage f19170b;
    public final boolean f19171c;
    public final ArrayList d;

    public oe(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f19170b = messagesStorage;
        this.d = arrayList;
        this.f19171c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19169a) {
            case 0:
                this.f19170b.lambda$putEphemeralMessages$204(this.d, this.f19171c);
                return;
            default:
                this.f19170b.lambda$putContacts$146(this.f19171c, this.d);
                return;
        }
    }

    public oe(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f19170b = messagesStorage;
        this.f19171c = z10;
        this.d = arrayList;
    }
}
