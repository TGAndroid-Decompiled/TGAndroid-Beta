package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f17660a;
    public final MessagesStorage.IntCallback f17661b;
    public final int[] f17662c;

    public df(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f17660a = i10;
        this.f17661b = intCallback;
        this.f17662c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17660a) {
            case 0:
                MessagesStorage.a4(this.f17661b, this.f17662c);
                return;
            default:
                MessagesStorage.w0(this.f17661b, this.f17662c);
                return;
        }
    }
}
