package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class bf implements Runnable {
    public final int f17965a;
    public final MessagesStorage.IntCallback f17966b;
    public final int[] f17967c;

    public bf(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f17965a = i10;
        this.f17966b = intCallback;
        this.f17967c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17965a) {
            case 0:
                MessagesStorage.a4(this.f17966b, this.f17967c);
                return;
            default:
                MessagesStorage.w0(this.f17966b, this.f17967c);
                return;
        }
    }
}
