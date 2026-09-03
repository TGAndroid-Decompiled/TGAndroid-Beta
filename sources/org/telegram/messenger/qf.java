package org.telegram.messenger;

import java.util.ArrayList;
public final class qf implements Runnable {
    public final int f19784a;
    public final MessagesStorage f19785b;
    public final ArrayList f19786c;
    public final Runnable d;

    public qf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f19784a = i10;
        this.f19785b = messagesStorage;
        this.f19786c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19784a) {
            case 0:
                this.f19785b.lambda$loadMessageAttachPaths$235(this.f19786c, this.d);
                return;
            case 1:
                this.f19785b.lambda$processAnchoredEphemeralMessages$203(this.f19786c, this.d);
                return;
            case 2:
                this.f19785b.lambda$processEphemeralMessages$201(this.f19786c, this.d);
                return;
            case 3:
                this.f19785b.lambda$checkLoadedRemoteFilters$69(this.f19786c, this.d);
                return;
            default:
                this.f19785b.lambda$processEphemeralEditedMessages$202(this.f19786c, this.d);
                return;
        }
    }
}
