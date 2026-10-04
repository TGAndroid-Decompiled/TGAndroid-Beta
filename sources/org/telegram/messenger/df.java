package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f17678a;
    public final MessagesStorage.IntCallback f17679b;
    public final int[] f17680c;

    public df(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f17678a = i10;
        this.f17679b = intCallback;
        this.f17680c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17678a) {
            case 0:
                MessagesStorage.a4(this.f17679b, this.f17680c);
                return;
            default:
                MessagesStorage.w0(this.f17679b, this.f17680c);
                return;
        }
    }
}
