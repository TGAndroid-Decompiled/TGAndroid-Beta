package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class te implements Runnable {
    public final int f19107a;
    public final MessagesStorage.IntCallback f19108b;
    public final int f19109c;

    public te(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f19107a = i11;
        this.f19108b = intCallback;
        this.f19109c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19107a) {
            case 0:
                this.f19108b.run(this.f19109c);
                return;
            case 1:
                this.f19108b.run(this.f19109c);
                return;
            default:
                this.f19108b.run(this.f19109c);
                return;
        }
    }
}
