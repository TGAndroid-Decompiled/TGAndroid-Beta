package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f16562a;
    public final MessagesStorage f16563b;
    public final int f16564c;

    public hf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f16562a = i11;
        this.f16563b = messagesStorage;
        this.f16564c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16562a) {
            case 0:
                this.f16563b.lambda$readAllDialogs$65(this.f16564c);
                return;
            case 1:
                this.f16563b.lambda$checkIfFolderEmptyInternal$245(this.f16564c);
                return;
            case 2:
                this.f16563b.lambda$clearDownloadQueue$184(this.f16564c);
                return;
            case 3:
                this.f16563b.lambda$putMessagesInternal$196(this.f16564c);
                return;
            case 4:
                this.f16563b.lambda$getDownloadQueue$186(this.f16564c);
                return;
            case 5:
                this.f16563b.lambda$getUnsentMessages$152(this.f16564c);
                return;
            case 6:
                this.f16563b.lambda$checkIfFolderEmpty$246(this.f16564c);
                return;
            default:
                this.f16563b.lambda$clearWidgetDialogs$167(this.f16564c);
                return;
        }
    }
}
