package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f16218a;
    public final MessagesStorage.IntCallback f16219b;
    public final int[] f16220c;

    public df(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f16218a = i10;
        this.f16219b = intCallback;
        this.f16220c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f16218a) {
            case 0:
                MessagesStorage.a4(this.f16219b, this.f16220c);
                return;
            default:
                MessagesStorage.w0(this.f16219b, this.f16220c);
                return;
        }
    }
}
