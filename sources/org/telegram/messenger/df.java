package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f17683a;
    public final MessagesStorage.IntCallback f17684b;
    public final int[] f17685c;

    public df(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f17683a = i10;
        this.f17684b = intCallback;
        this.f17685c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17683a) {
            case 0:
                MessagesStorage.a4(this.f17684b, this.f17685c);
                return;
            default:
                MessagesStorage.w0(this.f17684b, this.f17685c);
                return;
        }
    }
}
