package org.telegram.messenger;

import java.util.ArrayList;
public final class mf implements Runnable {
    public final int f16958a;
    public final MessagesStorage f16959b;
    public final ArrayList f16960c;
    public final Runnable d;

    public mf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f16958a = i10;
        this.f16959b = messagesStorage;
        this.f16960c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16958a) {
            case 0:
                this.f16959b.lambda$loadMessageAttachPaths$235(this.f16960c, this.d);
                return;
            case 1:
                this.f16959b.lambda$processAnchoredEphemeralMessages$203(this.f16960c, this.d);
                return;
            case 2:
                this.f16959b.lambda$processEphemeralMessages$201(this.f16960c, this.d);
                return;
            case 3:
                this.f16959b.lambda$checkLoadedRemoteFilters$69(this.f16960c, this.d);
                return;
            default:
                this.f16959b.lambda$processEphemeralEditedMessages$202(this.f16960c, this.d);
                return;
        }
    }
}
