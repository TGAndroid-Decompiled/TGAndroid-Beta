package org.telegram.messenger;

import java.util.ArrayList;
public final class lf implements Runnable {
    public final int f18440a;
    public final MessagesStorage f18441b;
    public final ArrayList f18442c;
    public final Runnable d;

    public lf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18440a = i10;
        this.f18441b = messagesStorage;
        this.f18442c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18440a) {
            case 0:
                this.f18441b.lambda$loadMessageAttachPaths$235(this.f18442c, this.d);
                return;
            case 1:
                this.f18441b.lambda$processAnchoredEphemeralMessages$203(this.f18442c, this.d);
                return;
            case 2:
                this.f18441b.lambda$processEphemeralMessages$201(this.f18442c, this.d);
                return;
            case 3:
                this.f18441b.lambda$checkLoadedRemoteFilters$69(this.f18442c, this.d);
                return;
            default:
                this.f18441b.lambda$processEphemeralEditedMessages$202(this.f18442c, this.d);
                return;
        }
    }
}
