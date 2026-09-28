package org.telegram.messenger;

import java.util.ArrayList;
public final class lf implements Runnable {
    public final int f16940a;
    public final MessagesStorage f16941b;
    public final ArrayList f16942c;
    public final Runnable d;

    public lf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f16940a = i10;
        this.f16941b = messagesStorage;
        this.f16942c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16940a) {
            case 0:
                this.f16941b.lambda$loadMessageAttachPaths$235(this.f16942c, this.d);
                return;
            case 1:
                this.f16941b.lambda$processAnchoredEphemeralMessages$203(this.f16942c, this.d);
                return;
            case 2:
                this.f16941b.lambda$processEphemeralMessages$201(this.f16942c, this.d);
                return;
            case 3:
                this.f16941b.lambda$checkLoadedRemoteFilters$69(this.f16942c, this.d);
                return;
            default:
                this.f16941b.lambda$processEphemeralEditedMessages$202(this.f16942c, this.d);
                return;
        }
    }
}
