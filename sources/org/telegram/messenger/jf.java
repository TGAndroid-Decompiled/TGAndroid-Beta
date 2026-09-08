package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f18095a;
    public final MessagesStorage f18096b;
    public final int f18097c;

    public jf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18095a = i11;
        this.f18096b = messagesStorage;
        this.f18097c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18095a) {
            case 0:
                this.f18096b.lambda$readAllDialogs$65(this.f18097c);
                return;
            case 1:
                this.f18096b.lambda$checkIfFolderEmptyInternal$245(this.f18097c);
                return;
            case 2:
                this.f18096b.lambda$clearDownloadQueue$184(this.f18097c);
                return;
            case 3:
                this.f18096b.lambda$putMessagesInternal$196(this.f18097c);
                return;
            case 4:
                this.f18096b.lambda$getDownloadQueue$186(this.f18097c);
                return;
            case 5:
                this.f18096b.lambda$getUnsentMessages$152(this.f18097c);
                return;
            case 6:
                this.f18096b.lambda$checkIfFolderEmpty$246(this.f18097c);
                return;
            default:
                this.f18096b.lambda$clearWidgetDialogs$167(this.f18097c);
                return;
        }
    }
}
