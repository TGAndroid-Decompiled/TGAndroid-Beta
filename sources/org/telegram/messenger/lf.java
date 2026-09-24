package org.telegram.messenger;

import java.util.ArrayList;
public final class lf implements Runnable {
    public final int f16921a;
    public final MessagesStorage f16922b;
    public final ArrayList f16923c;
    public final Runnable d;

    public lf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f16921a = i10;
        this.f16922b = messagesStorage;
        this.f16923c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16921a) {
            case 0:
                this.f16922b.lambda$loadMessageAttachPaths$235(this.f16923c, this.d);
                return;
            case 1:
                this.f16922b.lambda$processAnchoredEphemeralMessages$203(this.f16923c, this.d);
                return;
            case 2:
                this.f16922b.lambda$processEphemeralMessages$201(this.f16923c, this.d);
                return;
            case 3:
                this.f16922b.lambda$checkLoadedRemoteFilters$69(this.f16923c, this.d);
                return;
            default:
                this.f16922b.lambda$processEphemeralEditedMessages$202(this.f16923c, this.d);
                return;
        }
    }
}
