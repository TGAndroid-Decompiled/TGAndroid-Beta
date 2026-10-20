package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f18544a;
    public final MessagesStorage f18545b;
    public final int f18546c;

    public hf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18544a = i11;
        this.f18545b = messagesStorage;
        this.f18546c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18544a) {
            case 0:
                this.f18545b.lambda$readAllDialogs$65(this.f18546c);
                return;
            case 1:
                this.f18545b.lambda$checkIfFolderEmptyInternal$245(this.f18546c);
                return;
            case 2:
                this.f18545b.lambda$clearDownloadQueue$184(this.f18546c);
                return;
            case 3:
                this.f18545b.lambda$putMessagesInternal$196(this.f18546c);
                return;
            case 4:
                this.f18545b.lambda$getDownloadQueue$186(this.f18546c);
                return;
            case 5:
                this.f18545b.lambda$getUnsentMessages$152(this.f18546c);
                return;
            case 6:
                this.f18545b.lambda$checkIfFolderEmpty$246(this.f18546c);
                return;
            default:
                this.f18545b.lambda$clearWidgetDialogs$167(this.f18546c);
                return;
        }
    }
}
