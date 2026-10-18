package org.telegram.messenger;
public final class gf implements Runnable {
    public final int f18454a;
    public final MessagesStorage f18455b;
    public final int f18456c;

    public gf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18454a = i11;
        this.f18455b = messagesStorage;
        this.f18456c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18454a) {
            case 0:
                this.f18455b.lambda$readAllDialogs$65(this.f18456c);
                return;
            case 1:
                this.f18455b.lambda$checkIfFolderEmptyInternal$245(this.f18456c);
                return;
            case 2:
                this.f18455b.lambda$clearDownloadQueue$184(this.f18456c);
                return;
            case 3:
                this.f18455b.lambda$putMessagesInternal$196(this.f18456c);
                return;
            case 4:
                this.f18455b.lambda$getDownloadQueue$186(this.f18456c);
                return;
            case 5:
                this.f18455b.lambda$getUnsentMessages$152(this.f18456c);
                return;
            case 6:
                this.f18455b.lambda$checkIfFolderEmpty$246(this.f18456c);
                return;
            default:
                this.f18455b.lambda$clearWidgetDialogs$167(this.f18456c);
                return;
        }
    }
}
