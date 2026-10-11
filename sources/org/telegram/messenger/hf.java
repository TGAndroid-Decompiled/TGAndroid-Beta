package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f18060a;
    public final MessagesStorage f18061b;
    public final int f18062c;

    public hf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f18060a = i11;
        this.f18061b = messagesStorage;
        this.f18062c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18060a) {
            case 0:
                this.f18061b.lambda$readAllDialogs$65(this.f18062c);
                return;
            case 1:
                this.f18061b.lambda$checkIfFolderEmptyInternal$245(this.f18062c);
                return;
            case 2:
                this.f18061b.lambda$clearDownloadQueue$184(this.f18062c);
                return;
            case 3:
                this.f18061b.lambda$putMessagesInternal$196(this.f18062c);
                return;
            case 4:
                this.f18061b.lambda$getDownloadQueue$186(this.f18062c);
                return;
            case 5:
                this.f18061b.lambda$getUnsentMessages$152(this.f18062c);
                return;
            case 6:
                this.f18061b.lambda$checkIfFolderEmpty$246(this.f18062c);
                return;
            default:
                this.f18061b.lambda$clearWidgetDialogs$167(this.f18062c);
                return;
        }
    }
}
