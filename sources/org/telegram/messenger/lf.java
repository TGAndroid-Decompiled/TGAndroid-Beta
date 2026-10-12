package org.telegram.messenger;
public final class lf implements Runnable {
    public final int f17790a;
    public final MessagesStorage f17791b;
    public final int f17792c;

    public lf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f17790a = i11;
        this.f17791b = messagesStorage;
        this.f17792c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17790a) {
            case 0:
                this.f17791b.lambda$readAllDialogs$65(this.f17792c);
                return;
            case 1:
                this.f17791b.lambda$checkIfFolderEmptyInternal$245(this.f17792c);
                return;
            case 2:
                this.f17791b.lambda$clearDownloadQueue$184(this.f17792c);
                return;
            case 3:
                this.f17791b.lambda$putMessagesInternal$196(this.f17792c);
                return;
            case 4:
                this.f17791b.lambda$getDownloadQueue$186(this.f17792c);
                return;
            case 5:
                this.f17791b.lambda$getUnsentMessages$152(this.f17792c);
                return;
            case 6:
                this.f17791b.lambda$checkIfFolderEmpty$246(this.f17792c);
                return;
            default:
                this.f17791b.lambda$clearWidgetDialogs$167(this.f17792c);
                return;
        }
    }
}
