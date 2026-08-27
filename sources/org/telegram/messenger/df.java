package org.telegram.messenger;

public final class df implements Runnable {

    public final int f20055a;

    public final MessagesStorage.IntCallback f20056b;

    public final int[] f20057c;

    public df(MessagesStorage.IntCallback intCallback, int[] iArr, int i10) {
        this.f20055a = i10;
        this.f20056b = intCallback;
        this.f20057c = iArr;
    }

    @Override
    public final void run() {
        switch (this.f20055a) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f20056b, this.f20057c);
                break;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f20056b, this.f20057c);
                break;
        }
    }
}
