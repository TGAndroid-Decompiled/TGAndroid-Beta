package org.telegram.messenger;

public final class MessagesStorage$$ExternalSyntheticLambda150 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final int f$1;

    public MessagesStorage$$ExternalSyntheticLambda150(MessagesStorage messagesStorage, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = messagesStorage;
        this.f$1 = i;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$readAllDialogs$65(this.f$1);
                break;
            case 1:
                this.f$0.lambda$checkIfFolderEmptyInternal$245(this.f$1);
                break;
            case 2:
                this.f$0.lambda$clearDownloadQueue$184(this.f$1);
                break;
            case 3:
                this.f$0.lambda$putMessagesInternal$196(this.f$1);
                break;
            case 4:
                this.f$0.lambda$getDownloadQueue$186(this.f$1);
                break;
            case 5:
                this.f$0.lambda$getUnsentMessages$152(this.f$1);
                break;
            case 6:
                this.f$0.lambda$checkIfFolderEmpty$246(this.f$1);
                break;
            default:
                this.f$0.lambda$clearWidgetDialogs$167(this.f$1);
                break;
        }
    }
}
