package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f20856a;
    public final MessagesStorage f20857b;
    public final int f20858c;

    public lf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f20856a = i11;
        this.f20857b = messagesStorage;
        this.f20858c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20856a) {
            case 0:
                this.f20857b.lambda$readAllDialogs$65(this.f20858c);
                return;
            case 1:
                this.f20857b.lambda$checkIfFolderEmptyInternal$245(this.f20858c);
                return;
            case 2:
                this.f20857b.lambda$clearDownloadQueue$184(this.f20858c);
                return;
            case 3:
                this.f20857b.lambda$putMessagesInternal$196(this.f20858c);
                return;
            case 4:
                this.f20857b.lambda$getDownloadQueue$186(this.f20858c);
                return;
            case 5:
                this.f20857b.lambda$getUnsentMessages$152(this.f20858c);
                return;
            case 6:
                this.f20857b.lambda$checkIfFolderEmpty$246(this.f20858c);
                return;
            default:
                this.f20857b.lambda$clearWidgetDialogs$167(this.f20858c);
                return;
        }
    }
}
