package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f15949a;
    public final MessagesStorage.IntCallback f15950b;
    public final int[] f15951c;

    public df(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f15949a = i10;
        this.f15950b = intCallback;
        this.f15951c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f15949a) {
            case 0:
                MessagesStorage.a4(this.f15950b, this.f15951c);
                return;
            default:
                MessagesStorage.w0(this.f15950b, this.f15951c);
                return;
        }
    }
}
