package org.telegram.messenger;

public final class MessagesController$DialogPhotos$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final MessagesController.DialogPhotos f$0;

    public MessagesController$DialogPhotos$$ExternalSyntheticLambda1(MessagesController.DialogPhotos dialogPhotos, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogPhotos;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadCache$5();
                break;
            default:
                this.f$0.lambda$saveCache$6();
                break;
        }
    }
}
