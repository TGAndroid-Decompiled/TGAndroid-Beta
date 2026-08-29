package org.telegram.messenger;

import java.util.ArrayList;
public final class of implements Runnable {
    public final int f21179a;
    public final MessagesStorage f21180b;
    public final ArrayList f21181c;
    public final Runnable d;

    public of(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f21179a = i10;
        this.f21180b = messagesStorage;
        this.f21181c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21179a) {
            case 0:
                this.f21180b.lambda$loadMessageAttachPaths$235(this.f21181c, this.d);
                return;
            case 1:
                this.f21180b.lambda$processAnchoredEphemeralMessages$203(this.f21181c, this.d);
                return;
            case 2:
                this.f21180b.lambda$processEphemeralMessages$201(this.f21181c, this.d);
                return;
            case 3:
                this.f21180b.lambda$checkLoadedRemoteFilters$69(this.f21181c, this.d);
                return;
            default:
                this.f21180b.lambda$processEphemeralEditedMessages$202(this.f21181c, this.d);
                return;
        }
    }
}
