package org.telegram.messenger;

import java.util.ArrayList;
public final class lf implements Runnable {
    public final int f18338a;
    public final MessagesStorage f18339b;
    public final ArrayList f18340c;
    public final Runnable d;

    public lf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18338a = i10;
        this.f18339b = messagesStorage;
        this.f18340c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18338a) {
            case 0:
                this.f18339b.lambda$loadMessageAttachPaths$235(this.f18340c, this.d);
                return;
            case 1:
                this.f18339b.lambda$processAnchoredEphemeralMessages$203(this.f18340c, this.d);
                return;
            case 2:
                this.f18339b.lambda$processEphemeralMessages$201(this.f18340c, this.d);
                return;
            case 3:
                this.f18339b.lambda$checkLoadedRemoteFilters$69(this.f18340c, this.d);
                return;
            default:
                this.f18339b.lambda$processEphemeralEditedMessages$202(this.f18340c, this.d);
                return;
        }
    }
}
