package org.telegram.messenger;

import java.util.ArrayList;
public final class lf implements Runnable {
    public final int f16941a;
    public final MessagesStorage f16942b;
    public final ArrayList f16943c;
    public final Runnable d;

    public lf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f16941a = i10;
        this.f16942b = messagesStorage;
        this.f16943c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16941a) {
            case 0:
                this.f16942b.lambda$loadMessageAttachPaths$235(this.f16943c, this.d);
                return;
            case 1:
                this.f16942b.lambda$processAnchoredEphemeralMessages$203(this.f16943c, this.d);
                return;
            case 2:
                this.f16942b.lambda$processEphemeralMessages$201(this.f16943c, this.d);
                return;
            case 3:
                this.f16942b.lambda$checkLoadedRemoteFilters$69(this.f16943c, this.d);
                return;
            default:
                this.f16942b.lambda$processEphemeralEditedMessages$202(this.f16943c, this.d);
                return;
        }
    }
}
