package org.telegram.messenger;

import java.util.ArrayList;
public final class lf implements Runnable {
    public final int f18483a;
    public final MessagesStorage f18484b;
    public final ArrayList f18485c;
    public final Runnable d;

    public lf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18483a = i10;
        this.f18484b = messagesStorage;
        this.f18485c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18483a) {
            case 0:
                this.f18484b.lambda$loadMessageAttachPaths$235(this.f18485c, this.d);
                return;
            case 1:
                this.f18484b.lambda$processAnchoredEphemeralMessages$203(this.f18485c, this.d);
                return;
            case 2:
                this.f18484b.lambda$processEphemeralMessages$201(this.f18485c, this.d);
                return;
            case 3:
                this.f18484b.lambda$checkLoadedRemoteFilters$69(this.f18485c, this.d);
                return;
            default:
                this.f18484b.lambda$processEphemeralEditedMessages$202(this.f18485c, this.d);
                return;
        }
    }
}
