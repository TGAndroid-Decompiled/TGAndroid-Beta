package org.telegram.messenger;

import java.util.ArrayList;
public final class qf implements Runnable {
    public final int f19782a;
    public final MessagesStorage f19783b;
    public final ArrayList f19784c;
    public final Runnable d;

    public qf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f19782a = i10;
        this.f19783b = messagesStorage;
        this.f19784c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19782a) {
            case 0:
                this.f19783b.lambda$loadMessageAttachPaths$235(this.f19784c, this.d);
                return;
            case 1:
                this.f19783b.lambda$processAnchoredEphemeralMessages$203(this.f19784c, this.d);
                return;
            case 2:
                this.f19783b.lambda$processEphemeralMessages$201(this.f19784c, this.d);
                return;
            case 3:
                this.f19783b.lambda$checkLoadedRemoteFilters$69(this.f19784c, this.d);
                return;
            default:
                this.f19783b.lambda$processEphemeralEditedMessages$202(this.f19784c, this.d);
                return;
        }
    }
}
