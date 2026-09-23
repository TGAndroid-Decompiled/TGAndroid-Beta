package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f16300a;
    public final MessagesStorage f16301b;
    public final int f16302c;

    public hf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f16300a = i11;
        this.f16301b = messagesStorage;
        this.f16302c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16300a) {
            case 0:
                this.f16301b.lambda$readAllDialogs$65(this.f16302c);
                return;
            case 1:
                this.f16301b.lambda$checkIfFolderEmptyInternal$245(this.f16302c);
                return;
            case 2:
                this.f16301b.lambda$clearDownloadQueue$184(this.f16302c);
                return;
            case 3:
                this.f16301b.lambda$putMessagesInternal$196(this.f16302c);
                return;
            case 4:
                this.f16301b.lambda$getDownloadQueue$186(this.f16302c);
                return;
            case 5:
                this.f16301b.lambda$getUnsentMessages$152(this.f16302c);
                return;
            case 6:
                this.f16301b.lambda$checkIfFolderEmpty$246(this.f16302c);
                return;
            default:
                this.f16301b.lambda$clearWidgetDialogs$167(this.f16302c);
                return;
        }
    }
}
