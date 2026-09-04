package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class ef implements Runnable {
    public final int f17559a;
    public final MessagesStorage.IntCallback f17560b;
    public final int[] f17561c;

    public ef(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f17559a = i10;
        this.f17560b = intCallback;
        this.f17561c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17559a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f17560b, this.f17561c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f17560b, this.f17561c);
                return;
        }
    }
}
