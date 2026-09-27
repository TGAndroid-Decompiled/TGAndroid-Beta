package org.telegram.messenger;

import java.util.ArrayList;
public final class lf implements Runnable {
    public final int f16930a;
    public final MessagesStorage f16931b;
    public final ArrayList f16932c;
    public final Runnable d;

    public lf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f16930a = i10;
        this.f16931b = messagesStorage;
        this.f16932c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16930a) {
            case 0:
                this.f16931b.lambda$loadMessageAttachPaths$235(this.f16932c, this.d);
                return;
            case 1:
                this.f16931b.lambda$processAnchoredEphemeralMessages$203(this.f16932c, this.d);
                return;
            case 2:
                this.f16931b.lambda$processEphemeralMessages$201(this.f16932c, this.d);
                return;
            case 3:
                this.f16931b.lambda$checkLoadedRemoteFilters$69(this.f16932c, this.d);
                return;
            default:
                this.f16931b.lambda$processEphemeralEditedMessages$202(this.f16932c, this.d);
                return;
        }
    }
}
