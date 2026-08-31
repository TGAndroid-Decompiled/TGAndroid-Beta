package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class jf implements Runnable {
    public final int f19072a;
    public final MessagesStorage.IntCallback f19073b;
    public final int[] f19074c;

    public jf(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f19072a = i10;
        this.f19073b = intCallback;
        this.f19074c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19072a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f19073b, this.f19074c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f19073b, this.f19074c);
                return;
        }
    }
}
