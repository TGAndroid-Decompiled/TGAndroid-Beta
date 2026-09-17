package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f16500a;
    public final MessagesStorage f16501b;
    public final int f16502c;

    public jf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f16500a = i11;
        this.f16501b = messagesStorage;
        this.f16502c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16500a) {
            case 0:
                this.f16501b.lambda$readAllDialogs$65(this.f16502c);
                return;
            case 1:
                this.f16501b.lambda$checkIfFolderEmptyInternal$245(this.f16502c);
                return;
            case 2:
                this.f16501b.lambda$clearDownloadQueue$184(this.f16502c);
                return;
            case 3:
                this.f16501b.lambda$putMessagesInternal$196(this.f16502c);
                return;
            case 4:
                this.f16501b.lambda$getDownloadQueue$186(this.f16502c);
                return;
            case 5:
                this.f16501b.lambda$getUnsentMessages$152(this.f16502c);
                return;
            case 6:
                this.f16501b.lambda$checkIfFolderEmpty$246(this.f16502c);
                return;
            default:
                this.f16501b.lambda$clearWidgetDialogs$167(this.f16502c);
                return;
        }
    }
}
