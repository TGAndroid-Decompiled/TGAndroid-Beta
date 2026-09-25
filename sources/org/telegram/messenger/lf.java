package org.telegram.messenger;

import java.util.ArrayList;
public final class lf implements Runnable {
    public final int f16936a;
    public final MessagesStorage f16937b;
    public final ArrayList f16938c;
    public final Runnable d;

    public lf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f16936a = i10;
        this.f16937b = messagesStorage;
        this.f16938c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16936a) {
            case 0:
                this.f16937b.lambda$loadMessageAttachPaths$235(this.f16938c, this.d);
                return;
            case 1:
                this.f16937b.lambda$processAnchoredEphemeralMessages$203(this.f16938c, this.d);
                return;
            case 2:
                this.f16937b.lambda$processEphemeralMessages$201(this.f16938c, this.d);
                return;
            case 3:
                this.f16937b.lambda$checkLoadedRemoteFilters$69(this.f16938c, this.d);
                return;
            default:
                this.f16937b.lambda$processEphemeralEditedMessages$202(this.f16938c, this.d);
                return;
        }
    }
}
