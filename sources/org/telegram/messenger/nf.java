package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class nf implements Runnable {
    public final int f15886a;
    public final MessagesStorage.IntCallback f15887b;
    public final int[] f15888c;

    public nf(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f15886a = i10;
        this.f15887b = intCallback;
        this.f15888c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f15886a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f15887b, this.f15888c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f15887b, this.f15888c);
                return;
        }
    }
}
