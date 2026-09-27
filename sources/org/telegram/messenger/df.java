package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f16204a;
    public final MessagesStorage.IntCallback f16205b;
    public final int[] f16206c;

    public df(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f16204a = i10;
        this.f16205b = intCallback;
        this.f16206c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f16204a) {
            case 0:
                MessagesStorage.a4(this.f16205b, this.f16206c);
                return;
            default:
                MessagesStorage.w0(this.f16205b, this.f16206c);
                return;
        }
    }
}
