package org.telegram.messenger;
public final class hf implements Runnable {
    public final int f16558a;
    public final MessagesStorage f16559b;
    public final int f16560c;

    public hf(MessagesStorage messagesStorage, int i10, int i11) {
        this.f16558a = i11;
        this.f16559b = messagesStorage;
        this.f16560c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16558a) {
            case 0:
                this.f16559b.lambda$readAllDialogs$65(this.f16560c);
                return;
            case 1:
                this.f16559b.lambda$checkIfFolderEmptyInternal$245(this.f16560c);
                return;
            case 2:
                this.f16559b.lambda$clearDownloadQueue$184(this.f16560c);
                return;
            case 3:
                this.f16559b.lambda$putMessagesInternal$196(this.f16560c);
                return;
            case 4:
                this.f16559b.lambda$getDownloadQueue$186(this.f16560c);
                return;
            case 5:
                this.f16559b.lambda$getUnsentMessages$152(this.f16560c);
                return;
            case 6:
                this.f16559b.lambda$checkIfFolderEmpty$246(this.f16560c);
                return;
            default:
                this.f16559b.lambda$clearWidgetDialogs$167(this.f16560c);
                return;
        }
    }
}
