package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class gf implements Runnable {
    public final int f17025a;
    public final MessagesStorage.IntCallback f17026b;
    public final int[] f17027c;

    public gf(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f17025a = i10;
        this.f17026b = intCallback;
        this.f17027c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17025a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f17026b, this.f17027c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f17026b, this.f17027c);
                return;
        }
    }
}
