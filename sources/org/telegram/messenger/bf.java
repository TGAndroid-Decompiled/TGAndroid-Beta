package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class bf implements Runnable {
    public final int f17952a;
    public final MessagesStorage.IntCallback f17953b;
    public final int[] f17954c;

    public bf(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f17952a = i10;
        this.f17953b = intCallback;
        this.f17954c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17952a) {
            case 0:
                MessagesStorage.a4(this.f17953b, this.f17954c);
                return;
            default:
                MessagesStorage.w0(this.f17953b, this.f17954c);
                return;
        }
    }
}
