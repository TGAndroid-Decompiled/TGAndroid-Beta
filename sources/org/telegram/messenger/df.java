package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f16234a;
    public final MessagesStorage.IntCallback f16235b;
    public final int[] f16236c;

    public df(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f16234a = i10;
        this.f16235b = intCallback;
        this.f16236c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f16234a) {
            case 0:
                MessagesStorage.a4(this.f16235b, this.f16236c);
                return;
            default:
                MessagesStorage.w0(this.f16235b, this.f16236c);
                return;
        }
    }
}
