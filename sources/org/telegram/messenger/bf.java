package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class bf implements Runnable {
    public final int f17968a;
    public final MessagesStorage.IntCallback f17969b;
    public final int[] f17970c;

    public bf(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f17968a = i10;
        this.f17969b = intCallback;
        this.f17970c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17968a) {
            case 0:
                MessagesStorage.a4(this.f17969b, this.f17970c);
                return;
            default:
                MessagesStorage.w0(this.f17969b, this.f17970c);
                return;
        }
    }
}
