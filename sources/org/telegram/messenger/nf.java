package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f17942a;
    public final MessagesStorage f17943b;
    public final int f17944c;

    public nf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f17942a = i11;
        this.f17943b = messagesStorage;
        this.f17944c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17942a) {
            case 0:
                this.f17943b.lambda$readAllDialogs$65(this.f17944c);
                return;
            case 1:
                this.f17943b.lambda$checkIfFolderEmptyInternal$245(this.f17944c);
                return;
            case 2:
                this.f17943b.lambda$clearDownloadQueue$184(this.f17944c);
                return;
            case 3:
                this.f17943b.lambda$putMessagesInternal$196(this.f17944c);
                return;
            case 4:
                this.f17943b.lambda$getDownloadQueue$186(this.f17944c);
                return;
            case 5:
                this.f17943b.lambda$getUnsentMessages$152(this.f17944c);
                return;
            case 6:
                this.f17943b.lambda$checkIfFolderEmpty$246(this.f17944c);
                return;
            default:
                this.f17943b.lambda$clearWidgetDialogs$167(this.f17944c);
                return;
        }
    }
}
