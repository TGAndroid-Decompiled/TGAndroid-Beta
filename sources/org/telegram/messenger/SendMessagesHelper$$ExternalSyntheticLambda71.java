package org.telegram.messenger;

public final class SendMessagesHelper$$ExternalSyntheticLambda71 implements Runnable {
    public final int $r8$classId;
    public final Runnable f$0;

    public SendMessagesHelper$$ExternalSyntheticLambda71(int i, Runnable runnable) {
        this.$r8$classId = i;
        this.f$0 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(this.f$0);
                break;
            case 1:
                MessagesController.lambda$unblockPeer$110(this.f$0);
                break;
            default:
                this.f$0.run();
                break;
        }
    }
}
