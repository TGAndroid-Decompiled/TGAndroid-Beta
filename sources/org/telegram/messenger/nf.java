package org.telegram.messenger;
public final class nf implements Runnable {
    public final int f17917a;
    public final MessagesStorage f17918b;
    public final int f17919c;

    public nf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f17917a = i11;
        this.f17918b = messagesStorage;
        this.f17919c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17917a) {
            case 0:
                this.f17918b.lambda$readAllDialogs$65(this.f17919c);
                return;
            case 1:
                this.f17918b.lambda$checkIfFolderEmptyInternal$245(this.f17919c);
                return;
            case 2:
                this.f17918b.lambda$clearDownloadQueue$184(this.f17919c);
                return;
            case 3:
                this.f17918b.lambda$putMessagesInternal$196(this.f17919c);
                return;
            case 4:
                this.f17918b.lambda$getDownloadQueue$186(this.f17919c);
                return;
            case 5:
                this.f17918b.lambda$getUnsentMessages$152(this.f17919c);
                return;
            case 6:
                this.f17918b.lambda$checkIfFolderEmpty$246(this.f17919c);
                return;
            default:
                this.f17918b.lambda$clearWidgetDialogs$167(this.f17919c);
                return;
        }
    }
}
