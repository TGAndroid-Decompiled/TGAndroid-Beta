package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class gf implements Runnable {
    public final int f17695a;
    public final MessagesStorage.IntCallback f17696b;
    public final int[] f17697c;

    public gf(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f17695a = i10;
        this.f17696b = intCallback;
        this.f17697c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17695a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f17696b, this.f17697c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f17696b, this.f17697c);
                return;
        }
    }
}
