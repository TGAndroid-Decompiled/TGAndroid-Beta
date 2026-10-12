package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ve implements Runnable {
    public final int f19208a;
    public final MessagesStorage.IntCallback f19209b;
    public final int f19210c;

    public ve(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19208a = i11;
        this.f19209b = intCallback;
        this.f19210c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19208a) {
            case 0:
                this.f19209b.run(this.f19210c);
                return;
            case 1:
                this.f19209b.run(this.f19210c);
                return;
            default:
                this.f19209b.run(this.f19210c);
                return;
        }
    }
}
