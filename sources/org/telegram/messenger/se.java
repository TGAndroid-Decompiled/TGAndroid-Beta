package org.telegram.messenger;

import java.util.ArrayList;
public final class se implements Runnable {
    public final int f18112a = 0;
    public final MessagesStorage f18113b;
    public final boolean f18114c;
    public final ArrayList d;

    public se(MessagesStorage messagesStorage, ArrayList arrayList, boolean z10) {
        this.f18113b = messagesStorage;
        this.d = arrayList;
        this.f18114c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18112a) {
            case 0:
                this.f18113b.lambda$putEphemeralMessages$204(this.d, this.f18114c);
                return;
            default:
                this.f18113b.lambda$putContacts$146(this.f18114c, this.d);
                return;
        }
    }

    public se(MessagesStorage messagesStorage, boolean z10, ArrayList arrayList) {
        this.f18113b = messagesStorage;
        this.f18114c = z10;
        this.d = arrayList;
    }
}
