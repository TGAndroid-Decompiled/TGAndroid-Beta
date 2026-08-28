package org.telegram.messenger;
public final class df implements Runnable {
    public final int f20097a;
    public final MessagesStorage f20098b;
    public final int f20099c;

    public df(MessagesStorage messagesStorage, int i9, int i10) {
        this.f20097a = i10;
        this.f20098b = messagesStorage;
        this.f20099c = i9;
    }

    @Override
    public final void run() {
        switch (this.f20097a) {
            case 0:
                this.f20098b.lambda$readAllDialogs$65(this.f20099c);
                return;
            case 1:
                this.f20098b.lambda$checkIfFolderEmptyInternal$245(this.f20099c);
                return;
            case 2:
                this.f20098b.lambda$clearDownloadQueue$184(this.f20099c);
                return;
            case 3:
                this.f20098b.lambda$putMessagesInternal$196(this.f20099c);
                return;
            case 4:
                this.f20098b.lambda$getDownloadQueue$186(this.f20099c);
                return;
            case 5:
                this.f20098b.lambda$getUnsentMessages$152(this.f20099c);
                return;
            case 6:
                this.f20098b.lambda$checkIfFolderEmpty$246(this.f20099c);
                return;
            default:
                this.f20098b.lambda$clearWidgetDialogs$167(this.f20099c);
                return;
        }
    }
}
