package org.telegram.messenger;

import java.util.ArrayList;
public final class kf implements Runnable {
    public final int f18793a;
    public final MessagesStorage f18794b;
    public final ArrayList f18795c;
    public final Runnable d;

    public kf(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f18793a = i10;
        this.f18794b = messagesStorage;
        this.f18795c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18793a) {
            case 0:
                this.f18794b.lambda$loadMessageAttachPaths$235(this.f18795c, this.d);
                return;
            case 1:
                this.f18794b.lambda$processAnchoredEphemeralMessages$203(this.f18795c, this.d);
                return;
            case 2:
                this.f18794b.lambda$processEphemeralMessages$201(this.f18795c, this.d);
                return;
            case 3:
                this.f18794b.lambda$checkLoadedRemoteFilters$69(this.f18795c, this.d);
                return;
            default:
                this.f18794b.lambda$processEphemeralEditedMessages$202(this.f18795c, this.d);
                return;
        }
    }
}
