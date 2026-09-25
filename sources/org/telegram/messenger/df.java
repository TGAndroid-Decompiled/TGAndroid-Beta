package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f16210a;
    public final MessagesStorage.IntCallback f16211b;
    public final int[] f16212c;

    public df(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f16210a = i10;
        this.f16211b = intCallback;
        this.f16212c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f16210a) {
            case 0:
                MessagesStorage.a4(this.f16211b, this.f16212c);
                return;
            default:
                MessagesStorage.w0(this.f16211b, this.f16212c);
                return;
        }
    }
}
