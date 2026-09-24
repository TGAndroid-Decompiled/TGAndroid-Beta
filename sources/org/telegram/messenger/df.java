package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f16195a;
    public final MessagesStorage.IntCallback f16196b;
    public final int[] f16197c;

    public df(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f16195a = i10;
        this.f16196b = intCallback;
        this.f16197c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f16195a) {
            case 0:
                MessagesStorage.a4(this.f16196b, this.f16197c);
                return;
            default:
                MessagesStorage.w0(this.f16196b, this.f16197c);
                return;
        }
    }
}
