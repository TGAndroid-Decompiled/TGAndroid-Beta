package org.telegram.messenger;

import java.util.ArrayList;
public final class lf implements Runnable {
    public final int f18890a;
    public final MessagesStorage f18891b;
    public final ArrayList f18892c;
    public final Runnable d;

    public lf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18890a = i10;
        this.f18891b = messagesStorage;
        this.f18892c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18890a) {
            case 0:
                this.f18891b.lambda$loadMessageAttachPaths$235(this.f18892c, this.d);
                return;
            case 1:
                this.f18891b.lambda$processAnchoredEphemeralMessages$203(this.f18892c, this.d);
                return;
            case 2:
                this.f18891b.lambda$processEphemeralMessages$201(this.f18892c, this.d);
                return;
            case 3:
                this.f18891b.lambda$checkLoadedRemoteFilters$69(this.f18892c, this.d);
                return;
            default:
                this.f18891b.lambda$processEphemeralEditedMessages$202(this.f18892c, this.d);
                return;
        }
    }
}
