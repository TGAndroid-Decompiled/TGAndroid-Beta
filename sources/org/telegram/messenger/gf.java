package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class gf implements Runnable {
    public final int f20350a;
    public final MessagesStorage.IntCallback f20351b;
    public final int[] f20352c;

    public gf(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f20350a = i10;
        this.f20351b = intCallback;
        this.f20352c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f20350a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f20351b, this.f20352c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f20351b, this.f20352c);
                return;
        }
    }
}
