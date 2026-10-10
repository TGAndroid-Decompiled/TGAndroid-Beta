package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f17664a;
    public final MessagesStorage.IntCallback f17665b;
    public final int[] f17666c;

    public df(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f17664a = i10;
        this.f17665b = intCallback;
        this.f17666c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17664a) {
            case 0:
                MessagesStorage.a4(this.f17665b, this.f17666c);
                return;
            default:
                MessagesStorage.w0(this.f17665b, this.f17666c);
                return;
        }
    }
}
