package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f17889a;
    public final MessagesStorage f17890b;
    public final int f17891c;

    public hf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f17889a = i11;
        this.f17890b = messagesStorage;
        this.f17891c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17889a) {
            case 0:
                this.f17890b.lambda$readAllDialogs$65(this.f17891c);
                return;
            case 1:
                this.f17890b.lambda$checkIfFolderEmptyInternal$245(this.f17891c);
                return;
            case 2:
                this.f17890b.lambda$clearDownloadQueue$184(this.f17891c);
                return;
            case 3:
                this.f17890b.lambda$putMessagesInternal$196(this.f17891c);
                return;
            case 4:
                this.f17890b.lambda$getDownloadQueue$186(this.f17891c);
                return;
            case 5:
                this.f17890b.lambda$getUnsentMessages$152(this.f17891c);
                return;
            case 6:
                this.f17890b.lambda$checkIfFolderEmpty$246(this.f17891c);
                return;
            default:
                this.f17890b.lambda$clearWidgetDialogs$167(this.f17891c);
                return;
        }
    }
}
