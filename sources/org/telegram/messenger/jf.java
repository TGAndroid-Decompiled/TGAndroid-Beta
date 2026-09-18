package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f16672a;
    public final MessagesStorage f16673b;
    public final int f16674c;

    public jf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f16672a = i11;
        this.f16673b = messagesStorage;
        this.f16674c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16672a) {
            case 0:
                this.f16673b.lambda$readAllDialogs$65(this.f16674c);
                return;
            case 1:
                this.f16673b.lambda$checkIfFolderEmptyInternal$245(this.f16674c);
                return;
            case 2:
                this.f16673b.lambda$clearDownloadQueue$184(this.f16674c);
                return;
            case 3:
                this.f16673b.lambda$putMessagesInternal$196(this.f16674c);
                return;
            case 4:
                this.f16673b.lambda$getDownloadQueue$186(this.f16674c);
                return;
            case 5:
                this.f16673b.lambda$getUnsentMessages$152(this.f16674c);
                return;
            case 6:
                this.f16673b.lambda$checkIfFolderEmpty$246(this.f16674c);
                return;
            default:
                this.f16673b.lambda$clearWidgetDialogs$167(this.f16674c);
                return;
        }
    }
}
