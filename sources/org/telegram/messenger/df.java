package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f17679a;
    public final MessagesStorage.IntCallback f17680b;
    public final int[] f17681c;

    public df(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f17679a = i10;
        this.f17680b = intCallback;
        this.f17681c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17679a) {
            case 0:
                MessagesStorage.a4(this.f17680b, this.f17681c);
                return;
            default:
                MessagesStorage.w0(this.f17680b, this.f17681c);
                return;
        }
    }
}
