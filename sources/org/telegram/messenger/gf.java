package org.telegram.messenger;
public final class gf implements Runnable {
    public final int f18457a;
    public final MessagesStorage f18458b;
    public final int f18459c;

    public gf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18457a = i11;
        this.f18458b = messagesStorage;
        this.f18459c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18457a) {
            case 0:
                this.f18458b.lambda$readAllDialogs$65(this.f18459c);
                return;
            case 1:
                this.f18458b.lambda$checkIfFolderEmptyInternal$245(this.f18459c);
                return;
            case 2:
                this.f18458b.lambda$clearDownloadQueue$184(this.f18459c);
                return;
            case 3:
                this.f18458b.lambda$putMessagesInternal$196(this.f18459c);
                return;
            case 4:
                this.f18458b.lambda$getDownloadQueue$186(this.f18459c);
                return;
            case 5:
                this.f18458b.lambda$getUnsentMessages$152(this.f18459c);
                return;
            case 6:
                this.f18458b.lambda$checkIfFolderEmpty$246(this.f18459c);
                return;
            default:
                this.f18458b.lambda$clearWidgetDialogs$167(this.f18459c);
                return;
        }
    }
}
