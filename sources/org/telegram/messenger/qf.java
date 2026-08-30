package org.telegram.messenger;

import java.util.ArrayList;
public final class qf implements Runnable {
    public final int f18221a;
    public final MessagesStorage f18222b;
    public final ArrayList f18223c;
    public final Runnable d;

    public qf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18221a = i10;
        this.f18222b = messagesStorage;
        this.f18223c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18221a) {
            case 0:
                this.f18222b.lambda$loadMessageAttachPaths$235(this.f18223c, this.d);
                return;
            case 1:
                this.f18222b.lambda$processAnchoredEphemeralMessages$203(this.f18223c, this.d);
                return;
            case 2:
                this.f18222b.lambda$processEphemeralMessages$201(this.f18223c, this.d);
                return;
            case 3:
                this.f18222b.lambda$checkLoadedRemoteFilters$69(this.f18223c, this.d);
                return;
            default:
                this.f18222b.lambda$processEphemeralEditedMessages$202(this.f18223c, this.d);
                return;
        }
    }
}
