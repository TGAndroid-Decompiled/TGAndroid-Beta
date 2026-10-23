package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ff implements Runnable {
    public final int f18436a;
    public final MessagesStorage.IntCallback f18437b;
    public final int[] f18438c;

    public ff(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f18436a = i10;
        this.f18437b = intCallback;
        this.f18438c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18436a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f18437b, this.f18438c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f18437b, this.f18438c);
                return;
        }
    }
}
