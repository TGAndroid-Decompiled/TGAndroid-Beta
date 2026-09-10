package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class bf implements Runnable {
    public final int f14795a;
    public final MessagesStorage.IntCallback f14796b;
    public final int f14797c;

    public bf(MessagesStorage.IntCallback intCallback, int i10, int i11) {
        this.f14795a = i11;
        this.f14796b = intCallback;
        this.f14797c = i10;
    }

    @Override
    public final void run() {
        switch (this.f14795a) {
            case 0:
                MessagesStorage.U1(this.f14796b, this.f14797c);
                return;
            case 1:
                MessagesStorage.m2(this.f14796b, this.f14797c);
                return;
            default:
                MessagesStorage.X(this.f14796b, this.f14797c);
                return;
        }
    }
}
