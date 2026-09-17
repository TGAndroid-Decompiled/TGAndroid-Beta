package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f17512a;
    public final MessagesStorage.IntCallback f17513b;
    public final int[] f17514c;

    public df(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f17512a = i10;
        this.f17513b = intCallback;
        this.f17514c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17512a) {
            case 0:
                MessagesStorage.a4(this.f17513b, this.f17514c);
                return;
            default:
                MessagesStorage.w0(this.f17513b, this.f17514c);
                return;
        }
    }
}
