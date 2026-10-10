package org.telegram.messenger;

import java.util.ArrayList;
public final class lf implements Runnable {
    public final int f18444a;
    public final MessagesStorage f18445b;
    public final ArrayList f18446c;
    public final Runnable d;

    public lf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18444a = i10;
        this.f18445b = messagesStorage;
        this.f18446c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18444a) {
            case 0:
                this.f18445b.lambda$loadMessageAttachPaths$235(this.f18446c, this.d);
                return;
            case 1:
                this.f18445b.lambda$processAnchoredEphemeralMessages$203(this.f18446c, this.d);
                return;
            case 2:
                this.f18445b.lambda$processEphemeralMessages$201(this.f18446c, this.d);
                return;
            case 3:
                this.f18445b.lambda$checkLoadedRemoteFilters$69(this.f18446c, this.d);
                return;
            default:
                this.f18445b.lambda$processEphemeralEditedMessages$202(this.f18446c, this.d);
                return;
        }
    }
}
