package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class jf implements Runnable {
    public final int f17584a;
    public final MessagesStorage.IntCallback f17585b;
    public final int[] f17586c;

    public jf(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f17584a = i10;
        this.f17585b = intCallback;
        this.f17586c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f17584a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f17585b, this.f17586c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f17585b, this.f17586c);
                return;
        }
    }
}
