package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f16575a;
    public final MessagesStorage f16576b;
    public final int f16577c;

    public hf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f16575a = i11;
        this.f16576b = messagesStorage;
        this.f16577c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16575a) {
            case 0:
                this.f16576b.lambda$readAllDialogs$65(this.f16577c);
                return;
            case 1:
                this.f16576b.lambda$checkIfFolderEmptyInternal$245(this.f16577c);
                return;
            case 2:
                this.f16576b.lambda$clearDownloadQueue$184(this.f16577c);
                return;
            case 3:
                this.f16576b.lambda$putMessagesInternal$196(this.f16577c);
                return;
            case 4:
                this.f16576b.lambda$getDownloadQueue$186(this.f16577c);
                return;
            case 5:
                this.f16576b.lambda$getUnsentMessages$152(this.f16577c);
                return;
            case 6:
                this.f16576b.lambda$checkIfFolderEmpty$246(this.f16577c);
                return;
            default:
                this.f16576b.lambda$clearWidgetDialogs$167(this.f16577c);
                return;
        }
    }
}
