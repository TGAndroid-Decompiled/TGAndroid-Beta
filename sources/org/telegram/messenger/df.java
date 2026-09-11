package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f17485a;
    public final MessagesStorage.IntCallback f17486b;
    public final int[] f17487c;

    public df(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f17485a = i10;
        this.f17486b = intCallback;
        this.f17487c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17485a) {
            case 0:
                MessagesStorage.a4(this.f17486b, this.f17487c);
                return;
            default:
                MessagesStorage.w0(this.f17486b, this.f17487c);
                return;
        }
    }
}
