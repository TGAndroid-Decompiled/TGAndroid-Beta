package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class gf implements Runnable {
    public final int f18442a;
    public final MessagesStorage.IntCallback f18443b;
    public final int[] f18444c;

    public gf(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f18442a = i10;
        this.f18443b = intCallback;
        this.f18444c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18442a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f18443b, this.f18444c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f18443b, this.f18444c);
                return;
        }
    }
}
