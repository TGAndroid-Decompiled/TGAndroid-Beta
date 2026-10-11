package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f17696a;
    public final MessagesStorage.IntCallback f17697b;
    public final int[] f17698c;

    public df(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f17696a = i10;
        this.f17697b = intCallback;
        this.f17698c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17696a) {
            case 0:
                MessagesStorage.a4(this.f17697b, this.f17698c);
                return;
            default:
                MessagesStorage.w0(this.f17697b, this.f17698c);
                return;
        }
    }
}
