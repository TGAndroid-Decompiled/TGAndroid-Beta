package org.telegram.messenger;

import java.util.ArrayList;
public final class of implements Runnable {
    public final int f20868a;
    public final MessagesStorage f20869b;
    public final ArrayList f20870c;
    public final Runnable d;

    public of(MessagesStorage messagesStorage, ArrayList arrayList, Runnable runnable, int i10) {
        this.f20868a = i10;
        this.f20869b = messagesStorage;
        this.f20870c = arrayList;
        this.d = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20868a) {
            case 0:
                this.f20869b.lambda$loadMessageAttachPaths$239(this.f20870c, this.d);
                return;
            case 1:
                this.f20869b.lambda$processAnchoredEphemeralMessages$207(this.f20870c, this.d);
                return;
            case 2:
                this.f20869b.lambda$processEphemeralMessages$205(this.f20870c, this.d);
                return;
            case 3:
                this.f20869b.lambda$checkLoadedRemoteFilters$72(this.f20870c, this.d);
                return;
            default:
                this.f20869b.lambda$processEphemeralEditedMessages$206(this.f20870c, this.d);
                return;
        }
    }
}
