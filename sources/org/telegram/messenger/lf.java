package org.telegram.messenger;

import java.util.ArrayList;
public final class lf implements Runnable {
    public final int f18481a;
    public final MessagesStorage f18482b;
    public final ArrayList f18483c;
    public final Runnable d;

    public lf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18481a = i10;
        this.f18482b = messagesStorage;
        this.f18483c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18481a) {
            case 0:
                this.f18482b.lambda$loadMessageAttachPaths$235(this.f18483c, this.d);
                return;
            case 1:
                this.f18482b.lambda$processAnchoredEphemeralMessages$203(this.f18483c, this.d);
                return;
            case 2:
                this.f18482b.lambda$processEphemeralMessages$201(this.f18483c, this.d);
                return;
            case 3:
                this.f18482b.lambda$checkLoadedRemoteFilters$69(this.f18483c, this.d);
                return;
            default:
                this.f18482b.lambda$processEphemeralEditedMessages$202(this.f18483c, this.d);
                return;
        }
    }
}
