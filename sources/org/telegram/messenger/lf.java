package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f17493a;
    public final MessagesStorage f17494b;
    public final int f17495c;

    public lf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f17493a = i11;
        this.f17494b = messagesStorage;
        this.f17495c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17493a) {
            case 0:
                this.f17494b.lambda$readAllDialogs$65(this.f17495c);
                return;
            case 1:
                this.f17494b.lambda$checkIfFolderEmptyInternal$245(this.f17495c);
                return;
            case 2:
                this.f17494b.lambda$clearDownloadQueue$184(this.f17495c);
                return;
            case 3:
                this.f17494b.lambda$putMessagesInternal$196(this.f17495c);
                return;
            case 4:
                this.f17494b.lambda$getDownloadQueue$186(this.f17495c);
                return;
            case 5:
                this.f17494b.lambda$getUnsentMessages$152(this.f17495c);
                return;
            case 6:
                this.f17494b.lambda$checkIfFolderEmpty$246(this.f17495c);
                return;
            default:
                this.f17494b.lambda$clearWidgetDialogs$167(this.f17495c);
                return;
        }
    }
}
