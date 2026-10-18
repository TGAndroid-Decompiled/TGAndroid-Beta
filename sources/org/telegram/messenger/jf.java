package org.telegram.messenger;

import java.util.ArrayList;
public final class jf implements Runnable {
    public final int f18708a;
    public final MessagesStorage f18709b;
    public final ArrayList f18710c;
    public final Runnable d;

    public jf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18708a = i10;
        this.f18709b = messagesStorage;
        this.f18710c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18708a) {
            case 0:
                this.f18709b.lambda$loadMessageAttachPaths$235(this.f18710c, this.d);
                return;
            case 1:
                this.f18709b.lambda$processAnchoredEphemeralMessages$203(this.f18710c, this.d);
                return;
            case 2:
                this.f18709b.lambda$processEphemeralMessages$201(this.f18710c, this.d);
                return;
            case 3:
                this.f18709b.lambda$checkLoadedRemoteFilters$69(this.f18710c, this.d);
                return;
            default:
                this.f18709b.lambda$processEphemeralEditedMessages$202(this.f18710c, this.d);
                return;
        }
    }
}
