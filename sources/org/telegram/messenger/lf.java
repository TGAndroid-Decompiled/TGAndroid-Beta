package org.telegram.messenger;

import java.util.ArrayList;
public final class lf implements Runnable {
    public final int f18488a;
    public final MessagesStorage f18489b;
    public final ArrayList f18490c;
    public final Runnable d;

    public lf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18488a = i10;
        this.f18489b = messagesStorage;
        this.f18490c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18488a) {
            case 0:
                this.f18489b.lambda$loadMessageAttachPaths$235(this.f18490c, this.d);
                return;
            case 1:
                this.f18489b.lambda$processAnchoredEphemeralMessages$203(this.f18490c, this.d);
                return;
            case 2:
                this.f18489b.lambda$processEphemeralMessages$201(this.f18490c, this.d);
                return;
            case 3:
                this.f18489b.lambda$checkLoadedRemoteFilters$69(this.f18490c, this.d);
                return;
            default:
                this.f18489b.lambda$processEphemeralEditedMessages$202(this.f18490c, this.d);
                return;
        }
    }
}
