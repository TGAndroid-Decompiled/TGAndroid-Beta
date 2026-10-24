package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class gf implements Runnable {
    public final int f18508a;
    public final MessagesStorage.IntCallback f18509b;
    public final int[] f18510c;

    public gf(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f18508a = i10;
        this.f18509b = intCallback;
        this.f18510c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f18508a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f18509b, this.f18510c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f18509b, this.f18510c);
                return;
        }
    }
}
