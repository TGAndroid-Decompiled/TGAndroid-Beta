package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ig implements Runnable {
    public final int f20354a;
    public final MessagesStorage.IntCallback f20355b;
    public final int[] f20356c;

    public ig(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f20354a = i10;
        this.f20355b = intCallback;
        this.f20356c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f20354a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$258(this.f20355b, this.f20356c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$55(this.f20355b, this.f20356c);
                return;
        }
    }
}
