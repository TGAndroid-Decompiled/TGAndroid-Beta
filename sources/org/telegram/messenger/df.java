package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class df implements Runnable {
    public final int f18191a;
    public final MessagesStorage.IntCallback f18192b;
    public final int[] f18193c;

    public df(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f18191a = i10;
        this.f18192b = intCallback;
        this.f18193c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18191a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f18192b, this.f18193c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f18192b, this.f18193c);
                return;
        }
    }
}
