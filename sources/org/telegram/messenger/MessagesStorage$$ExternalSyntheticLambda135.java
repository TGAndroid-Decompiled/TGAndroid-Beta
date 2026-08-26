package org.telegram.messenger;

public final class MessagesStorage$$ExternalSyntheticLambda135 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage.IntCallback f$0;
    public final int[] f$1;

    public MessagesStorage$$ExternalSyntheticLambda135(MessagesStorage.IntCallback intCallback, int[] iArr, int i) {
        this.$r8$classId = i;
        this.f$0 = intCallback;
        this.f$1 = iArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                MessagesStorage.lambda$getDialogMaxMessageId$254(this.f$0, this.f$1);
                break;
            default:
                MessagesStorage.lambda$getSavedDialogMaxMessageId$52(this.f$0, this.f$1);
                break;
        }
    }
}
