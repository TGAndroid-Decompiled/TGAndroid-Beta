package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class cf implements Runnable {
    public final int f18093a;
    public final MessagesStorage.IntCallback f18094b;
    public final int[] f18095c;

    public cf(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f18093a = i10;
        this.f18094b = intCallback;
        this.f18095c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18093a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f18094b, this.f18095c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f18094b, this.f18095c);
                return;
        }
    }
}
