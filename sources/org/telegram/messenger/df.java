package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f16217a;
    public final MessagesStorage.IntCallback f16218b;
    public final int[] f16219c;

    public df(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f16217a = i10;
        this.f16218b = intCallback;
        this.f16219c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f16217a) {
            case 0:
                MessagesStorage.a4(this.f16218b, this.f16219c);
                return;
            default:
                MessagesStorage.w0(this.f16218b, this.f16219c);
                return;
        }
    }
}
