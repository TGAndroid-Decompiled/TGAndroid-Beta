package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
public final class jf implements Runnable {
    public final int f19074a;
    public final MessagesStorage.IntCallback f19075b;
    public final int[] f19076c;

    public jf(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f19074a = i10;
        this.f19075b = intCallback;
        this.f19076c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f19074a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f19075b, this.f19076c);
                return;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f19075b, this.f19076c);
                return;
        }
    }
}
