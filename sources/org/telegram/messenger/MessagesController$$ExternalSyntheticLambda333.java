package org.telegram.messenger;

public final class MessagesController$$ExternalSyntheticLambda333 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final boolean f$1;

    public MessagesController$$ExternalSyntheticLambda333(int i, MessagesController messagesController, boolean z) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkPromoInfo$164(this.f$1);
                break;
            default:
                this.f$0.lambda$removeFolderTemporarily$480(this.f$1);
                break;
        }
    }
}
