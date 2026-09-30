package org.telegram.messenger;

import java.util.ArrayList;
public final class lf implements Runnable {
    public final int f16957a;
    public final MessagesStorage f16958b;
    public final ArrayList f16959c;
    public final Runnable d;

    public lf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f16957a = i10;
        this.f16958b = messagesStorage;
        this.f16959c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16957a) {
            case 0:
                this.f16958b.lambda$loadMessageAttachPaths$235(this.f16959c, this.d);
                return;
            case 1:
                this.f16958b.lambda$processAnchoredEphemeralMessages$203(this.f16959c, this.d);
                return;
            case 2:
                this.f16958b.lambda$processEphemeralMessages$201(this.f16959c, this.d);
                return;
            case 3:
                this.f16958b.lambda$checkLoadedRemoteFilters$69(this.f16959c, this.d);
                return;
            default:
                this.f16958b.lambda$processEphemeralEditedMessages$202(this.f16959c, this.d);
                return;
        }
    }
}
