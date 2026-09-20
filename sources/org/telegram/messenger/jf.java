package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f16721a;
    public final MessagesStorage f16722b;
    public final int f16723c;

    public jf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f16721a = i11;
        this.f16722b = messagesStorage;
        this.f16723c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16721a) {
            case 0:
                this.f16722b.lambda$readAllDialogs$65(this.f16723c);
                return;
            case 1:
                this.f16722b.lambda$checkIfFolderEmptyInternal$245(this.f16723c);
                return;
            case 2:
                this.f16722b.lambda$clearDownloadQueue$184(this.f16723c);
                return;
            case 3:
                this.f16722b.lambda$putMessagesInternal$196(this.f16723c);
                return;
            case 4:
                this.f16722b.lambda$getDownloadQueue$186(this.f16723c);
                return;
            case 5:
                this.f16722b.lambda$getUnsentMessages$152(this.f16723c);
                return;
            case 6:
                this.f16722b.lambda$checkIfFolderEmpty$246(this.f16723c);
                return;
            default:
                this.f16722b.lambda$clearWidgetDialogs$167(this.f16723c);
                return;
        }
    }
}
