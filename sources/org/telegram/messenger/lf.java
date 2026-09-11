package org.telegram.messenger;

import java.util.ArrayList;
public final class lf implements Runnable {
    public final int f18311a;
    public final MessagesStorage f18312b;
    public final ArrayList f18313c;
    public final Runnable d;

    public lf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18311a = i10;
        this.f18312b = messagesStorage;
        this.f18313c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18311a) {
            case 0:
                this.f18312b.lambda$loadMessageAttachPaths$235(this.f18313c, this.d);
                return;
            case 1:
                this.f18312b.lambda$processAnchoredEphemeralMessages$203(this.f18313c, this.d);
                return;
            case 2:
                this.f18312b.lambda$processEphemeralMessages$201(this.f18313c, this.d);
                return;
            case 3:
                this.f18312b.lambda$checkLoadedRemoteFilters$69(this.f18313c, this.d);
                return;
            default:
                this.f18312b.lambda$processEphemeralEditedMessages$202(this.f18313c, this.d);
                return;
        }
    }
}
