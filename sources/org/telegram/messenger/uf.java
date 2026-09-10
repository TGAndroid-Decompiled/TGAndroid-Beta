package org.telegram.messenger;

import java.util.ArrayList;
public final class uf implements Runnable {
    public final int f16512a;
    public final MessagesStorage f16513b;
    public final ArrayList f16514c;
    public final Runnable d;

    public uf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f16512a = i10;
        this.f16513b = messagesStorage;
        this.f16514c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16512a) {
            case 0:
                this.f16513b.lambda$loadMessageAttachPaths$235(this.f16514c, this.d);
                return;
            case 1:
                this.f16513b.lambda$processAnchoredEphemeralMessages$203(this.f16514c, this.d);
                return;
            case 2:
                this.f16513b.lambda$processEphemeralMessages$201(this.f16514c, this.d);
                return;
            case 3:
                this.f16513b.lambda$checkLoadedRemoteFilters$69(this.f16514c, this.d);
                return;
            default:
                this.f16513b.lambda$processEphemeralEditedMessages$202(this.f16514c, this.d);
                return;
        }
    }
}
